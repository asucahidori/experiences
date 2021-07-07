package com.gatz.discovery.modules.cidm.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TProvince;
import com.gatz.discovery.modules.cidm.service.TProvinceService;
import com.gatz.discovery.modules.cidm.util.Logger;


/** 
 * TprovinceController
 */
@Controller
@RequestMapping("/tprovince")
public class TprovinceController{

	protected Logger logger = Logger.getLogger(this.getClass());
    @Resource(name="tprovinceService")
	private TProvinceService tprovinceService;
    
	/**
     * 获得省市列表
     *
     * @return 列表页
     */
    @RequestMapping("/getTprovinceList")
    @ResponseBody
    public JSONObject getTprovinceList() {
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try{
//    		throw new RuntimeException("yichang ");
	    	List<TProvince> list = tprovinceService.queryTprovince(paramMap);
	    	Map<String,Object> map = new HashMap<String,Object>();
	    	map.put("list",list);
	    	return new JSONObject(map); 
    	}catch(Exception ex){
    		logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
    	}
    }
}
