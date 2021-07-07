package com.gatz.discovery.modules.cidm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.cidm.dao.TGdpMapper;
import com.gatz.discovery.modules.cidm.model.TGdp;
import com.gatz.discovery.modules.cidm.model.TGdpVo;
import com.gatz.discovery.modules.cidm.service.ImportGdpService;

import net.minidev.json.JSONObject;
@Service
public class ImportGdpServiceImpl extends GenericServiceImpl<TGdp, Long> implements ImportGdpService{
	@Resource
	private TGdpMapper tGdpMapper;
	@Override
	public Map<String, Object> importFile(Map<String, Map<Integer, List<String>>> map, List<TGdp> tGdp,String year) {
		 
		Map<String, Object> resultObj = new HashMap<String, Object>();
		try
		{
			Iterator<String> iter = map.keySet().iterator();
			while (iter.hasNext()){
				String key = iter.next();
				Map<Integer, List<String>> mapdata = map.get(key);
				
				/*JSONObject jObject=new JSONObject();  
				jObject.put("aaaaaaa", mapdata);  
				System.out.println(">>>>>>>>>>>>>>>>>"+jObject.toString());*/
				//解析数据
				if((key.trim()).equals("城镇居民收支情况")){
					insertGdpBudget(mapdata,"1");
				}
				if((key.trim()).equals("农村居民收支情况")){
					insertGdpBudget(mapdata,"2");
				}
				if((key.trim()).equals("地区生产总值")){
					updateGdpBudget(mapdata);
				}
				
				
			}
		}catch (Exception e)
		{
			e.printStackTrace();
			resultObj.put("msg", "E_解析失败！");
		}
		return null;
	}

	@Override
	public GenericDao<TGdp, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 更新收支情况
	 * @param list
	 * @throws ParseException 
	 */
	public void insertGdpBudget(Map<Integer, List<String>> mapdata,String type) throws ParseException{
		List list = new ArrayList<Object>();
		Iterator<Integer> iter1 = mapdata.keySet().iterator();
		Date year1=null;
		Date year2=null;
		Short area_type=0;
		while (iter1.hasNext()){
			Integer key1 = iter1.next();
			if(key1>=3){
				TGdp tgdp1 = new TGdp();
				TGdp tgdp2 = new TGdp();
				List<String> tempList = mapdata.get(key1);
				if(key1==3){
					year1=new SimpleDateFormat("yyyy").parse(tempList.get(1));
					year2=new SimpleDateFormat("yyyy").parse(tempList.get(2));
				}
				if(key1==4){
					area_type=2;
				}else{
					area_type=3;
				}
				String areaName=tempList.get(0);
				if(null==areaName||areaName.equals("")){
					continue;
				}
				if(key1>=4){
					
					//根据areaname查找ID
					Map maperea = new HashedMap();
					maperea.put("areatype", area_type);
					maperea.put("areaname",areaName.trim());
					Long areaid = tGdpMapper.selectAreaIdByName(maperea);
					if(null==areaid){
						continue;
					}
					String income1=tempList.get(1);
					String income2=tempList.get(2);
					String increment1=tempList.get(3);
					//支出
					String expenditure1=tempList.get(4);
					String expenditure2=tempList.get(5);
					String increment2=tempList.get(6);
					
					tgdp1.setAreaId(areaid);
					tgdp1.setDateId(year1);
					tgdp1.setAreaType(area_type);
					tgdp1.setIncome(Long.valueOf(income1));
					tgdp1.setExpend(Long.valueOf(expenditure1));
					
					
					tgdp2.setAreaId(areaid);
					tgdp2.setDateId(year2);
					tgdp2.setAreaType(area_type);
					tgdp2.setIncome(Long.valueOf(income2));
					tgdp2.setExpend(Long.valueOf(expenditure2));
					
					
					list.add(tgdp1);
					list.add(tgdp2);
				}
			}
			
			
		}
		//插入数据库
		tGdpMapper.insertGdplists(list);	
	}
	/**
	 * 更新收支情况
	 * @param list
	 * @throws ParseException 
	 */
	public void updateGdpBudget(Map<Integer, List<String>> mapdata) throws ParseException{
		List list = new ArrayList<Object>();
		Iterator<Integer> iter1 = mapdata.keySet().iterator();
		String year1=null;
		String year2=null;
		Short area_type=0;
		while (iter1.hasNext()){
			Integer key1 = iter1.next();
			if(key1>=4){
				TGdpVo tgdp1 = new TGdpVo();
				TGdpVo tgdp2 = new TGdpVo();
				List<String> tempList = mapdata.get(key1);
				if(key1==4){
					year1=parseDate(new SimpleDateFormat("yyyy").parse(tempList.get(1)));
					year2=parseDate(new SimpleDateFormat("yyyy").parse(tempList.get(2)));
				}
				if(key1==5){
					area_type=2;
				}else{
					area_type=3;
				}
				String areaName=tempList.get(0);
				if(null==areaName||areaName.equals("")){
					continue;
				}
				if(key1>=5){
					if(areaName.indexOf("注")!=-1){
						break;
					}
					if(areaName.indexOf("核")!=-1||areaName.indexOf("展")!=-1){
						continue;
					}
					
					//根据areaname查找ID
					Map maperea = new HashedMap();
					maperea.put("areatype", area_type);
					maperea.put("areaname",areaName.trim());
					Long areaid = tGdpMapper.selectAreaIdByName(maperea);
					if(null==areaid){
						continue;
					}
					
					String gdp1=tempList.get(1);
					String gdp2=tempList.get(2);
					if(gdp1.indexOf(".")!=-1){
						gdp1=gdp1.substring(0, gdp1.indexOf("."));
					}
					if(gdp2.indexOf(".")!=-1){
						gdp2=gdp2.substring(0, gdp2.indexOf("."));
					}
					
					tgdp1.setAreaId(areaid);
					tgdp1.setDateId(year1);
					tgdp1.setAreaType(area_type);
					tgdp1.setGdp(Long.valueOf(gdp1));
					
					tgdp2.setAreaId(areaid);
					tgdp2.setDateId(year2);
					tgdp2.setAreaType(area_type);
					tgdp2.setGdp(Long.valueOf(gdp2));
					//批量修改报错，改成单条插入
					//list.add(tgdp1);
					List list1 = new ArrayList<Object>();
					list1.add(tgdp1);
					tGdpMapper.updateGdplists(list1);
					
					//list.add(tgdp2);
					List list2 = new ArrayList<Object>();
					list2.add(tgdp2);
					tGdpMapper.updateGdplists(list2);
				}
			}
			
			
		}
		//插入数据库
			
	}
	public String parseDate(Date d){
		String sDate = null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sDate="'"+sdf.format(d)+"'";
		System.out.println(sDate);
		return sDate;
	}
}
