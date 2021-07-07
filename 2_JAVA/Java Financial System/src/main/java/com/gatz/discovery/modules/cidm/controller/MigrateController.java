package com.gatz.discovery.modules.cidm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gatz.discovery.core.util.CoordinateUtil;
import com.gatz.discovery.modules.cidm.dao.TTownMapper;
import com.gatz.discovery.modules.cidm.model.TStorePoi;
import com.gatz.discovery.modules.cidm.model.TStreetCoordinateWithBLOBs;
import com.gatz.discovery.modules.cidm.model.TTown;
import com.gatz.discovery.modules.cidm.model.TVillageCharts;
import com.gatz.discovery.modules.cidm.service.TStorePoiService;
import com.gatz.discovery.modules.cidm.service.TStreetCoordinateService;
import com.gatz.discovery.modules.cidm.service.TTownService;
import com.gatz.discovery.modules.cidm.service.TVillageChartsService;
import com.gatz.discovery.modules.cidm.util.Logger;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

/**
 * 迁徙图表
 * 
 * @author jh
 *
 */
@Controller
@RequestMapping(value = "/migrate")
public class MigrateController {

	protected Logger logger = Logger.getLogger(this.getClass());

	@Resource
	private TVillageChartsService tVillageChartsService;

	@Resource
	private TTownService tTownService;

	@Resource
	private TStreetCoordinateService tStreetCoordinateService;

	@Resource
	private TStorePoiService tStorePoiService;

	@RequestMapping("/toMigrate")
	public ModelAndView toMigrate(HttpServletRequest request, HttpServletResponse response, String townId) {
		ModelAndView mav = new ModelAndView("modules/migrate/migrate");
		mav.addObject("townId", townId);
		return mav;
	}

