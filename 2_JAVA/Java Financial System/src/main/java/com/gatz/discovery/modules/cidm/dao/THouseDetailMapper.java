package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.THouseDetail;
import com.gatz.discovery.modules.cidm.model.THouseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THouseDetailMapper {
    int countByExample(THouseDetailExample example);

    int deleteByExample(THouseDetailExample example);

    int deleteByPrimaryKey(Long houseId);

    int insert(THouseDetail record);

    int insertSelective(THouseDetail record);

    List<THouseDetail> selectByExample(THouseDetailExample example);

    THouseDetail selectByPrimaryKey(Long houseId);

    int updateByExampleSelective(@Param("record") THouseDetail record, @Param("example") THouseDetailExample example);

    int updateByExample(@Param("record") THouseDetail record, @Param("example") THouseDetailExample example);

    int updateByPrimaryKeySelective(THouseDetail record);

    int updateByPrimaryKey(THouseDetail record);
}