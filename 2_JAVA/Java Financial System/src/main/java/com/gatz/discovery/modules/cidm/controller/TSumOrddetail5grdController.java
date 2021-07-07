package com.gatz.discovery.modules.cidm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TSumOrddetail5grd;
import com.gatz.discovery.modules.cidm.service.TSumOrddetail5grdService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONObject;

@Controller
@RequestMapping(value = "/sumOrddetail5grd")
public class TSumOrddetail5grdController {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private TSumOrddetail5grdService tSumOrddetail5grdService;
	
	Map<String,Object> paramMap = new HashMap<String,Object>();
	/**
	 * 平台消费top10
	 * */
	@ResponseBody
	@RequestMapping("/searchTSumOrddetail5grdTop10")
	public List<JSONObject> searchTSumOrddetail5grdTop10(Long id,int type)throws Exception{

		List<JSONObject> list = new ArrayList<JSONObject>();
		TSumOrddetail5grd tSumOrddetail5grd = new TSumOrddetail5grd();
		tSumOrddetail5grd.setAreaId(id);
		tSumOrddetail5grd.setAreaType(Short.parseShort(type+""));
		try{
			list = this.tSumOrddetail5grdService.searchTSumOrddetail5grdTop10(tSumOrddetail5grd);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		List<JSONObject> errorList = new ArrayList<JSONObject>();
    		errorList.add(new JSONObject(paramMap));
    		return errorList;
		}
		return list;
	}
}
