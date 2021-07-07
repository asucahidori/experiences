package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TSumBusiness;
import com.gatz.discovery.modules.cidm.model.TSumBusinessExample;
import com.gatz.discovery.modules.cidm.model.TSumBusinessKey;
import java.util.List;
import java.util.Map;

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
    
    /**
     * 根据街道ID，取得街道周边业态
     * @param areacode
     * @return
     */
	public List<Map<String, Object>> getStreetSurroundState(String areacode);
}