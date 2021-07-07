package com.gatz.discovery.modules.cidm.dao;

import java.util.List;
import java.util.Map;

import net.minidev.json.JSONObject;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TBuilding;
import com.gatz.discovery.modules.cidm.model.TBuildingExample;

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
    
    /**
     * @desc 根据条件查询楼栋信息
     * @param params
     * @return
     */
    List<TBuilding> queryTbuildingInfo(Map<String,Object> params);


}