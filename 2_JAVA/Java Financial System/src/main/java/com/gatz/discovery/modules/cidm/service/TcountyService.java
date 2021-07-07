package com.gatz.discovery.modules.cidm.service;

import java.util.List;
import java.util.Map;

import com.gatz.discovery.modules.cidm.model.TCounty;

/**
 * Service接口
 * 
 */
public interface TcountyService  {

	/**
	 * 获取列表
	 * 
	 */
	public List<TCounty> queryTcounty(Map paramMap);

	/**
     * 查询符合条件的数量
     */
	public Integer queryTcountyCount(Map paramMap);
	/**
	 * 根据Id查询基本信息
	 */
	public TCounty getTcountyById(Long id);
	
	/**
	 * 根据Id删除信息
	 */
	public int deleteTcountyById(Long id);
	/**
	 * 修改信息
	 * 
	 */
	public int updateTcounty(TCounty tcounty);
	
	
	/**
	 * 新增
	 * @return
	 */
	public int insertTcounty(TCounty tcounty);
	
}
