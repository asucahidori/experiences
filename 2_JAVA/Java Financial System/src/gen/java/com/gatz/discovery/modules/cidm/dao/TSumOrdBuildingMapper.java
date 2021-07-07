package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrdBuilding;
import com.gatz.discovery.modules.cidm.model.TSumOrdBuildingExample;
import com.gatz.discovery.modules.cidm.model.TSumOrdBuildingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrdBuildingMapper {
    int countByExample(TSumOrdBuildingExample example);

    int deleteByExample(TSumOrdBuildingExample example);

    int deleteByPrimaryKey(TSumOrdBuildingKey key);

    int insert(TSumOrdBuilding record);

    int insertSelective(TSumOrdBuilding record);

    List<TSumOrdBuilding> selectByExample(TSumOrdBuildingExample example);

    TSumOrdBuilding selectByPrimaryKey(TSumOrdBuildingKey key);

    int updateByExampleSelective(@Param("record") TSumOrdBuilding record, @Param("example") TSumOrdBuildingExample example);

    int updateByExample(@Param("record") TSumOrdBuilding record, @Param("example") TSumOrdBuildingExample example);

    int updateByPrimaryKeySelective(TSumOrdBuilding record);

    int updateByPrimaryKey(TSumOrdBuilding record);
}