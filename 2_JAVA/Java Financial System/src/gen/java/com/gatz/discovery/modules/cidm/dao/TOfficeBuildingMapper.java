package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TOfficeBuilding;
import com.gatz.discovery.modules.cidm.model.TOfficeBuildingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOfficeBuildingMapper {
    int countByExample(TOfficeBuildingExample example);

    int deleteByExample(TOfficeBuildingExample example);

    int deleteByPrimaryKey(Long officeBldId);

    int insert(TOfficeBuilding record);

    int insertSelective(TOfficeBuilding record);

    List<TOfficeBuilding> selectByExample(TOfficeBuildingExample example);

    TOfficeBuilding selectByPrimaryKey(Long officeBldId);

    int updateByExampleSelective(@Param("record") TOfficeBuilding record, @Param("example") TOfficeBuildingExample example);

    int updateByExample(@Param("record") TOfficeBuilding record, @Param("example") TOfficeBuildingExample example);

    int updateByPrimaryKeySelective(TOfficeBuilding record);

    int updateByPrimaryKey(TOfficeBuilding record);
}