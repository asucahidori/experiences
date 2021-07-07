package com.gatz.discovery.modules.cidm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.core.entity.JSONResult;
import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TbArea;

public interface AreaDataAnalyseService extends GenericService<TbArea, Long> {
	/**
	 * 区县国安社区性别结构(街道--各街道性别结构)
	 * @param areacode
	 * @return
	 */
	public List getAreaSexCount(String areacode);
	
	/**
	 * 根据省市id , 省市/直辖市--各区性别结构
	 * @param areacode
	 * @return
	 */
	public List getCountrySexCount(String areacode);
	/**
     * 根据省市id , 市--各区住宅房价（区名）
     * @param areacode
     * @return
     */
    public List getCityHomePriceCountry(String areacode);
    
    /**
     * 根据省市id , 市住宅房价（日期）
     * @param areacode
     * @return
     */
    public List getCityHomePriceCount(String areacode);
    
    /**
     * 根据区县id , 街道--各街道住宅房价（街道名）
     * @param areacode
     * @return
     */
    public List getCountryHomePriceTown(String areacode);
    
    /**
     * 根据区县id , 区县住宅房价（日期）
     * @param areacode
     * @return
     */
    public List getCountryHomePriceCount(String areacode);
    
    /**
     * 根据街道id , 街道--各社区住宅房价（社区名）
     * @param areacode
     * @return
     */
    public List getTownHomePriceVillage(String areacode);
    
    /**
     * 根据街道id , 街道社区住宅房价（日期）
     * @param areacode
     * @return
     */
    public List getTownHomePriceCount(String areacode);
    
    
    /**
     *  根据小区id , 小区--住房住宅性质
     * @param areacode
     * @return
     */
    public List getAreaHomeProperty(String areacode);
    
    /**
     * 根据楼栋id ,楼栋--住房住宅性质
     * @param areacode
     * @return
     */
    public List getBuildingHomeProperty(String areacode);
    
    
    
    /**
     *  根据街道id , 各社区写字楼总面积
     * @param areacode
     * @return
     */
    public List getVillageAreaCount(String areacode);
    
    /**
     * 根据街道id ,各社区写字楼平均租金
     * @param areacode
     * @return
     */
    public List getVillageAverageRent(String areacode);
    
    /**
     * 根据小区id , 住宅房价（按年月）
     * @param areacode
     * @return
     */
    public List getVillageHomePriceCount(String areacode);

    /**
     * 根据街道ID，取得街道周边业态
     * @param areacode
     * @return
     */
	public List getStreetSurroundState(String areacode);
	/**
	 * 根据区域ID，取得门店POI
	 * @param id
	 * @param type
	 * @return
	 */
	public List queryStorePoi(Long id);
	
	
	/**
	 * 高德地图，查询区域坐标
	 * @param id
	 * @param type
	 * @return
	 */
	public List selectMapWithBLOBsGaode(Long id);
}
