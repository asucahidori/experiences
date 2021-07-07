package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyvillageHomeInfo;
import com.gatz.discovery.modules.cidm.model.TTinyvillageHomeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTinyvillageHomeInfoMapper {
    int countByExample(TTinyvillageHomeInfoExample example);

    int deleteByExample(TTinyvillageHomeInfoExample example);

    int deleteByPrimaryKey(Long tinyvillageId);

    int insert(TTinyvillageHomeInfo record);

    int insertSelective(TTinyvillageHomeInfo record);

    List<TTinyvillageHomeInfo> selectByExample(TTinyvillageHomeInfoExample example);

    TTinyvillageHomeInfo selectByPrimaryKey(Long tinyvillageId);

    int updateByExampleSelective(@Param("record") TTinyvillageHomeInfo record, @Param("example") TTinyvillageHomeInfoExample example);

    int updateByExample(@Param("record") TTinyvillageHomeInfo record, @Param("example") TTinyvillageHomeInfoExample example);

    int updateByPrimaryKeySelective(TTinyvillageHomeInfo record);

    int updateByPrimaryKey(TTinyvillageHomeInfo record);
}