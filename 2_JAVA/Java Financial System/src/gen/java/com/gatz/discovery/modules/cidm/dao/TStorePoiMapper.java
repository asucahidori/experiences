package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TStorePoi;
import com.gatz.discovery.modules.cidm.model.TStorePoiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStorePoiMapper {
    int countByExample(TStorePoiExample example);

    int deleteByExample(TStorePoiExample example);

    int deleteByPrimaryKey(Long storePoiId);

    int insert(TStorePoi record);

    int insertSelective(TStorePoi record);

    List<TStorePoi> selectByExample(TStorePoiExample example);

    TStorePoi selectByPrimaryKey(Long storePoiId);

    int updateByExampleSelective(@Param("record") TStorePoi record, @Param("example") TStorePoiExample example);

    int updateByExample(@Param("record") TStorePoi record, @Param("example") TStorePoiExample example);

    int updateByPrimaryKeySelective(TStorePoi record);

    int updateByPrimaryKey(TStorePoi record);
}