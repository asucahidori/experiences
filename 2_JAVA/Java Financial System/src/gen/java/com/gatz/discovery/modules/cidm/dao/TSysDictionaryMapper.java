package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSysDictionary;
import com.gatz.discovery.modules.cidm.model.TSysDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysDictionaryMapper {
    int countByExample(TSysDictionaryExample example);

    int deleteByExample(TSysDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSysDictionary record);

    int insertSelective(TSysDictionary record);

    List<TSysDictionary> selectByExample(TSysDictionaryExample example);

    TSysDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSysDictionary record, @Param("example") TSysDictionaryExample example);

    int updateByExample(@Param("record") TSysDictionary record, @Param("example") TSysDictionaryExample example);

    int updateByPrimaryKeySelective(TSysDictionary record);

    int updateByPrimaryKey(TSysDictionary record);
}