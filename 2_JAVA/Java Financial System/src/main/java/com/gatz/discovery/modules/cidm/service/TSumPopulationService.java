package com.gatz.discovery.modules.cidm.service;

import java.util.List;
import java.util.Map;

import net.minidev.json.JSONObject;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;

/**
 * Created by baibing on 2016/1/27.
 */
public interface TSumPopulationService extends GenericService<TSumPopulation, Long> {

	public JSONObject searchSumPopulation(TSumPopulation tSumPopulation);
	
	public List<JSONObject> searchSumPopulationGrade(TSumPopulation tSumPopulation);
	
	public JSONObject searchSumPopulationBypopulation(TSumPopulation tSumPopulation);
	
	/**
	 * @查询社区常住人口数
	 * @author xzl
	 */
	public JSONObject queryResidentPopulationByArea(Map<String,Object> map);
	
	public JSONObject queryResidentSalesLevelByArea(Map<String,Object> map);
	
}
