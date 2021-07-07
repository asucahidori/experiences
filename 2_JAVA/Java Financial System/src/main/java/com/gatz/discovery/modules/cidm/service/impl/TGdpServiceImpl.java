package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TGdpMapper;
import com.gatz.discovery.modules.cidm.model.AreaMapVo;
import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.service.TGdpService;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class TGdpServiceImpl extends GenericServiceImpl<TGdp,Long> implements TGdpService {
	
	@Resource
    private TGdpMapper tGdpMapper;

	/**
	 * 查询生产总值
	 */
	@Override
	public JSONObject searchGdp(TGdp tGdp) {
		// TODO Auto-generated method stub
		List<JSONObject> list = new ArrayList<JSONObject>();
		JSONObject jSONObject = new JSONObject();
		List<Map<Integer, Object>> listMap = tGdpMapper.searchGdp(tGdp);
		if(listMap != null && !listMap.isEmpty()){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("gdp", m.get("gdp"));	//生产总值
				list.add(o);
			}
			jSONObject=list.get(0);
		}
		return jSONObject;
	}

	@Override
	public GenericDao<TGdp, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @desc 人均可支配收入，人均消费支出
	 * @author xzl
	 */
	public JSONObject queryAvgGdpByArea(Map<String,Object> map){
		List <AreaMapVo> list = tGdpMapper.queryAvgGdpByArea(map);
		JSONObject o = new JSONObject();
		if(list != null && list.size() > 0){
			List <String> listNameArray = new ArrayList<String>();
			List <Long> listIncomeArray = new ArrayList<Long>();
			List <Long> listExpendArray = new ArrayList<Long>();
			for(int i=0; i<list.size(); i++){
				AreaMapVo vo = list.get(i);
				listIncomeArray.add(vo.getIncome());
				listExpendArray.add(vo.getExpend());
				listNameArray.add(vo.getAreaName());
				
			}
			o.put("x_areaName", listNameArray.toArray());
			o.put("y_income", listIncomeArray.toArray());
			o.put("y_expend", listExpendArray.toArray());
		}
		return o;
	}
	

}
