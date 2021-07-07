package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TCountyMapper;
import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TCounty;
import com.gatz.discovery.modules.cidm.service.TcountyService;


@Service("tcountyService")
public class TcountyServiceImpl extends GenericServiceImpl<TCounty, Long> implements TcountyService {

	@Resource
	private TCountyMapper tCountyDao;
	
	/**
	 * 获取列表
	 * 
	 */
	public List<TCounty> queryTcounty(Map paramMap){
		return tCountyDao.queryTcounty(paramMap);
	}

	@Override
	public Integer queryTcountyCount(Map paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TCounty getTcountyById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTcountyById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTcounty(TCounty tcounty) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertTcounty(TCounty tcounty) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GenericDao<TCounty, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}


}
