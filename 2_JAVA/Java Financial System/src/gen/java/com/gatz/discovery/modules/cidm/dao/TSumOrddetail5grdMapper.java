package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrddetail5grd;
import com.gatz.discovery.modules.cidm.model.TSumOrddetail5grdExample;
import com.gatz.discovery.modules.cidm.model.TSumOrddetail5grdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrddetail5grdMapper {
    int countByExample(TSumOrddetail5grdExample example);

    int deleteByExample(TSumOrddetail5grdExample example);

    int deleteByPrimaryKey(TSumOrddetail5grdKey key);

    int insert(TSumOrddetail5grd record);

    int insertSelective(TSumOrddetail5grd record);

    List<TSumOrddetail5grd> selectByExample(TSumOrddetail5grdExample example);

    TSumOrddetail5grd selectByPrimaryKey(TSumOrddetail5grdKey key);

    int updateByExampleSelective(@Param("record") TSumOrddetail5grd record, @Param("example") TSumOrddetail5grdExample example);

    int updateByExample(@Param("record") TSumOrddetail5grd record, @Param("example") TSumOrddetail5grdExample example);

    int updateByPrimaryKeySelective(TSumOrddetail5grd record);

    int updateByPrimaryKey(TSumOrddetail5grd record);
}