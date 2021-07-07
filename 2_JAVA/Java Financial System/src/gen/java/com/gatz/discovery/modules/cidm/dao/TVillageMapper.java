package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TVillage;
import com.gatz.discovery.modules.cidm.model.TVillageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVillageMapper {
    int countByExample(TVillageExample example);

    int deleteByExample(TVillageExample example);

    int deleteByPrimaryKey(Long villageId);

    int insert(TVillage record);

    int insertSelective(TVillage record);

    List<TVillage> selectByExample(TVillageExample example);

    TVillage selectByPrimaryKey(Long villageId);

    int updateByExampleSelective(@Param("record") TVillage record, @Param("example") TVillageExample example);

    int updateByExample(@Param("record") TVillage record, @Param("example") TVillageExample example);

    int updateByPrimaryKeySelective(TVillage record);

    int updateByPrimaryKey(TVillage record);
}