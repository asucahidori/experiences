package com.gatz.discovery.modules.cidm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TProvince;
import com.gatz.discovery.modules.cidm.model.TProvinceExample;

public interface TProvinceMapper {
    int countByExample(TProvinceExample example);

    int deleteByExample(TProvinceExample example);

    int deleteByPrimaryKey(Long provinceId);

    int insert(TProvince record);

    int insertSelective(TProvince record);

    List<TProvince> selectByExample(TProvinceExample example);

    TProvince selectByPrimaryKey(Long provinceId);

    int updateByExampleSelective(@Param("record") TProvince record, @Param("example") TProvinceExample example);

    int updateByExample(@Param("record") TProvince record, @Param("example") TProvinceExample example);

    int updateByPrimaryKeySelective(TProvince record);

    int updateByPrimaryKey(TProvince record);
    
    /**
     * 查询中国地图省数据和人口数
     * @return
     * 	List<Map<String, Object>>
     *  key: provinceId 省直辖市ID
     *  	 name		省直辖市名称
     *  	 gbCode		省直辖市国标码
     *  	 number		省国安社区用户数
     * */
    public List<Map<String, Object>> countMapOfChina();
    
    /**
     * 查询中国地图市数据和人口数
     * @param proviceId 省直辖市ID
     * @return
     * List<Map<String, Object>>
     * key: proviceId 省直辖市ID
     * 		cityId	      市地区ID	
     * 		gbCode	      市地区国标码
     * 		name	      市地区名称
     * 		number	      市国安社区用户量
     * */
    public List<Map<String, Object>> countMapOfChinaCity(@Param("proviceId") String proviceId);
    
    /**
     * 查询中国地图区县数据和人口数据
     * @param cityId  市地区ID
     * @return List<Map<String, Object>>
     * key: countyId 区县ID
     * 		gbCode   区县国标码
     * 		name 	   区县名
     * 		cityId	   市地区id
     * 		countyNumber 
     * */
    public List<Map<String, Object>> countMapOfChinaCounty(@Param("cityId") String cityId);
    
    /**
     * 核心数据 人均收入、人均支出
     * @param map
     * key: proviceId 省直辖市ID
     * 		areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
     * @return Map<String, Object>
     * 	key:income 人均收入
     * 		expend 人均支出 
     * */
    public Map<String, Object> countInCome(Map<String, Object> map);
    
    /**
	 * 核心数据统计国安社区用户
	 * @param map
	 * key: proviceId   省直辖市ID
	 * 		cityId   	市地区ID
	 * 		countyId 	区县ID
	 * @return Map<String, Object>
	 * key: customerNumber 国安社区用户
	 * */
    public Map<String, Object> countCustomer(Map<String, Object> map);
    
    /**
     * 核心数据统计国安门店数
     * @param map
     * key: proviceId   省直辖市ID
	 * 		cityId   	市地区ID
	 * 		countyId 	区县ID
	 * @return Map<String, Object>
	 * key: storeNumber 国安门店数
     * */
    public Map<String, Object> countStore(Map<String, Object> map);
    
    /**
     * 核心数据统计国安社区潜力用户、消费等级、核心家庭
     * @param map
     * key:areaId   区域ID
     * 	   areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
     * @return Map<String, Object>
     * 	key: comsumeLevel 消费等级
     * 		 leadNum	      潜力用户
     * 		 nuclearFamily核心家庭
     * 		 households   住宅户数
     * */
    public Map<String, Object> countSumPopulation(Map<String, Object> map);
    
    /**
     * 查询住宅数据
     * @param map
     * key:areaId   区域ID
     * 	   areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
     * @return map
     * key: households 住宅户数
     * */
    public Map<String, Object> countMapOfChinaHouseholds(Map<String, Object> map);

    
    /**
     * 查询所有省
     * @param map
     * key: households 住宅户数
     * */
     public List<TProvince> queryTprovince();
    
    /**
     * 北京地图国安门店数量
     * @param map
     * key: countyId 区县ID 数据格式: 1,2,3
     * 		createTime 开始日期  数据格式：yyyy-mm 默认从2015-09开始
     * @return List<Map<String, object>>
     * key: countyId   区县ID
     * 		number     门店数量
     * 		createTime 统计时间 yyyy-mm
     * */
    public List<Map<String, Object>> countMapOfChinaCountyStores(Map<String, Object> map);
    
    /**
     * 北京地图国安社区数量
     * @param map
     * key: countyId 区县ID 数据格式: 1,2,3
     * 		createTime 开始日期  数据格式：yyyy-mm 默认从2015-09开始
     * @return List<Map<String, Object>>
     * key: countyId 区县ID
     * 		number     门店数量
     * 		createTime 统计时间 yyyy-mm
     * */
    public List<Map<String, Object>> countMapOfChianCountyVillages(Map<String, Object> map);
    
    /**
     * 北京地图国安社区订单额
     * @param map
     * key: countyId 区县ID 数据格式: 1,2,3
     * 		areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
     * 		createTime 开始日期  数据格式：yyyy-mm 默认从2015-09开始
     * @return List<Map<String, Object>>
     * key: countyId	区县ID
     * 		number		订单金额
     * 		createTime  统计时间 yyyy-mm
     * */
    public List<Map<String, Object>> countMapOfChinaCountyOrder(Map<String, Object> map);
    /**
     * 核心数据统计国安门订单额
     * @param map
     * key: proviceId   省直辖市ID
	 * 		cityId   	市地区ID
	 * 		countyId 	区县ID
	 * @return Map<String, Object>
	 * key: storeNumber 国安门店数
     * */
    public Map<String, Object> countOrder(Map<String, Object> map);
}