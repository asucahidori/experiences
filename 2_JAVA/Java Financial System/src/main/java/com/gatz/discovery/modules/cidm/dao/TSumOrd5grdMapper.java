package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrd5grd;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grdExample;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grdKey;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TSumOrd5grdMapper {
    int countByExample(TSumOrd5grdExample example);

    int deleteByExample(TSumOrd5grdExample example);

    int deleteByPrimaryKey(TSumOrd5grdKey key);

    int insert(TSumOrd5grd record);

    int insertSelective(TSumOrd5grd record);

    List<TSumOrd5grd> selectByExample(TSumOrd5grdExample example);

    TSumOrd5grd selectByPrimaryKey(TSumOrd5grdKey key);

    int updateByExampleSelective(@Param("record") TSumOrd5grd record, @Param("example") TSumOrd5grdExample example);

    int updateByExample(@Param("record") TSumOrd5grd record, @Param("example") TSumOrd5grdExample example);

    int updateByPrimaryKeySelective(TSumOrd5grd record);

    int updateByPrimaryKey(TSumOrd5grd record);
    
    //查询国安社区订单金额
    List<TSumOrd5grd> selectOrders(Map map);
    //根据街道获取国安订单额
	List<TSumOrd5grd> gerOrderByStreet(Map resultMap);
}