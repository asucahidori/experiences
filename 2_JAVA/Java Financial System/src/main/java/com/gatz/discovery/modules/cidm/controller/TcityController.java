package com.gatz.discovery.modules.cidm.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.service.TcityService;
import com.gatz.discovery.modules.cidm.util.Logger;

/** 
 * TcityController
 */
@Controller
@RequestMapping("/tcity")
public class TcityController{
	protected Logger logger = Logger.getLogger(this.getClass());
    //private static Logger logger = org.slf4j.LoggerFactory.getLogger(ActivityController.class);
    @Resource(name="tcityService")
	private TcityService tcityService;
    
	/**
     * 访问列表页面
     *
     * @return 列表页
     */
    @RequestMapping("/tcityList")
    public String goTcityList() {
        return "tcity/tcityList";
    }
    /**
     * 跳转到新增页面
     */
    @RequestMapping("/goAddTcity")
    public String goAddTcity() {
        return "tcity/TcityAdd";
    }

    /**
     *查询列表数据
     *
     * @return
     */
    @RequestMapping(value = "/queryTcity")
    @ResponseBody
    public JSONObject queryTcity(long provinceId) {
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try{
	    	paramMap.put("provinceId", provinceId);
	        List<TCity> tcityList = tcityService.queryTcity(paramMap);
	        Map<String,Object> map = new HashMap<String,Object>();
	    	map.put("list",tcityList);
	    	return new JSONObject(map); 
    	}catch(Exception ex){
    		logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
    	}
    }
   
}
