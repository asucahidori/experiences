var x_car = null;
var y_car = null;
// 获得国安社区用户量数据 按日期
function getUsersCount(id, type,tinyvillageId) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
			tinyvillageId : tinyvillageId
		},
		url : basePath + "/CIDM/guoAnUsers/guoAnUsersCount",
		error : function(data) {
			alert('获取数据失败');
		},
		success : function(data) {
			x_car = data.x;
			y_car = data.y;
		}
	});
	initCommunityUserCapacityByDate();
	
}
// 获得国安社区用户量数据 按地区
var xnames = null;
var ycounts = null;
function getEveryArea(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
		},
		url : basePath + "/CIDM/guoAnUsers/guoAnEveryAeraCount",
		error : function() {
			alert('获取各区去数据失败');
		},
		success : function(data) {
			xnames = data.x_name;
			ycounts = data.y_counts;
		}
	});
	var name;
/*	if(type=="1"){
		name="各区国安社区用户量（单位：人）";
	}
	if(type=="3"){
		name="各街道国安社区用户量（单位：人）";
	}
	if(type=="4"){
		name="各社区国安社区用户量（单位：人）";
	}*/
	initCommunityUserCapacityByArea(name);
}

// 获得国安社区订单额 按日期
var x_month = null;
var y_order = null;
function getUsersOrders(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
		},
		url : basePath + "/CIDM/guoAnUsers/guoAnOrdersCount",
		error : function() {
			alert('获取订单额数据失败');
		},
		success : function(data) {
			x_month = data.xmonth;
			y_order = data.yorder;
		}
	});
	initCommunityUserOrderByDate();
}

// 获得国安社区订单额 按地区
var x_everyName = null;
var y_everyCount = null;
function everyOrdersCounts(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
		},
		url : basePath + "/CIDM/guoAnUsers/everyOrdersCounts",
		error : function() {
			alert('获取订各区单额数据失败');
		},
		success : function(data) {
			x_everyName = data.x_everyName;
			y_everyCount = data.y_everyCount;
		}
	});
	var name;
/*	if(type=="1"){
		name="各区国安社区订单额（单位：元）";
	}
	if(type=="3"){
		name="各街道国安社区订单额（单位：元）";
	}
	if(type=="4"){
		name="各社区国安社区订单额（单位：元）";
	}*/
	initCommunityUserOrderByArea(name);
}

// 各区住宅房价
var x_areaPriceName = null;
var y_areaPrice =null;
function getAreaHomePriceByArea(id, fction,type) {
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				// alert("ajax..gq_house.."+result.data);
				// alert("ajax..gq_house1.."+result.data[0]);
				// alert("ajax..gq_house2.."+result.data[1]);
				if (result.data.length > 0) {
					x_areaPriceName = result.data[0];
					y_areaPrice = result.data[1];
				}
			}else{
				alert("失败:" + result.data[0].message);
			}
			var name;
//			if(type=="1"){
//				name="各区住宅房价(单位：元)";
//			}
//			if(type=="3"){
//				name="各街道住宅房价(单位：元)";
//			}
//			if(type=="4"){
//				name="各社区住宅房价(单位：元)";
//			}
			initHousingPricesByArea(name);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}

// 住宅房价(年)
var x_areaPriceMonth = null;
var y_monthPrice =null;
function getAreaHomePriceByDate(id, fction) {
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				if (result.data.length > 0) {
					x_areaPriceMonth = result.data[0];
					y_monthPrice = result.data[1];
				}
			}else{
				//alert("失败:" + result.data[0].message);
			}
			initHousingPricesByDate();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}

//性别结构
var x_areaName = null;
var y_boy =null;
var y_gril =null;
function getChartSexData(id, fction,type) {
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				if (result.data.length > 0) {
					x_areaName = result.data[0];
					y_boy = result.data[1];
					y_gril = result.data[2];
//					option_gq_age.xAxis[0].data = streetN;// x轴赋值数据
//					option_gq_age.series[0].data = boy;// y轴赋值数据
//					option_gq_age.series[1].data = gril;// y轴赋值数据
//					myChart_gq_age.hideLoading();
//					myChart_gq_age.setOption(option_gq_age);
				}
			}else{
				alert("失败:" + result.data[0].message);
			}
			var name;
		/*	if(type=="1"){
				name="各区性别结构（单位：人）";
			}
			if(type=="3"){
				name="各街道性别结构（单位：人）";
			}
			if(type=="4"){
				name="各社区性别结构（单位：人）";
			}*/
			initSexStructure(name);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}


