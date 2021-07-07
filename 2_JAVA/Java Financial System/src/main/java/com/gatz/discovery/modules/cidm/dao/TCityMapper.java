package com.gatz.discovery.modules.cidm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TCityExample;

public interface TCityMapper {
    int countByExample(TCityExample example);

    int deleteByExample(TCityExample example);

    int deleteByPrimaryKey(Long cityId);

    int insert(TCity record);

    int insertSelective(TCity record);

    List<TCity> selectByExample(TCityExample example);

    TCity selectByPrimaryKey(Long cityId);

    int updateByExampleSelective(@Param("record") TCity record, @Param("example") TCityExample example);

    int updateByExample(@Param("record") TCity record, @Param("example") TCityExample example);

    int updateByPrimaryKeySelective(TCity record);

    int updateByPrimaryKey(TCity record);
    
    /**
     * 查询城市数据
     * @param provinceId
     * @param cityId
     * */
    public List<TCity> selectCityByProviceID(Map<String, Object> map);
}