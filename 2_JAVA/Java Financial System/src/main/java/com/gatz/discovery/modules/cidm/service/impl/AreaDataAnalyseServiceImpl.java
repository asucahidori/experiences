package com.gatz.discovery.modules.cidm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TStorePoiMapper;
import com.gatz.discovery.modules.cidm.dao.TStreetCoordinateMapper;
import com.gatz.discovery.modules.cidm.dao.TSumBusinessMapper;
import com.gatz.discovery.modules.cidm.dao.TSumHouseMapper;
import com.gatz.discovery.modules.cidm.dao.TSumPopulationMapper;
import com.gatz.discovery.modules.cidm.dao.TTinyvillageHomePriceMapper;
import com.gatz.discovery.modules.cidm.dao.TTinyvillageOfficeInfoMapper;
import com.gatz.discovery.modules.cidm.dao.TTinyvillageOfficePriceMapper;
import com.gatz.discovery.modules.cidm.model.CoordinatesVo;
import com.gatz.discovery.modules.cidm.model.TbArea;
import com.gatz.discovery.modules.cidm.service.AreaDataAnalyseService;
import com.gatz.discovery.modules.cidm.util.DataUtil;
/**
 * 
 * @author lixing
 *
 */
@Service
public class AreaDataAnalyseServiceImpl extends GenericServiceImpl<TbArea, Long> implements AreaDataAnalyseService {
	@Resource
	private TSumPopulationMapper tSumPopulationMapper;
	@Resource
	private TTinyvillageHomePriceMapper tTinyvillageHomePriceMapper;
	@Resource
	private TSumHouseMapper tSumHouseMapper;
	@Resource
	private TTinyvillageOfficeInfoMapper tTinyvillageOfficeInfoMapper;
	@Resource
	private TTinyvillageOfficePriceMapper tTinyvillageOfficePriceMapper;
	@Resource
	private TSumBusinessMapper tSumBusinessMapper;
	@Resource
    private TStorePoiMapper tStorePoiMapper;
	@Resource
    private TStreetCoordinateMapper streetCoordinateMapper;
	@Override
	public GenericDao<TbArea, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAreaSexCount(String areacode) {
		
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tSumPopulationMapper.getAreaSexCount(areacode);
		List streetN = new ArrayList();
		List boylist = new ArrayList();
		List grillist = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			streetN.add(map.get("name"));
			boylist.add(map.get("male_population"));
			grillist.add(map.get("female_population"));
		}
		aa.add(0, streetN);
		aa.add(1, boylist);
		aa.add(2, grillist);
		