//家庭结构类型分布
var dataArray = [];
function initPopulation(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/CIDM/sumPopulation/searchPopulation",
		   data: {id : id,
				  type : type,},
		   success: function(msg){
			 if(msg != null){
				 if(msg.message != null && msg.message != ""){
					 showErrorMessage(msg.message);
				 }else{
					 dataArray = [msg.one,msg.two,msg.three,msg.four,msg.five];
					 initFamilyStructure();
				 }
			 }
		   }
		});
}

//消费实力等级
var dataArrayTime = [];
var dataArraySum = [];
function initPopulationDengji(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/CIDM/sumPopulation/searchSumPopulationGrade",
		   data: {id : id,
				  type : type},
		   success: function(msg){
			 if(msg != null && msg.length>0){
				 if(msg[0].message != null && msg[0].message != ""){
					 showErrorMessage(msg[0].message);
				 }else{
					 var arr = new Array();
					 var arrSum = new Array();
					 for(var i=0;i<msg.length;i++){
						 arr.push(msg[i].updateTime);
						 arrSum.push(msg[i].comsumeLevel);
					 }
					 dataArrayTime=arr;
					 dataArraySum = arrSum;
				 }
			 }
			 initConsumptionlevelByData();
		   }
		});
}

//消费top 10
var dataArrayName = [];
var dataArrayPrice = [];
function initOrddetailTopten(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/CIDM/sumOrddetail5grd/searchTSumOrddetail5grdTop10",
		   data: {id : id,
				  type : type,},
		   success: function(msg){
			 if(msg != null  && msg.length>0){
				 if(msg[0].message!=null && msg[0].message != ""){
					 showErrorMessage(msg[0].message);
				 }else{
					 var arrName = new Array();
					 var arrPrice = new Array();
					 for(var i=0;i<msg.length;i++){
						 if(msg[i].productName==""||msg[i].productName==null){
							 arrName.push("无");
						 }else{
							 arrName.push(msg[i].productName);
						 }
						 if(msg[i].tradingPrice=="" || msg[i].tradingPrice==null){
							 arrPrice.push(0);
						 }else{
							 arrPrice.push(msg[i].tradingPrice);
						 }
					 }
					 dataArrayName=arrName;
					 dataArrayPrice = arrPrice;
				 }
			 }
			 initCommunityConsumptionTopten();
		   }
		});
}
//住户住宅性质
var x_householdProperty= null;
var y_householdProperty= null;
function getHouseholdProperty(id, fction){
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				if (result.data.length > 0) {
					x_householdProperty = result.data[0];
					y_householdProperty = result.data[1];
				}
			}else{
				//alert("失败:" + result.data[0].message);
			}
			initResidentialProperties();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}
//各社区写字楼总面积
var x_areaVillageOffice= null;
var y_areaVillageOffice= null;
function getAreaVillageOffice(id, fction){
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				if (result.data.length > 0) {
					x_areaVillageOffice = result.data[0];
					y_areaVillageOffice = result.data[1];
				}
			}else{
				alert("失败:" + result.data[0].message);
			}
			initOfficeSpaceByArea();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}
//各社区写字楼平均租金
var x_villageOfficeRents= null;
var y_villageOfficeRents= null;
function getVillageOfficeRents(id, fction){
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				if (result.data.length > 0) {
					x_villageOfficeRents = result.data[0];
					y_villageOfficeRents = result.data[1];
				}
			}else{
				alert("失败:" + result.data[0].message);
			}
			initOfficeRentsByArea();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}

//街道周边业态
var x_streetSurroundState= null;
function getStreetSurroundState(id, fction){
	$.ajax({
		type : "post",
		url : basePath + "/CIDM/areaData/"+fction,
		dataType : "json",
		data : {
			areacode : id
		},
		success : function(result) {
			if (result.success) {
				if (result.data.length > 0) {
					x_streetSurroundState = result.data[0];
				}
			}else{
				//alert("失败:" + result.data[0].message);
			}
			initSurroundinTheFormats();
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
					+ XMLHttpRequest.readyState + "  " + textStatus);
		}
	});
}


