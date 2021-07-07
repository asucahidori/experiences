package com.gatz.discovery.modules.cidm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TSumHouse;
import com.gatz.discovery.modules.cidm.service.TSumHouseService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONObject;

@Controller
@RequestMapping(value = "/sumHouse")
public class TSumHouseController {
	protected Logger logger = Logger.getLogger(this.getClass());	
	@Resource
	private TSumHouseService tSumHouseService;
	Map<String,Object> paramMap = new HashMap<String,Object>();
	/**
	 * 查询住宅信息
	 * */
	@ResponseBody
	@RequestMapping("/searchSumHouse")
	public JSONObject searchSumHouse(Long id,int type)throws Exception{
		JSONObject jsonObject = new JSONObject();
		TSumHouse tSumHouse = new TSumHouse();
		tSumHouse.setAreaId(id);
		tSumHouse.setAreaType(Short.parseShort(type+""));
		try{
			jsonObject = this.tSumHouseService.searchSumHouse(tSumHouse);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
}
