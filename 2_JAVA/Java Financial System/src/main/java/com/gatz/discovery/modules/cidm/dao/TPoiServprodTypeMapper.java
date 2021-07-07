package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TPoiServprodType;
import com.gatz.discovery.modules.cidm.model.TPoiServprodTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPoiServprodTypeMapper {
    int countByExample(TPoiServprodTypeExample example);

    int deleteByExample(TPoiServprodTypeExample example);

    int deleteByPrimaryKey(Long prodServTypeId);

    int insert(TPoiServprodType record);

    int insertSelective(TPoiServprodType record);

    List<TPoiServprodType> selectByExample(TPoiServprodTypeExample example);

    TPoiServprodType selectByPrimaryKey(Long prodServTypeId);

    int updateByExampleSelective(@Param("record") TPoiServprodType record, @Param("example") TPoiServprodTypeExample example);

    int updateByExample(@Param("record") TPoiServprodType record, @Param("example") TPoiServprodTypeExample example);

    int updateByPrimaryKeySelective(TPoiServprodType record);

    int updateByPrimaryKey(TPoiServprodType record);
}