package com.gatz.discovery.modules.cidm.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.minidev.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gatz.discovery.core.entity.JSONResult;
import com.gatz.discovery.modules.cidm.service.AreaDataAnalyseService;
import com.gatz.discovery.modules.cidm.util.DataUtil;
import com.gatz.discovery.modules.cidm.util.Logger;

/**
 * Created by lixing on 2016/2/3.
 */
@Controller
@RequestMapping(value = "/areaData")
public class AreaDataAnalyseController {
	
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private AreaDataAnalyseService areaDataAnalyseService;

    @RequestMapping("/cityreport")
    public String areamap(@RequestParam(required=false) String name,@RequestParam(required=false) String id,HttpServletRequest request,Model model) {
    	String namestr = request.getParameter("name");
	    model.addAttribute("id", id);
	    model.addAttribute("name", DataUtil.encodeStr(namestr));
        return "modules/cidm/report_city";
    }
    
    /**
     * -------------------------------------------------------------------------------------------------------
     */
    /**
     * 根据省市id , 省市/直辖市--各区性别结构
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "countrysexcount", method = RequestMethod.POST)
    public JSONResult getCountrySexCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getCountrySexCount(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据区县id , 街道--各街道性别结构
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "townsexcount", method = RequestMethod.POST)
    public JSONResult getAreaSexCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getAreaSexCount(areacode);
    		return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
        
    }
    
    /**
     * 根据省市id , 市--各区住宅房价（区名）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "cityHomePriceCountry", method = RequestMethod.POST)
    public JSONResult getCityHomePriceCountry(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getCityHomePriceCountry(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据省市id , 市住宅房价（日期）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "cityHomePrice", method = RequestMethod.POST)
    public JSONResult getCityHomePriceCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getCityHomePriceCount(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    
    
    /**
     * 根据区县id , 街道--各街道住宅房价（街道名）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "countryHomePriceTown", method = RequestMethod.POST)
    public JSONResult getCountryHomePriceTown(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getCountryHomePriceTown(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据区县id , 区县住宅房价（日期）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "countryHomePrice", method = RequestMethod.POST)
    public JSONResult getCountryHomePriceCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getCountryHomePriceCount(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    
    /**
     * 根据街道id , 街道--各社区住宅房价（社区名）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "townHomePriceVillage", method = RequestMethod.POST)
    public JSONResult getTownHomePriceVillage(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getTownHomePriceVillage(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据街道id , 街道社区住宅房价（日期）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "townHomePrice", method = RequestMethod.POST)
    public JSONResult getTownHomePriceCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
			List aa = areaDataAnalyseService.getTownHomePriceCount(areacode);
			return new JSONResult<List<Object>>(aa);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据小区id , 住宅房价（按年月）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "villageHomePrice", method = RequestMethod.POST)
    public JSONResult getVillageHomePriceCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getVillageHomePriceCount(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }



    /**
     * 根据小区id , 小区--住房住宅性质
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "areaHomeProperty", method = RequestMethod.POST)
    public JSONResult getAreaHomeProperty(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getAreaHomeProperty(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据楼栋id ,楼栋--住房住宅性质
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "buildingHomeProperty", method = RequestMethod.POST)
    public JSONResult getBuildingHomeProperty(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getBuildingHomeProperty(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    
    
    
    /**
     * 根据街道id , 各社区写字楼总面积
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "villageAreaCount", method = RequestMethod.POST)
    public JSONResult getVillageAreaCount(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getVillageAreaCount(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据街道id ,各社区写字楼平均租金
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "villageAverageRent", method = RequestMethod.POST)
    public JSONResult getVillageAverageRent(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getVillageAverageRent(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    
    /**
     * 根据街道ID，取得街道周边业态
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "streetSurroundState", method = RequestMethod.POST)
    public JSONResult getStreetSurroundState(@RequestParam(required=false) String areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.getStreetSurroundState(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 根据区域ID，取得门店POI
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "queryStorePoi", method = RequestMethod.POST)
    public JSONResult queryStorePoi(@RequestParam(required=false) Long areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.queryStorePoi(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
    /**
     * 查询街道区域坐标（高德）
     * @param areacode
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selectMapWithBLOBsGaode", method = RequestMethod.POST)
    public JSONResult selectMapWithBLOBsGaode(@RequestParam(required=false) Long areacode) {
    	List dataList = new ArrayList();
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	try {
    		dataList = areaDataAnalyseService.selectMapWithBLOBsGaode(areacode);
			return new JSONResult<List<Object>>(dataList);
		} catch (Exception e) {
			logger.error(e.getMessage());
    		paramMap.put("message","系统错误，请联系管理员！");
    		dataList.add(paramMap);
    		return new JSONResult<List<Object>>(dataList,false);
		}
    }
}
