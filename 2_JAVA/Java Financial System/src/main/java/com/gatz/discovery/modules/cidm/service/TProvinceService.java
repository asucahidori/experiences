package com.gatz.discovery.modules.cidm.service;

import java.util.List;
import java.util.Map;

import com.gatz.discovery.modules.cidm.model.TProvince;

/**
 * Service接口
 * 
 */
public interface TProvinceService  {

	/**
	 * 获取列表
	 * 
	 */
	public List<TProvince> queryTprovince(Map<String,Object> paramMap);

	/**
     * 查询符合条件的数量
     */
	public Integer queryTprovinceCount(Map paramMap);
	/**
	 * 根据Id查询基本信息
	 */
	public TProvince getTprovinceById(Long id);
	
	/**
	 * 根据Id删除信息
	 */
	public int deleteTprovinceById(Long id);
	/**
	 * 修改信息
	 * 
	 */
	public int updateTprovince(TProvince tprovince);
	
	
	/**
	 * 新增
	 * @return
	 */
	public int insertTprovince(TProvince tprovince);
	
}
