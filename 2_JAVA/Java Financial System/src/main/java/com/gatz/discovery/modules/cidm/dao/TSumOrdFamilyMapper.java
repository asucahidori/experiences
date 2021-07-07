package com.gatz.discovery.modules.cidm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TSumOrdFamily;
import com.gatz.discovery.modules.cidm.model.TSumOrdFamilyExample;
import com.gatz.discovery.modules.cidm.model.TSumOrdFamilyKey;

public interface TSumOrdFamilyMapper {
    int countByExample(TSumOrdFamilyExample example);

    int deleteByExample(TSumOrdFamilyExample example);

    int deleteByPrimaryKey(TSumOrdFamilyKey key);

    int insert(TSumOrdFamily record);

    int insertSelective(TSumOrdFamily record);

    List<TSumOrdFamily> selectByExample(TSumOrdFamilyExample example);

    TSumOrdFamily selectByPrimaryKey(TSumOrdFamilyKey key);

    int updateByExampleSelective(@Param("record") TSumOrdFamily record, @Param("example") TSumOrdFamilyExample example);

    int updateByExample(@Param("record") TSumOrdFamily record, @Param("example") TSumOrdFamilyExample example);

    int updateByPrimaryKeySelective(TSumOrdFamily record);

    int updateByPrimaryKey(TSumOrdFamily record);
    
    /**
     * 查询订单订单量、订单额
     * @param record
     * @return
     */
    List<Map<Integer, Object>> searchSumOrdFamily(TSumOrdFamily record);
}