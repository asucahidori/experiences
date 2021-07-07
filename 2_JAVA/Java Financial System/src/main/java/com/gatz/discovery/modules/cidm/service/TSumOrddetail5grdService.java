package com.gatz.discovery.modules.cidm.service;

import java.util.List;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TSumOrddetail5grd;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/27.
 */
public interface TSumOrddetail5grdService extends GenericService<TSumOrddetail5grd, Long> {

	public List<JSONObject> searchTSumOrddetail5grdTop10(TSumOrddetail5grd tSumOrddetail5grd);
}
