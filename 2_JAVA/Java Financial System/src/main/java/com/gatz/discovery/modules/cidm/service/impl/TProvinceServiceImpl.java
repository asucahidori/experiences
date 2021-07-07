package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TProvinceMapper;
import com.gatz.discovery.modules.cidm.model.TProvince;
import com.gatz.discovery.modules.cidm.model.TbArea;
import com.gatz.discovery.modules.cidm.service.TProvinceService;


@Service("tprovinceService")
public class TProvinceServiceImpl extends GenericServiceImpl<TProvince, Long> implements TProvinceService {
	
	@Resource
	private TProvinceMapper TProvinceDao;
	
	public List<TProvince> queryTprovince(Map<String,Object> paramMap) {
		// TODO Auto-generated method stub
		List<TProvince> list =  TProvinceDao.queryTprovince();
		return list;
	}

	@Override
	public GenericDao<TProvince, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer queryTprovinceCount(Map paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TProvince getTprovinceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTprovinceById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTprovince(TProvince tprovince) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertTprovince(TProvince tprovince) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
