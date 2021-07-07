//获得省、直辖市信息
function getProvinceData(){
	
	$.ajax({
		   async: false,
			   type: "POST",
			   url: basePath+"/discovery/tprovince/getTprovinceList",
			   data: {},
			   success: function(result){
				   
				   if(result!=null&&result!=undefined){
					   if(result.message!=undefined&&result.message!=null){
						   alert(result.message);
					   }
					   else{
						   var options = result.list;
						   $("#province").prepend("<option value='0'></option>");
						   for(var i=0;i<options.length;i++){
							   var option = options[i];
							   $("#province").append("<option value='"+option.provinceId+"'>"+option.name+"</option>"); 
						   }
					   }
				   }
			   },
			   error : function(data) {
					alert("失败:" + data.responseText);
			   }
	});
}

//加载市信息
function getCityData(provinceId){
	//获得省、直辖市信息
	$.ajax({
		   async: false,
			   type: "POST",
			   url: basePath+"/discovery/tcity/queryTcity",
			   data: {"provinceId":provinceId},
			   success: function(result){
				   if(result!=null&&result!=undefined){
					   if(result.message!=undefined&&result.message!=null){
						   alert(result.message);
					   }
					   else{
						   var options = result.list;
						   $("#city").prepend("<option value='0'></option>");
						   for(var i=0;i<options.length;i++){
							   var option = options[i];
							   $("#city").append("<option value='"+option.cityId+"'>"+option.name+"</option>"); 
						   }
					   }
				   }
			   },
			   error : function(data) {
					alert("失败:" + data.responseText);
			   }
	});
}

//加载区县信息
function getAreaData(cityId){
	//获得省、直辖市信息
	$.ajax({
		   async: false,
			   type: "POST",
			   url: basePath+"/discovery/tcounty/queryTcounty",
			   data: {"cityId":cityId},
			   success: function(result){
				   if(result!=null&&result!=undefined){
					   if(result.message!=undefined&&result.message!=null){
						   alert(result.message);
					   }
					   else{
						   var options = result.list;
						   $("#area").prepend("<option value='0'></option>");
						   for(var i=0;i<options.length;i++){
							   var option = options[i];
							   $("#area").append("<option value='"+option.countyId+"'>"+option.name+"</option>"); 
						   }
					   }
				   }
			   },
			   error : function(data) {
					alert("失败:" + data.responseText);
			   }
	});
}

var numberList = null;
//加载街道等信息信息
function getStreetData(areaId,type,elementId){
	var number=0;
	//获得省、直辖市信息
	$.ajax({
		   async: false,
			   type: "POST",
			   url: basePath+"/discovery/map/getBaiduMap",
			   data: {"id":areaId,"type":type},
			   success: function(result){
				   if(result!=undefined && result.length!=0){
					   if(result.message!=undefined&&result.message!=null){
						   alert(result.message);
					   }
					   else{
						   if(8 == type){
							   numberList =  result.list;
							   number=1;
						   }else if(7==type){
							   var options = result.list;
							   //$("#"+elementId).prepend("<option value='0'></option>");
							   for(var i=0;i<options.length;i++){
								   var option = options[i];
								   $("#"+elementId).append("<option value='"+option.id+"'>"+option.areaName+"</option>"); 
							   }
						   }else{
							   var options = result.list;
							   $("#"+elementId).prepend("<option value='0'></option>");
							   for(var i=0;i<options.length;i++){
								   var option = options[i];
								   $("#"+elementId).append("<option value='"+option.id+"'>"+option.areaName+"</option>"); 
							   }
						   }
					   }
				   }
			   },
			   error : function(data) {
					alert("失败:" + data.responseText);
			   }
		})
	   if(number==1){
		   getFilterData(areaId,elementId);
	   }
}
//点击楼栋时，显示单元号进行过滤
function getFilterData(value,flag){
	var unit = [];
	var floor=[];
	var household=[];
	//通过楼栋获得单元
	//$("#"+flag).html("<option></option>");
	if("unit" == flag){
		//$("#"+flag).prepend("<option value='0'></option>");
		for(var i=0;i<numberList.length;i++){
			var option =numberList[i]; 
			if(value ==option.buildingId&&unit.indexOf(option.buildingUnitNo)<0 ){
				   unit.push(option.buildingUnitNo);
				   $("#"+flag).append("<option value='"+option.buildingUnitNo+"'>"+option.buildingUnitNo+""+'单元'+"</option>"); 
			}
		}
	}
	if("floor" == flag){
		//$("#"+flag).prepend("<option value='0'></option>");
		for(var i=0;i<numberList.length;i++){
			var option =numberList[i]; 
			if( value==option.buildingUnitNo&&floor.indexOf(option.floor)<0 ){
				floor.push(option.floor);
				   $("#"+flag).append("<option value='"+option.floor+"'>"+option.floor+""+'层'+"</option>"); 
			}
		}
	}
	if("household" == flag){
		//$("#"+flag).prepend("<option value='0'></option>");
		for(var i=0;i<numberList.length;i++){
			var option =numberList[i]; 
			if(value ==option.floor&&household.indexOf(option.buildingHouseNo)<0 ){
				household.push(option.buildingHouseNo);
				   $("#"+flag).append("<option value='"+option.buildingHouseNo+"'>"+option.buildingHouseNo+""+'房间'+"</option>"); 
			}
		}
	}
}
//点击单元时获得房间号
$("#floor").change(function(){
	//$("#household").html("<option><option>");
	$("#household").empty();
	$("#select2-household-container").html("<option><option>");
	cleanSelectOption("floor");
	var option2 = $("<option>").val("").text("");
	$("#household").append(option2);
	getFilterData($(this).val(),"household");
});
//点击单元下拉框时发生改变获取该单元的楼层
$("#unit").change(function(){
	//$("#floor").html("<option><option>");
	$("#floor").empty();
	$("#select2-floor-container").html("<option><option>");
	cleanSelectOption("unit");
	var option2 = $("<option>").val("").text("");
	$("#floor").append(option2);
	getFilterData($(this).val(),"floor");
});
//楼栋下拉框的值发生改变时触发的事件
$("#building").change(function(){
	//$("#unit").html("<option><option>");
	$("#unit").empty();
	$("#select2-unit-container").html("<option><option>");
	cleanSelectOption("building");
	var option2 = $("<option>").val("").text("");
	$("#unit").append(option2);
	getStreetData($(this).val(),8,"unit");
	//getFilterData($(this).val(),"unit");
});


