package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TVillageCharts;
import com.gatz.discovery.modules.cidm.model.TVillageChartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVillageChartsMapper {
    int countByExample(TVillageChartsExample example);

    int deleteByExample(TVillageChartsExample example);

    int deleteByPrimaryKey(Long villageId);

    int insert(TVillageCharts record);

    int insertSelective(TVillageCharts record);

    List<TVillageCharts> selectByExample(TVillageChartsExample example);

    TVillageCharts selectByPrimaryKey(Long villageId);

    int updateByExampleSelective(@Param("record") TVillageCharts record, @Param("example") TVillageChartsExample example);

    int updateByExample(@Param("record") TVillageCharts record, @Param("example") TVillageChartsExample example);

    int updateByPrimaryKeySelective(TVillageCharts record);

    int updateByPrimaryKey(TVillageCharts record);
}