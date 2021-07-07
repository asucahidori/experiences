package com.gatz.discovery.modules.cidm.service;

import java.util.Map;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TGdp;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
public interface TGdpService extends GenericService<TGdp, Long> {

	public JSONObject searchGdp(TGdp tGdp);
	
	/**
	 * @desc 人均可支配收入，人均消费支出
	 * @author xzl
	 */
	public JSONObject queryAvgGdpByArea(Map<String,Object> map);
}
