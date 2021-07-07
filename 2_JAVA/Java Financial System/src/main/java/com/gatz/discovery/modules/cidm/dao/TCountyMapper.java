package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.OrderMap;
import com.gatz.discovery.modules.cidm.model.TCounty;
import com.gatz.discovery.modules.cidm.model.TCountyExample;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TCountyMapper {
    int countByExample(TCountyExample example);

    int deleteByExample(TCountyExample example);

    int deleteByPrimaryKey(Long countyId);

    int insert(TCounty record);

    int insertSelective(TCounty record);

    List<TCounty> selectByExample(TCountyExample example);

    TCounty selectByPrimaryKey(Long countyId);

    int updateByExampleSelective(@Param("record") TCounty record, @Param("example") TCountyExample example);

    int updateByExample(@Param("record") TCounty record, @Param("example") TCountyExample example);

    int updateByPrimaryKeySelective(TCounty record);

    int updateByPrimaryKey(TCounty record);

	List<OrderMap> guoAnEveryAreaConut(Map map);
	
	//各区订单额总量
	List<OrderMap> everyOrderCounts(Map map);

	List<TSumOrd5grd> guoAnQuOrdersCount(Long id, int type);
	//按地区查询的数据
	List<OrderMap> everyAreaOrderCounts(Map mapOrders);
	//按地区查询各区国安用户量
	List<OrderMap> guoAnEveryConutByArea(Map mapEveryMap);
	//根据街道获取各社区国安用户量
	List<OrderMap> guoAnEveryCountByStreet(Map mapEveryMap);
	//根据街道获取各区订单金额
	List<OrderMap> getEveryOrdersByStreet(Map mapOrders);
	/**
	 * @desc 根据条件查询区县信息
	 * @param paramMap
	 * @return
	 */
	public List<TCounty> queryTcounty(Map paramMap);
	//根据小区获取订单额
	List<OrderMap> getEveryOrdersByTown(Map mapOrders);
	
}