package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TProvince;
import com.gatz.discovery.modules.cidm.model.TProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProvinceMapper {
    int countByExample(TProvinceExample example);

    int deleteByExample(TProvinceExample example);

    int deleteByPrimaryKey(Long provinceId);

    int insert(TProvince record);

    int insertSelective(TProvince record);

    List<TProvince> selectByExample(TProvinceExample example);

    TProvince selectByPrimaryKey(Long provinceId);

    int updateByExampleSelective(@Param("record") TProvince record, @Param("example") TProvinceExample example);

    int updateByExample(@Param("record") TProvince record, @Param("example") TProvinceExample example);

    int updateByPrimaryKeySelective(TProvince record);

    int updateByPrimaryKey(TProvince record);
}