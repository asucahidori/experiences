<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<!-- Template Name: Clip-Two - Responsive Admin Template build with Twitter Bootstrap 3.x | Author: ClipTheme -->
<!--[if IE 8]><html class="ie8" lang="en"><![endif]-->
<!--[if IE 9]><html class="ie9" lang="en"><![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- start: HEAD -->
<head>
<title>国安大数据</title>
<!-- start: META -->
<!--[if IE]><meta http-equiv='X-UA-Compatible' content="IE=edge,IE=9,IE=8,chrome=1" /><![endif]-->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta content="" name="description" />
<meta content="" name="author" />
<!-- end: META -->
<!-- start: GOOGLE FONTS -->
<link
	href="http://fonts.useso.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic"
	rel="stylesheet" type="text/css" />
<!-- end: GOOGLE FONTS -->
<!-- start: MAIN CSS -->
<link rel="stylesheet"
	href="<%=basePath %>/discovery/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=basePath %>/discovery/vendor/fontawesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=basePath %>/discovery/vendor/themify-icons/themify-icons.min.css">
<link href="<%=basePath %>/discovery/vendor/animate.css/animate.min.css"
	rel="stylesheet" media="screen">
<link
	href="<%=basePath %>/discovery/vendor/perfect-scrollbar/perfect-scrollbar.min.css"
	rel="stylesheet" media="screen">
<link href="<%=basePath %>/discovery/vendor/switchery/switchery.min.css"
	rel="stylesheet" media="screen">
<!-- end: MAIN CSS -->
<!-- start: CLIP-TWO CSS -->
<link rel="stylesheet"
	href="<%=basePath %>/discovery/assets/css/styles.css">
<link rel="stylesheet"
	href="<%=basePath %>/discovery/assets/css/plugins.css">
<link rel="stylesheet"
	href="<%=basePath %>/discovery/assets/css/themes/theme-1.css" />
<link rel="stylesheet"
	href="<%=basePath %>/discovery/assets/css/add.css">
<!-- end: CLIP-TWO CSS -->
<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
</head>
<!-- end: HEAD -->
<style type="text/css">
.ctrl-wrap {
	padding: 5px 20px 20px 20px;
	text-align: center;
}

.ctrl-content .btn {
	width: 7%;
}

.g2wrap {
	height: 300px;
	width: 33%;
	float: left;
}
#app .app-content {
  height: 100%;
  overflow: auto;
}

