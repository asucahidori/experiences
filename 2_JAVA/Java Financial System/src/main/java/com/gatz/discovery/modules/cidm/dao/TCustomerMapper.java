package com.gatz.discovery.modules.cidm.dao;

import com.gatz.discovery.modules.cidm.model.TCustomer;
import com.gatz.discovery.modules.cidm.model.TCustomerExample;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TCustomerMapper {
    int countByExample(TCustomerExample example);

    int deleteByExample(TCustomerExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    List<TCustomer> selectByExample(TCustomerExample example);

    TCustomer selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByExample(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);
    
    //根据街道获取国安社区用户量
   	List<TSumPopulation> getGuoAnByStreet(Map mapStreet);
   	
  //根据区获取国安用户量
  	List<TSumPopulation> selecEverytUsers(Map map);
  	
  //国安社区用户总量
    List<TCustomer> selectUsers(Map map);
}