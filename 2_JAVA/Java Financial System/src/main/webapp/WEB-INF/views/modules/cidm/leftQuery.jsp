<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>

<ul class="main-navigation-menu">
	<li class="active open"><a href="<%=basePath %>/discovery/index">
			<div class="item-content">
				<div class="item-media">
					<i class="ti-home"></i>
				</div>
				<div class="item-inner">
					<span class="title"><a href="<%=basePath%>/discovery/map"> 首页 </a></span>
				</div>
			</div>
	</a></li>

	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<!--<i class="ti-settings"></i>-->
					<i class="fa fa-gear"></i>
				</div>
				<div class="form-group">
					<label> 省 </label> <select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择省市'" id="province">
						<option></option>

					</select>
				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-gear"></i>
				</div>
				<div class="form-group">
					<label> 市 </label> <select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择区'" id="city">
						<option></option>
					</select>

				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-pie-chart"></i>
				</div>
				<div class="form-group">
					<label> 区/县城 </label> <select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择省市'" id="area">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-building"></i>
				</div>
				<div class="form-group">
					<label> 街道 </label> <select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择省市'" id="street">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-building"></i>
				</div>
				<div class="form-group">
					<label> 小区 </label> <select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择省市'" id="village">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-building"></i>
				</div>
				<div class="form-group">
					<label> 楼栋 </label> <select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择省市'" id="building">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>

	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-building"></i>
				</div>
				<div class="form-group">
					<label> 单元 </label>
					<select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择单元'" id="unit">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-building"></i>
				</div>
				<div class="form-group">
					<label> 楼层 </label>
					<select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择楼层'" id="floor">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div class="item-media">
					<i class="fa fa-building"></i>
				</div>
				<div class="form-group">
					<label> 房间号 </label>
					<select
						class="js-example-placeholder-single js-states form-control"
						style="placeholde: '请选择楼层'" id="household">
						<option></option>
					</select>
				</div>
			</div>
	</a></li>
	
	
	<li><a href="javascript:void(0)">
			<div class="item-content">
				<div>
					<button id="search_report" type="button"
						class="btn btn-primary btn-wide btn-scroll btn-scroll-left fa fa-search search_submit">
						<span>查&nbsp;&nbsp;询</span>
					</button>
				</div>
			</div>
	</a></li>
