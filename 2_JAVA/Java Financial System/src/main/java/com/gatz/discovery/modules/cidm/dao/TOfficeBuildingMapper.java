package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TOfficeBuilding;
import com.gatz.discovery.modules.cidm.model.TOfficeBuildingExample;

import java.util.List;
import java.util.Map;

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
    
    /**
     * @desc 根据条件查询写字楼信息
     * @param params
     * @return
     */
    List<TOfficeBuilding> queryTofficeBuildingInfo(Map<String,Object> params);
}