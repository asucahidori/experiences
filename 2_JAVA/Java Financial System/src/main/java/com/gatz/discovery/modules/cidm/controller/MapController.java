 package com.gatz.discovery.modules.cidm.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gatz.discovery.core.entity.JSONResult;
import com.gatz.discovery.core.util.StringUtil;
import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TbArea;
import com.gatz.discovery.modules.cidm.service.MapDataService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONObject;

 /**
 * Created by baibing on 2016/1/22.
 */
@Controller
@RequestMapping(value = "/map")
public class MapController {
	protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private MapDataService mapDataService;
    
    //错误信息
    Map<String,Object> paramMap = new HashMap<String,Object>();

    /**
      * 默认跳转中国地图
      * @return
      */
    @RequestMapping("")
    public String getDefaultMap () {
    	return "modules/cidm/map_citydata";
    }
    /**
     * 默认跳转省市地图
     * @return
     */
    @RequestMapping("/areaMap")
    public ModelAndView getAreaMap (String name,String id,String gbCode,String type,HttpSession httpSession) {
    	ModelAndView mv = new ModelAndView();
    	try {
			name = java.net.URLDecoder.decode(name , "UTF-8");
			//市数据
			TCity city = this.mapDataService.selectCityInfo(id);
			if(city != null){
	    		mv.addObject("cityId", city.getCityId());//市id
	    		mv.addObject("cityName",city.getName());//市名称
	    	}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}
    	
    	mv.addObject("name", name);
    	mv.addObject("id", id);
    	mv.addObject("gbCode", gbCode);
    	mv.addObject("type", type);
    	mv.setViewName("modules/cidm/map_areadata");
    	//判断直辖市，省和市一致
    	Map<String,Object> province = new HashMap<String,Object>();
		   province.put("name", name);
		   province.put("id", id);
		   province.put("type", 1);
		   httpSession.setAttribute("province", province);
    	
    	Map<String,Object> tcity = new HashMap<String,Object>();
    	tcity.put("name", name);
    	tcity.put("id", id);
    	tcity.put("type", type);
    	tcity.put("gbCode", gbCode);
    	httpSession.setAttribute("city", tcity);
    	
    	return mv;
    }
   
     /**
      * 获取全部一级城市级别数据
      * @return
      */
    @RequestMapping(value = "/chinaData", method = RequestMethod.GET)
    @ResponseBody
    public JSONResult findList() {
    	mapDataService.selectAllCity();
        return getUserList("0");

    }
    
    /**
     * 转到百度地图
     * @return
     * @author xzl
     * type:1:中国省、自治区、直辖市  2:市;3：区县;4:街道;5:社区;6 小区;7楼栋;8:房间
     */
	 @RequestMapping(value = "/toBaiduMap", method = RequestMethod.GET)
	 // @ResponseBody
	 public ModelAndView toBaiduMap(String name,Long id,String type,HttpSession httpSession) {
		   try {
				name = java.net.URLDecoder.decode(name , "UTF-8");
		   } catch (UnsupportedEncodingException e) {
				e.printStackTrace();
		   }
		   ModelAndView mv = new ModelAndView();
		   mv.addObject("name", name);
		   mv.addObject("id", id);
		   mv.addObject("type", type);
		   
		   
		   if(type.equals("4")){
			   mv.setViewName("modules/cidm/map_streetdata");
			   Map<String,Object> tcounty = new HashMap<String,Object>();
		    	tcounty.put("name", name);
		    	tcounty.put("id", id);
		    	tcounty.put("type", type);
		    	httpSession.setAttribute("county", tcounty);
		   }
		   if(type.equals("6")){
			   mv.setViewName("modules/cidm/map_villagedata");
			   Map<String,Object> ttown = new HashMap<String,Object>();
			   ttown.put("name", name);
			   ttown.put("id", id);
			   ttown.put("type", type);
			   httpSession.setAttribute("town", ttown);
		   }
		   if(type.equals("7")){
			   mv.setViewName("modules/cidm/map_tiny_villagedata");
			   Map<String,Object> tvillage = new HashMap<String,Object>();
			   tvillage.put("name", name);
			   tvillage.put("id", id);
			   tvillage.put("type", type);
			   httpSession.setAttribute("village", tvillage);
		   }
		   if(type.equals("8")){
			   mv.setViewName("modules/cidm/map_buildingdata");
			   Map<String,Object> ttinyvillage = new HashMap<String,Object>();
			   ttinyvillage.put("name", name);
			   ttinyvillage.put("id", id);
			   ttinyvillage.put("type", type);
			   httpSession.setAttribute("tinyvillage", ttinyvillage);
		   }
		   
		   logger.error("toBaiduMap...................."+name+":"+id+":"+type);
		   return mv;
	  }
	 
