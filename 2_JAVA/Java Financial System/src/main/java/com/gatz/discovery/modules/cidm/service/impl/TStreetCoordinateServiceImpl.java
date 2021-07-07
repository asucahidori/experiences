package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TStreetCoordinateMapper;
import com.gatz.discovery.modules.cidm.model.TStreetCoordinateWithBLOBs;
import com.gatz.discovery.modules.cidm.service.TStreetCoordinateService;

@Service
public class TStreetCoordinateServiceImpl extends GenericServiceImpl<TStreetCoordinateWithBLOBs, Long> implements TStreetCoordinateService {

	@Resource
	private TStreetCoordinateMapper tStreetCoordinateMapper; 
	
	@Override
	public int insert(TStreetCoordinateWithBLOBs model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TStreetCoordinateWithBLOBs model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TStreetCoordinateWithBLOBs selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TStreetCoordinateWithBLOBs selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TStreetCoordinateWithBLOBs> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDao<TStreetCoordinateWithBLOBs, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TStreetCoordinateWithBLOBs selectByStreetId(int streetId) {
		// TODO Auto-generated method stub
		return tStreetCoordinateMapper.selectByStreetId(streetId);
	}

}
