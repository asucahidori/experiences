package com.gatz.discovery.modules.cidm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TSumOrdFamily;
import com.gatz.discovery.modules.cidm.service.TSumOrdFamilyService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONObject;

@Controller
@RequestMapping(value = "/sumOrdFamily")
public class TSumOrdFamilyController {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private TSumOrdFamilyService tSumOrdFamilyService;
	
	Map<String,Object> paramMap = new HashMap<String,Object>();
	/**
	 * 查询订单量
	 * */
	@ResponseBody
	@RequestMapping("/searchSumOrdFamily")
	public JSONObject searchSumOrdFamily(Long id)throws Exception{
		JSONObject jsonObject = new JSONObject();
		TSumOrdFamily tSumOrdFamily = new TSumOrdFamily();
		tSumOrdFamily.setHouseId(id);
		try{
			jsonObject = this.tSumOrdFamilyService.searchSumOrdFamily(tSumOrdFamily);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
}