	 /**
	     * @desc 根据id 及区域类型获得   ------4:街道;5:社区;6 小区;7楼栋;8:房间
	     * @return
	     * @author xzl
	     * type:1:中国省、自治区、直辖市  2:市;3：区县;4:街道;5:社区;6 小区;7楼栋;8:房间
	     */
	   @RequestMapping(value = "/getBaiduMap", method = RequestMethod.POST)
	   @ResponseBody
	   public JSONObject getBaiduMap(Long id,int type) {
		   try{
			   Map<String,Object> map = mapDataService.getAreaInfo(id, type);
			   return  new JSONObject(map);
		   }catch(Exception ex){
				logger.error(ex.getMessage());
				Map<String,Object> paramMap = new HashMap<String,Object>();
				paramMap.put("message","系统错误，请联系管理员！");
				return new JSONObject(paramMap); 
			}
	   }
	   
     
    /**
     * 根据parentId , 获取TbArea数据列表
     * @param id
     * @return
     */
    @RequestMapping(value = "/chinaData/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JSONResult getUserList(@PathVariable("id") String id) {
        TbArea t = new TbArea();
        t.setAreaNo(Integer.valueOf(id));
        return new JSONResult<List<TbArea>>(mapDataService.selectDataOfCity(t));
    }

    
    /**
	 * 中国地图省数据
	 * @return List<JSONObject>
	 *  * key: id		            省直辖市ID   对应dao：provinceId
	 *  	   name		            省直辖市名称
	 *  	   gbCode	            省直辖市国标码  
	 *  	   value		国安社区用户数   对应dao：number
	 * */
	@ResponseBody
	@RequestMapping("/mapOfChina")
	public List<JSONObject> mapOfChina(){
		List<JSONObject> list = new ArrayList<JSONObject>();
		try{
			list = this.mapDataService.selectMapOfChina();
		}catch(Exception ex){
			logger.error(ex.getMessage() + "MapController.mapOfChina");
			paramMap.put("message","系统错误，请联系管理员！");
			//ex.printStackTrace();
			list = new ArrayList<JSONObject>();
			list.add(new JSONObject(paramMap));
			return list;
		}
		return list;
	}
	
	/**`
	 * 中国地图市数据
	 * @param provinceId  省直辖市ID
	 * @return List<JSONObject>
	 * key: proviceId   省直辖市ID
     * 	    id	                        市地区ID	 对应dao：cityId
     * 		gbCode	           市地区国标码
     * 		name	           市地区名称
     * 		value 	           市国安社区用户量 对应dao:number
	 * */
	@ResponseBody
	@RequestMapping("/mapOfChinaCity")
	public List<JSONObject> mapOfChinaCity(String proviceId){
		List<JSONObject> list = new ArrayList<JSONObject>();
		try{
			//list = this.mapDataService.selectMapOfChinaCity(proviceId);
			list = this.mapDataService.selectMapOfChinaCityOrCountyInfo(proviceId);
		}catch(Exception ex){
			list = new ArrayList<JSONObject>();
			logger.error(ex.getMessage());
			paramMap.put("message","系统错误，请联系管理员！");
			//ex.printStackTrace();
			list.add(new JSONObject(paramMap));
			return list;
		}
		return list;
	}
	

