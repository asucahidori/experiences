package com.gatz.discovery.modules.cidm.service;

import java.util.List;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TVillageCharts;

public interface TVillageChartsService extends GenericService<TVillageCharts, Long> {
	
	List<TVillageCharts> getVillageByDownId(Long townId);
}
