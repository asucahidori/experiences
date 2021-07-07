package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TTinyVillage;
import com.gatz.discovery.modules.cidm.model.TTinyVillageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTinyVillageMapper {
    int countByExample(TTinyVillageExample example);

    int deleteByExample(TTinyVillageExample example);

    int deleteByPrimaryKey(Long tinyvillageId);

    int insert(TTinyVillage record);

    int insertSelective(TTinyVillage record);

    List<TTinyVillage> selectByExample(TTinyVillageExample example);

    TTinyVillage selectByPrimaryKey(Long tinyvillageId);

    int updateByExampleSelective(@Param("record") TTinyVillage record, @Param("example") TTinyVillageExample example);

    int updateByExample(@Param("record") TTinyVillage record, @Param("example") TTinyVillageExample example);

    int updateByPrimaryKeySelective(TTinyVillage record);

    int updateByPrimaryKey(TTinyVillage record);
}