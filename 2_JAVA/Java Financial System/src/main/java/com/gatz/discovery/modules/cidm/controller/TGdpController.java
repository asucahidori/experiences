package com.gatz.discovery.modules.cidm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.service.TGdpService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONObject;

@Controller
@RequestMapping(value = "/gdp")
public class TGdpController {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private TGdpService tGdpService;
	
	Map<String,Object> paramMap = new HashMap<String,Object>();
	/**
	 * 查询编码,面积
	 * */
	@ResponseBody
	@RequestMapping("/searchGdp")
	public JSONObject searchGdp(Long id,int type)throws Exception{
		JSONObject jsonObject = new JSONObject();
		TGdp tGdp = new TGdp();
		tGdp.setAreaId(id);
		tGdp.setAreaType(Short.parseShort(type+""));
		try{
			jsonObject = this.tGdpService.searchGdp(tGdp);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
	
	/**
	 * @desc 人均可支配收入，人均消费支出
	 * @author xzl
	 */
	@ResponseBody
	@RequestMapping("/queryAvgGdpByArea")
	public JSONObject queryAvgGdpByArea(Long id,int type)throws Exception{
		JSONObject jsonObject = new JSONObject();
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("id",id);
		paramMap.put("type",type+2);//街道下取各社区的信息
		try{
			jsonObject = this.tGdpService.queryAvgGdpByArea(paramMap);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
}
