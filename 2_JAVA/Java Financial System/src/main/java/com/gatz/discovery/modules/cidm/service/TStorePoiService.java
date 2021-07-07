package com.gatz.discovery.modules.cidm.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TStorePoi;

public interface TStorePoiService extends GenericService<TStorePoi, Long> {

	public TStorePoi selectByStreetId(Long streetId);

}
