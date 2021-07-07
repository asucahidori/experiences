package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TSumOrdFamilyMapper;
import com.gatz.discovery.modules.cidm.model.TSumOrdFamily;
import com.gatz.discovery.modules.cidm.service.TSumOrdFamilyService;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class TSumOrdFamilyServiceImpl extends GenericServiceImpl<TSumOrdFamily,Long> implements TSumOrdFamilyService {
	
	@Resource
    private TSumOrdFamilyMapper tSumOrdFamilyMapper;

	/**
	 * 查询订单订单量、订单额
	 */
	@Override
	public JSONObject searchSumOrdFamily(TSumOrdFamily searchSumOrdFamily) {
		// TODO Auto-generated method stub
		List<JSONObject> list = new ArrayList<JSONObject>();
		JSONObject jSONObject = new JSONObject();
		List<Map<Integer, Object>> listMap = tSumOrdFamilyMapper.searchSumOrdFamily(searchSumOrdFamily);
		if(listMap != null && !listMap.isEmpty()){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("orderNumber", m.get("orderNumber"));	//订单量
				o.put("tradingPrice", m.get("tradingPrice"));	//订单额
				list.add(o);
			}
			jSONObject=list.get(0);
		}
		return jSONObject;
	}

	@Override
	public GenericDao<TSumOrdFamily, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}


}
