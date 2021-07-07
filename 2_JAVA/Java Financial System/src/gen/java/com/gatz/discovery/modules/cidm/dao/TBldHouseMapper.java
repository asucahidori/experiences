package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TBldHouse;
import com.gatz.discovery.modules.cidm.model.TBldHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBldHouseMapper {
    int countByExample(TBldHouseExample example);

    int deleteByExample(TBldHouseExample example);

    int deleteByPrimaryKey(Long houseId);

    int insert(TBldHouse record);

    int insertSelective(TBldHouse record);

    List<TBldHouse> selectByExample(TBldHouseExample example);

    TBldHouse selectByPrimaryKey(Long houseId);

    int updateByExampleSelective(@Param("record") TBldHouse record, @Param("example") TBldHouseExample example);

    int updateByExample(@Param("record") TBldHouse record, @Param("example") TBldHouseExample example);

    int updateByPrimaryKeySelective(TBldHouse record);

    int updateByPrimaryKey(TBldHouse record);
}