//人口规模
function initSumPopulation(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/CIDM/sumPopulation/searchSumPopulationBypopulation",
		   data: {id : id,
				  type : type,},
		   success: function(msg){
			 if(msg != null){
				 if(msg.message != null && msg.message != ""){
					 showErrorMessage(msg.message);
				 }else{
					 if(msg.population!=null && msg.population!="undefined" && msg.population!=""){
						 $("#sumPopulation").html((msg.population/10000).toFixed(2)+"万人");
					 }else{
						 $("#sumPopulation").html("0万人");
					 }
					 
				 }
				
			 }
		   }
		});
}

//编码,面积
function initSumHouse(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/CIDM/sumHouse/searchSumHouse",
		   data: {id : id,
				  type : type,},
		   success: function(msg){
			 if(msg != null){
				 if(msg.message !=null && msg.message != ""){
					 showErrorMessage(msg.message);
				 }else{
					 if(msg.gbCode!=null && msg.gbCode!="undefined" && msg.gbCode!=""){
						 $("#gbCode").html(msg.gbCode);
					 }else{
						 $("#gbCode").html("0");
					 }
					 if(msg.squareArea!=null && msg.squareArea!="undefined" && msg.squareArea!=""){
						 $("#squareArea").html(msg.squareArea+"km²");
					 }else{
						 $("#squareArea").html("0km²");
					 }
					 
					 if(msg.officeBldNum!=null && msg.officeBldNum!="undefined" && msg.officeBldNum!=""){
						 $("#officeBldNum").html(msg.officeBldNum+"栋");
					 }else{
						 $("#officeBldNum").html("0栋");
					 }
					 
					 if(msg.houseBldNum!=null && msg.houseBldNum!="undefined" && msg.houseBldNum!=""){
						 $("#houseBldNum").html(msg.houseBldNum+"栋");
					 }else{
						 $("#houseBldNum").html("0栋");
					 }
					 
					 if(msg.households!=null && msg.households!="undefined" && msg.households!=""){
						 $("#households").html(msg.households+"栋");
					 }else{
						 $("#households").html("0栋");
					 }
					
					 if(msg.house_park_num!=null && msg.house_park_num!="undefined" && msg.house_park_num!=""){
						 $("#house_park_num").html(msg.house_park_num+"个 ");
					 }else{
						 $("#house_park_num").html("0个 ");
					 }
					 
				 }
				 }
		   }
		});
}

//GDp
function initGdp(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/CIDM/gdp/searchGdp",
		   data: {id : id,
				  type : type,},
		   success: function(msg){
			 if(msg != null){
				 if(msg.message !=null && msg.message != ""){
					 showErrorMessage(msg.message);
				 }else{
					 if(msg.gdp!=null && msg.gdp!="undefined" && msg.gdp!=""){
						 $("#gdp").html((msg.gdp/100000000).toFixed(2)+"亿元");
					 }else{
						 $("#gdp").html("0亿元");
					 }
				 }
			 }
		   }
		});
}

/***异常处理
@param json key:message
**/
function showErrorMessage(errorMessage){
		if(errorMessage != null && errorMessage != ''){
			alert(errorMessage);
		}
}

//各社区常住人员数
var x_ResidentPopulation = [];
var y_ResidentPopulation = [];
//获得国安社区用户量数据 按日期
function loadResidentPopulationByArea(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
		},
		url : basePath + "/CIDM/sumPopulation/queryResidentPopulationBypopulation",
		error : function(data) {
			alert('获取数据失败');
		},
		success : function(data) {
			x_ResidentPopulation = data.x_ResidentPopulation;
			y_ResidentPopulation = data.y_ResidentPopulation;
		}
	});
	initResidentPopulationByArea();
}

//收入支出统计报表
var x_IncomeExpenditure = [];
var y_Income = [];
var y_expend = [];
//获得国安社区用户量数据 按日期
function loadIncomeExpenditure(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
		},
		url : basePath + "/CIDM/gdp/queryAvgGdpByArea",
		error : function(data) {
			alert('获取数据失败');
		},
		success : function(data) {
			x_IncomeExpenditure = data.x_areaName;
			y_Income = data.y_income;
			y_expend = data.y_expend;
		}
	});
	initIncomeExpenditure();
}


