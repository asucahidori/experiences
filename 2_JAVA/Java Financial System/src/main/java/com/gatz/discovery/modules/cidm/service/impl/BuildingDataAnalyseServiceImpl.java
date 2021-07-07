package com.gatz.discovery.modules.cidm.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.model.TbArea;
import com.gatz.discovery.modules.cidm.service.BuildingDataAnalyseService;

@Service
public class BuildingDataAnalyseServiceImpl extends GenericServiceImpl<TbArea, Long>
		implements BuildingDataAnalyseService {

	@Override
	public int insert(TbArea model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TbArea model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbArea selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TbArea selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TbArea> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GenericDao<TbArea, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, String> getBuildingCount(String areacode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getBuildingUserCount(String areacode) {
		// TODO Auto-generated method stub
		return null;
	}

	



}