</ul>
<script src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
<script language="javascript">
	jQuery(document)
			.ready(
					function() {
						var provinceId = "";
						var provinceName = "";

						var cityId = "";
						var cityName = "";

						var areaId = "";
						var areaName = "";

						var streetId = "";
						var streetName = "";

						var villageId = "";
						var villageName = "";

						var buildingId = "";
						var buildingName = "";
						
						var unit = "";
						var floor = "";
						var household = "";
						var unitName = "";
						var floorName = "";
						var householdName = "";
						$("#search_report")
								.click(
										function() {
											$($("select").toArray().reverse())
													.each(
															function() {
																var name = $(
																		this)
																		.find(
																				"option:selected")
																		.text();
																var id = $(this)
																		.val();
																var selectP = $(
																		this)
																		.attr(
																				"id");
																var type = "";
																var tinyVillageId=0;
																if (null!=id&&id != ""&&id!="0") {
																	if (selectP == "province") {
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();
																		type = 1;
																	}
																	if (selectP == "city") {
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();

																		cityId = $("#city").val();
																		cityName = $("#city option:selected").text();

																		type = 1;
																	}
																	if (selectP == "area") {
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();

																		cityId = $("#city").val();
																		cityName = $("#city option:selected").text();

																		areaId = $("#area").val();
																		areaName = $("#area option:selected").text();
																		type = 3;
																	}
																	if (selectP == "street") {
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();

																		cityId = $("#city").val();
																		cityName = $("#city option:selected").text();

																		areaId = $("#area").val();
																		areaName = $("#area option:selected").text();

																		streetId = $("#street").val();
																		streetName = $("#street option:selected").text();

																		type = 4;
																	}
																	if (selectP == "village") {
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();

																		cityId = $("#city").val();
																		cityName = $("#city option:selected").text();

																		areaId = $("#area").val();
																		areaName = $("#area option:selected").text();

																		streetId = $("#street").val();
																		streetName = $("#street option:selected").text();


																		villageId = $("#village").val();
																		villageName = $("#village option:selected").text();
																		type = 6;
																	}
																	/* if (selectP == "building") {
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();

																		cityId = $("#city").val();
																		cityName = $("#city option:selected").text();

																		areaId = $("#area").val();
																		areaName = $("#area option:selected").text();

																		streetId = $("#street").val();
																		streetName = $("#street option:selected").text();


																		villageId = $("#village").val();
																		villageName = $("#village option:selected").text();

																		buildingId = $("#building").val();
																		buildingName = $("#building option:selected").text();
																		
																		type = 7;
																		tinyVillageId = $("#village").val();
																		
																	    name = $("#village option:selected").text(); 
																		id = $("#village").val();
																		
																		//url="${ctxContents }/map/toReportHousehold?name="
																		//+ name + "&id=" + areaid+"&type=" + type+"&buildingid="+buildingid+ "&tinyVillageId="+tinyVillageId;
																		//window.open(encodeURI(encodeURI(url)),"_self");
																		//return false;
																	} */
																	if(selectP == "building"||selectP == "unit"||selectP == "floor"||selectP == "household"){
																		alert("楼栋、单元、楼层、房间号暂时没有统计，请选择其它区域！");
																		return false;
																	}
																	/* if (selectP == "household") {
																		
																		provinceId = $("#province").val();
																		provinceName = $("#province option:selected").text();

																		cityId = $("#city").val();
																		cityName = $("#city option:selected").text();

																		areaId = $("#area").val();
																		areaName = $("#area option:selected").text();

																		streetId = $("#street").val();
																		streetName = $("#street option:selected").text();


																		villageId = $("#village").val();
																		villageName = $("#village option:selected").text();

																		buildingId = $("#building").val();
																		buildingName = $("#building option:selected").text();
																		 
																		
																		 type = 8;
																		 unit = $("#unit").val();
																		 floor = $("#floor").val();
																		 household = $("#household").val();
																		 unitName = $("#unit option:selected").text();
																		 floorName = $("#floor option:selected").text();
																		 householdName = $("#household option:selected").text();

																		 name = $("#village option:selected").text(); 
																		 id = $("#village").val();  
																		
																		//url="${ctxContents }/map/toReportHousehold?name="
																		//+ name + "&id=" + areaid+"&type=" + type+"&buildingid="+buildingid+ "&unit="+unit+"&household="+household;
																		//window.open(encodeURI(encodeURI(url)),"_self");
																		//return false;
																	} */
																	window
																			.open(
																					encodeURI(encodeURI("${ctxContents }/map/toReportHousehold?name="
																							+ name
																							+ "&id="
																							+ id
																							+ "&type="
																							+ type
																							+"&tinyVillageId="
																							+tinyVillageId
																							+"&provinceId="+provinceId
																							+"&provinceName="+provinceName
																							+"&cityId="+cityId
																							+"&cityName="+cityName
																							+"&areaId="+areaId
																							+"&areaName="+areaName
																							+"&streetId="+streetId
																							+"&streetName="+streetName
																							+"&villageId="+villageId
																							+"&villageName="+villageName
																							+"&buildingId="+buildingId
																							+"&buildingName="+buildingName
																							+"&unit="+unit
																							+"&floor="+floor
																							+"&household="+household
																							+"&unitName="+unitName
																							+"&floorName="+floorName
																							+"&householdName="+householdName
																					)),
																					"_self");
																	return false;
																}

															});

										});
					});
	
	
	$(function() {
		var type = ${type};
		if(type=="1"){
			var provincev = '${sessionScope.province.id}';
			//var option = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option);
	  		getProvinceData();
	  		$("#province").val(provincev);
	  	
	  		getCityData(provincev);	 
	  		var cityv = '${sessionScope.city.id}';
	  		if(null!=cityv&&cityv!=""){
		  		$("#city").val(cityv);
		  		getAreaData(cityv);
	  		}
	  		
		}
		if(type=="2"){
			var provincev = '${sessionScope.province.id}';
			//var option = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option);
	  		getProvinceData();
	  		$("#province").val(provincev);
	  	
	  		getCityData(provincev);	  		
			var cityv = '${sessionScope.city.id}';
			//var option2 = $("<option>").val(cityv).text('${sessionScope.city.name}');
	  		//$("#city").append(option2);
	  		getCityData(provincev);
	  		$("#city").val(cityv);
	  		
	  		getAreaData(cityv);
		}
		if(type=="3"){
			
			var provincev = '${sessionScope.province.id}';
			//var option1 = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option1);
	  		getProvinceData();
	  		$("#province").val(provincev); 
			
			//获取省份ID
			var cityv = '${sessionScope.city.id}';
			//var option2 = $("<option>").val(cityv).text('${sessionScope.city.name}');
	  		//$("#city").append(option2);
	  		getCityData(provincev);
	  		$("#city").val(cityv);
	  		
			var id = '${id}';
			//var option3 = $("<option>").val(id).text('${name}');
	  		//$("#area").append(option3);
	  		getAreaData(cityv);
	  		
	  		$("#area").val(id); 
	  		
	  		getStreetData(id,4,"street");
		}
		if(type=="4"){
			var provincev = '${sessionScope.province.id}';
			//var option1 = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option1);
	  		getProvinceData();
	  		$("#province").val(provincev); 
			
			//获取省份ID
			var cityv = '${sessionScope.city.id}';
			//var option2 = $("<option>").val(cityv).text('${sessionScope.city.name}');
	  		//$("#city").append(option2);
	  		getCityData(provincev);
	  		$("#city").val(cityv); 
	  		
			var areav = '${sessionScope.county.id}';
			//var option3 = $("<option>").val(areav).text('${sessionScope.county.name}');
	  		//$("#area").append(option3);
	  		getAreaData(cityv);
	  		$("#area").val(areav); 
	  		
	  		
	  		var streetv = '${id}';
			//var option4 = $("<option>").val(streetv).text('${name}');
	  		//$("#street").append(option4);
	  		getStreetData(areav,4,"street");
	  		$("#street").val(streetv); 
	  		
	  		getStreetData(streetv,6,"village");
			
			
		}
		if(type=="6"){
			var provincev = '${sessionScope.province.id}';
			//var option1 = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option1);
	  		getProvinceData();
	  		$("#province").val(provincev); 
			
			//获取省份ID
			var cityv = '${sessionScope.city.id}';
			//var option2 = $("<option>").val(cityv).text('${sessionScope.city.name}');
	  		//$("#city").append(option2);
	  		getCityData(provincev);
	  		$("#city").val(cityv);
	  		
			var areav = '${sessionScope.county.id}';
			//var option3 = $("<option>").val(areav).text('${sessionScope.county.name}');
	  		//$("#area").append(option3);
	  		getAreaData(cityv);
	  		$("#area").val(areav);
	  		
	  		
	  		var streetv = '${sessionScope.town.id}';
			//var option4 = $("<option>").val(streetv).text('${sessionScope.town.name}');
	  		//$("#street").append(option4);
	  		getStreetData(areav,4,"street");
	  		$("#street").val(streetv);
	  		
	  		var villagev = '${id}';
			//var option5 = $("<option>").val(villagev).text('${name}');
	  		//$("#village").append(option5);
	  		getStreetData(streetv,6,"village");
	  		$("#village").val(villagev);
	  		
	  		getStreetData(villagev,7,"building");
		}
		if(type=="7"){
			var provincev = '${sessionScope.province.id}';
			//var option1 = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option1);
	  		$("#province").val(provincev); 
	  		getProvinceData();
			
			//获取省份ID
			var cityv = '${sessionScope.city.id}';
			//var option2 = $("<option>").val(cityv).text('${sessionScope.city.name}');
	  		//$("#city").append(option2);
	  		getCityData(provincev);
	  		$("#city").val(cityv);
	  		
			var areav = '${sessionScope.county.id}';
			//var option3 = $("<option>").val(areav).text('${sessionScope.county.name}');
	  		//$("#area").append(option3);
	  		getAreaData(cityv);
	  		$("#area").val(areav); 
	  		
	  		
	  		var streetv = '${sessionScope.town.id}';
			//var option4 = $("<option>").val(streetv).text('${sessionScope.town.name}');
	  		//$("#street").append(option4);
	  		getStreetData(areav,4,"street");
	  		$("#street").val(streetv); 
	  		
	  		var villagev = '${sessionScope.village.id}';
			//var option5 = $("<option>").val(villagev).text('${sessionScope.village.name}');
	  		//$("#village").append(option5);
	  		getStreetData(streetv,6,"village");
	  		$("#village").val(villagev);
	  		
	  		var tinyvillagevv = '${sessionScope.building.id}';
			//var option6 = $("<option>").val(tinyvillagevv).text('${sessionScope.building.name}');
	  		//$("#building").append(option6);
	  		getStreetData(villagev,7,"building");
	  		$("#building").val(tinyvillagevv);
	  		getStreetData(tinyvillagevv,8,"unit");
		}
		if(type=="8"){
			var provincev = '${sessionScope.province.id}';
			//var option1 = $("<option>").val(provincev).text('${sessionScope.province.name}');
	  		//$("#province").append(option1);
	  		$("#province").val(provincev); 
	  		getProvinceData();
			
			//获取省份ID
			var cityv = '${sessionScope.city.id}';
			//var option2 = $("<option>").val(cityv).text('${sessionScope.city.name}');
	  		//$("#city").append(option2);
	  		getCityData(provincev);
	  		$("#city").val(cityv); 
	  		
			var areav = '${sessionScope.county.id}';
			//var option3 = $("<option>").val(areav).text('${sessionScope.county.name}');
	  		//$("#area").append(option3);
	  		getAreaData(cityv);
	  		$("#area").val(areav); 
	  		
	  		
	  		var streetv = '${sessionScope.town.id}';
			//var option4 = $("<option>").val(streetv).text('${sessionScope.town.name}');
	  		//$("#street").append(option4);
	  		getStreetData(areav,4,"street");
	  		$("#street").val(streetv); 
	  		
	  		var villagev = '${sessionScope.village.id}';
			//var option5 = $("<option>").val(villagev).text('${sessionScope.village.name}');
	  		//$("#village").append(option5);
	  		getStreetData(streetv,6,"village");
	  		$("#village").val(villagev);
	  		
	  		var tinyvillagevv = '${sessionScope.building.id}';
			//var option6 = $("<option>").val(tinyvillagevv).text('${sessionScope.building.name}');
	  		//$("#building").append(option6);
	  		getStreetData(villagev,7,"building");
	  		$("#building").val(tinyvillagevv);
	  		
	  		var unit = '${sessionScope.household.unit}';
	  		getStreetData(tinyvillagevv,8,"unit");
	  		$("#unit").val(unit);
	  		
	 		var floor = '${sessionScope.household.floor}'; 	
	 		//var floorName = '${sessionScope.household.floorName}'; 
	 		//var option8 = $("<option>").val(floor).text(floorName);
	  		//$("#floor").append(option8);
	  		getFilterData(unit,"floor");
	  		$("#floor").val(floor);
	  		
	  		var household = '${sessionScope.household.household}';
	  		//var householdName = '${sessionScope.household.householdName}';
	  		//var option9 = $("<option>").val(household).text(householdName);
	  		//$("#household").append(option9);
	  		getFilterData(floor,"household");
	  		$("#household").val(household);
		}
		
	});
</script>