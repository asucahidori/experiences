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
	href="${ctxContents }/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${ctxContents }/vendor/fontawesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${ctxContents }/vendor/themify-icons/themify-icons.min.css">
<link href="${ctxContents }/vendor/animate.css/animate.min.css"
	rel="stylesheet" media="screen">
<link
	href="${ctxContents }/vendor/perfect-scrollbar/perfect-scrollbar.min.css"
	rel="stylesheet" media="screen">
<link href="${ctxContents }/vendor/switchery/switchery.min.css"
	rel="stylesheet" media="screen">
<!-- end: MAIN CSS -->
<!-- start: CLIP-TWO CSS -->
<link rel="stylesheet" href="${ctxContents }/assets/css/styles.css">
<link rel="stylesheet" href="${ctxContents }/assets/css/plugins.css">
<%-- <link rel="stylesheet"
	href="${ctxContents }/assets/css/themes/theme-1.css" id="skin_color" /> --%>
<link rel="stylesheet" href="${ctxContents }/assets/css/add.css">
<!-- end: CLIP-TWO CSS -->
<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
</head>
<!-- end: HEAD -->
<body>
	<c:import url='/navbar' />
	<div id="app">
		<div class="app-content">
			<div class="main-content  main-content_map">
				<div class="wrap-content container" id="container">
					<!-- start: map -->
					<div class="row row_bg">
						<div class="col-lg-9">
							<div class="map_bg">
								<div class="map_region">
									<div id="main" style="height: 600px"></div>
									<div class="map_lick" id="dataReport" style="display:none;">
										<i class="fa fa-bar-chart map_font"></i><span class="s_data">数据报告，<a
											id="clickDetail"
											href="<%=basePath%>/discovery/guoAnUsers/getGuoAnUsers?id=1"
											id="$("
											#clickDetail").attr("href","${ctxContents }/map/toReportPage?name="+name+"
											&id="+id+" &type="+type+"&tinyVillageId=0");">点击详情&gt;&gt;</a></span>
									</div>
								</div>
							</div>
						</div>
						<!-- 核心数据 -->
						<c:import url='/coreData' />
					</div>
					<!-- end:  map -->
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
	<script src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
	<script src="${ctxContents }/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="${ctxContents }/vendor/modernizr/modernizr.js"></script>
	<script src="${ctxContents }/vendor/jquery-cookie/jquery.cookie.js"></script>
	<script
		src="${ctxContents }/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script src="${ctxContents }/vendor/switchery/switchery.min.js"></script>
	<!-- end: MAIN JAVASCRIPTS -->
	<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<script src="${ctxContents }/vendor/Chart.js/Chart.min.js"></script>
	
	<script
		src="${ctxContents }/vendor/jquery.sparkline/jquery.sparkline.min.js"></script>
	<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<!-- start: CLIP-TWO JAVASCRIPTS -->
	<script src="${ctxContents }/assets/js/main.js"></script>
	<!-- start: JavaScript Event Handlers for this page -->
	<!-- <script src="${ctxContents }/assets/js/index.js"></script>  -->
	 <script type="text/javascript" src="${ctxContents }/master/js/esl.js"></script> 
	 <script type="text/javascript"
		src="${ctxContents }/master/js/loadCoreData.js"></script> 
	<script>
		/**
			 key: id	    省直辖市ID   对应dao：provinceId
		  	 name		    省直辖市名称
			 gbCode	            省直辖市国标码 
			 value		    国安社区用户数   对应dao：number
		 */
		var dataArray = [];
		//加载地图数据
		initMapOfChina();
		function initMapOfChina() {
			//1.加载地图数据
			$.ajax({
				async : false,
				type : "POST",
				url : "${basePath }/discovery/map/mapOfChina",
				data : "",
				success : function(msg) {
					if (msg != null) {
						dataArray = msg;
						//dataArray = [{name: '北京',id:'110100',value: Math.round(Math.random()*1000),selected:true}];

						//异常处理
						showErrorMessage(dataArray[0]);
						
						//加载北京核心数据
						initBJCoreData(dataArray);
					}
				}
			});
		}

		/**
			默认登录是加载北京核心数据
			@param dataArray
		**/
		function initBJCoreData(array){
			if(array != null && array.length > 0){
				for(var i=0; i<array.length; i++){
					var p = array[i];
					if(p != null && p != ''){
						var name = p.name;//省名称
						if(name.indexOf("市") > 0 ){
							name.replace("市", "");
						}
						var id = p.id;	  //省编号
						if(name == "北京"){
							//2. 加载地图核心数据
							var data = "areaType=1&" + "id=" + id;
							getCoreData(data, name);
							break;
						}
					}
				}
				
			}
		}
		
		/***异常处理
		@param json key:message
		 **/
		function showErrorMessage(errorMessage) {
			if (errorMessage != null) {
				var msg = errorMessage.message;//错误提示信息
				if (msg != null && msg != '') {
					alert(msg);
				}
			}
		}

		jQuery(document).ready(function() {
			Main.init();
		});

		//加载map路径
		require.config({
			paths : {
				echarts : '${ctxContents }/master/js/echarts',
				'echarts/chart/line' : '${ctxContents }/master/js/echarts-map',
				'echarts/chart/map' : '${ctxContents }/master/js/echarts-map'
			}
		});

		option = {
			title : {
				x : 'center'
			},
			
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
	                		   var url = "${ctxContents }/map/toReportPage?name=" + params[1] + "&id="+ myseries[i].data[j].id + "&type=1&tinyVillageId=0";
	               			   res +=",<a href='"+encodeURI(encodeURI(url))+"'>&nbsp;点击详情>></a>";
	               			   break;
	                	   }
	                   }
	                }
	                return res;
	            }
	        },
			dataRange : {
				min : 0,
				max : 1000,
				x : 'left',
				y : 'bottom',
				text : [ '高', '低' ], // 文本，默认为数值文本
				calculable : true
			},
			toolbox : {
				show : true,
				orient : 'vertical',
				x : 'right',
				y : 'center'
			},
			roamController : {
				show : true,
				x : 'right',
				mapTypeControl : {
					'china' : true
				}
			},

			series : [ {
				type : 'map',
				mapType : 'china',
				selectedMode : 'single',
				roam : false,
				itemStyle : {
					normal : {
						label : {
							show : true
						}
					},
					emphasis : {
						color : "#f9db0e",
						label : {
							show : true
						}
					}
				},
				data : dataArray
			} ]
		};
		require([ 'echarts', 'echarts/chart/bar', 'echarts/chart/line',
				'echarts/chart/map'

		], function(ec) {

			var main = document.getElementById("main");
			var myChart = ec.init(main,'red');

			myChart.setOption(option);
			var ecConfig = require('echarts/config');
			myChart.on(ecConfig.EVENT.MAP_SELECTED, function(param) {
				var selected = param.selected;
				//var str = '当前选择： ';
				var selectedProvince;
				var name;
				var myprovince_id;
				var gbCode;

				for (var i = 0, l = option.series[0].data.length; i < l; i++) { //当然我们需要遍历整个data数组  来进行操作
					name = option.series[0].data[i].name;
					if(name.indexOf("市") > 0 ){
						name = name.replace("市", "");
					}
					if(name.indexOf("省") > 0 ){
						name = name.replace("省", "");
					}
					id = option.series[0].data[i].id;
					v_gbCode = option.series[0].data[i].gbCode;
					option.series[0].data[i].selected = selected[name];

					if (selected[name]) {
						selectedProvince = name;
						myprovince_id = id;
						gbCode = v_gbCode;
						break;
					}
				}
				
				window.open(
						encodeURI(encodeURI("${ctxContents }/map/areaMap?name="
								+ name + "&id=" +myprovince_id+"&gbCode="+gbCode+"&type=3")), "_self"); //这里的 open 方法的 第二个 参数 是传值用的  ， 当然我们也可以这样写 window.open("map9_test02(1).html?ID="+myprovince_id,'');
			});
			myChart.on(ecConfig.EVENT.HOVER, function(param) {
				var name = param.name;
				var selectedProvince=null;
				var id=0;

				for (var i = 0, l = option.series[0].data.length; i < l; i++) { //当然我们需要遍历整个data数组  来进行操作
					namestr = option.series[0].data[i].name;
					if(namestr.indexOf("市") > 0 ){
						namestr = namestr.replace("市", "");
					}
					if(namestr.indexOf("省") > 0 ){
						namestr = namestr.replace("省", "");
					}
					if (name == namestr) {
						id = option.series[0].data[i].id;
						break;
					}
				}
				//show(param.event.pageX, param.event.pageY, id, name);
				
				//北京地图核心数据加载
				var data = "id=" + id + "&areaType=1";
           	    getCoreData(data, name);
			});
			myChart.setOption(option);
			window.onresize = myChart.resize;//根据窗口大小自适应
		}

		)
		var proviceName = "";
		function show(x, y, id, name) {
			if (proviceName == name)
				return;
			else {
				var report_box = $("#dataReport");
				report_box.css("display", "block");
				var offset = report_box.offset();
				report_box.css("left", x - 5);
				report_box.css("top", y - 150);
				proviceName = name;
			}
			var url = "${ctxContents }/map/toReportPage?name=" + name + "&id="+ id + "&type=1&tinyVillageId=0";
			$("#clickDetail").attr("href",encodeURI(encodeURI(url)));
		}
	</script>
	<!-- end: JavaScript Event Handlers for this page -->
	<!-- end: CLIP-TWO JAVASCRIPTS -->
</body>
</html>