  /**
    * 核心数据统计查询
   *  @param id 		省直辖市ID-proviceId/市地区ID-cityId/区县ID-countyId/街道ID-town_id
 	* @param areaType   1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
 	* @return JSONObject
 	* key: income 			人均收入
 	* 	   expend        	人均支出 
 	* 	   customerNumber   国安社区用户
 	* 	   storeNumber	            国安门店数
 	* 	   comsumeLevel 	消费等级
 	* 	   leadNum	   		潜力用户
 	* 	   proportion		国安社区用户/潜力用户的比例
 	* 	   nuclearFamily    核心家庭
     * */
	@ResponseBody
	@RequestMapping("/mapOfChinaCoreData")
	public JSONObject mapOfChinaCoreData(String id, String areaType){
		JSONObject json = new JSONObject();
		try{
			json = this.mapDataService.selectMapOfChinaCoreData(id, areaType, null);
		}catch(Exception ex){
			json = new JSONObject();
			logger.error(ex.getMessage() + "MapController.mapOfChinaCoreData");
			paramMap.put("message","系统错误，请联系管理员！");
			return new JSONObject(paramMap); 
		}
		return json;
	}

	/**
	 * @desc 转到省市、区县、街道\小区、楼栋、房间报表页
	 * @author xzl
	 */
	 @RequestMapping(value = "/toReportPage", method = RequestMethod.GET)
	 public ModelAndView toReportPage(String name,Long id,Long type,Long tinyVillageId,HttpSession httpSession) {
		   try {
				name = java.net.URLDecoder.decode(name , "UTF-8");
		   } catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				logger.error(e.getMessage());
		   }
		   ModelAndView mv = new ModelAndView();
		   mv.addObject("name", name);
		   mv.addObject("id", id);
		   mv.addObject("type", type);
		   mv.addObject("tinyVillageId", tinyVillageId);
		   if(1==type){
			   mv.setViewName("modules/cidm/report_city");
			   Map<String,Object> province = new HashMap<String,Object>();
			   province.put("name", name);
			   province.put("id", id);
			   province.put("type", type);
			   httpSession.setAttribute("province", province);
		   }else if(3==type)
			   mv.setViewName("modules/cidm/report_area");
		   else if(6==type){
			   mv.setViewName("modules/cidm/report_street");
			   mv.addObject("type", 4);
		   }
		   else if(7==type){
			   mv.setViewName("modules/cidm/report_village");
			   mv.addObject("type", 6);
			   Map<String,Object> ttinyvillage = new HashMap<String,Object>();
				 /*ttinyvillage.put("name", name);
				 ttinyvillage.put("id", id);
				 ttinyvillage.put("type", type);
				 httpSession.setAttribute("tinyvillage", ttinyvillage);
				 logger.error("toBuildingPage...................."+name+":"+id+":"+type);*/
			   Map<String,Object> tvillage = new HashMap<String,Object>();
			   tvillage.put("name", name);
			   tvillage.put("id", id);
			   tvillage.put("type", type);
			   httpSession.setAttribute("village", tvillage);
		   }
		   else if(8==type){
			   mv.setViewName("modules/cidm/report_building");
			   mv.addObject("type", 7);
		   }
		   else if(9==type){
			   mv.setViewName("modules/cidm/report_household");
			   mv.addObject("type", 8);
		   }
		   return mv;
	  }
	 	/**
		 * @desc 转到楼栋住宅
		 * @author xzl
		 */
		 @RequestMapping(value = "/toReportHousehold", method = RequestMethod.GET)
		 public ModelAndView toReportHousehold(String name,Long id,int type,Long tinyVillageId,String buildingid,String unit,String floor,String household,HttpSession httpSession,
				 String provinceId,
				 String provinceName,
				 String cityId,
				 String cityName,
				 String areaId,
				 String areaName,
				 String streetId,
				 String streetName,
				 String villageId,
				 String villageName,
				 String buildingId,
				 String buildingName,
				 String unitName,
				 String floorName,
				 String householdName
				 ) {
			   try {
					name = java.net.URLDecoder.decode(name , "UTF-8");
			   } catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					logger.error(e.getMessage());
			   }
			   if(StringUtil.isNotEmpty(provinceId)){
				   try {
					   provinceName = java.net.URLDecoder.decode(provinceName , "UTF-8");
				   } catch (Exception e) {
					   logger.error(e.getMessage());
					   e.printStackTrace();
				   }
				   Map<String,Object> province = new HashMap<String,Object>();
				   province.put("name", provinceName);
				   province.put("id", provinceId);
				   province.put("type", 1);
				   httpSession.setAttribute("province", province);
			   }
			   if(StringUtil.isNotEmpty(cityId)){
				   try {
					   cityName = java.net.URLDecoder.decode(cityName , "UTF-8");
					} catch (Exception e) {
						logger.error(e.getMessage());
						e.printStackTrace();
					}
				   Map<String,Object> city = new HashMap<String,Object>();
				   if(cityName.equals("市辖区")||provinceName.indexOf("市")!=-1){
					   city.put("name", (provinceName.indexOf("市")!=-1)?provinceName.replace("市", ""):provinceName);
				   }else{
					   city.put("name", (cityName.indexOf("市")!=-1)?cityName.replace("市", ""):cityName);
				   }
				   city.put("id", cityId);
				   city.put("type", 1);
			       httpSession.setAttribute("city", city);
				  
			   }
			   if(StringUtil.isNotEmpty(areaId)){
				   try {
					   areaName = java.net.URLDecoder.decode(areaName , "UTF-8");
					} catch (Exception e) {
						logger.error(e.getMessage());
						e.printStackTrace();
					}
				   Map<String,Object> tcounty = new HashMap<String,Object>();
			    	tcounty.put("name", areaName);
			    	tcounty.put("id", areaId);
			    	tcounty.put("type", 3);
			    	httpSession.setAttribute("county", tcounty);
			   }
			   if(StringUtil.isNotEmpty(streetId)){
				   try {
					   streetName = java.net.URLDecoder.decode(streetName , "UTF-8");
					} catch (Exception e) {
						logger.error(e.getMessage());
						e.printStackTrace();
					}
				   Map<String,Object> ttown = new HashMap<String,Object>();
				   ttown.put("name", streetName);
				   ttown.put("id", streetId);
				   ttown.put("type", 4);
				   httpSession.setAttribute("town", ttown);
			   }
			   if(StringUtil.isNotEmpty(villageId)){
				   try {
					   villageName = java.net.URLDecoder.decode(villageName , "UTF-8");
					} catch (Exception e) {
						logger.error(e.getMessage());
						e.printStackTrace();
					}
				   Map<String,Object> tvillage = new HashMap<String,Object>();
				   tvillage.put("name", villageName);
				   tvillage.put("id", villageId);
				   tvillage.put("type", 6);
				   httpSession.setAttribute("village", tvillage);
			   }
			   if(StringUtil.isNotEmpty(buildingId)){
				   try {
					   buildingName = java.net.URLDecoder.decode(buildingName , "UTF-8");
					} catch (Exception e) {
						logger.error(e.getMessage());
						e.printStackTrace();
					}
				   Map<String,Object> tbuilding = new HashMap<String,Object>();
				   tbuilding.put("name", buildingName);
				   tbuilding.put("id", buildingId);
				   tbuilding.put("type", 7);
				   httpSession.setAttribute("building", tbuilding);
			   }
			   
			   if(StringUtil.isNotEmpty(household)){
				   try {
					   buildingName = java.net.URLDecoder.decode(buildingName , "UTF-8");
					} catch (Exception e) {
						logger.error(e.getMessage());
						e.printStackTrace();
					}
				   Map<String,Object> householdM = new HashMap<String,Object>();
				   householdM.put("unit", unit);
				   householdM.put("floor", floor);
				   householdM.put("type", 8);
				   householdM.put("household",household);
				   householdM.put("unitName", unitName);
				   householdM.put("floorName", floorName);
				   householdM.put("householdName", householdName);
				   httpSession.setAttribute("household", householdM);
			   }
			   
			   
			   ModelAndView mv = new ModelAndView();
			   mv.addObject("name", name);
			   mv.addObject("id", id);
			   mv.addObject("type", type);
			   mv.addObject("buildingid",buildingid);
			   mv.addObject("unit", unit);
			   mv.addObject("household", household);
			   mv.addObject("tinyVillageId", tinyVillageId);
			   if(1==type){
				   mv.setViewName("modules/cidm/report_city");
				  
			   }else if(2==type){
				   mv.setViewName("modules/cidm/report_city");
			   }else if(3==type)
				   mv.setViewName("modules/cidm/report_area");
			   else if(4==type){
				   mv.setViewName("modules/cidm/report_street");
			   }
			   else if(6==type){
				   mv.setViewName("modules/cidm/report_village");
			   }
			   if(7==type){
				   mv.setViewName("modules/cidm/report_building");
			   }
			   else if(8==type){
				   mv.setViewName("modules/cidm/report_household");
			   }
			   return mv;
		  }
	 
	 /**
		 * @desc 转到地图楼栋页面
		 * @author xzl
		 */
		 @RequestMapping(value = "/toBuildingPage", method = RequestMethod.GET)
		 public ModelAndView toBuildingPage(Long id,String name,int type,HttpSession httpSession) {
			  try {
					name = java.net.URLDecoder.decode(name , "UTF-8");
			   } catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					logger.error(e.getMessage());
			   }
			 ModelAndView mv = new ModelAndView();
			 mv.addObject("name", name);
			 mv.addObject("id", id);
			 mv.addObject("type", type);
			 mv.setViewName("modules/cidm/map_household");
			 
			 Map<String,Object> ttinyvillage = new HashMap<String,Object>();
			 ttinyvillage.put("name", name);
			 ttinyvillage.put("id", id);
			 ttinyvillage.put("type", type);
			 httpSession.setAttribute("tinyvillage", ttinyvillage);
			 logger.error("toBuildingPage...................."+name+":"+id+":"+type);
			 return mv;
		 }
	 
	 
	 /**
	    * 核心数据统计查询
	    * @param proviceId  省直辖市ID
	 	* @param cityId   	市地区ID
	 	* @param countyId 	区县ID
	 	* @param type 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
	 	* @return JSONObject
	 	* key: income 			人均收入
	 	* 	   expend        	人均支出 
	 	* 	   customerNumber   国安社区用户
	 	* 	   storeNumber	            国安门店数
	 	* 	   comsumeLevel 	消费等级
	 	* 	   leadNum	   		潜力用户
	 	* 	   proportion		国安社区用户/潜力用户的比例
	 	* 	   nuclearFamily    核心家庭
	 	* @author xzl
	     * */
		@ResponseBody
		@RequestMapping("/getCoreData")
		public JSONObject getCoreData(Long Id, String type,String name)throws Exception{
			JSONObject json = new JSONObject();
			/*try{
				json = this.mapDataService.selectMapOfChinaCoreData(id, type);
			}catch(Exception e){
				e.printStackTrace();
			}*/
			return json;
		}

	/**
	 * 获取省公司地图数据
	 * @param countyId 	区县ID 例：1,2,3,
	 * @param proviceId 省直辖市ID
	 * @param areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
	 * @return JSONObject
	 * 	key:date		日期集合
	 * 		dataStore	国安门店数量
	 * 		dataVillage 国安社区数量
	 * 		dataOrder	国安社区订单额	 
	 * */
	@ResponseBody
	@RequestMapping("/mapOfChinaCountyStatisticsInfo")
	public JSONObject mapOfChinaCountyStatisticsInfo(String proviceId, String countyId, String areaType){
		JSONObject json = new JSONObject();
		try{
			json = this.mapDataService.selectMapOfChinaCountyInfo(countyId, areaType, proviceId, null);
		}catch(Exception ex){
			json = new JSONObject();
			logger.error(ex.getMessage() + "MapController.mapOfChinaCountyStatisticsInfo");
			paramMap.put("message","系统错误，请联系管理员！");
			//e.printStackTrace();
			return new JSONObject(paramMap);
		}
		return json;
	}
	
	@RequestMapping("/toBuilding")
	public ModelAndView toBuilding(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("modules/building/building");
		mav.addObject("buildingInfo", "");
		return mav;
	}
	
	@RequestMapping("/aboutUs")
	public ModelAndView aboutUs(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("modules/about/about");
		return mav;
	}
}

