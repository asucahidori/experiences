package com.gatz.discovery.modules.cidm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.AreaMapVo;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;
import com.gatz.discovery.modules.cidm.model.TSumPopulationExample;
import com.gatz.discovery.modules.cidm.model.TSumPopulationKey;

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
    
    /**
	 * 区县国安社区性别结构(街道--各街道性别结构)
	 * @param areacode
	 * @return
	 */
	public List<Map<String, Object>> getAreaSexCount(String areacode);
	/**
	 * 根据省市id , 省市/直辖市--各区性别结构
	 * @param areacode
	 * @return
	 */
	public List<Map<String, Object>> getCountrySexCount(String areacode);

    /**
     * 住户家庭结构类型分布
     * @param record
     * @return
     */
    List<Map<Integer, Object>> searchSumPopulation(TSumPopulation record);
    
    
    /**
     * 季度消费等级
     * @param record
     * @return
     */
    List<Map<Integer, Object>> searchSumPopulationGrade(TSumPopulation record);
    
    /**
     * 查询人口规模
     * @param record
     * @return
     */
    List<Map<Integer, Object>> searchSumPopulationBypopulation(TSumPopulation record);
    
    /**
     * 查询常住人口数
     * @param record
     * @return
     * @author xzl
     */
    List<AreaMapVo> queryResidentPopulationByArea(Map<String,Object> map);
    
    /**
     * 居民消费等级
     * @param record
     * @return
     * @author xzl
     */
    public List<HashMap<String,Object>> queryResidentSalesLevelByArea(Map<String, Object> map);
    
}