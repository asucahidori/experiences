package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TSumPopulationMapper;
import com.gatz.discovery.modules.cidm.model.AreaMapVo;
import com.gatz.discovery.modules.cidm.model.ResidentSalesLevelVo;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;
import com.gatz.discovery.modules.cidm.service.TSumPopulationService;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class TSumPopulationServiceImpl extends GenericServiceImpl<TSumPopulation,Long> implements TSumPopulationService {
	
	@Resource
    private TSumPopulationMapper tSumPopulationMapper;
	/**
	 * 住户家庭结构类型分布
	 */
	@Override
	public JSONObject searchSumPopulation(TSumPopulation tSumPopulation) {
		List<JSONObject> list = new ArrayList<JSONObject>();
		// TODO Auto-generated method stub
		List<Map<Integer, Object>> listMap = tSumPopulationMapper.searchSumPopulation(tSumPopulation);
		JSONObject jSONObject = new JSONObject();
		if(listMap != null && !listMap.isEmpty()){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("one", m.get("one"));	//一人户
				o.put("two", m.get("two"));//二人户
				o.put("three", m.get("three"));	//三人户
				o.put("four", m.get("four"));//四人户 
				o.put("five", m.get("five"));//五人户以上 s
				list.add(o);
			}
			jSONObject = list.get(0);
		}
		return jSONObject;
	}

	@Override
	public GenericDao<TSumPopulation, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 季度消费等级
	 */
	@Override
	public List<JSONObject> searchSumPopulationGrade(TSumPopulation tSumPopulation) {
		List<JSONObject> list = new ArrayList<JSONObject>();
		// TODO Auto-generated method stub
		List<Map<Integer, Object>> listMap = tSumPopulationMapper.searchSumPopulationGrade(tSumPopulation);
		if(listMap != null && listMap.size() > 0){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("updateTime", m.get("updateTime"));	//日期
				o.put("comsumeLevel", m.get("comsumeLevel"));//消费等级
				list.add(o);
			}
		}
		return list;
	}

	/**
	 * 查询人口规模
	 */
	@Override
	public JSONObject searchSumPopulationBypopulation(TSumPopulation tSumPopulation) {
		List<JSONObject> list = new ArrayList<JSONObject>();
		JSONObject jSONObject = new JSONObject();
		List<Map<Integer, Object>> listMap = tSumPopulationMapper.searchSumPopulationBypopulation(tSumPopulation);
		if(listMap != null && !listMap.isEmpty()){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("population", m.get("population"));//人数
				o.put("comsumeLeve", m.get("comsume_level"));	//消费等级
				list.add(o);
			}
			jSONObject = list.get(0);
		}
		return jSONObject;
	}

	/**
	 * @查询社区常住人口数
	 * @author xzl
	 */
	@Override
	public JSONObject queryResidentPopulationByArea(Map<String,Object> map) {
		List <AreaMapVo> list = tSumPopulationMapper.queryResidentPopulationByArea(map);
		JSONObject o = new JSONObject();
		if(list != null && list.size() > 0){
			List <String> listNameArray = new ArrayList<String>();
			List <Long> listPopulationArray = new ArrayList<Long>();
			for(int i=0; i<list.size(); i++){
				AreaMapVo vo = list.get(i);
				listPopulationArray.add(vo.getPopulation());
				listNameArray.add(vo.getAreaName());
			}
			o.put("x_ResidentPopulation", listNameArray.toArray());
			o.put("y_ResidentPopulation", listPopulationArray.toArray());
		}
		return o;
	}

	/**
	 *@desc各社区居民消费等级
	 * @author xzl
	 */
	@Override
	public JSONObject queryResidentSalesLevelByArea(Map<String, Object> map) {
		List <HashMap<String,Object>> list = tSumPopulationMapper.queryResidentSalesLevelByArea(map);
		JSONObject o = new JSONObject();
		if(list != null && list.size() > 0){
			List <ResidentSalesLevelVo> listNameArray = new ArrayList<ResidentSalesLevelVo>();
			List <Long> listPopulationArray = new ArrayList<Long>();
			for(int i=0; i<list.size(); i++){
				
				HashMap<String,Object> vo = (HashMap<String,Object>)list.get(i);
				ResidentSalesLevelVo vx = new ResidentSalesLevelVo();
				vx.setText((String)vo.get("areaName"));
				vx.setMax(10);
				vx.setMin(0);
				listPopulationArray.add(((Long)vo.get("comsumeLevel")));
				listNameArray.add(vx);
			}
			o.put("x_ResidentSalesLevel", listNameArray.toArray());
			o.put("y_ResidentSalesLevel", listPopulationArray.toArray());
		}
		return o;
	}

}
