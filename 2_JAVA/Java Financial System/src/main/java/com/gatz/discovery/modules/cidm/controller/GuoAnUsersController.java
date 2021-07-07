package com.gatz.discovery.modules.cidm.controller;


import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.modules.cidm.service.GuoAnUsersService;
import com.gatz.discovery.modules.cidm.util.Logger;



@Controller
@RequestMapping(value = "/guoAnUsers")
public class GuoAnUsersController {
	//private Logger logger = LoggerFactory.getLogger(getClass());
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private GuoAnUsersService guoAnUsersService;
	/**
	 * 根据areacode获取国安社区用户量
	 * 
	 */
	@RequestMapping(value="/guoAnUsersCount",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject  guoAnUsersCount(Long id,int type,Integer tinyvillageId){
		 JSONObject json = new JSONObject();
		 Map resultMap = new HashedMap();
		 resultMap.put("message", "没有符合条件的数据!");
		 resultMap.put("code", "-1");
		 try{
			 json = guoAnUsersService.getGuoAnUsersCount(id,type,tinyvillageId);
			 if(json==null){
				 return new JSONObject(resultMap);
			 }
			 return json;
	}catch(Exception ex){
			ex.printStackTrace();
    		logger.error(ex.getMessage());
    		resultMap.put("message","系统错误，请联系管理员！");
    		return new JSONObject(resultMap); 
    	}
	}
	
	/**
	 * 国安社区订单金额
	 * 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/guoAnOrdersCount",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject  guoAnOrdersCount(Long id,int type){
		JSONObject json = new JSONObject();
		 Map resultMap = new HashedMap();
		 resultMap.put("message", "没有符合条件的数据!");
		 resultMap.put("code", "-1");
		 try{
		if(type==1){
			json = guoAnUsersService.guoAnOrdersCount(id,type);
			if(json==null){
				 return new JSONObject(resultMap);
			 }
			return json;
		}else if (type==3) {
			json = guoAnUsersService.guoAnQuOrdersCount(id,type);
			if(json==null){
				 return new JSONObject(resultMap);
			}
			return json;
		}else if (type==4) {
			json=guoAnUsersService.gerOrderByStreet(id,type);
			if(json==null){
				return new JSONObject(resultMap);
			}
			return json;
		}else if (6==type||7==type) {
			json=guoAnUsersService.getEveryOrdersByTown(id,type);
			if(json==null){
				return new JSONObject(resultMap);
			}
			return json;
		}
		else{
			return null;
		}
	}catch(Exception ex){
		logger.error(ex.getMessage());
		resultMap.put("message","系统错误，请联系管理员！");
		return new JSONObject(resultMap); 
	}
	}
	/**
	 * 获取各区国安用户量
	 * 地区
	 * type=1点击详情进入的是各区用户量
	 * type=3点击详情展示该区各街道国安用户量
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/guoAnEveryAeraCount",method=RequestMethod.POST)
	@ResponseBody
	public JSONObject guoAnEveryAeraCount(Long id,int type){
		JSONObject json = new JSONObject();
		Map resultMap = new HashedMap();
		 resultMap.put("message", "没有符合条件的数据!");
		 resultMap.put("code", "-1");
		try{
			
		if(type==1){
			json= guoAnUsersService.guoAnEveryAreaCount(id,type);
			if(json == null){
				 return new JSONObject(resultMap);
			}
			return json;
		}else if (type==3) {
			json = guoAnUsersService.guoAnEveryCountByArea(id, type);
			if(json==null){
				 return new JSONObject(json);
			}
			return json;
		}else if (type==4) {
			json=guoAnUsersService.guoAnEveryCountByStreet(id,type);
			if(json==null){
				return new JSONObject(resultMap);
			}
			return json;
		}else{
			return null;
		}
	}catch(Exception ex){
		logger.error(ex.getMessage());
		resultMap.put("message","系统错误，请联系管理员！");
		return new JSONObject(resultMap); 
	}
	}
		
	
	/**
	 * 各区订单金额总量
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/everyOrdersCounts",method=RequestMethod.POST)
	@ResponseBody
	public JSONObject everyOrderCounts(Long id,int type){
		JSONObject json= new JSONObject();
		 Map resultMap = new HashedMap();
		 resultMap.put("message", "没有符合条件的数据!");
		 resultMap.put("code", "-1");
		try{
		if(type==1){
			json = guoAnUsersService.everyOrderCounts(id,type);
			if(json==null){
				 return new JSONObject(resultMap);
			 }
			return json;
		}else if(type==3){
			json = guoAnUsersService.everyAreaOrderCounts(id,type);
			if(json==null){
				 return new JSONObject(resultMap);
			}
			return json;
		}else if (type==4) {
			json=guoAnUsersService.getEveryOrdersByStreet(id,type);
			if(json==null){
				return new JSONObject(resultMap);
			}
			return json;
		}
		else{
			return null;
		}
	}
		catch(Exception ex){
			logger.error(ex.getMessage());
			resultMap.put("message","系统错误，请联系管理员！");
			return new JSONObject(resultMap); 
		}
	}
}
	
	
	
	
	
	
	
	
	