.app-navbar-fixed {
    padding-top: 55px;
}
</style>
<body>
	<c:import url='/navbar' />
	<div id="app">
		<div class="app-content">
			<div class="main-content  main-content_map">
				<c:import url='/navigateBar' />
				<div class="wrap-content container" id="container">
					<!-- start: map -->
					<div class="row row_bg">
						<div class="col-lg-9">
							<div class="map_bg">
								<div class="map_region">
									<div id="main" style="height: 600px"></div>
									<div class="map_lick" id="dataReport" style="display: none;">
										<i class="fa fa-bar-chart map_font"></i><span class="s_data">数据报告，<a
											id="clickDetail"
											href="<%=basePath %>/discovery/areaData/areareport?name=${name}&id=${id}">点击详情&gt;&gt;</a></span>
									</div>
								</div>
							</div>
						</div>
						<!-- 核心数据 -->
						<c:import url='/coreData' />
					</div>
					<!--row-->
					<!-- end:  map -->
					<div class="row">
						<div class="col-lg-12">
							<div class="tab-pane" id="main2">
								<div class="ctrl-wrap">
									<div class="ctrl-content" id="year"> </div>
								</div>
								<div id="g20" class="g2wrap"></div>
								<div id="g21" class="g2wrap"></div>
								<div id="g22" class="g2wrap"></div>
								<p style="clear: both"></p>
							</div>
						</div>
					</div>
				</div>
				<!--头部以上的三个DIV1-->
			</div>
			<!--头部以上的三个DIV2-->
		</div>
		<!--app-content DIV-->

		<!-- start: FOOTER -->
		<footer class="footer_map">
			<div class="footer-inner">
				<div class="pull-left">
					&copy; <span class="current-year"></span><span
						class="text-bold text-uppercase">2016 中信国安</span>. <span>All
						rights reserved</span>
				</div>
				<div class="pull-right">
					<span class="go-top"><i class="ti-angle-up"></i></span>
				</div>
			</div>
		</footer>
		<!-- end: FOOTER -->
		<!-- start: OFF-SIDEBAR -->
		<!-- end: OFF-SIDEBAR -->
		<!-- start: SETTINGS -->
		<div class="settings panel panel-default hidden-xs hidden-sm"
			id="settings">
			<button ct-toggle="toggle" data-toggle-class="active"
				data-toggle-target="#settings" class="btn btn-default">
				<i class="fa fa-spin fa-gear"></i>
			</button>
			<div class="panel-heading">Style Selector</div>
			<div class="panel-body">
				<!-- start: FIXED HEADER -->
				<div class="setting-box clearfix">
					<span class="setting-title pull-left"> Fixed header</span> <span
						class="setting-switch pull-right"> <input type="checkbox"
						class="js-switch" id="fixed-header" />
					</span>
				</div>
				<!-- end: FIXED HEADER -->
				<!-- start: FIXED SIDEBAR -->
				<div class="setting-box clearfix">
					<span class="setting-title pull-left">Fixed sidebar</span> <span
						class="setting-switch pull-right"> <input type="checkbox"
						class="js-switch" id="fixed-sidebar" />
					</span>
				</div>
				<!-- end: FIXED SIDEBAR -->
				<!-- start: CLOSED SIDEBAR -->
				<div class="setting-box clearfix">
					<span class="setting-title pull-left">Closed sidebar</span> <span
						class="setting-switch pull-right"> <input type="checkbox"
						class="js-switch" id="closed-sidebar" />
					</span>
				</div>
				<!-- end: CLOSED SIDEBAR -->
				<!-- start: FIXED FOOTER -->
				<div class="setting-box clearfix">
					<span class="setting-title pull-left">Fixed footer</span> <span
						class="setting-switch pull-right"> <input type="checkbox"
						class="js-switch" id="fixed-footer" />
					</span>
				</div>
				<!-- end: FIXED FOOTER -->
				<!-- start: THEME SWITCHER -->
				<div class="colors-row setting-box">
					<div class="color-theme theme-1">
						<div class="color-layout">
							<label> <input type="radio" name="setting-theme"
								value="theme-1"> <span class="ti-check"></span> <span
								class="split header"> <span class="color th-header"></span>
									<span class="color th-collapse"></span>
							</span> <span class="split"> <span class="color th-sidebar"><i
										class="element"></i></span> <span class="color th-body"></span>
							</span>
							</label>
						</div>
					</div>
					<div class="color-theme theme-2">
						<div class="color-layout">
							<label> <input type="radio" name="setting-theme"
								value="theme-2"> <span class="ti-check"></span> <span
								class="split header"> <span class="color th-header"></span>
									<span class="color th-collapse"></span>
							</span> <span class="split"> <span class="color th-sidebar"><i
										class="element"></i></span> <span class="color th-body"></span>
							</span>
							</label>
						</div>
					</div>
				</div>
				<div class="colors-row setting-box">
					<div class="color-theme theme-3">
						<div class="color-layout">
							<label> <input type="radio" name="setting-theme"
								value="theme-3"> <span class="ti-check"></span> <span
								class="split header"> <span class="color th-header"></span>
									<span class="color th-collapse"></span>
							</span> <span class="split"> <span class="color th-sidebar"><i
										class="element"></i></span> <span class="color th-body"></span>
							</span>
							</label>
						</div>
					</div>
					<div class="color-theme theme-4">
						<div class="color-layout">
							<label> <input type="radio" name="setting-theme"
								value="theme-4"> <span class="ti-check"></span> <span
								class="split header"> <span class="color th-header"></span>
									<span class="color th-collapse"></span>
							</span> <span class="split"> <span class="color th-sidebar"><i
										class="element"></i></span> <span class="color th-body"></span>
							</span>
							</label>
						</div>
					</div>
				</div>
				<div class="colors-row setting-box">
					<div class="color-theme theme-5">
						<div class="color-layout">
							<label> <input type="radio" name="setting-theme"
								value="theme-5"> <span class="ti-check"></span> <span
								class="split header"> <span class="color th-header"></span>
									<span class="color th-collapse"></span>
							</span> <span class="split"> <span class="color th-sidebar"><i
										class="element"></i></span> <span class="color th-body"></span>
							</span>
							</label>
						</div>
					</div>
					<div class="color-theme theme-6">
						<div class="color-layout">
							<label> <input type="radio" name="setting-theme"
								value="theme-6"> <span class="ti-check"></span> <span
								class="split header"> <span class="color th-header"></span>
									<span class="color th-collapse"></span>
							</span> <span class="split"> <span class="color th-sidebar"><i
										class="element"></i></span> <span class="color th-body"></span>
							</span>
							</label>
						</div>
					</div>
				</div>
				<!-- end: THEME SWITCHER -->
			</div>
		</div>
		<!-- end: SETTINGS -->
	</div>
	<!-- start: MAIN JAVASCRIPTS -->
	<script src="<%=basePath %>/discovery/vendor/jquery/jquery.min.js"></script>
	<script
		src="<%=basePath %>/discovery/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="<%=basePath %>/discovery/vendor/modernizr/modernizr.js"></script>
	<script
		src="<%=basePath %>/discovery/vendor/jquery-cookie/jquery.cookie.js"></script>
	<script
		src="<%=basePath %>/discovery/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script
		src="<%=basePath %>/discovery/vendor/switchery/switchery.min.js"></script>
	<!-- end: MAIN JAVASCRIPTS -->
	<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<script
		src="<%=basePath %>/discovery/vendor/jquery.sparkline/jquery.sparkline.min.js"></script>
	<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<!-- start: CLIP-TWO JAVASCRIPTS -->
	<script src="<%=basePath %>/discovery/assets/js/main.js"></script>

	<!-- start: JavaScript Event Handlers for this page -->
	<script type="text/javascript"
		src="<%=basePath %>/discovery/master/js/esl.js"></script>
	<script type="text/javascript"
		src="<%=basePath %>/discovery/master/js/option2.js"></script>
	<%-- <script src="<%=basePath %>/discovery/master/js/data-a-china.js"></script> --%>
	<script src="<%=basePath %>/discovery/master/js/data-china.js"></script>
	<script type="text/javascript"
		src="${ctxContents }/master/js/loadCoreData.js"></script>
	<script>
			var dataArray = [];//城市数据数组 
			
			var idSF = ""; //区县ID 例:1,2,3
			
			var curYear = "2015-09"; //用户点击的年份 暂时写死
			
			var yearValues = [];  //要展示的年份
			
			var proviceId = "";  //省公司ID
			
			var proviceNameValue = "";//省公司名称
				
			var dataMapCounty = {};		//展示数据集数据源
			
			/**
				为map赋值
		 	 * 	dataStore	国安门店数量
		 	 * 	dataVillage 国安社区数量
		  	* 	dataOrder	国安社区订单额	
			*/
	
			var dataMap = {}; //国安门店数量、国安社区数量、国安社区订单额数据
			
			//1. 加载市数据
			initMapOfChinaCity();
			function initMapOfChinaCity(){
				proviceId = "${id}";
				proviceNameValue = "${name}";
				$.ajax({
          		   async: false,
   				   type: "POST",
   				   url: "${basePath }/discovery/map/mapOfChinaCity",
   				   data: "proviceId=${id}",
   				   success: function(msg){
   					 if(msg != null){
   						 dataArray = msg;
   						 
   						showErrorMessage(dataArray[0]);
   				
   						//获取区县I、城市数组
   						getIDSF(dataArray);
   						
   						//+2. 加载最下层数据
   						initMapOfCountyStatisticsInfo(idSF, proviceId, "3");
   					 }
   				   }
   				});
				//默认加载北京市核心数据
				var data = "id=${cityId}&areaType=1";
				getCoreData(data, "${cityName}");
			}

			
			
			/***异常处理
			@param json key:message
			**/
			function showErrorMessage(errorMessage){
				if(errorMessage != null){
					var msg = errorMessage.message;//错误提示信息
					if(msg != null && msg != ''){
						alert(msg);
					}
				}
			}
			
			
			/**
				北京地图悬浮事件
				@param name 区县名称
				@param proviceId   省直辖市ID
				@param cityId
			*/
			function initMouseOverShowData(name, proviceId, cityId){
				var data = "id=" + cityId + "&areaType=3";
				//加载核心数据
				getCoreData(data, name);
			}
			
			/**
			 展示年份
			 @param years json数组年份
			*/
			function showYear(years){
				var year = document.getElementById("year");
				for(var i=0; i<years.length; i++){
					var input = createButtonNow(years[i]);
					if( i == 0){//默认第一个input被选中
						input.setAttribute("class", "btn btn-success");
						curYear = years[i];
					}
					year.appendChild(input);
				}
				//year.setAttribute("class", "ctrl-content"); 
			}
			
			/**
			动态创建按钮
			*/
			function createButtonNow(year){
				var input = document.createElement("button");
				input.type = "button";
				input.innerHTML = year;
				input.id = year;
				input.setAttribute("class", "btn btn-info");
				return input;
			}	
			
			/**
			加载国安门店数量、国安社区数量、国安社区订单额
			*/
			$('button').on('click', function (e) {
			    $('#' + curYear)[0].className = 'btn btn-info';
			    curYear = e.target.id;
			    $('#' + curYear)[0].className = 'btn btn-success';
			    functionMap.chart2();
			});
			
			
			/**
			 组织区县id用于查询国安门店数、国安社区数、国安订单额
			 @param array
			*/
			function getIDSF(array){
				for(var i=0; i<array.length; i++){
					//区县ID
					idSF += array[i].id;
					if(i != array.length - 1){
						idSF += ",";
					}
				}
			}
			
			/**
			 * 加载国安门店数量、国安社区数量、国安社区订单额
			 * @param countyId 	区县ID 例：1,2,3,
			 * @param proviceId 省直辖市ID
			 * @param areaType 1-省直辖市自治区、2-市地区、3-区县、4-街道、5-社区、6-小区、7-楼、8-房间
			*/
			function initMapOfCountyStatisticsInfo(countyId, proviceId, areaType){
				 var dataValue = "proviceId=" + proviceId;
				 dataValue += "&countyId=" + countyId;
				 dataValue += "&areaType=" + areaType; 
				 $.ajax({
          		   async: false,
   				   type: "POST",
   				   url: "${basePath }/discovery/map/mapOfChinaCountyStatisticsInfo",
   				   data: dataValue,
   				   success: function(msg){
   					 if(msg != null){
   						 //1. 日期数组
   						yearValues = msg.date;
   						 
   						 /**
   						  * 	key:date		日期集合
						  * 		dataStore	国安门店数量
						  * 		dataVillage 国安社区数量
						  * 		dataOrder	国安社区订单额	
   						  */
   						 
   						//2. 国安门店数量
   						var dataStoreTemp = msg.dataStore;
  						if(dataStoreTemp != null){
  							//数据转化,防止echart格式化数字时出现0
  							convertDataMapValue(yearValues, dataStoreTemp);
  							//dataStoreTemp["2016-02"][0]["value"] = 100;
  							//国安门店数量
  							dataMapCounty.dataStore = dataStoreTemp;
  							//dataMapCounty.dataStore = {"2015-09":[],"2015-09max":"0","2016-02":[{"name":"朝阳区","value":2}],"2016-02max":"2"};
  						}
  						
  						//3. 国安社区数量
  						var dataVillageTemp = msg.dataVillage;
  						if(dataVillageTemp != null){
  							//数据转化,防止echart格式化数字时出现0
  							convertDataMapValue(yearValues, dataVillageTemp);
  							//国安社区数量
  							dataMapCounty.dataVillage = dataVillageTemp;
  						}
  						
  						//4. 国安社区订单额
  						var dataOrderTemp = msg.dataOrder;
  						if(dataOrderTemp != null){
  							//数据转化,防止echart格式化数字时出现0
  							convertDataMapValue(yearValues, dataOrderTemp);
  							
  							//国安社区订单额
  							dataMapCounty.dataOrder = dataOrderTemp;
  							//国安社区订单额
  							//dataMapCounty.dataOrder = {"2015-11":[],"2016-01":[],"2015-10":[],"2015-12":[],"2016-02":[{"name":"朝阳区","value":"2"}],"2016-02max":"2","2015-09":[]};
  						}
  						
  						//5. 展示年份
  						if(yearValues != null && yearValues.length > 0){
  							showYear(yearValues);
  						}
  						
  						//6. 异常处理
  						showErrorMessage(msg);
   					 }
   				   }
   				});
			}
			
			/**
				转化dataMap数据，把string类型的数字转换成float类型
				@param years 年份数组
				@param 要转换的json集合
			*/
			function convertDataMapValue(years, dataMaps){
				if(years != null && years.length > 0){
					for(var i=0; i<years.length; i++){
						var ys = dataMaps[years[i]];//获取年份数据
						if(ys != null && ys.length > 0){
							for(var j=0; j<ys.length; j++){
								var value = ys[j]["value"] * 1;
								dataMaps[years[i]][j]["value"] = value;
							}
						}
					}
				}
			}
			
			
			
			/**
			 * 加载国安门店数量、国安社区数量、国安社区订单额数据 方法
			 * */
			functionMap.chart2 = function () {
			    functionMap.chart2dispose();
			    var ec = require('echarts');
			    myChart20 = ec.init(document.getElementById('g20'));
			    myChart21 = ec.init(document.getElementById('g21'));
			    myChart22 = ec.init(document.getElementById('g22'));
			    
			    myChart20.setOption(option2('Store', proviceNameValue));	//国安门店
			    myChart21.setOption(option2('Village', proviceNameValue));//国安社区数量
			    myChart22.setOption(option2('Order', proviceNameValue));	//国安社区订单额数据
			}
			
			jQuery(document).ready(function() {
				Main.init();
				//Index.init();
			});
		     // 路径配置
			require.config({
			        paths:{ 
			            echarts:'<%=basePath %>/discovery/master/js/echarts',
			            'echarts/chart/bar' : '<%=basePath %>/discovery/master/js/echarts-map',
			            'echarts/chart/line': '<%=basePath %>/discovery/master/js/echarts-map',
			            'echarts/chart/map' : '<%=basePath %>/discovery/master/js/echarts-map'
			        }
			 });
	        // 使用
	          require(
		            [
		                'echarts',
		                'echarts/chart/bar',
		                'echarts/chart/line',
		                'echarts/chart/map'
		            ],
	            function (ec) {
	            	// 基于准备好的dom，初始化echarts图表
	                var myChart = ec.init(document.getElementById('main')); 
	                //获取前台传来的参数
	        	    var estJson = eval("({ '${name}':'${gbCode}'})");
	                var cityMap =estJson;

	                var curIndx = 0;
	                 var mapType = [];
	                 var mapGeoData = require('echarts/util/mapData/params');
	                 for (var city in cityMap) {
	                     mapType.push(city);
	                     // 自定义扩展图表类型
	                     mapGeoData.params[city] = {
	                         getGeoJson: (function (c) {
	                             var geoJsonName = cityMap[c];
	                             return function (callback) {
	                                 $.getJSON('<%=basePath %>/discovery/assets/echarts/geoJson/china-main-city/' + geoJsonName + '.json', callback);
	                             }
	                         })(city)
	                     }
	                 }
	                 
	                 var ecConfig = require('echarts/config');
	                 var zrEvent = require('zrender/tool/event');
	                 
	                 
	                 option = {
	                     title: {
	                         text : ''
	                     },
	                     /* tooltip : {
	                         trigger: 'item',
	                         formatter: '{b}'
	                     }, */
	                     tooltip : {
	         	            trigger: 'item',
	         	            enterable: true,
	         	            hideDelay: 4000,
	         	            formatter: function (params){
	         	                var myseries = option.series;
	         	                var $png = params[1];
	         	                var res = "<i class='fa fa-bar-chart'></i>&nbsp;&nbsp;数据报告";
	         	                for(var i = 0;i<myseries.length;i++){
	         	                   for(var j=0;j<myseries[i].data.length;j++){
	         	                	   if(myseries[i].data[j].name==params[1]){
	         	                		   var url = "<%=basePath %>/discovery/map/toReportPage?name="+  params[1] + "&id=" + myseries[i].data[j].id + "&type=3&tinyVillageId=0";
	         	                		   //var url = "${ctxContents }/map/toReportPage?name=" + params[1] + "&id="+ myseries[i].data[j].id + "&type=1&tinyVillageId=0";
	         	               			   res +=",<a href='"+encodeURI(encodeURI(url))+"'>&nbsp;点击详情>></a>";
	         	               			   break;
	         	                	   }
	         	                   }
	         	                }
	         	                return res;
	         	            }
	         	         },
	                     dataRange: {
	     		            min: 0,
	     		            max: 1000,
	     		            x: 'left',
	     		            y: 'bottom',
	     		            color:['#0178dd','#d5f8fe'],
	     		            text:['高','低'],           // 文本，默认为数值文本
	     		            calculable : true
	     		        },
	                     series : [
	                         {
	                             name: '',
	                             type: 'map',
	                             mapType: "${name}",
	                             selectedMode : 'single',
	                             itemStyle:{
	                                 normal:{label:{show:true}},
	                                 emphasis:{
	     								color:"#f9db0e",
	     		                    	label:{show:true}
	     		                    }

	                             },
	                             data:dataArray

	                         }
	                     ]
	                 };
	                 myChart.on(ecConfig.EVENT.MAP_SELECTED, function (param){
	                	 var selected = param.selected;
	                	 var areaName="";
	                	 var countryId="";
		                 for (var i = 0, l = option.series[0].data.length; i < l; i++) { //当然我们需要遍历整个data数组  来进行操作
		    					name = option.series[0].data[i].name;
		    					id = option.series[0].data[i].id;
		    					option.series[0].data[i].selected = selected[name];
		    					if (selected[name]) {
		    						areaName = name;
		    						countryId = id;
		    						break;
		    					}
		    				}
	                	 window.open(encodeURI(encodeURI("<%=basePath %>/discovery/map/toBaiduMap?name="+areaName+"&id="+countryId+"&type=4")),"_self");  //这里的 open 方法的 第二个 参数 是传值用的  ， 当然我们也可以这样写 window.open("map9_test02(1).html?ID="+myprovince_id,'');
	                });
	                 
	                 myChart.on(ecConfig.EVENT.HOVER, function (param){
	                	 var proviceId = "";
	                	 var name = param.name;
	                	 var id=0;
	                	 for (var i = 0, l = option.series[0].data.length; i < l; i++) { //当然我们需要遍历整个data数组  来进行操作
	                		 if (name == option.series[0].data[i].name) {
	     						id = option.series[0].data[i].id;
	     						proviceId = option.series[0].data[i].proviceId;//省直辖市ID
	     						break;
	     					}
	     				}
	                	
	                	//北京地图核心数据加载
	               	    initMouseOverShowData(name, proviceId, id);
	                	
	                	//点击详情
               	    	//show(param.event.pageX,param.event.pageY,name,id,3);
               	    	
               	    });
	                
	                // 为echarts对象加载数据 
                    myChart.setOption(option); 
                    window.onresize = myChart.resize;//根据窗口大小自适应
	                  
	                //加载数量地图控制
	              /***
	                var g20 = document.getElementById("g20");
	                var g21 = document.getElementById("g21");
	                var g22 = document.getElementById("g22");
	                var g20Chart = ec.init(g20);
	                var g21Chart = ec.init(g21);
	                var g22Chart = ec.init(g22);
	                g20Chart.setOption(option2('Store'));
	                g21Chart.setOption(option2('Village'));
	                g22Chart.setOption(option2('Order'));
	               ***/
		            functionMap.chart2();
		          
	               
	            }
	        );
	        
	        var proviceName="";
		    function show(x,y,name,id,type){
		    	if(proviceName==name)
		    		 return;
		    	else{
					var report_box=$("#dataReport");
			  		report_box.css("display","block")
			  		var offset=report_box.offset();
			  		
			  		report_box.css("left",x-5);
			  		report_box.css("top",y-150);
			  		proviceName= name;
			  		var url = "<%=basePath %>/discovery/map/toReportPage?name="+ name + "&id=" + id + "&type=" + type+"&tinyVillageId=0";
			  		$("#clickDetail").attr("href",encodeURI(encodeURI(url)));
			}
		}

		var chartDivHeight = $("#container").height();
		var main1 = $("#main").height();
		var main2 = $("#main2").height();
		$("#container").height(main1 + main2 + 400);
	</script>
	<!-- end: JavaScript Event Handlers for this page -->
	<!-- end: CLIP-TWO JAVASCRIPTS -->
</body>
</html>
