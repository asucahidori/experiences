package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TStorePoiMapper;
import com.gatz.discovery.modules.cidm.model.TStorePoi;
import com.gatz.discovery.modules.cidm.service.TStorePoiService;

@Service
public class TStorePoiServiceImpl extends GenericServiceImpl<TStorePoi, Long> implements TStorePoiService {

	@Resource
	private TStorePoiMapper tStorePoiMapper;

	@Override
	public int insert(TStorePoi model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TStorePoi model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TStorePoi selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TStorePoi selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TStorePoi> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDao<TStorePoi, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TStorePoi selectByStreetId(Long streetId) {
		// TODO Auto-generated method stub
		return tStorePoiMapper.selectByStreetId(streetId);
	}

}
