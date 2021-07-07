package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TOrderMapper;
import com.gatz.discovery.modules.cidm.model.TOrder;
import com.gatz.discovery.modules.cidm.service.TOrderService;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class TOrderServiceImpl extends GenericServiceImpl<TOrder,Long> implements TOrderService {
	
	@Resource
    private TOrderMapper tOrderMapper;

	@Override
	public GenericDao<TOrder, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject selectSumOrder(TOrder tOrder) {
		// TODO Auto-generated method stub
				List<JSONObject> list = new ArrayList<JSONObject>();
				JSONObject jSONObject = new JSONObject();
				List<Map<Integer, Object>> listMap = tOrderMapper.selectSumOrder(tOrder);
				if(listMap != null && !listMap.isEmpty()){
					for(int i=0; i<listMap.size(); i++){
						Map<Integer, Object> m = listMap.get(i);
						JSONObject o = new JSONObject();
						o.put("orderSum", m.get("orderSum"));
						o.put("sumPrice", m.get("sumPrice"));
						o.put("sumCustomer", m.get("sumCustomer"));
						list.add(o);
					}
					jSONObject=list.get(0);
				}
				return jSONObject;
	}

	/**
	 * 同年环比
	 */
	@Override
	public JSONObject selectContrastOrder(TOrder tOrder) {
		List<JSONObject> list = new ArrayList<JSONObject>();
		JSONObject jSONObject = new JSONObject();
		List<Map<Integer, Object>> listMap = tOrderMapper.selectContrastOrder(tOrder);
		if(listMap != null && !listMap.isEmpty()){
			for(int i=0; i<listMap.size(); i++){
				Map<Integer, Object> m = listMap.get(i);
				JSONObject o = new JSONObject();
				o.put("orderSum1", m.get("orderSum1"));
				o.put("sumPrice1", m.get("sumPrice1"));
				o.put("sumCustomer1", m.get("sumCustomer1"));
				o.put("orderSum2", m.get("orderSum2"));
				o.put("sumPrice2", m.get("sumPrice2"));
				o.put("sumCustomer2", m.get("sumCustomer2"));
				list.add(o);
			}
			jSONObject=list.get(0);
		}
		return jSONObject;
	}

	@Override
	public JSONObject selectContrastCustomer(String id, String areaType,
			Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		paramMap.put("areaType", areaType);
		
		Map<String, Object> m = this.tOrderMapper.selectContrastCustomer(paramMap);
		if(m != null && !m.isEmpty()){
			String sumCustomer1 = m.get("sumCustomer1") + "";
			String sumCustomer2 = m.get("sumCustomer2") + "";
			if(StringUtils.isNoneBlank(sumCustomer1)&&StringUtils.isNoneBlank(sumCustomer2)){
				json.put("sumCustomer1", sumCustomer1);//国安社区用户
				json.put("sumCustomer2", sumCustomer2);//国安社区用户
			}else{
				json.put("sumCustomer1", "0");//国安社区用户
				json.put("sumCustomer2", "0");//国安社区用户
			}
		}else{
			json.put("sumCustomer1", "0");//国安社区用户
			json.put("sumCustomer2", "0");//国安社区用户
		}
		return json;
	}

	@Override
	public JSONObject selectContrastPrice(String id, String areaType,
			Map<String, Object> map) throws Exception {
		JSONObject json = new JSONObject();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		paramMap.put("areaType", areaType);
		
		Map<String, Object> m = this.tOrderMapper.selectContrastPrice(paramMap);
		if(m != null && !m.isEmpty()){
			String sumPrice1 = m.get("sumPrice1") + "";
			String sumPrice2 = m.get("sumPrice2") + "";
			if(StringUtils.isNoneBlank(sumPrice1)&&StringUtils.isNoneBlank(sumPrice2)){
				json.put("sumPrice1", sumPrice1);//国安社区用户
				json.put("sumPrice2", sumPrice2);//国安社区用户
			}else{
				json.put("sumPrice1", "0");//国安社区用户
				json.put("sumPrice2", "0");//国安社区用户
			}
		}else{
			json.put("sumPrice1", "0");//国安社区用户
			json.put("sumPrice2", "0");//国安社区用户
		}
		return json;
	}
	
}