	@RequestMapping("/moveChart")
	public ModelAndView moveChart(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");

		ModelAndView mav = new ModelAndView("modules/migrate/moveChart");
		if (StringUtils.isBlank(id) || StringUtils.isBlank(name)) {
			return mav;
		}
		try {
			name = java.net.URLDecoder.decode(name, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}

		if (StringUtils.isBlank(id)) {
			return mav;
		}
		TStorePoi tStorePoi = tStorePoiService.selectByStreetId(Long.parseLong(id));
		if (tStorePoi != null) {
			double[] coor = CoordinateUtil.gd2bd(tStorePoi.getCoordinateX(), tStorePoi.getCoordinateY());
			mav.addObject("storelng", coor[0]);
			mav.addObject("storelat", coor[1]);
			mav.addObject("storeName", tStorePoi.getName());
		}
		TStreetCoordinateWithBLOBs ts = tStreetCoordinateService.selectByStreetId(Integer.parseInt(id));
		if (ts == null) {
			return mav;
		}
		String str = new String(ts.getCoordinates());
		str = str.replace("-", ",");
		str = str.replace("\\[|\\]", "");
		if (str.lastIndexOf(",") == str.length() - 1) {
			str = str.substring(0, str.length() - 1);
		}
		mav.addObject("townName", name);
		mav.addObject("townId", id);
		mav.addObject("boundary", str);
		return mav;
	}

	@ResponseBody
	@RequestMapping("/villageMigrate")
	public JSONObject getVillageByDownId(String townId) {
		JSONObject json = new JSONObject();
		if (StringUtils.isBlank(townId)) {
			json.put("message", "townId为空！");
			return json;
		}
		TTown town = tTownService.selectById(Long.parseLong(townId));
		List<TVillageCharts> villages = tVillageChartsService.getVillageByDownId(Long.parseLong(townId));
		JSONObject geoCoord = new JSONObject();
		int dataMax = 100;
		for (TVillageCharts vc : villages) {
			double[] sqxy = new double[2];
			sqxy[0] = vc.getBaiduCoordinateX();
			sqxy[1] = vc.getBaiduCoordinateY();
			geoCoord.put(vc.getName(), sqxy); // 社区坐标

			double[] dtxy = new double[2];
			dtxy[0] = vc.getArea1BaiduX();
			dtxy[1] = vc.getArea1BaiduY();
			geoCoord.put(vc.getArea1Name(), dtxy); // 地铁坐标

			double[] csxy = new double[2];
			csxy[0] = vc.getArea2BaiduX();
			csxy[1] = vc.getArea2BaiduY();
			geoCoord.put(vc.getArea2Name(), csxy); // 超市坐标
			if (vc.getResidentPopulationNumber() * 0.4 > dataMax) {
				dataMax = (int) (vc.getResidentPopulationNumber() * 0.4);
			}
		}
		json.put("geoCoord", geoCoord);

		// 时间轴数据分8:00,9:00,11:00,18:00四个时间段数据
		JSONObject option1 = new JSONObject();
		JSONArray markLine1 = new JSONArray();
		JSONArray markPoint1 = new JSONArray();

		JSONObject option2 = new JSONObject();
		JSONArray markLine2 = new JSONArray();
		JSONArray markPoint2 = new JSONArray();

		JSONObject option3 = new JSONObject();
		JSONArray markLine3 = new JSONArray();
		JSONArray markPoint3 = new JSONArray();

		JSONObject option4 = new JSONObject();
		JSONArray markLine4 = new JSONArray();
		JSONArray markPoint4 = new JSONArray();
		for (TVillageCharts vs : villages) {
			JSONArray arr1 = new JSONArray();
			JSONObject start1 = new JSONObject();
			JSONObject end1 = new JSONObject();
			start1.put("name", vs.getName());
			end1.put("name", vs.getArea1Name());
			end1.put("value", (int) (vs.getResidentPopulationNumber() * 0.4));
			arr1.add(start1);
			arr1.add(end1);
			markLine1.add(arr1);
			markPoint1.add(end1);// 8:00-9:00 社区到地铁

			JSONArray arr2 = new JSONArray();
			JSONObject start2 = new JSONObject();
			JSONObject end2 = new JSONObject();
			start2.put("name", vs.getName());
			end2.put("name", vs.getArea2Name());
			end2.put("value", (int) (vs.getResidentPopulationNumber() * 0.2));
			arr2.add(start2);
			arr2.add(end2);
			markLine2.add(arr2);
			markPoint2.add(end2);// 9:00-10:00 社区到超市

			JSONArray arr3 = new JSONArray();
			JSONObject start3 = new JSONObject();
			JSONObject end3 = new JSONObject();
			start3.put("name", vs.getArea2Name());
			end3.put("name", vs.getName());
			end3.put("value", (int) (vs.getResidentPopulationNumber() * 0.2));
			arr3.add(start3);
			arr3.add(end3);
			markLine3.add(arr3);
			markPoint3.add(end3);// 10:00-11:00超市 到社区

			JSONArray arr4 = new JSONArray();
			JSONObject start4 = new JSONObject();
			JSONObject end4 = new JSONObject();
			start4.put("name", vs.getArea1Name());
			end4.put("name", vs.getName());
			end4.put("value", (int) (vs.getResidentPopulationNumber() * 0.4));
			arr4.add(start4);
			arr4.add(end4);
			markLine4.add(arr4);
			markPoint4.add(end4);// 18:00-20:00地铁到社区
		}
		option1.put("markLine", markLine1);
		option1.put("markPoint", markPoint1);
		option2.put("markLine", markLine2);
		option2.put("markPoint", markPoint2);
		option3.put("markLine", markLine3);
		option3.put("markPoint", markPoint3);
		option4.put("markLine", markLine4);
		option4.put("markPoint", markPoint4);
		json.put("option1", option1);
		json.put("option2", option2);
		json.put("option3", option3);
		json.put("option4", option4);
		JSONArray timeLine = new JSONArray();
		timeLine.add("8:00-9:00");
		timeLine.add("9:00-10:00");
		timeLine.add("10:00-11:00");
		timeLine.add("18:00-20:00");
		json.put("timeline", timeLine);
		json.put("dataMax", dataMax);
		json.put("townx", town.getBaiduCoordinateX());
		json.put("towny", town.getBaiduCoordinateY());
		return json;
	}
}
