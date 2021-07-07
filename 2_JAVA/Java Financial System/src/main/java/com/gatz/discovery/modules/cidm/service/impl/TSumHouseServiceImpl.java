package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TSumHouseMapper;
import com.gatz.discovery.modules.cidm.model.TSumHouse;
import com.gatz.discovery.modules.cidm.service.TSumHouseService;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class TSumHouseServiceImpl extends GenericServiceImpl<TSumHouse,Long> implements TSumHouseService {
	
	@Resource
    private TSumHouseMapper tSumHouseMapper;

	/**
	 * 查询编码,面积 
	 */
	@Override
	public JSONObject searchSumHouse(TSumHouse tSumHouse) {
		// TODO Auto-generated method stub
		List<JSONObject> list = new ArrayList<JSONObject>();
		JSONObject jSONObject = new JSONObject();
		List<Map<Integer, Object>> listMap = tSumHouseMapper.searchSumHouse(tSumHouse);
		if(listMap != null && !listMap.isEmpty()){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("gbCode", m.get("gb_code"));	//编码
				o.put("squareArea", m.get("square_area"));	//面积
				o.put("officeBldNum", m.get("office_bld_num"));	//写字楼
				o.put("houseBldNum", m.get("house_bld_num"));	//住宅楼
				o.put("households", m.get("households"));	//住宅户数
				o.put("rentalNumber", m.get("rental_number"));	//出租数
				o.put("house_park_num", m.get("house_park_num"));	//住宅停车位数
				list.add(o);
			}
			jSONObject = list.get(0);
		}
		return jSONObject;
	}

	@Override
	public GenericDao<TSumHouse, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
