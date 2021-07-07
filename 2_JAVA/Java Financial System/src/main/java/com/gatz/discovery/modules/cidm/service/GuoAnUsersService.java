package com.gatz.discovery.modules.cidm.service;

import java.util.List;

import net.minidev.json.JSONObject;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.TBldHouse;
import com.gatz.discovery.modules.cidm.model.TBuilding;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;



public interface GuoAnUsersService extends GenericService<TSumPopulation, Long>{
	
	//根据areaCode获取国安社区用户总量
	JSONObject getGuoAnUsersCount(Long id,int type,Integer tinyvillageId);
	//根据areaCode获取国安社区订单金额
	JSONObject guoAnOrdersCount(Long id,int type);
	//获取各区国安用户量
	JSONObject guoAnEveryAreaCount(Long id,int type);
	//各区订单额总量
	JSONObject everyOrderCounts(Long id,int type);
	//获取区县的国安社区用户总量
	JSONObject getEveryCounts(Long id,int type);
	//区县订单金额
	JSONObject guoAnQuOrdersCount(Long id,int type);
	JSONObject everyAreaOrderCounts(Long id,int type);
	//按地区查询各区国安用户量
	JSONObject guoAnEveryCountByArea(Long id, int type);
	//根据街道获取国安社区用户量
	JSONObject getGuoAnByStreet(Long id, int type);
	//根据街道获取国安订单金额日期
	JSONObject gerOrderByStreet(Long id, int type);
	//根据街道获取各区国安社区用户量
	JSONObject guoAnEveryCountByStreet(Long id, int type);
	//根据街道获取各区订单额
	JSONObject getEveryOrdersByStreet(Long id, int type);
	//根据小区获取订单额
	JSONObject getEveryOrdersByTown(Long id, int type);
	
	



}
