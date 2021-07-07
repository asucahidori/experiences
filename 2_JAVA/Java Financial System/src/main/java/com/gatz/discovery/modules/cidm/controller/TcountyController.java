package com.gatz.discovery.modules.cidm.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TCounty;
import com.gatz.discovery.modules.cidm.service.TcountyService;
import com.gatz.discovery.modules.cidm.util.Logger;

/** 
 * TcountyController
 */
@Controller
@RequestMapping("/tcounty")
public class TcountyController{
	protected Logger logger = Logger.getLogger(this.getClass());
    //private static Logger logger = org.slf4j.LoggerFactory.getLogger(ActivityController.class);
    @Resource(name="tcountyService")
	private TcountyService tcountyService;


    /**
     *查询列表数据
     *
     * @return
     */
    @RequestMapping(value = "/queryTcounty")
    @ResponseBody
    public JSONObject queryTcounty(Long cityId) {
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try{
	    	paramMap.put("cityId", cityId);
	        List<TCounty> tcountyList = tcountyService.queryTcounty(paramMap);
	        Map<String,Object> map = new HashMap<String,Object>();
	        map.put("list", tcountyList);
	        return new JSONObject(map); 
	    }catch(Exception ex){
			logger.error(ex.getMessage());
			paramMap.put("message","系统错误，请联系管理员！");
			return new JSONObject(paramMap); 
		}
    }
}