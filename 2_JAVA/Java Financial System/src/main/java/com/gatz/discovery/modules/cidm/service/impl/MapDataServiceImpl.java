package com.gatz.discovery.modules.cidm.service.impl;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.minidev.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TBldHouseMapper;
import com.gatz.discovery.modules.cidm.dao.TBuildingMapper;
import com.gatz.discovery.modules.cidm.dao.TCityMapper;
import com.gatz.discovery.modules.cidm.dao.TOfficeBuildingMapper;
import com.gatz.discovery.modules.cidm.dao.TProvinceMapper;
import com.gatz.discovery.modules.cidm.dao.TSumHouseMapper;
import com.gatz.discovery.modules.cidm.dao.TTinyVillageMapper;
import com.gatz.discovery.modules.cidm.dao.TTownMapper;
import com.gatz.discovery.modules.cidm.dao.TVillageMapper;
import com.gatz.discovery.modules.cidm.dao.TbAreaMapper;
import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TProvince;
import com.gatz.discovery.modules.cidm.model.TbArea;
import com.gatz.discovery.modules.cidm.service.MapDataService;


/**
 * Created by baibing on 2016/1/22.
 */
@Service
public class MapDataServiceImpl extends GenericServiceImpl<TbArea, Long> implements MapDataService {
    @Resource
    private TbAreaMapper tbAreaDao;

    @Override
    public GenericDao<TbArea, Long> getDao() {
        return tbAreaDao;
    }
    

	
	//街道dao
	@Resource
    private TTownMapper tTownMapper;
	
	//小区dao
	@Resource
    private TTinyVillageMapper tTinyVillageMapper;
	
	//省
    @Resource
    private TProvinceMapper tProvinceDao;

    //市
    @Resource
    private TCityMapper tCityDao;
    
	//住宅楼栋dao
	@Resource
    private TBuildingMapper tBuildingMapper;
	
	//写字楼栋Dao
	@Resource
    private TOfficeBuildingMapper tOfficeBuildingMapper;
    
	//楼房住宅信息Dao
	@Resource
    private TBldHouseMapper tBldHouseMapper;
	
	//楼房住宅价位信息Dao
	@Resource
    private TSumHouseMapper tSumHouseMapper;
	@Resource
    private TVillageMapper tVillageMapper;
	
	/**
     * 返回所有城市的数据列表
     * @return
     */
    @Override
    public List<TbArea> selectAllCity() {
    	
    	//{name: '北京',id:'110100',value: Math.round(Math.random()*1000)},
    	return null;
        //return tbAreaDao.selectAllCity();
    }

    /**
     * 返回一组以parentNo查询的数据列表
     * @param sourceD
     * @return
     */
    @Override
    public List<TbArea> selectDataOfCity(TbArea sourceD) {
        return tbAreaDao.selectDataOfCity(sourceD);
    }

    /**
     * @desc 根据id 及区域类型获得   ------4:街道;5:社区;6 小区;7楼栋;8:房间等信息
     * @return
     * @author xzl
     * type:1:中国省、自治区、直辖市  2:市;3：区县;4:街道;5:社区;6 小区;7楼栋;8:房间
     */
	@Override
	public Map getAreaInfo(Long id, int type) {
		//组装返回结果
		Map map = new HashMap();
		List list = null;
		
		//组装参数
		Map<String,Object> params = new HashMap<String,Object>();
		
		if(4==type){//区县id查找街道
			params.put("countyId", id);
			list = tTownMapper.queryTtownInfo(params);
		}
		//程序中不要示社区显示
		/*else if(5==type){
			
		}*/
		else if(6==type){//街道id查找小区
			params.put("townId", id);
			//list = tTinyVillageMapper.queryTtinyVillageInfo(params);
			list = tVillageMapper.queryTVillageInfo(params);
		}
		else if(7==type){//根据小区id查询住宅楼
			//住宅楼
			params.put("villageId", id);
			//list = tBuildingMapper.queryTbuildingInfo(params);
			list = tTinyVillageMapper.queryTtinyVillageInfo(params);
			//写字楼
//			List list0 = tOfficeBuildingMapper.queryTofficeBuildingInfo(params);
//			if(list!=null&&list.size()>0&&list0!=null&&list0.size()>0){
//				map.put("officeBuildingMap", list0);
//			}
		}
		else if(8==type){//根据楼栋id查询房间
			//params.put("buildingId", id);
			//list = tBldHouseMapper.queryTbldHouseInfo(params);
			
			params.put("tinyvillageId", id);
			list = tBuildingMapper.queryTbuildingInfo(params);
		}
		map.put("list", list);
		return map;
	}

