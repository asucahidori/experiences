package com.gatz.discovery.modules.cidm.service;

import java.util.List;
import java.util.Map;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TbArea;

import net.minidev.json.JSONObject;

/**
 * Created by baibing on 2016/1/22.
 */
public interface MapDataService extends GenericService<TbArea, Long> {
    /**
     * 通过 城市查询数据
     *
     * @return
     */
    List<TbArea> selectAllCity();

    /**
     * 通过一级地区数据 查询数据
     *
     * @return
     */
    List<TbArea> selectDataOfCity(TbArea sourceD);
    
    /**

     * 查询中国地图省数据
     * @return List<JSONObject>

     * @desc 根据id 及区域类型获得   ------4:街道;5:社区;6 小区;7楼栋;8:房间等信息
     * @return
     * @author xzl
     * type:1:中国省、自治区、直辖市  2:市;3：区县;4:街道;5:社区;6 小区;7楼栋;8:房间
     */
    public Map getAreaInfo(Long id,int type);
    
    /**
     * 查询中国地图数据
     * key: provinceId  省直辖市ID
	 *  	name		省直辖市名称
	 *  	id			省直辖市国标码   对应dao：gbCode
	 *  	value		国安社区用户数   对应dao：number
     * */
    public List<JSONObject> selectMapOfChina()throws Exception;
    
    /**
     * 查询中国地图市数据
     * @param  proviceId
     * @return List<JSONObject>
     *   key: proviceId   省直辖市ID
     * 		  id	                  市地区ID	 对应dao：cityId
     * 		  gbCode	      市地区国标码
     * 		  name	                  市地区名称
     * 		  value 	      市国安社区用户量 对应dao:number
     * */
    public List<JSONObject> selectMapOfChinaCity(String proviceId)throws Exception;
    
    /**
     * 查询中国地图区县数据和人口数据
     * @param cityId  市地区ID
     * @return List<JSONObject>
     * key: countyId 区县ID
     * 		gbCode   区县国标码
     * 		name 	   区县名
     * 		cityId	   市地区id
     * 		countyNumber 
     * */
    public List<JSONObject> selectMapOfChinaCounty(List<TCity> cityId)throws Exception;
    
    /**
     * 查询市/区县数据，根据省分类查询不同的数据
     * @param proviceId   省直辖市ID 默认: 0:省;1:直辖市;
     * @return List<JSONObject>
     * */
    public List<JSONObject> selectMapOfChinaCityOrCountyInfo(String proviceId)throws Exception;
    
   /**
    * 核心数据统计查询
    *  @param id 		省直辖市ID-proviceId/市地区ID-cityId/区县ID-countyId/街道ID-town_id
 	* @param areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
 	* @param lastYearDate 去年的一月一日 yyyy-01-01
 	* @param Map<String, Object> map 如果有多个参数可以通过map传入
	* @return JSONObject
	* key: income 			人均收入
	* 	   expend        	人均支出 
	* 	   customerNumber   国安社区用户
	* 	   storeNumber	            国安门店数
	* 	   comsumeLevel 	消费等级
	* 	   leadNum	   		潜力用户	
    * */
    public JSONObject selectMapOfChinaCoreData(String id, String areaType, Map<String, Object> map)throws Exception;
 
    /**
	 * 获取年份集合yyyy
	 * @param year  年份 要加/减的年份
	 * @return List<String> yyyy-mm
	 * */
	public List<String> initMapsOfChinaCountyYears(String year)throws Exception;
	
	/**
	 * 查询区县国安门店数量、国安社区数量、国安社区订单额、日期、区县数据
	 * @param countyId 区县ID
	 * @param proviceId 省公司ID
	 * @param areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
	 * @param Map<String, Object> map 用于扩展参数
	 * @return List<JSONObject>
	 * 	key:date		日期集合
	 * 		dataStore	国安门店数量
	 * 		dataVillage 国安社区数量
	 * 		dataOrder	国安社区订单额		  
	 * */
	public JSONObject selectMapOfChinaCountyInfo(String countyId, String areaType, String proviceId, Map<String, Object> map)throws Exception;

	/**
	 * 获取直辖市市数据 
	 * @param proviceId 省ID
	 * @return cityId
	 * */
	public TCity selectCityInfo(String proviceId);
}
