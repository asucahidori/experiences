package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.model.TGdpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGdpMapper {
    int countByExample(TGdpExample example);

    int deleteByExample(TGdpExample example);

    int deleteByPrimaryKey(Long areaId);

    int insert(TGdp record);

    int insertSelective(TGdp record);

    List<TGdp> selectByExample(TGdpExample example);

    TGdp selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") TGdp record, @Param("example") TGdpExample example);

    int updateByExample(@Param("record") TGdp record, @Param("example") TGdpExample example);

    int updateByPrimaryKeySelective(TGdp record);

    int updateByPrimaryKey(TGdp record);
}