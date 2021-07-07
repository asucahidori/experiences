package com.gatz.discovery.modules.cidm.service;

import java.util.Map;

import net.minidev.json.JSONObject;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TOrder;

/**
 * Created by baibing on 2016/1/27.
 */
public interface TOrderService extends GenericService<TOrder, Long> {
	/**
	 * @desc 订单总量
	 * @author xzl
	 */
	public JSONObject selectSumOrder(TOrder tOrder);
	
	/**
	 * @desc 同年环比
	 * @author xzl
	 */
	public JSONObject selectContrastOrder(TOrder tOrder);
	
	public JSONObject selectContrastCustomer(String id, String areaType, Map<String, Object> map)throws Exception;
	
	public JSONObject selectContrastPrice(String id, String areaType, Map<String, Object> map)throws Exception;
}
