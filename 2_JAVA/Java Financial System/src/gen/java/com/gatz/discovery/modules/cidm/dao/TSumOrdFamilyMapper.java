package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrdFamily;
import com.gatz.discovery.modules.cidm.model.TSumOrdFamilyExample;
import com.gatz.discovery.modules.cidm.model.TSumOrdFamilyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}