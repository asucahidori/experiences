package com.gatz.discovery.modules.cidm.controller;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.service.ImportGdpService;
import com.gatz.discovery.modules.cidm.util.ImportParesExcelUtil;
import com.gatz.discovery.modules.cidm.util.Logger;

@Controller
@RequestMapping(value = "/importGdp")
public class ImportGdpController {
	protected Logger logger = Logger.getLogger(this.getClass());
	protected String msg;
	protected List<TGdp> tgdpList;
	

	@Resource
	private ImportGdpService importGdpService;
	/**
     * 默认跳转页面
     * @return
     */
   @RequestMapping("/getImportGdp")
   public String getImportGdp () {
       return "modules/cidm/import_gdp";
   }
   
	/**
    * 默认跳转页面
    * @return
    */
  @RequestMapping("/importGdp")
  public String importGdp (@RequestParam("file") MultipartFile file,@RequestParam("myYear") String year,HttpServletRequest request) {
	  
	  String tempFileName = file.getOriginalFilename();
	  try
		{
		Map<String, Map<Integer, List<String>>> map = null;
		if (null != tempFileName)
		{
			//String suffix = this.getFileBean().getExFileFileName();
			// 03
			if (tempFileName.endsWith(".xls") || tempFileName.endsWith(".XLS"))
			{
				map = ImportParesExcelUtil.readExcel03(file.getInputStream(), 14);
				// 07以上
			} else if (tempFileName.endsWith(".xlsx") || tempFileName.endsWith(".XLSX"))
			{
				map = ImportParesExcelUtil.readExcel07(file.getInputStream(), 14);
			} else
			{
				this.msg = "请导入03或07版本的Excel文件";
				
			}
		} else
		{
			this.msg = "请导入文件！";
		}
		
		if (null != map)
		{
			Map<String, Object> resultObj = importGdpService.importFile(map,tgdpList,year);
			
			if (null != resultObj)
			{
				this.msg = String.valueOf(resultObj.get("VALIDATE"));
			}
			
		}
		else
		{
			this.msg = "Excel文件未读取到！";
		}
		
	}catch(Exception e)
		{
			this.msg = "E_error";
			e.printStackTrace();
			
		}
      return "modules/cidm/import_gdp";
  }

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<TGdp> getTgdpList() {
		return tgdpList;
	}

	public void setTgdpList(List<TGdp> tgdpList) {
		this.tgdpList = tgdpList;
	}
}
