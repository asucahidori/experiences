package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TTownMapper;
import com.gatz.discovery.modules.cidm.model.TTown;
import com.gatz.discovery.modules.cidm.service.TTownService;

@Service
public class TTownServiceImpl extends GenericServiceImpl<TTown, Long> implements TTownService {

	@Resource
	private TTownMapper tTownMapper;

	@Override
	public int insert(TTown model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TTown model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TTown selectById(Long id) {
		// TODO Auto-generated method stub
		return tTownMapper.selectByPrimaryKey(id);
	}

	@Override
	public TTown selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TTown> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TTown selectByPrimaryKey(Long townId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDao<TTown, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
