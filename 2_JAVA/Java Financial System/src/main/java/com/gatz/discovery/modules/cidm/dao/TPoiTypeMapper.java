package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TPoiType;
import com.gatz.discovery.modules.cidm.model.TPoiTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPoiTypeMapper {
    int countByExample(TPoiTypeExample example);

    int deleteByExample(TPoiTypeExample example);

    int deleteByPrimaryKey(Long poiTypeId);

    int insert(TPoiType record);

    int insertSelective(TPoiType record);

    List<TPoiType> selectByExample(TPoiTypeExample example);

    TPoiType selectByPrimaryKey(Long poiTypeId);

    int updateByExampleSelective(@Param("record") TPoiType record, @Param("example") TPoiTypeExample example);

    int updateByExample(@Param("record") TPoiType record, @Param("example") TPoiTypeExample example);

    int updateByPrimaryKeySelective(TPoiType record);

    int updateByPrimaryKey(TPoiType record);
}