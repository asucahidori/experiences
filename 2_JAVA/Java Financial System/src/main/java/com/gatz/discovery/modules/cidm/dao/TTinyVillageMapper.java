package com.gatz.discovery.modules.cidm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TTinyVillage;
import com.gatz.discovery.modules.cidm.model.TTinyVillageExample;

public interface TTinyVillageMapper {
    int countByExample(TTinyVillageExample example);

    int deleteByExample(TTinyVillageExample example);

    int deleteByPrimaryKey(Long tinyvillageId);

    int insert(TTinyVillage record);

    int insertSelective(TTinyVillage record);

    List<TTinyVillage> selectByExample(TTinyVillageExample example);

    TTinyVillage selectByPrimaryKey(Long tinyvillageId);

    int updateByExampleSelective(@Param("record") TTinyVillage record, @Param("example") TTinyVillageExample example);

    int updateByExample(@Param("record") TTinyVillage record, @Param("example") TTinyVillageExample example);

    int updateByPrimaryKeySelective(TTinyVillage record);

    int updateByPrimaryKey(TTinyVillage record);
    
    /**
     * @desc 根据条件查询小区信息
     * @param params
     * @return
     */
    List<TTinyVillage> queryTtinyVillageInfo(Map<String,Object> params);
    
    /**
     * @desc 根据条件查询街道住宅价格信息
     * @param params
     * @return
     */
    HashMap<String,Object> queryStreetHomePriceCoreInfo(String id);
 
    /**
     * @desc 根据条件查询街道写字楼价格信息
     * @param params
     * @return
     */
    HashMap<String,Object> queryStreetOfficePriceCoreInfo(String id);
    
    /**
     * @desc 根据条件查询小区住宅楼价格信息
     * @param params
     * @return
     */
    HashMap<String,Object> queryTinVillageHomePriceCoreData(String id);
}