//各社区居民消费等级
var x_ResidentSalesLevel = [];
var y_ResidentSalesLevel = [];
//获得国安社区用户量数据 按日期
function loadResidentSalesLevelByArea(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			type : type,
		},
		url : basePath + "/CIDM/sumPopulation/queryResidentSalesLevel",
		error : function(data) {
			alert('获取数据失败');
		},
		success : function(data) {
			x_ResidentSalesLevel = data.x_ResidentSalesLevel;
			y_ResidentSalesLevel = data.y_ResidentSalesLevel;
		}
	});
	initConsumptionLevelByarea();
}



//去掉省市报表滚动条
function changeDivCitySize(){
	var mainHeight =  $("#bj_main_r_cont").height();  
	var height = $("#report_1").height();
	$("#app").height(mainHeight+height+200);
}


function initSumOrser(provinceId, cityId,countyId,townId,villageId,tinyVillageId,buildingId){
	$.ajax({
	   async: false,
	   type: "POST",
	   url: "/CIDM/order/selectSumOrder",
	   data: {provinceId : provinceId,
		   	  cityId : cityId,
		   	countyId:countyId,
		   	townId:townId,
		   	villageId:villageId,
		   	tinyVillageId:tinyVillageId,
		   	buildingId:buildingId
		   },
	   success: function(msg){
		 if(msg != null){
			 if(msg.message !=null && msg.message != ""){
				 showErrorMessage(msg.message);
			 }else{
				 if(msg.orderSum!=null && msg.orderSum!="undefined" && msg.orderSum!=""){
					 $("#orderSum").html((msg.orderSum/10000).toFixed(2));
				 }else{
					 $("#orderSum").html("0");
				 }
			 }
		 }
	   }
	});
}


function initContrastOrser(provinceId, cityId,countyId,townId,villageId,tinyVillageId,buildingId){
	$.ajax({
	   async: false,
	   type: "POST",
	   url: "/CIDM/order/selectContrastOrder",
	   data: {provinceId : provinceId,
		   	  cityId : cityId,
			   	countyId:countyId,
			   	townId:townId,
			   	villageId:villageId,
			   	tinyVillageId:tinyVillageId,
			   	buildingId:buildingId},
	   success: function(msg){
		 if(msg != null){
			 if(msg.message !=null && msg.message != ""){
				 showErrorMessage(msg.message);
			 }else{
				 if(msg.orderSum1!=null && msg.orderSum1!="undefined" && msg.orderSum1!=""){
					 $("#contrastOrder").html("同年环比增长"+(((msg.orderSum1)/10000-(msg.orderSum2)/10000)*100).toFixed(2)+"%");
				 }else{
					 $("#contrastOrder").html("同年环比增长0%");
				 }
			 }
		 }
	   }
	});
}

function initContrastCustomer(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			areaType : type,
		},
		url : basePath + "/CIDM/order/selectContrastCustomer",
		error : function(data) {
			alert('获取数据失败');
		},
		success : function(msg) {
			if(msg != null){
				 if(msg.message !=null && msg.message != ""){
					 showErrorMessage(msg.message);
				 }else{
					 if(msg.sumCustomer1!=null && msg.sumCustomer1!="undefined" && msg.sumCustomer1!=""){
						 $("#contrastCustomer").html("同年环比增长"+(((msg.sumCustomer1)/10000-(msg.sumCustomer2)/10000)*100).toFixed(2)+"%");
					 }else{
						 $("#contrastCustomer").html("同年环比增长0%");
					 }
				 }
			 }
		}
	});
}

function initContrastPrice(id, type) {
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data : {
			id : id,
			areaType : type,
		},
		url : basePath + "/CIDM/order/selectContrastPrice",
		error : function(data) {
			alert('获取数据失败');
		},
		success : function(msg) {
			if(msg != null){
				 if(msg.message !=null && msg.message != ""){
					 showErrorMessage(msg.message);
				 }else{
					 if(msg.sumPrice1!=null && msg.sumPrice1!="undefined" && msg.sumPrice1!=""){
						 $("#contrastPrice").html("同年环比增长"+(((msg.sumPrice1)/10000-(msg.sumPrice2)/10000)*100).toFixed(2)+"%");
					 }else{
						 $("#contrastPrice").html("同年环比增长0%");
					 }
				 }
			 }
		}
	});
}