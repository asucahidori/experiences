package com.gatz.discovery.modules.cidm.service;

import java.util.HashMap;
import java.util.List;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TbArea;

public interface BuildingDataAnalyseService extends GenericService<TbArea, Long> {
	/**
	 * 楼房总量统计
	 * @param areacode
	 * @return
	 */
	public HashMap<String,String> getBuildingCount(String areacode);
	
	/**
	 * 楼房国安社区用户量
	 * @param areacode
	 * @return
	 */
	public List getBuildingUserCount(String areacode);
	
}
