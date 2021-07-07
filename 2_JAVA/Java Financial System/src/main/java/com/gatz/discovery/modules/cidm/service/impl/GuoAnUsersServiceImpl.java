package com.gatz.discovery.modules.cidm.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TBldHouseMapper;
import com.gatz.discovery.modules.cidm.dao.TBuildingMapper;
import com.gatz.discovery.modules.cidm.dao.TCountyMapper;
import com.gatz.discovery.modules.cidm.dao.TCustomerMapper;
import com.gatz.discovery.modules.cidm.dao.TSumOrd5grdMapper;
import com.gatz.discovery.modules.cidm.dao.TSumPopulationMapper;
import com.gatz.discovery.modules.cidm.dao.TTinyVillageMapper;
import com.gatz.discovery.modules.cidm.model.OrderMap;
import com.gatz.discovery.modules.cidm.model.TCustomer;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grd;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;
import com.gatz.discovery.modules.cidm.service.GuoAnUsersService;


@Service
public class GuoAnUsersServiceImpl extends GenericServiceImpl<TSumPopulation, Long> implements GuoAnUsersService {

	@Resource
    private TSumPopulationMapper tSumPopulationMapperDao;
	@Resource
	private TSumOrd5grdMapper tSumOrd5grdMapperDao;
	@Resource 
	private TCountyMapper tCountyMapperDao;
	@Resource
	private TBuildingMapper tBuildingMapperDao;
	@Resource
	private TBldHouseMapper tBldHouseMapperDao;
	@Resource
	private TTinyVillageMapper tTinyVillageMapperDao;
	@Resource
	private TCustomerMapper TCustomerMapperDao;
	@SuppressWarnings("unchecked")
	@Override
	public GenericDao<TSumPopulation, Long> getDao() {
		return (GenericDao<TSumPopulation, Long>) tSumPopulationMapperDao;
	}
	
	//国安社区用户总量
	@SuppressWarnings("unchecked")
	public JSONObject getGuoAnUsersCount(Long id, int type,Integer tinyvillageId) {
		JSONObject json = new JSONObject();
		Map mapall = new HashedMap();
		mapall.put("id", id);
		mapall.put("type", type);
		mapall.put("tinyvillageId", tinyvillageId);
		List<TCustomer> usersList = TCustomerMapperDao.selectUsers(mapall);
		List populaList = new ArrayList();
		List monthList = new ArrayList();
		if(usersList.size()==0){
			return null;
		}
		for(TCustomer tp : usersList){
			Long population=tp.getPopulation();
            Date month1=tp.getCreateTime();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(month1);
            populaList.add(population);
            monthList.add(month);
		}
		json.put("x", monthList);
		json.put("y", populaList);
		
		return json;
	}
	
