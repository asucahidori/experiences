package com.gatz.discovery.modules.cidm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TSumHouse;
import com.gatz.discovery.modules.cidm.model.TSumHouseExample;

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
    
    /**
     *  根据小区id , 小区--住房住宅性质
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getAreaHomeProperty(String areacode);
    
    /**
     * 根据楼栋id ,楼栋--住房住宅性质
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getBuildingHomeProperty(String areacode);
    
    /**
     * 查询编码,面积
     * @param record
     * @return
     */
    List<Map<Integer, Object>> searchSumHouse(TSumHouse record);
    
    /**
     * 查询小区出租比例
     * @param record
     * @return
     */
    HashMap<String,Object> queryTinyVillageRentalRatio(Map map);
}