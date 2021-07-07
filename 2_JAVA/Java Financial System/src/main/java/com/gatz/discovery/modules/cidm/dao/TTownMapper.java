package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.AreaMapVo;
import com.gatz.discovery.modules.cidm.model.TTown;
import com.gatz.discovery.modules.cidm.model.TTownExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TTownMapper {
    int countByExample(TTownExample example);

    int deleteByExample(TTownExample example);

    int deleteByPrimaryKey(Long townId);

    int insert(TTown record);

    int insertSelective(TTown record);

    List<TTown> selectByExample(TTownExample example);

    TTown selectByPrimaryKey(Long townId);

    int updateByExampleSelective(@Param("record") TTown record, @Param("example") TTownExample example);

    int updateByExample(@Param("record") TTown record, @Param("example") TTownExample example);

    int updateByPrimaryKeySelective(TTown record);

    int updateByPrimaryKey(TTown record);
    /**
     * @desc 根据条件查询街道信息
     * @param params
     * @return
     */
    List<AreaMapVo> queryTtownInfo(Map<String,Object> params);
}