//小区下拉框的值发生改变时触发的事件
$("#village").change(function(){
	//$("#building").html("<option><option>");
	$("#building").empty();
	$("#select2-building-container").html("<option><option>");
	cleanSelectOption("village");
	var option2 = $("<option>").val("").text("");
	$("#building").append(option2);
	getStreetData($(this).val(),7,"building");
});



//街道下拉框的值发生改变时触发的事件
$("#street").change(function(){
	//$("#village").html("<option><option>");
	$("#village").empty();
	$("#select2-village-container").html("<option><option>");
	cleanSelectOption("street");
	var option2 = $("<option>").val("").text("");
	$("#village").append(option2);
	getStreetData($(this).val(),6,"village");
});

//区县下拉框的值发生改变时触发的事件
$("#area").change(function(){
	//$("#street").html("<option><option>");
	$("#street").empty();
	$("#select2-street-container").html("<option><option>");
	cleanSelectOption("area");
	var option2 = $("<option>").val("").text("");
	$("#street").append(option2);
	getStreetData($(this).val(),4,"street");
});

//市下拉框的值发生改变时触发的事件
$("#city").change(function(){
	//$("#area").html("<option><option>");
	$("#area").empty();
	$("#select2-area-container").html("<option><option>");
	cleanSelectOption("city");
	var option2 = $("<option>").val("").text("");
	$("#area").append(option2);
	getAreaData($(this).val());
});


//省下拉框的值发生改变时触发的事件
$("#province").change(function(){
	//$("#city").html("<option><option>");
	$("#city").empty();
 	$("#select2-city-container").html("<option><option>");
	cleanSelectOption("province");
	var option2 = $("<option>").val("").text("");
	$("#city").append(option2);
	getCityData($(this).val());
});

//获得省直辖市数据
getProvinceData();

//订单量
function initSumOrd(id){
	$.ajax({
	   async: false,
	   type: "POST",
	   url: "/discovery/sumOrdFamily/searchSumOrdFamily",
	   data: {id : id,},
	   success: function(msg){
		 if(msg != null){
			 if(msg.message !=null && msg.message != ""){
				 showErrorMessage(msg.message);
			 }else{
				 if(msg.orderNumber!=null && msg.orderNumber!="undefined" && msg.orderNumber!=""){
					 $("#orderNumber").html(msg.orderNumber+"单");
				 }else{
					 $("#orderNumber").html("0单");
				 }
				 if(msg.tradingPrice!=null && msg.tradingPrice!="undefined" && msg.tradingPrice!=""){
					 $("#tradingPrice").html(msg.tradingPrice+"元");
				 }else{
					 $("#tradingPrice").html("0元");
				 }
			 }
		 }
	   }
	});
}

