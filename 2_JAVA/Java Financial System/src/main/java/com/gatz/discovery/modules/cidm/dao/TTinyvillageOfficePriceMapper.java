package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficePrice;
import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficePriceExample;
import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficePriceKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TTinyvillageOfficePriceMapper {
    int countByExample(TTinyvillageOfficePriceExample example);

    int deleteByExample(TTinyvillageOfficePriceExample example);

    int deleteByPrimaryKey(TTinyvillageOfficePriceKey key);

    int insert(TTinyvillageOfficePrice record);

    int insertSelective(TTinyvillageOfficePrice record);

    List<TTinyvillageOfficePrice> selectByExample(TTinyvillageOfficePriceExample example);

    TTinyvillageOfficePrice selectByPrimaryKey(TTinyvillageOfficePriceKey key);

    int updateByExampleSelective(@Param("record") TTinyvillageOfficePrice record, @Param("example") TTinyvillageOfficePriceExample example);

    int updateByExample(@Param("record") TTinyvillageOfficePrice record, @Param("example") TTinyvillageOfficePriceExample example);

    int updateByPrimaryKeySelective(TTinyvillageOfficePrice record);

    int updateByPrimaryKey(TTinyvillageOfficePrice record);
    
    /**
     * 根据街道id ,各社区写字楼平均租金
     * @param areacode
     * @return
     */
    public List<Map<String, Object>> getVillageAverageRent(String areacode);
}