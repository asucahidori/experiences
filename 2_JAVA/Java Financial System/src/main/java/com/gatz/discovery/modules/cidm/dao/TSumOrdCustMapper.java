package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrdCust;
import com.gatz.discovery.modules.cidm.model.TSumOrdCustExample;
import com.gatz.discovery.modules.cidm.model.TSumOrdCustKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrdCustMapper {
    int countByExample(TSumOrdCustExample example);

    int deleteByExample(TSumOrdCustExample example);

    int deleteByPrimaryKey(TSumOrdCustKey key);

    int insert(TSumOrdCust record);

    int insertSelective(TSumOrdCust record);

    List<TSumOrdCust> selectByExample(TSumOrdCustExample example);

    TSumOrdCust selectByPrimaryKey(TSumOrdCustKey key);

    int updateByExampleSelective(@Param("record") TSumOrdCust record, @Param("example") TSumOrdCustExample example);

    int updateByExample(@Param("record") TSumOrdCust record, @Param("example") TSumOrdCustExample example);

    int updateByPrimaryKeySelective(TSumOrdCust record);

    int updateByPrimaryKey(TSumOrdCust record);
}