    /**
     * 查询中国地图数据
	 * key: id			省直辖市ID   对应dao：provinceId
	 *  	name		省直辖市名称
	 *  	gbCode		省直辖市国标码  
	 *  	value		国安社区用户数   对应dao：number
     * */
	@Override
	public List<JSONObject> selectMapOfChina() throws Exception {
		List<JSONObject> list = new ArrayList<JSONObject>();
		
		//1. 查询数据库中的数据
		List<Map<String, Object>> rl = this.tProvinceDao.countMapOfChina();
		
		//2. 遍历查询到的数据并转换为JSON对象集合
		if(rl != null && rl.size() > 0){
			for(int i=0; i<rl.size(); i++){
				Map<String, Object> m = rl.get(i);
				JSONObject o = new JSONObject();
				o.put("name", m.get("name"));	//省直辖市名称
				o.put("id", m.get("provinceId"));//省直辖市ID
				o.put("gbCode", m.get("gbCode"));	//省直辖市国标码
				o.put("value", m.get("number"));//国安社区用户数 
				list.add(o);
			}
		}
	
		return list;
	}
    

	 /**
     * 查询中国地图市数据
     * @param  proviceId 省直辖市ID
     * @return List<JSONObject>
     *   key: proviceId   省直辖市ID
     * 		  id	                  市地区ID	 对应dao：cityId
     * 		  gbCode	      市地区国标码
     * 		  name	                  市地区名称
     * 		  value 	      市国安社区用户量 对应dao:number
     * */
    @Override
	public List<JSONObject> selectMapOfChinaCity(String proviceId)throws Exception {
    	List<JSONObject> list = new ArrayList<JSONObject>();
    	try{
	    	//1. 获取数据
	    	List<Map<String, Object>> lm = this.tProvinceDao.countMapOfChinaCity(proviceId);
	    	
	    	//2. 组装前台数据
	    	if(lm != null && lm.size() > 0){
	    		for(int i=0; i<lm.size(); i++){
	    			Map<String, Object> m = lm.get(i);
	    			JSONObject o = new JSONObject();
	    			o.put("proviceId", m.get("proviceId"));//省直辖市ID
	    			o.put("id", m.get("cityId"));		   //市地区ID
	    			o.put("gbCode", m.get("gbCode"));      //市地区国标码
	    			o.put("name", m.get("name"));		   //市地区名称
	    			o.put("value", m.get("number"));	   // 市国安社区用户量 
	    			list.add(o);
	    		}
	    	}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
		return list;
	}

    
    
    /**
     * 查询中国地图区县数据和人口数据
     * @param cityId  市地区ID
     * @return List<Map<String, Object>>
     * key: id 		   区县ID	对应dao：countyId
     * 		gbCode   区县国标码
     * 		name 	   区县名
     * 		cityId	   市地区id
     * 		value    区县社区用户量 对应dao：countyNumber
     * */
    @Override
	public List<JSONObject> selectMapOfChinaCounty(List<TCity> city) throws Exception {
	   List<JSONObject> json = new ArrayList<JSONObject>();
		try{
			if(city!=null && city.size()>0){
				for(int i=0;i<city.size();i++){
					String cityId = city.get(i).getCityId() + "";
					//1. 查询区县数据
					List<Map<String, Object>> lm = this.tProvinceDao.countMapOfChinaCounty(cityId);
					//2. 组装数据发送到前台
					if(lm != null && lm.size() > 0){
						for(int n=0; n<lm.size(); n++){
							Map<String, Object> m = lm.get(n);
							JSONObject o = new JSONObject();
							o.put("id", m.get("countyId"));			//区县ID
							o.put("gbCode", m.get("gbCode"));		//区县国标码
							o.put("name", m.get("name"));			//区县名
							o.put("cityId", m.get("cityId"));		//市区ID
							o.put("value", m.get("countyNumber"));	//区县社区用户量 
							/*if(i == 0){ 此处注释,不能进行默认选中，因为地图单击事件会有问题
								o.put("selected", "true");//默认选中第一条数据
							}*/
							json.add(o);
						}
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return json;
	}
   
   
    /**
    * 查询市/区县数据，根据省分类查询不同的数据
    * @param proviceId   省直辖市ID 默认: 0:省;1:直辖市;
    * @return List<JSONObject>
    * */
    @Override
	public List<JSONObject> selectMapOfChinaCityOrCountyInfo(String proviceId) throws Exception {
    	List<JSONObject> json = new ArrayList<JSONObject>();
    	try{
			//1. 查询省数据
    		TProvince provice = this.tProvinceDao.selectByPrimaryKey(new Long(proviceId));
  
    		//2. 判断查询市/区数据
    		if(provice != null){
    			
    			String type = provice.getType(); //省类型 默认 0:省;1:直辖市;
    			
	    		
    				if("null".equals(type) || type==null){//查询市数据
	    			
    					json = this.selectMapOfChinaCity(proviceId);
	    			
    				}else if("直辖市".equals(type)){//查询区县数据
    					
    					//3. 查询区县数据
    					//查询区县数据
    					Map<String, Object> paramMap = new HashMap<String, Object>();
    					paramMap.put("provinceId", proviceId);
    					List<TCity> city = this.tCityDao.selectCityByProviceID(paramMap);
    					if(city != null && city.size() > 0){
    						String cityId = city.get(0).getCityId() + "";
    						json = this.selectMapOfChinaCounty(city);
    					}
	    			}
    		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return json;
	}

/**
    * 核心数据统计查询
 	* @param id 		省直辖市ID-proviceId/市地区ID-cityId/区县ID-countyId/街道ID-town_id
 	* @param areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
 	* @param lastYearDate 去年的一月一日 yyyy-01-01
 	* @param Map<String, Object> map 如果有多个参数可以通过map传入
 	* @return JSONObject
 	* key: income 			人均收入
 	* 	   expend        	人均支出 
 	* 	   customerNumber   国安社区用户
 	* 	   storeNumber	            国安门店数
 	* 	   comsumeLevel 	消费等级
 	* 	   leadNum	   		潜力用户
 	* 	   proportion		国安社区用户/潜力用户的比例	
 	* 	   nuclearFamily    核心家庭(P.S 核心家庭数 = t_sum_population(人口统计)表的t_sum_population核心家庭数/t_sum_house(住宅统计)表的households住宅户数) 
     * */
	@Override
	public JSONObject selectMapOfChinaCoreData(String id, String areaType, Map<String, Object> map)
			throws Exception {
		JSONObject json = new JSONObject();
		try{
			//入参
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("id", id);
			paramMap.put("areaType", areaType);
			paramMap.put("lastYearDate", this.lastYearDate(-1, "01", "01"));//查询去年的数据
			
			//1. 取国安社区用户
			Map<String, Object> m = this.tProvinceDao.countCustomer(paramMap);
			if(m != null && !m.isEmpty()){
				String customerNumber = m.get("customerNumber") + "";
				if(StringUtils.isNoneBlank(customerNumber)){
					json.put("customerNumber", customerNumber);//国安社区用户
				}else{
					json.put("customerNumber", "0");//国安社区用户
				}
			}else{
				json.put("customerNumber", "0");//国安社区用户
			}
			
			//2. 国安潜力用户、消费等级、核心家庭
			Map<String, Object> m1 = this.tProvinceDao.countSumPopulation(paramMap);
			if(m1 != null && !m1.isEmpty()){
				
				String leadNum = m1.get("leadNum") + "";//潜力用户
				if(StringUtils.isNoneBlank(leadNum)){
					json.put("leadNum", leadNum);//潜力用户
				}else{
					json.put("leadNum", "0");//潜力用户
				}
				
				String comsumeLevel = m1.get("comsumeLevel") + "";//消费等级
				if(StringUtils.isNoneBlank(comsumeLevel)){
					json.put("comsumeLevel", comsumeLevel);//消费等级
				}else{
					json.put("comsumeLevel", "0");//消费等级
				}
				
				//2.1 核心家庭数 = 核心家庭/住宅户数
				String nuclearFamily = m1.get("nuclearFamily") + "";
				
				//住宅户数
				Map<String, Object> m3 = this.tProvinceDao.countMapOfChinaHouseholds(paramMap);
				if(m3 != null && !m3.isEmpty()){
					String households = m3.get("households") + ""; //住宅户数
					if(StringUtils.isNoneBlank(nuclearFamily) && StringUtils.isNoneBlank(households)
							&& !"0".equals(households) && !"0".equals(nuclearFamily) && !"null".equals(nuclearFamily) && !"null".equals(households)){
						BigDecimal c = new BigDecimal(nuclearFamily);//核心家庭
						BigDecimal l = new BigDecimal(households);	 //住宅户数
						json.put("nuclearFamily", c.divide(l, 2, BigDecimal.ROUND_HALF_EVEN).multiply(new BigDecimal("100")).toString());
					}else{
						json.put("nuclearFamily", "0");//核心家庭
					}
				}else{
					json.put("nuclearFamily", "0");//核心家庭
				}
			}else{
				json.put("leadNum", "0");//潜力用户
				json.put("comsumeLevel", "0");//消费等级
				json.put("nuclearFamily", "0");//核心家庭
			}
			
			//3. 人均收入、人均支出
			if(!"4".equals(areaType)&&!"6".equals(areaType)){
				Map<String, Object> m2 = this.tProvinceDao.countInCome(paramMap);
				if(m2 != null && !m2.isEmpty()){
					String income = m2.get("income") + "";//人均收入
					if(StringUtils.isNoneBlank(income)){
						json.put("income", income);//人均收入
					}else{
						json.put("income", "0");//人均收入
					}
					
					String expend = m2.get("expend") + "";//人均支出
					if(StringUtils.isNoneBlank(expend)){
						json.put("expend", expend);//人均支出
					}else{
						json.put("expend", "0");//人均支出
					}
					
				}else{
					json.put("income", "0");//人均收入
					json.put("expend", "0");//人均支出
				}
			}
			
			//6. 国安社区门店
			Map<String, Object> m3 = this.tProvinceDao.countStore(paramMap);
			if(m3 != null && !m3.isEmpty()){
				String storeNumber = m3.get("storeNumber") + "";// 国安门店数
				if(StringUtils.isNotBlank(storeNumber)){
					json.put("storeNumber", m3.get("storeNumber"));// 国安门店数
				}else{
					json.put("storeNumber", "0");// 国安门店数
				}
			}else{
				json.put("storeNumber", "0");// 国安门店数
			}
			
			//7. 计算国安社区用户/国安潜力用户的百分比
			if(m != null && !m.isEmpty() && m1 != null && !m1.isEmpty()){
				String customerNumber = m.get("customerNumber") + "";//国安社区用户
				String leadNum = m1.get("leadNum") + "";//潜力用户
				if(StringUtils.isNoneBlank(customerNumber) && StringUtils.isNoneBlank(leadNum)
						&& !"0".equals(customerNumber) && !"0".equals(leadNum)){
//					MathContext mc = new MathContext(2, RoundingMode.HALF_DOWN);
					BigDecimal c = new BigDecimal(customerNumber);
					BigDecimal l = new BigDecimal(leadNum);
					String proportion = c.divide(l, 2, BigDecimal.ROUND_HALF_EVEN).multiply(new BigDecimal("100")).toString();
					json.put("proportion", proportion);
				}else{
					json.put("proportion", "0");
				}
			}else{
				json.put("proportion", "0");
			}
			
			if("4".equals(areaType)){
				//查询街道住宅价格
				Map homePrice = tTinyVillageMapper.queryStreetHomePriceCoreInfo(id);
				json.put("income", homePrice.get("price")==null?0.00:homePrice.get("price"));//人均收入
				//查询街道写字楼价格
				Map officePrice = tTinyVillageMapper.queryStreetOfficePriceCoreInfo(id);
				json.put("expend",officePrice.get("price")==null?0.00:officePrice.get("price"));
				
			}
			if("6".equals(areaType)){
				//查询小区出租比例
				Map hmRentRadio = tSumHouseMapper.queryTinyVillageRentalRatio(paramMap);
				json.put("expend",hmRentRadio.get("rentRradio")==null?0.00:hmRentRadio.get("rentRradio"));
				//查询小区住宅价格
				Map tinyPrice = tTinyVillageMapper.queryTinVillageHomePriceCoreData(id);
				if(null!=tinyPrice&& !tinyPrice.isEmpty()){
					json.put("income",  tinyPrice.get("price")==null?0.00:tinyPrice.get("price"));//人均收入
				}else{
					json.put("income",  0.00);//人均收入
				}
			}

			//国安社区订单额
			Map<String, Object> dataOrder = this.tProvinceDao.countOrder(paramMap);
			if(dataOrder != null && !dataOrder.isEmpty()){
				String ordersum = dataOrder.get("ordercount") + "";
				if(StringUtils.isNotBlank(ordersum)){
					json.put("ordersum", dataOrder.get("ordercount"));
				}else{
					json.put("ordersum", "0");
				}
			}else{
				json.put("ordersum", "0");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return json;
	}
	
	/**
	 * 获取年份
	 * @param y  要增/减的年份
	 * @param m	  月
	 * @param d  日
	 * */
	public String lastYearDate(int y, String m, String d)throws Exception{
		StringBuffer date = new StringBuffer();
		Date dd = new Date();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy");
		
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(dd);
	    rightNow.add(Calendar.YEAR, y);//日期减1年
		
	    Date dt1=rightNow.getTime();
        String reStr = sf.format(dt1);
        
        date.append(reStr).append("-").append(m).append("-").append(d);
		return date.toString();
	}
	
	/**
	 * 获取年份集合yyyy
	 * @param year  年份 要加/减的年份
	 * @return List<String> yyyy-mm
	 * */
	public List<String> initMapsOfChinaCountyYears(String year)throws Exception{
		List<String> list = new ArrayList<String>();
		try{
			if(StringUtils.isNotBlank(year) && year.indexOf("-") != -1){
				//1. 传入的年份和月份
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
				Date pDate = sf.parse(year);
				Calendar p = Calendar.getInstance();
				p.setTime(pDate);
				int py = p.get(Calendar.YEAR); //传入年份
				int pm = p.get(Calendar.MONTH);//传入月份
				
				//2. 当前的年份和月份
				Calendar c = Calendar.getInstance();
				int cy = c.get(Calendar.YEAR);//当前年份
				int cm = c.get(Calendar.MONTH);//当前月份
				
				//3. 计算入参的当前日期相差几个月-两个日期相差的月份
				int tempMonth = (cy - py) * 12 + (cm - pm);
				
				//4. 把入参年份和月份放入集合
				list.add(sf.format(pDate));
				
				//5. 累加月份
				for(int i=0; i<tempMonth; i++){
					
					//累加月份
					p.add(Calendar.MONTH, 1);
					
					//日期组装
					StringBuffer sfDate = new StringBuffer();
					
					//日期月份默认+1
					sfDate.append(p.get(Calendar.YEAR)).append("-").append(p.get(Calendar.MONTH) + 1);
					
					Date d = sf.parse(sfDate.toString());
					
					//格式化数据 格式：yyyy-MM
					list.add(sf.format(d));
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * 查询区县国安门店数量、国安社区数量、国安社区订单额、日期、区县数据
	 * @param countyId 	区县ID 例：1,2,3,
	 * @param proviceId 省直辖市ID
	 * @param areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
	 * @param Map<String, Object> map 用于扩展参数
	 * @return JSONObject
	 * 	key:date		日期集合
	 * 		dataStore	国安门店数量
	 * 		dataVillage 国安社区数量
	 * 		dataOrder	国安社区订单额	
	 * 		countryList 区县数据	  
	 * */
	@Override
	public JSONObject selectMapOfChinaCountyInfo(String countyId, String areaType, String proviceId, Map<String, Object> map)
			throws Exception {
		JSONObject jsonObj = new JSONObject();
		try{
			String year = this.queryCurrentYM(-6); //获取月份
			
			//入参
			Map<String, Object> paramMap = new HashMap<String, Object>();
			String[] arrayCountyId = null;
			if(StringUtils.isNoneBlank(countyId)){
				arrayCountyId = countyId.split(","); //区县ID
			}
			paramMap.put("countyIdArray", arrayCountyId);
			paramMap.put("areaType", areaType);
			paramMap.put("createTime", year);//默认值
			paramMap.put("provinceId", proviceId);
			
			//1. 日期
			List<String> dateList = this.initMapsOfChinaCountyYears(year);
			
			//+5. 获取区县数据
			List<JSONObject> countryList = this.selectMapOfChinaCityOrCountyInfo(proviceId);
			
			//+5.1 转换区县地图数据
			Map<String, Object> countryMap = this.converCountyMap(countryList);
			
			//2. 国安门店数量
			List<Map<String, Object>> dataStoreList = this.tProvinceDao.countMapOfChinaCountyStores(paramMap);
			
			//2.1 获取门店json数据
			Map<String, Object> dataStoreJson = this.groupByCountyMapInfo(dataStoreList, countryMap, dateList);
					
			//3. 国安社区数量
			List<Map<String, Object>> dataVillageList = this.tProvinceDao.countMapOfChianCountyVillages(paramMap);
			
			//3.1 获取国安社区数量json数据
			Map<String, Object> dataVillageJson = this.groupByCountyMapInfo(dataVillageList, countryMap, dateList);
			
			//4. 国安社区订单额
			List<Map<String, Object>> dataOrderList = this.tProvinceDao.countMapOfChinaCountyOrder(paramMap);
			
			//4.1 获取国安社区订单额json
			Map<String, Object> dataOrderJson = this.groupByCountyMapInfo(dataOrderList, countryMap, dateList);
			
			
			//返回数据
			jsonObj.put("countryList", countryList);	//区县名称
			jsonObj.put("date", dateList);				//日期
			jsonObj.put("dataStore", dataStoreJson);	//国安门店数量
			jsonObj.put("dataVillage", dataVillageJson);//国安社区数量
			jsonObj.put("dataOrder", dataOrderJson);	//国安社区订单额
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return jsonObj;
	}
	
	
	
	/**
	 * 分组国安门店数量、国安社区数量、国安社区订单额
	 * @param listMap
	 * key: countyId		区县ID
	 * 		number			国安门店数量/国安社区数量/国安社区订单额
	 * 		createTime 		统计时间 yyyy-mm
	 * @param yearList 		统计时间yyyy-mm
	 * @param countyList 	区县数据
	 * @return Map<String, Object>
	 * 1. 显示数据  List<JSONObject>
	 * key:createTime		 统计时间 yyyy-mm
	 * value: List<JSONObject>
	 *  	  key:name:	  区县名称(这里直接返回区县的真实名称)
	 *  	 	  value： 国安门店数量/国安社区数量/国安社区订单额
	 * 2. 最大数据 
	 * key: createTime + "max" 统计时间 yyyy-mm加上字符串max
	 * value: 当前年份的最大数据值
	 * */
	private Map<String, Object> groupByCountyMapInfo(List<Map<String, Object>> listMap, 
			Map<String, Object> countyList, List<String> yearList)throws Exception{
		//返回数据
		Map<String, Object> returnMap = new HashMap<String, Object>();
		try{
			if(yearList != null && yearList.size() > 0){
				//日期赋值
				for(int i=0; i<yearList.size(); i++){
					//日期yyyy-MM
					String yearM = yearList.get(i);
					
					List<JSONObject> list = new ArrayList<JSONObject>();
					
					returnMap.put(yearM, list);//展示数据
					
					returnMap.put(yearM + "max", "0");//最大数据 {yyyy-MMmax:value} 例:{2016-02max:0}
				}
				
				//区县数据赋值
				Double max = new Double(0);//日期最大值
				
				for(int k=0; k<listMap.size(); k++){
					
					Map<String, Object> map = listMap.get(k);//数据集
					
					String countyId = map.get("countyId") + "";//区县ID
					
					String createTime = map.get("createTime") + "";//统计时间 yyyy-mm
			
					String number = map.get("number") + "";//国安门店数量/国安社区数量/国安社区订单额
					
					
					if(returnMap.containsKey(createTime)){
						
						JSONObject o = new JSONObject();
						
						o.put("name", countyList.get(countyId));//区县名称
						
						o.put("value", number);					//统计数据
						
						List<JSONObject> mList = (List<JSONObject>)returnMap.get(createTime);
						
						mList.add(o);
						
						returnMap.put(createTime, mList);
						
						//获取最大值
						if(StringUtils.isNotBlank(number)){
							
							Double tempNumber = Double.parseDouble(number);
							
							max = max.compareTo(tempNumber) > 0 ? max : tempNumber;
							
							returnMap.put(createTime + "max", max);//最大数据 {yyyy-MMmax:value} 例:{2016-02max:0}
						}
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return returnMap;
	}
	
	/**
	 * 把省数据组装成key:value的形式，
	 * @param List<JSONObject>
	 * key: 区县Id
	 * value: 区县名称
	 * @return Map<String, String>
	 * */
	private Map<String, Object> converCountyMap(List<JSONObject> list)throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		try{
			if(list != null && list.size() > 0){
				for(JSONObject o: list){
					map.put(o.get("id") + "", o.get("name") + "");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}
	
	
	/***
	 * 格式化数字 并四舍五入
	 * @param format 格式化数据格式 
	 * P.S. format为空时，默认小数点后保留3位小数并四舍五入
	 * #.#/0: #/0小数点后的位数
	 * @param number 要格式化的数据
	 * @return returnNumber 格式化后的数据 
	 * 1. 参数format非空,按照format参数格式化数据
	 * 2. 参数format为空,默认格式化数据保留3位小数
	 * 3. 参数number为空/不是数字,返回number,不予格式化数据
	 * */
	private String numberFormat(String fromat, String number)throws Exception{
		try{
			if(StringUtils.isNoneBlank(number)){
				DecimalFormat df = null;
				if(StringUtils.isNoneBlank(fromat)){
					df = new DecimalFormat(fromat);
				}else{
					df = new DecimalFormat();
				}
				if(isNumber(number)){
					double temp = Double.parseDouble(number);
					return df.format(temp);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return number;
	}
	
	/**
	 * 判断是否为数字
	 * @param number
	 * */
	public boolean isNumber(String number){
		try{
			Double.parseDouble(number);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	/**
	 * 获取直辖市市数据 
	 * @param proviceId 省ID
	 * @return cityId
	 * */
	public TCity selectCityInfo(String proviceId){
		TCity c = new TCity();
		try{
			//2. 查询市数据
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("provinceId", proviceId);
			List<TCity> city = this.tCityDao.selectCityByProviceID(paramMap);
			
			if(city != null && city.size() > 0){
				c = city.get(0);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 根据当前日期前推/后推N个月
	 * @param month 月份
	 * @return yyyy-MM
	 * */
	private String queryCurrentYM(int month)throws Exception{
		String str = "";
		try{
			Date d = new Date();
			
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		
			Calendar rightNow = Calendar.getInstance();
			
			rightNow.setTime(d);
			
		    rightNow.add(Calendar.MONTH, month);//减月份
		    
		    Date dt1=rightNow.getTime();
		    
		    str = sf.format(dt1);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return str;
	}

	public TProvinceMapper gettProvinceDao() {
		return tProvinceDao;
	}

	public void settProvinceDao(TProvinceMapper tProvinceDao) {
		this.tProvinceDao = tProvinceDao;
	}
	
	public static void main(String[] args){
		try{
		/*	BigDecimal c = new BigDecimal("3");
			BigDecimal l = new BigDecimal("2000");
			String proportion = c.divide(l).multiply(new BigDecimal("100")).toString();
			System.out.println(proportion);
			
			StringBuffer date = new StringBuffer();*/
		/*	Date dd = new Date();
			
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
			
			Calendar rightNow = Calendar.getInstance();
			rightNow.setTime(dd);
		    rightNow.add(Calendar.MONTH, -6);//日期减1年
			
		    Date dt1=rightNow.getTime();
	        String reStr = sf.format(dt1);
	        
	        //date.append(reStr).append("-").append("01").append("-").append("01");
	        
	        System.out.println(reStr);*/
		/*	SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM");
			Date date = sm.parse("2015-09");
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			
			c.add(Calendar.MONTH, 5);
		
			String mo = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1);
			
			Date dd = sm.parse(mo);
			System.out.println(sm.format(dd));*/
			/*c.add(Calendar.YEAR, Integer.valueOf("-1"));
			System.out.println(2015 + 0 + "");
			
			MapDataServiceImpl m = new MapDataServiceImpl();
			List<String> s = m.initMapsOfChinaCountyYears("-1");
			for(String l: s){
				System.out.println(l);
			}*/
		/*	DecimalFormat df= new DecimalFormat("#.###");
			String ss  = "100";
			System.out.println(Double.parseDouble(ss));*/
			//Integer.parseInt(ss);
			//int i = 1/0;
			MapDataServiceImpl m = new MapDataServiceImpl();
			System.out.println(m.queryCurrentYM(-6));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//
}
