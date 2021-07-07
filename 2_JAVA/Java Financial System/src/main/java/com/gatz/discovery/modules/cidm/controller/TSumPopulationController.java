package com.gatz.discovery.modules.cidm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TSumPopulation;
import com.gatz.discovery.modules.cidm.service.TSumPopulationService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONObject;

@Controller
@RequestMapping(value = "/sumPopulation")
public class TSumPopulationController {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private TSumPopulationService tSumPopulationService;
	
	Map<String,Object> paramMap = new HashMap<String,Object>();
	/**
     * 默认跳转页面
     * @return
     */
   @RequestMapping("/getDefaultPopulation")
   public String getDefaultPopulation () {
       return "modules/cidm/report_village";
   }
	
	/**
	 * 住户家庭结构类型分布
	 * */
	@ResponseBody
	@RequestMapping("/searchPopulation")
	public JSONObject searchPopulation(Long id,int type)throws Exception{
		JSONObject jSONObject = new JSONObject();
		TSumPopulation tSumPopulation = new TSumPopulation();
		tSumPopulation.setAreaId(id);
		tSumPopulation.setAreaType(Short.parseShort(type+""));
		try{
			jSONObject = this.tSumPopulationService.searchSumPopulation(tSumPopulation);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jSONObject;
	}
	
	
	/**
	 * 季度消费等级
	 * */
	@ResponseBody
	@RequestMapping("/searchSumPopulationGrade")
	public List<JSONObject> searchSumPopulationGrade(Long id,int type)throws Exception{

		List<JSONObject> list = new ArrayList<JSONObject>();
		TSumPopulation tSumPopulation = new TSumPopulation();
		tSumPopulation.setAreaId(id);
		tSumPopulation.setAreaType(Short.parseShort(type+""));
		try{
			list = this.tSumPopulationService.searchSumPopulationGrade(tSumPopulation);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		List<JSONObject> errorList = new ArrayList<JSONObject>();
    		errorList.add(new JSONObject(paramMap));
    		return errorList; 
		}
		return list;
	}
	
	
	/**
	 * 人口规模
	 * */
	@ResponseBody
	@RequestMapping("/searchSumPopulationBypopulation")
	public JSONObject searchSumPopulationBypopulation(Long id,int type)throws Exception{
		JSONObject jsonObject = new JSONObject();
		TSumPopulation tSumPopulation = new TSumPopulation();
		tSumPopulation.setAreaId(id);
		tSumPopulation.setAreaType(Short.parseShort(type+""));
		try{
			jsonObject = this.tSumPopulationService.searchSumPopulationBypopulation(tSumPopulation);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
	
	/**
	 * @desc 获取常住人口数
	 * @author xzl
	 */
	@ResponseBody
	@RequestMapping("/queryResidentPopulationBypopulation")
	public JSONObject queryResidentPopulation(Long id,int type)throws Exception{
		JSONObject jsonObject = new JSONObject();
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("id",id);
		paramMap.put("type",type+1);//街道下取各社区的信息
		try{
			jsonObject = this.tSumPopulationService.queryResidentPopulationByArea(paramMap);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
	
	/**
	 * @desc 各社区居民消费等级
	 * @author xzl
	 */
	@ResponseBody
	@RequestMapping("/queryResidentSalesLevel")
	public JSONObject queryResidentSalesLevel(Long id,int type)throws Exception{
		JSONObject jsonObject = new JSONObject();
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("id",id);
		paramMap.put("type",type+1);//街道下取各社区的信息
		try{
			jsonObject = this.tSumPopulationService.queryResidentSalesLevelByArea(paramMap);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
}
