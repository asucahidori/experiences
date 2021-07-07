package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumBusiness;
import com.gatz.discovery.modules.cidm.model.TSumBusinessExample;
import com.gatz.discovery.modules.cidm.model.TSumBusinessKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSumBusinessMapper {
    int countByExample(TSumBusinessExample example);

    int deleteByExample(TSumBusinessExample example);

    int deleteByPrimaryKey(TSumBusinessKey key);

    int insert(TSumBusiness record);

    int insertSelective(TSumBusiness record);

    List<TSumBusiness> selectByExample(TSumBusinessExample example);

    TSumBusiness selectByPrimaryKey(TSumBusinessKey key);

    int updateByExampleSelective(@Param("record") TSumBusiness record, @Param("example") TSumBusinessExample example);

    int updateByExample(@Param("record") TSumBusiness record, @Param("example") TSumBusinessExample example);

    int updateByPrimaryKeySelective(TSumBusiness record);

    int updateByPrimaryKey(TSumBusiness record);
}