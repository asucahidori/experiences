package com.gatz.discovery.modules.cidm.controller;

import com.gatz.discovery.core.entity.JSONResult;
import com.gatz.discovery.modules.cidm.service.BuildingDataAnalyseService;

import net.minidev.json.JSONObject;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import com.gatz.discovery.modules.cidm.util.Logger;
import com.gatz.discovery.modules.cidm.util.Logger;/**
 * Created by lixing on 2016/2/3.
 */
@Controller
@RequestMapping(value = "/buildingData")
public class BuildingDataAnalyseController {

    //private Logger logger = LoggerFactory.getLogger(getClass());
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private BuildingDataAnalyseService buildingDataAnalyseService;

	/**
     * 根据楼宇id , 获取楼宇统计数据
     * @param id
     * @return
     */
    @RequestMapping(value = "count", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getBuildingCount(@RequestParam(required=false) String buildingcode) {
    	HashMap<String, String> a = buildingDataAnalyseService.getBuildingCount(buildingcode);
    	JSONObject obj = new JSONObject();
		obj.put("success", "true");
		obj.put("msg", "111");
		obj.put("data", a);
		System.out.println("ssss.........."+obj.toJSONString());
		return obj;
    }
    /**
     * 根据楼宇id , 获取楼宇用户量
     * @param buildingcode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "usercount", method = RequestMethod.POST)
    public JSONResult getBuildingUserCount(@RequestParam(required=false) String buildingcode) {
    	List aa = buildingDataAnalyseService.getBuildingUserCount(buildingcode);
    	System.err.println(",,,..........................."+(new JSONResult<List<Object>>(aa)).getData().toString());
        return new JSONResult<List<Object>>(aa);
    }
}
