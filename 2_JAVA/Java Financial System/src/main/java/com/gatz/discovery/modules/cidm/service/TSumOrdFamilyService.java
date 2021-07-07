package com.gatz.discovery.modules.cidm.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.model.TSumOrdFamily;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
public interface TSumOrdFamilyService extends GenericService<TSumOrdFamily, Long> {

	public JSONObject searchSumOrdFamily(TSumOrdFamily searchSumOrdFamily);
}
