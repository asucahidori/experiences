package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumOrd5grd;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grdExample;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumOrd5grdMapper {
    int countByExample(TSumOrd5grdExample example);

    int deleteByExample(TSumOrd5grdExample example);

    int deleteByPrimaryKey(TSumOrd5grdKey key);

    int insert(TSumOrd5grd record);

    int insertSelective(TSumOrd5grd record);

    List<TSumOrd5grd> selectByExample(TSumOrd5grdExample example);

    TSumOrd5grd selectByPrimaryKey(TSumOrd5grdKey key);

    int updateByExampleSelective(@Param("record") TSumOrd5grd record, @Param("example") TSumOrd5grdExample example);

    int updateByExample(@Param("record") TSumOrd5grd record, @Param("example") TSumOrd5grdExample example);

    int updateByPrimaryKeySelective(TSumOrd5grd record);

    int updateByPrimaryKey(TSumOrd5grd record);
}