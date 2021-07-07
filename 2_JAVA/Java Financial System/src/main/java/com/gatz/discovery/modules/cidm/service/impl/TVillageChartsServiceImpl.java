package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TVillageChartsMapper;
import com.gatz.discovery.modules.cidm.model.TVillageCharts;
import com.gatz.discovery.modules.cidm.service.TVillageChartsService;

@Service
public class TVillageChartsServiceImpl extends GenericServiceImpl<TVillageCharts, Long>
		implements TVillageChartsService {

	@Resource
	private TVillageChartsMapper tVillageChartsMapper;

	@Override
	public int insert(TVillageCharts model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TVillageCharts model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TVillageCharts selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TVillageCharts selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVillageCharts> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVillageCharts> getVillageByDownId(Long townId) {
		// TODO Auto-generated method stub
		return tVillageChartsMapper.getVillageByDownId(townId);
	}

	@Override
	public GenericDao<TVillageCharts, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
