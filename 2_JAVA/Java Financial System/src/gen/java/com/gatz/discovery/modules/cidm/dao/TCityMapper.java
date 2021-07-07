package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}