package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TCityMapper;
import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TProvince;
import com.gatz.discovery.modules.cidm.service.TcityService;

@Service("tcityService")
public class TcityServiceImpl extends GenericServiceImpl<TCity, Long>  implements TcityService {

	@Resource
	private TCityMapper TCityDao;
	
	

	@Override
	public Integer queryTcityCount(Map paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TCity getTcityById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTcityById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTcity(TCity tcity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertTcity(TCity tcity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GenericDao<TCity, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 获取列表
	 * 
	 */
	public List<TCity> queryTcity(Map paramMap){
		return TCityDao.selectCityByProviceID(paramMap);
	}
}
