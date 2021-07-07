package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumHouse;
import com.gatz.discovery.modules.cidm.model.TSumHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumHouseMapper {
    int countByExample(TSumHouseExample example);

    int deleteByExample(TSumHouseExample example);

    int deleteByPrimaryKey(Long areaId);

    int insert(TSumHouse record);

    int insertSelective(TSumHouse record);

    List<TSumHouse> selectByExample(TSumHouseExample example);

    TSumHouse selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") TSumHouse record, @Param("example") TSumHouseExample example);

    int updateByExample(@Param("record") TSumHouse record, @Param("example") TSumHouseExample example);

    int updateByPrimaryKeySelective(TSumHouse record);

    int updateByPrimaryKey(TSumHouse record);
}