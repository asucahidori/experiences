package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficeInfo;
import com.gatz.discovery.modules.cidm.model.TTinyvillageOfficeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTinyvillageOfficeInfoMapper {
    int countByExample(TTinyvillageOfficeInfoExample example);

    int deleteByExample(TTinyvillageOfficeInfoExample example);

    int deleteByPrimaryKey(Long tinyvillageId);

    int insert(TTinyvillageOfficeInfo record);

    int insertSelective(TTinyvillageOfficeInfo record);

    List<TTinyvillageOfficeInfo> selectByExample(TTinyvillageOfficeInfoExample example);

    TTinyvillageOfficeInfo selectByPrimaryKey(Long tinyvillageId);

    int updateByExampleSelective(@Param("record") TTinyvillageOfficeInfo record, @Param("example") TTinyvillageOfficeInfoExample example);

    int updateByExample(@Param("record") TTinyvillageOfficeInfo record, @Param("example") TTinyvillageOfficeInfoExample example);

    int updateByPrimaryKeySelective(TTinyvillageOfficeInfo record);

    int updateByPrimaryKey(TTinyvillageOfficeInfo record);
}