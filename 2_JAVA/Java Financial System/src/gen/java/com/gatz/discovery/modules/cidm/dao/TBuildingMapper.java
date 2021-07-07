package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TBuilding;
import com.gatz.discovery.modules.cidm.model.TBuildingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBuildingMapper {
    int countByExample(TBuildingExample example);

    int deleteByExample(TBuildingExample example);

    int deleteByPrimaryKey(Long buildingId);

    int insert(TBuilding record);

    int insertSelective(TBuilding record);

    List<TBuilding> selectByExample(TBuildingExample example);

    TBuilding selectByPrimaryKey(Long buildingId);

    int updateByExampleSelective(@Param("record") TBuilding record, @Param("example") TBuildingExample example);

    int updateByExample(@Param("record") TBuilding record, @Param("example") TBuildingExample example);

    int updateByPrimaryKeySelective(TBuilding record);

    int updateByPrimaryKey(TBuilding record);
}