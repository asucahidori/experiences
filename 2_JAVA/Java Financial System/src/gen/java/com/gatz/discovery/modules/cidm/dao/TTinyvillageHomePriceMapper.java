package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyvillageHomePrice;
import com.gatz.discovery.modules.cidm.model.TTinyvillageHomePriceExample;
import com.gatz.discovery.modules.cidm.model.TTinyvillageHomePriceKey;
import java.util.List;
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
}