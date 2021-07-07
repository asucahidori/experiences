package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TStore;
import com.gatz.discovery.modules.cidm.model.TStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStoreMapper {
    int countByExample(TStoreExample example);

    int deleteByExample(TStoreExample example);

    int deleteByPrimaryKey(Long storeId);

    int insert(TStore record);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStoreExample example);

    TStore selectByPrimaryKey(Long storeId);

    int updateByExampleSelective(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByExample(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByPrimaryKeySelective(TStore record);

    int updateByPrimaryKey(TStore record);
}