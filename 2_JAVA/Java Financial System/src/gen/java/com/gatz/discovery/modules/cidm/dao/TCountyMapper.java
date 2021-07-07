package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TCounty;
import com.gatz.discovery.modules.cidm.model.TCountyExample;
import java.util.List;
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
}