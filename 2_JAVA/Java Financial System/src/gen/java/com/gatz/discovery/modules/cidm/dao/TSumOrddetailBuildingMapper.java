package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrddetailBuilding;
import com.gatz.discovery.modules.cidm.model.TSumOrddetailBuildingExample;
import com.gatz.discovery.modules.cidm.model.TSumOrddetailBuildingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrddetailBuildingMapper {
    int countByExample(TSumOrddetailBuildingExample example);

    int deleteByExample(TSumOrddetailBuildingExample example);

    int deleteByPrimaryKey(TSumOrddetailBuildingKey key);

    int insert(TSumOrddetailBuilding record);

    int insertSelective(TSumOrddetailBuilding record);

    List<TSumOrddetailBuilding> selectByExample(TSumOrddetailBuildingExample example);

    TSumOrddetailBuilding selectByPrimaryKey(TSumOrddetailBuildingKey key);

    int updateByExampleSelective(@Param("record") TSumOrddetailBuilding record, @Param("example") TSumOrddetailBuildingExample example);

    int updateByExample(@Param("record") TSumOrddetailBuilding record, @Param("example") TSumOrddetailBuildingExample example);

    int updateByPrimaryKeySelective(TSumOrddetailBuilding record);

    int updateByPrimaryKey(TSumOrddetailBuilding record);
}