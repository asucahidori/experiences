package com.gatz.discovery.modules.cidm.service;

import java.util.List;
import java.util.Map;

import com.gatz.discovery.modules.cidm.model.TCity;

/**
 * Service接口
 * 
 */
public interface TcityService  {

	/**
	 * 获取列表
	 * 
	 */
	public List<TCity> queryTcity(Map paramMap);

	/**
     * 查询符合条件的数量
     */
	public Integer queryTcityCount(Map paramMap);
	/**
	 * 根据Id查询基本信息
	 */
	public TCity getTcityById(Long id);
	
	/**
	 * 根据Id删除信息
	 */
	public int deleteTcityById(Long id);
	/**
	 * 修改信息
	 * 
	 */
	public int updateTcity(TCity tcity);
	
	
	/**
	 * 新增
	 * @return
	 */
	public int insertTcity(TCity tcity);
	
}
