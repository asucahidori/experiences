package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrddetailFamily;
import com.gatz.discovery.modules.cidm.model.TSumOrddetailFamilyExample;
import com.gatz.discovery.modules.cidm.model.TSumOrddetailFamilyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrddetailFamilyMapper {
    int countByExample(TSumOrddetailFamilyExample example);

    int deleteByExample(TSumOrddetailFamilyExample example);

    int deleteByPrimaryKey(TSumOrddetailFamilyKey key);

    int insert(TSumOrddetailFamily record);

    int insertSelective(TSumOrddetailFamily record);

    List<TSumOrddetailFamily> selectByExample(TSumOrddetailFamilyExample example);

    TSumOrddetailFamily selectByPrimaryKey(TSumOrddetailFamilyKey key);

    int updateByExampleSelective(@Param("record") TSumOrddetailFamily record, @Param("example") TSumOrddetailFamilyExample example);

    int updateByExample(@Param("record") TSumOrddetailFamily record, @Param("example") TSumOrddetailFamilyExample example);

    int updateByPrimaryKeySelective(TSumOrddetailFamily record);

    int updateByPrimaryKey(TSumOrddetailFamily record);
}