package com.gatz.discovery.modules.cidm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gatz.discovery.modules.cidm.model.TOrder;
import com.gatz.discovery.modules.cidm.model.TOrderExample;

public interface TOrderMapper {
    int countByExample(TOrderExample example);

    int deleteByExample(TOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByExample(TOrderExample example);

    TOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
    
    List<Map<Integer, Object>> selectSumOrder(TOrder record);
    
    List<Map<Integer, Object>> selectContrastOrder(TOrder record);
    
    public Map<String, Object> selectContrastCustomer(Map<String, Object> map);
    
    public Map<String, Object> selectContrastPrice(Map<String, Object> map);
}