	//根据区获取国安社区用户量
	@Override
	public JSONObject getEveryCounts(Long id,int type) {
		JSONObject json = new JSONObject();
		Map mapall = new HashedMap();
		mapall.put("id", id);
		mapall.put("type", type);
		List<TSumPopulation> usersList=TCustomerMapperDao.selecEverytUsers(mapall);
		List populaList = new ArrayList();
		List monthList = new ArrayList();
		if(usersList.size()==0){
			return null;
		}
		for(TSumPopulation tp : usersList){
			Long population=tp.getPopulation();
            Date month1=tp.getUpdateTime();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(month1);
            populaList.add(population);
            monthList.add(month);
		}
		json.put("x", monthList);
		json.put("y", populaList);
		return json;
	}
	//北京市国安社区前9个月订单额
	@Override
	public JSONObject guoAnOrdersCount(Long id,int type) {
		JSONObject json = new JSONObject();
		Map mapOrders = new HashedMap();
		mapOrders.put("id", id);
		mapOrders.put("type",type);
		List<TSumOrd5grd> orsersList= tSumOrd5grdMapperDao.selectOrders(mapOrders);
		List orderList = new ArrayList();
		List monthList = new ArrayList();
		if(orsersList.size()==0){
			return null;
		}
		for(TSumOrd5grd to : orsersList){
			Long orderCounts1 = to.getOrdersCount();
//			String orderCounts = String.format("%.2f", orderCounts1);//四舍五入保留两位小数
			Date monthDate = to.getDate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(monthDate);
    		orderList.add(orderCounts1);
            monthList.add(month);
		}
		json.put("xmonth", monthList);
		json.put("yorder", orderList);
		return json;
	}
	//获取各区国安社区用户量
	@Override
	public JSONObject guoAnEveryAreaCount(Long id,int type) {
		JSONObject json= new JSONObject();
		Map mapEveryMap = new HashedMap();
		mapEveryMap.put("id", id);
		mapEveryMap.put("type", type);
		List<OrderMap> conuntryList = tCountyMapperDao.guoAnEveryAreaConut(mapEveryMap);
			List areaCountsList = new ArrayList();
			List areaNameList = new ArrayList();
			if(conuntryList.size()==0){
				return null;
			}
			for (OrderMap county : conuntryList) {
					Long areaCouts = county.getPopulation();
					areaCountsList.add(areaCouts);
				    String areaName =county.getName();
				    areaNameList.add(areaName);
			}
			json.put("x_name", areaNameList);
			json.put("y_counts", areaCountsList);
			return json;
	}
	//各区订单额总量
	@Override
	public JSONObject everyOrderCounts(Long id,int type) {
		JSONObject json= new JSONObject();
		Map mapEveryMap = new HashedMap();
		mapEveryMap.put("id", id);
		mapEveryMap.put("type", type);
		List<OrderMap> orderCountsList = tCountyMapperDao.everyOrderCounts(mapEveryMap);
		List orderNameList = new ArrayList();
		List everyCountList = new ArrayList();
		if(orderCountsList.size()==0){
			return null;
		}
		for (OrderMap tc : orderCountsList) {
			String everyNameString=tc.getName();
			orderNameList.add(everyNameString);
			Double orderCount=tc.getOrdersCount();
			everyCountList.add(orderCount);
		}
		json.put("x_everyName", orderNameList);
		json.put("y_everyCount", everyCountList);
		return json;
	}

	//区县前9个月国安社区订单金额
	@Override
	public JSONObject guoAnQuOrdersCount(Long id, int type) {
		JSONObject json = new JSONObject();
		Map mapOrders = new HashedMap();
		mapOrders.put("id", id);
		mapOrders.put("type",type);
		List<TSumOrd5grd> orserList= tSumOrd5grdMapperDao.selectOrders(mapOrders);
		List orderList = new ArrayList();
		List monthList = new ArrayList();
		for(TSumOrd5grd to : orserList){
			Long orderCounts1 = to.getOrdersCount();
//			String orderCounts = String.format("%.2f", orderCounts1);//四舍五入保留两位小数
			Date monthDate = to.getDate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(monthDate);
    		orderList.add(orderCounts1);
            monthList.add(month);
		}
		json.put("xmonth", monthList);
		json.put("yorder", orderList);
		return json;
}
	@Override
	public JSONObject everyAreaOrderCounts(Long id, int type) {
		JSONObject json = new JSONObject();
		Map mapOrders = new HashedMap();
		mapOrders.put("id", id);
		mapOrders.put("type",type);
		List<OrderMap> orderCountsList = tCountyMapperDao.everyAreaOrderCounts(mapOrders);
		List orderNameList = new ArrayList();
		List everyCountList = new ArrayList();
		if(orderCountsList.size()==0){
			return null;
		}
		for (OrderMap tc : orderCountsList) {
			String everyNameString=tc.getName();
			orderNameList.add(everyNameString);
				Double orderCount=tc.getOrdersCount();
				everyCountList.add(orderCount);
		}
		json.put("x_everyName", orderNameList);
		json.put("y_everyCount", everyCountList);
		return json;
	}
	//按地区查询国安各区用户量
	@Override
	public JSONObject guoAnEveryCountByArea(Long id, int type) {
		JSONObject json= new JSONObject();
		Map mapEveryMap = new HashedMap();
		mapEveryMap.put("id", id);
		mapEveryMap.put("type", type);
		List<OrderMap> conuntryList = tCountyMapperDao.guoAnEveryConutByArea(mapEveryMap);
			List areaCountsList = new ArrayList();
			List areaNameList = new ArrayList();
			for (OrderMap county : conuntryList) {
					Long areaCouts = county.getPopulation();
					areaCountsList.add(areaCouts);
				    String areaName =county.getName();
				    areaNameList.add(areaName);
			}
			json.put("x_name", areaNameList);
			json.put("y_counts", areaCountsList);
			return json;
	}
	