//消费等级 家庭结构
function initLevel(id,type){
	$.ajax({
	   async: false,
	   type: "POST",
	   url: "/discovery/sumPopulation/searchSumPopulationBypopulation",
	   data: {id : id,
		   	  type : type,	},
	   success: function(msg){
		 if(msg != null && msg!=""){
			 if(msg.message !=null && msg.message != ""){
				 showErrorMessage(msg.message);
			 }else{
				 if(msg.comsumeLeve!=null && msg.comsumeLeve!="undefined" && msg.comsumeLeve!=""){
					 $("#comsumeLeve").html(msg.comsumeLeve+"级");
				 }else{
					 $("#comsumeLeve").html("0级");
				 }
				 if(msg.population!=null && msg.population!="undefined" && msg.population!=""){
					 $("#population").html(msg.population+"人");
				 }else{
					 $("#population").html("0人");
				 }
			 }
		 }
	   }
	});
}

//住房性质出租数
function initRentalNumber(id,type){
	$.ajax({
	   async: false,
	   type: "POST",
	   url: "/discovery/sumHouse/searchSumHouse",
	   data: {id : id,
		   	  type : type,	},
	   success: function(msg){
		 if(msg != null && msg!=""){
			 if(msg.message !=null && msg.message != ""){
				 showErrorMessage(msg.message);
			 }else{
					 if(msg.rentalNumber=="0" || msg.rentalNumber=="" || msg.rentalNumber==null){
						 $("#rentalNumber").html("自住");
					 }else{
						 $("#rentalNumber").html("出租");
					 }
				 
			 }
		 }
	   }
	});
}

//异常处理
function showErrorMessage(errorMessage){
	if(errorMessage != null && errorMessage != ''){
		alert(errorMessage);
	}
}


/////////////****************表四 各社区消费TOP10 ***********/////////////////
function initCommunityConsumptionTopten() {
	var myChart_communityConsumptionTopten = echarts.init(document
			.getElementById("communityConsumptionTopten"));
	option_communityConsumptionTopten = {
		title : {
			text : "国安社区平台消费TOP10（单位：元）",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		legend : {
			data : [ "元" ],
			x : "right"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
				},
				restore : {
					show : true
				},
				saveAsImage : {
					show : true
				}
			}
		},
		calculable : true,
		xAxis : [ {
			type : "value",
			boundaryGap : [ 0, 0.01 ],
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					color : "black",
					fontSize : 12,
				},
				interval : 0,
			}
		} ],

		grid : {
			x : 100,
			x2 : 30,
			y2 : 30,
		},
		yAxis : [ {
			type : "category",
			data : dataArrayName,
			axisLabel : {
				//rotate:15, //刻度旋转45度角
				textStyle : {
					color : "black",
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					if(params.indexOf("【")!=-1){
						return params.substring(0,params.indexOf("【"));
					}else{
						return params.substring(0,8);
					}
				}
			}
		} ],
		series : [ {
			name : "元",
			type : "bar",
			data : dataArrayPrice,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		backgroundColor : "rgb(255, 255, 255)",
		color : [ "rgb(165, 219, 103)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]
	}
	myChart_communityConsumptionTopten
			.setOption(option_communityConsumptionTopten);
}

//消费top 10
var dataArrayName = [];
var dataArrayPrice = [];
function initOrddetailTop(id, type){
		$.ajax({
		   async: false,
		   type: "POST",
		   url: "/discovery/sumOrddetail5grd/searchTSumOrddetail5grdTop10",
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
						 arrName.push(msg[i].productName);
						 arrPrice.push(msg[i].tradingPrice);
					 }
					 dataArrayName=arrName;
					 dataArrayPrice = arrPrice;
				 }
			 }
			 initCommunityConsumptionTopten();
		   }
		});
}
function cleanSelectOption(changeSN){
	$($("select").toArray().reverse()).each(		
	function() {
		var name = $(this).find("option:selected").text();
		var id = $(this).val();
		var selectP = $(this).attr("id");
		if(changeSN==selectP){
			return false;
		}else if(null!=name&&name!=""){
			$("#"+selectP).val("");
			$("#select2-"+selectP+"-container").html("<option><option>");
			$("#"+selectP).empty();
		}		
	});
}
