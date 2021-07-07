package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyvillageHomePrice;
import com.gatz.discovery.modules.cidm.model.TTinyvillageHomePriceExample;
import com.gatz.discovery.modules.cidm.model.TTinyvillageHomePriceKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TTinyvillageHomePriceMapper {
    int countByExample(TTinyvillageHomePriceExample example);

    int deleteByExample(TTinyvillageHomePriceExample example);

    int deleteByPrimaryKey(TTinyvillageHomePriceKey key);

    int insert(TTinyvillageHomePrice record);

    int insertSelective(TTinyvillageHomePrice record);

    List<TTinyvillageHomePrice> selectByExample(TTinyvillageHomePriceExample example);

    TTinyvillageHomePrice selectByPrimaryKey(TTinyvillageHomePriceKey key);

    int updateByExampleSelective(@Param("record") TTinyvillageHomePrice record, @Param("example") TTinyvillageHomePriceExample example);

    int updateByExample(@Param("record") TTinyvillageHomePrice record, @Param("example") TTinyvillageHomePriceExample example);

    int updateByPrimaryKeySelective(TTinyvillageHomePrice record);

    int updateByPrimaryKey(TTinyvillageHomePrice record);
    
    
    /**
     * 根据省市id , 市--各区住宅房价（区名）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getCityHomePriceCountry(String areacode);
    
    /**
     * 根据省市id , 市住宅房价（日期）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getCityHomePriceCount(String areacode);
    
    /**
     * 根据区县id , 街道--各街道住宅房价（街道名）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getCountryHomePriceTown(String areacode);
    
    /**
     * 根据区县id , 区县住宅房价（日期）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getCountryHomePriceCount(String areacode);
    
    /**
     * 根据街道id , 街道--各社区住宅房价（社区名）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getTownHomePriceVillage(String areacode);
    
    /**
     * 根据街道id , 街道社区住宅房价（日期）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getTownHomePriceCount(String areacode);
    
    /**
     * 根据小区id , 住宅房价（按年月）
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getVillageHomePriceCount(String areacode);
}