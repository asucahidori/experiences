package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrddetailCust;
import com.gatz.discovery.modules.cidm.model.TSumOrddetailCustExample;
import com.gatz.discovery.modules.cidm.model.TSumOrddetailCustKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrddetailCustMapper {
    int countByExample(TSumOrddetailCustExample example);

    int deleteByExample(TSumOrddetailCustExample example);

    int deleteByPrimaryKey(TSumOrddetailCustKey key);

    int insert(TSumOrddetailCust record);

    int insertSelective(TSumOrddetailCust record);

    List<TSumOrddetailCust> selectByExample(TSumOrddetailCustExample example);

    TSumOrddetailCust selectByPrimaryKey(TSumOrddetailCustKey key);

    int updateByExampleSelective(@Param("record") TSumOrddetailCust record, @Param("example") TSumOrddetailCustExample example);

    int updateByExample(@Param("record") TSumOrddetailCust record, @Param("example") TSumOrddetailCustExample example);

    int updateByPrimaryKeySelective(TSumOrddetailCust record);

    int updateByPrimaryKey(TSumOrddetailCust record);
}