package com.gatz.discovery.modules.cidm.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TStreetCoordinateWithBLOBs;

public interface TStreetCoordinateService extends GenericService<TStreetCoordinateWithBLOBs, Long> {
	
	public TStreetCoordinateWithBLOBs selectByStreetId(int streetId);
}
