package com.gatz.discovery.modules.cidm.service;

import java.util.List;
import java.util.Map;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TGdp;

/**
 * Created by baibing on 2016/1/27.
 */
public interface ImportGdpService extends GenericService<TGdp, Long> {

	public Map<String,Object> importFile(Map<String, Map<Integer, List<String>>> map,List<TGdp> tGdp,String year);
}