	//根据街道获取国安社区用户量
	@Override
	public JSONObject getGuoAnByStreet(Long id, int type) {
		JSONObject json = new JSONObject();
		Map mapStreet = new HashedMap();
		mapStreet.put("id", id);
		mapStreet.put("type", type);
		List<TSumPopulation> streetList = TCustomerMapperDao.getGuoAnByStreet(mapStreet);
		List xList=new ArrayList();
		List yList= new ArrayList();
		if(streetList.size()==0){
			return null;
		}
		for (TSumPopulation ts : streetList) {
			Long population=ts.getPopulation();
            Date month1=ts.getDateId();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(month1);
    		xList.add(population);
    		yList.add(month);
		}
		json.put("x", xList);
		json.put("y", yList);
		return json;
	}
	//根据街道获取国安社区订单额
	@Override
	public JSONObject gerOrderByStreet(Long id, int type) {
		JSONObject json= new JSONObject();
		Map resultMap = new HashedMap();
		resultMap.put("id",id);
		resultMap.put("type", type);
		List<TSumOrd5grd> orsersList= tSumOrd5grdMapperDao.gerOrderByStreet(resultMap);
		List orderList = new ArrayList();
		List monthList = new ArrayList();
		if(orsersList.size()==0){
			return null;
		}
		for(TSumOrd5grd to : orsersList){
			Long orderCounts1 = to.getOrdersCount();
//			String orderCounts = String.format("%.2f", orderCounts1);//四舍五入保留两位小数
			Date monthDate = to.getDate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(monthDate);
    		orderList.add(orderCounts1);
            monthList.add(month);
		}
		json.put("xmonth", monthList);
		json.put("yorder", orderList);
		return json;
	}
	//根据街道获取各社区国安用户量
	@Override
	public JSONObject guoAnEveryCountByStreet(Long id, int type) {
		JSONObject json= new JSONObject();
		Map mapEveryMap = new HashedMap();
		mapEveryMap.put("id", id);
		mapEveryMap.put("type", type);
		List<OrderMap> conuntryList = tCountyMapperDao.guoAnEveryCountByStreet(mapEveryMap);
			List areaCountsList = new ArrayList();
			List areaNameList = new ArrayList();
			if(conuntryList.size()==0){
				return null;
			}
			for (OrderMap county : conuntryList) {
					Long areaCouts = county.getPopulation();
					areaCountsList.add(areaCouts);
					String areaName =county.getName();
					areaNameList.add(areaName);
			}
			json.put("x_name", areaNameList);
			json.put("y_counts", areaCountsList);
			return json;
	}
	//根据街道获取各区订单额
	@Override
	public JSONObject getEveryOrdersByStreet(Long id, int type) {
		JSONObject json = new JSONObject();
		Map mapOrders = new HashedMap();
		mapOrders.put("id", id);
		mapOrders.put("type",type);
		List<OrderMap> orderCountsList = tCountyMapperDao.getEveryOrdersByStreet(mapOrders);
		List orderNameList = new ArrayList();
		List everyCountList = new ArrayList();
		if(orderCountsList.size()==0){
			return null;
		}
		for (OrderMap tc : orderCountsList) {
			String everyNameString=tc.getName();
			System.out.println(everyNameString);
			orderNameList.add(everyNameString);
				Double orderCount=tc.getOrdersCount();
				System.out.println(orderCount);
				everyCountList.add(orderCount);
			}
		json.put("x_everyName", orderNameList);
		json.put("y_everyCount", everyCountList);
		return json;
	}
	
	/**
	 * 根据小区获取订单额
	 */
	@Override
	public JSONObject getEveryOrdersByTown(Long id, int type) {
		JSONObject json = new JSONObject();
		Map mapOrders = new HashedMap();
		mapOrders.put("id", id);
		mapOrders.put("type",type);
		List<OrderMap> orderCountsList = tCountyMapperDao.getEveryOrdersByTown(mapOrders);
		List orderList = new ArrayList();
		List monthList = new ArrayList();
		if(orderCountsList.size()==0){
			return null;
		}
		for (OrderMap tc : orderCountsList) {
			Double orderCounts1 = tc.getOrdersCount();
//			String orderCounts = String.format("%.2f", orderCounts1);//四舍五入保留两位小数
			Date monthDate = tc.getDate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");	//HH支持24小时，hh支持12小时
    		String month=sdf.format(monthDate);
    		orderList.add(orderCounts1);
            monthList.add(month);
			}
		json.put("xmonth", monthList);
		json.put("yorder", orderList);
		return json;
	}	
}

	
	
