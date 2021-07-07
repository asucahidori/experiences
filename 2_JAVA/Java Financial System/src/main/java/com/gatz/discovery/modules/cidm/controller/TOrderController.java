package com.gatz.discovery.modules.cidm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.model.TOrder;
import com.gatz.discovery.modules.cidm.service.TOrderService;
import com.gatz.discovery.modules.cidm.util.Logger;

@Controller
@RequestMapping(value = "/order")
public class TOrderController {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private TOrderService tOrderService;
	
	Map<String,Object> paramMap = new HashMap<String,Object>();
	/**
	 * 订单量
	 * */
	@ResponseBody
	@RequestMapping("/selectSumOrder")
	public JSONObject selectSumOrder(Long provinceId,Long cityId,Long countyId,Long townId,Long villageId,Long tinyVillageId,Long buildingId)throws Exception{
		JSONObject jsonObject = new JSONObject();
		TOrder order = new TOrder();
		order.setProvinceId(provinceId);
		order.setCityId(cityId);
		order.setCountyId(countyId);
		order.setTownId(townId);
		order.setVillageId(villageId);
		order.setTinyVillageId(tinyVillageId);
		order.setBuildingId(buildingId);
		try{
			jsonObject = this.tOrderService.selectSumOrder(order);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
	
	
	/**
	 * 同年环比
	 * */
	@ResponseBody
	@RequestMapping("/selectContrastOrder")
	public JSONObject selectContrastOrder(Long provinceId,Long cityId,Long countyId,Long townId,Long villageId,Long tinyVillageId,Long buildingId)throws Exception{
		JSONObject jsonObject = new JSONObject();
		TOrder order = new TOrder();
		order.setProvinceId(provinceId);
		order.setCityId(cityId);
		order.setCountyId(countyId);
		order.setTownId(townId);
		order.setVillageId(villageId);
		order.setTinyVillageId(tinyVillageId);
		order.setBuildingId(buildingId);
		try{
			jsonObject = this.tOrderService.selectContrastOrder(order);
		}catch(Exception ex){
			logger.error(ex.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(paramMap); 
		}
		return jsonObject;
	}
	
	
	@ResponseBody
	@RequestMapping("/selectContrastCustomer")
	public JSONObject selectContrastCustomer(String id, String areaType)throws Exception{
		JSONObject json = new JSONObject();
		try{
			json = this.tOrderService.selectContrastCustomer(id, areaType, null);
		}catch(Exception ex){
			json = new JSONObject();
			logger.error(ex.getMessage() + "MapController.mapOfChinaCoreData");
			paramMap.put("message","系统错误，请联系管理员！");
			return new JSONObject(paramMap); 
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping("/selectContrastPrice")
	public JSONObject selectContrastPrice(String id, String areaType)throws Exception{
		JSONObject json = new JSONObject();
		try{
			json = this.tOrderService.selectContrastPrice(id, areaType, null);
		}catch(Exception ex){
			json = new JSONObject();
			logger.error(ex.getMessage() + "MapController.mapOfChinaCoreData");
			paramMap.put("message","系统错误，请联系管理员！");
			return new JSONObject(paramMap); 
		}
		return json;
	}
}
