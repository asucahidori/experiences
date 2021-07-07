package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TSumOrddetail5grdMapper;
import com.gatz.discovery.modules.cidm.model.TSumOrddetail5grd;
import com.gatz.discovery.modules.cidm.service.TSumOrddetail5grdService;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class TSumOrddetail5grdServiceImpl extends GenericServiceImpl<TSumOrddetail5grd,Long> implements TSumOrddetail5grdService {
	
	@Resource
    private TSumOrddetail5grdMapper tSumOrddetail5grdMapper;

	@Override
	public GenericDao<TSumOrddetail5grd, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 消费top 10
	 */
	@Override
	public List<JSONObject> searchTSumOrddetail5grdTop10(TSumOrddetail5grd tSumOrddetail5grd) {
		List<JSONObject> list = new ArrayList<JSONObject>();
		// TODO Auto-generated method stub
		List<Map<Integer, Object>> listMap = tSumOrddetail5grdMapper.searchTSumOrddetail5grdTop10(tSumOrddetail5grd);
		if(listMap != null && listMap.size() > 0){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("productName", m.get("productName"));	//产品名称
				o.put("tradingPrice", m.get("tradingPrice"));//价格 
				list.add(o);
			}
		}
		return list;
	}
	

}
