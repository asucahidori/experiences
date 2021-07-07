package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumPopulation;
import com.gatz.discovery.modules.cidm.model.TSumPopulationExample;
import com.gatz.discovery.modules.cidm.model.TSumPopulationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumPopulationMapper {
    int countByExample(TSumPopulationExample example);

    int deleteByExample(TSumPopulationExample example);

    int deleteByPrimaryKey(TSumPopulationKey key);

    int insert(TSumPopulation record);

    int insertSelective(TSumPopulation record);

    List<TSumPopulation> selectByExample(TSumPopulationExample example);

    TSumPopulation selectByPrimaryKey(TSumPopulationKey key);

    int updateByExampleSelective(@Param("record") TSumPopulation record, @Param("example") TSumPopulationExample example);

    int updateByExample(@Param("record") TSumPopulation record, @Param("example") TSumPopulationExample example);

    int updateByPrimaryKeySelective(TSumPopulation record);

    int updateByPrimaryKey(TSumPopulation record);
}