		return aa;
	}

	@Override
	public List getCountrySexCount(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = null;
		strArray = tSumPopulationMapper.getCountrySexCount(areacode);
		List streetN = new ArrayList();
		List boylist = new ArrayList();
		List grillist = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			streetN.add(map.get("name"));
			boylist.add(map.get("male_population"));
			grillist.add(map.get("female_population"));
		}
		aa.add(0, streetN);
		aa.add(1, boylist);
		aa.add(2, grillist);
		/*String [] strArray1 = {"东城区", "西城区", "崇文区", "朝阳区", "海淀区", "丰台区", "石景山", "门头沟", "房山区", "通州区", "顺义区", "昌平区", "大兴区", "怀柔区", "平谷区", "密云县", "延庆县"};
		int [] number ={100, 110, 200, 230, 350, 410, 180, 250, 350, 401, 298, 381, 298, 345, 501, 301, 401};
		int [] number1 ={120, 80, 210, 200, 300, 380, 200, 240, 340, 400, 280, 380, 390, 510, 500, 300, 380};
		aa.add(0, strArray1);
		aa.add(1, number);
		aa.add(2, number1);*/
		return aa;
	}

	@Override
	public List getCityHomePriceCountry(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getCityHomePriceCountry(areacode);
		List areaN = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			areaN.add(map.get("name"));
			price.add(map.get("price"));
		}
		aa.add(0, areaN);
		aa.add(1, price);
		return aa;
	}

	@Override
	public List getCityHomePriceCount(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getCityHomePriceCount(areacode);
		ArrayList date = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			date.add(String.valueOf(map.get("month")));
			price.add(map.get("price"));
		}
		aa.add(0, DataUtil.parseDateString(date));
		aa.add(1, price);
		
		/*ArrayList<String> strArray = new ArrayList<String> ();
		strArray.add("201507");
    	strArray.add("201508");strArray.add("201509");strArray.add("201510");strArray.add("201511");strArray.add("201512");strArray.add("201601");strArray.add("201602");strArray.add("201603");
    	//转换格式
    	aa.add(DataUtil.parseDateString(strArray));
    	String [] strArray1 = {"3.6","3.1","3.1","3","2.9","3.5","3.1","3","3.2"};
    	aa.add(strArray1);*/
		
		return aa;
	}

	@Override
	public List getCountryHomePriceTown(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getCountryHomePriceTown(areacode);
		List areaN = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			areaN.add(map.get("name"));
			price.add(map.get("price"));
		}
		aa.add(0, areaN);
		aa.add(1, price);
		return aa;
	}

	@Override
	public List getCountryHomePriceCount(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getCountryHomePriceCount(areacode);
		ArrayList date = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			date.add(String.valueOf(map.get("month")));
			price.add(map.get("price"));
		}
		aa.add(0, DataUtil.parseDateString(date));
		aa.add(1, price);
		return aa;
	}

	@Override
	public List getTownHomePriceVillage(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getTownHomePriceVillage(areacode);
		List areaN = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			areaN.add(map.get("name"));
			price.add(map.get("price"));
		}
		aa.add(0, areaN);
		aa.add(1, price);
		return aa;
	}

	@Override
	public List getTownHomePriceCount(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getTownHomePriceCount(areacode);
		ArrayList date = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			date.add(String.valueOf(map.get("month")));
			price.add(map.get("price"));
		}
		aa.add(0, DataUtil.parseDateString(date));
		aa.add(1, price);
		return aa;
	}
	
	@Override
	public List getVillageHomePriceCount(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageHomePriceMapper.getVillageHomePriceCount(areacode);
		ArrayList date = new ArrayList();
		List price = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			date.add(String.valueOf(map.get("month")));
			price.add(map.get("price"));
		}
		aa.add(0, DataUtil.parseDateString(date));
		aa.add(1, price);
		return aa;
	}
	
	@Override
	public List getAreaHomeProperty(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tSumHouseMapper.getAreaHomeProperty(areacode);
		ArrayList propertyN = new ArrayList();
		List proData = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			String zizhu = String.valueOf(map.get("zizhu"));
			propertyN.add("自住");
			Map proMapzizhu = new HashMap<String,String>();
			proMapzizhu.put("value", zizhu);
			proMapzizhu.put("name", "自住");
			proData.add(0,proMapzizhu);
			String zuzhu = String.valueOf(map.get("zuzhu"));
			propertyN.add("租住");
			Map proMapzuzhu = new HashMap<String,String>();
			proMapzuzhu.put("value", zuzhu);
			proMapzuzhu.put("name", "租住");
			proData.add(1,proMapzuzhu);
		}
		aa.add(propertyN);
		aa.add(proData);
		return aa;
	}

	@Override
	public List getBuildingHomeProperty(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tSumHouseMapper.getBuildingHomeProperty(areacode);
		ArrayList propertyN = new ArrayList();
		List proData = new ArrayList();
		for (Object object : strArray) {
			
			Map<String, Object> map = (Map<String, Object>) object;
			String zizhu = String.valueOf(map.get("zizhu"));
			propertyN.add("自住");
			Map proMapzizhu = new HashMap<String,String>();
			proMapzizhu.put("value", zizhu);
			proMapzizhu.put("name", "自住");
			proData.add(0,proMapzizhu);
			String zuzhu = String.valueOf(map.get("zuzhu"));
			propertyN.add("租住");
			Map proMapzuzhu = new HashMap<String,String>();
			proMapzuzhu.put("value", zuzhu);
			proMapzuzhu.put("name", "租住");
			proData.add(1,proMapzuzhu);
		}
		aa.add(propertyN);
		aa.add(proData);
		return aa;
	}

	@Override
	public List getVillageAreaCount(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageOfficeInfoMapper.getVillageAreaCount(areacode);
		List areaN = new ArrayList();
		List areacount = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			areaN.add(map.get("name"));
			areacount.add(map.get("buildup_area"));
		}
		aa.add(0, areaN);
		aa.add(1, areacount);
		return aa;
	}

	@Override
	public List getVillageAverageRent(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tTinyvillageOfficePriceMapper.getVillageAverageRent(areacode);
		List areaN = new ArrayList();
		List arearent= new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			areaN.add(map.get("name"));
			arearent.add(map.get("rent"));
		}
		aa.add(0, areaN);
		aa.add(1, arearent);
		return aa;
	}
	
	@Override
	public List getStreetSurroundState(String areacode) {
		List aa = new ArrayList();
		List<Map<String, Object>> strArray = tSumBusinessMapper.getStreetSurroundState(areacode);
		ArrayList propertyN = new ArrayList();
		List stsData = new ArrayList();
		for (Object object : strArray) {
			Map<String, Object> map = (Map<String, Object>) object;
			Map proMap = new HashMap<String,String>();
			proMap.put("value", map.get("shop_area"));
			proMap.put("name", map.get("level1_name"));
			stsData.add(0,proMap);
		}
		aa.add(stsData);
		return aa;
	}

	@Override
	public List queryStorePoi(Long id) {
		List aa = new ArrayList();
		//组装参数
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("countyId", id);
		
		aa = tStorePoiMapper.queryStorePoi(params);
		return aa;
	}

	@Override
	public List selectMapWithBLOBsGaode(Long id) {
		List aa = new ArrayList();
		//组装参数
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("streetId", id);
		
		List Coordinates = streetCoordinateMapper.selectMapWithBLOBsGaode(params);
		
		CoordinatesVo cvo = (CoordinatesVo) Coordinates.get(0);
		
		String str = new String(cvo.getGaodeCoordinates());
		
		aa.add(str);
		
		return aa;
	}

}
