package com.gatz.discovery.modules.cidm.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TSumHouse;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
public interface TSumHouseService extends GenericService<TSumHouse, Long> {

	public JSONObject searchSumHouse(TSumHouse tSumHouse);
}
