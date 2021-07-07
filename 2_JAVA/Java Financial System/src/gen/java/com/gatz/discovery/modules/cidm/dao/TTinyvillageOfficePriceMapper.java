package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficePrice;
import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficePriceExample;
import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficePriceKey;
import java.util.List;
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
}