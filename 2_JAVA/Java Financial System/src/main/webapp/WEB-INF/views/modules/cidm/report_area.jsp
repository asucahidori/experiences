<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="" name="description" />
		<meta content="" name="author" />
		<!-- end: META -->
		<!-- start: GOOGLE FONTS -->
		<link href="http://fonts.useso.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic" rel="stylesheet" type="text/css" />
		<!-- end: GOOGLE FONTS -->
		<!-- start: MAIN CSS -->
		<link rel="stylesheet" href="${ctxContents }/vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="${ctxContents }/vendor/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${ctxContents }/vendor/themify-icons/themify-icons.min.css">
		<link href="${ctxContents }/vendor/animate.css/animate.min.css" rel="stylesheet" media="screen">
		<link href="${ctxContents }/vendor/perfect-scrollbar/perfect-scrollbar.min.css" rel="stylesheet" media="screen">
		<link href="${ctxContents }/vendor/switchery/switchery.min.css" rel="stylesheet" media="screen">
		<!-- end: MAIN CSS -->
		<!-- start: CLIP-TWO CSS -->
        <link href="${ctxContents }/vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.css" rel="stylesheet" media="screen">
		<link href="${ctxContents }/vendor/select2/select2.min.css" rel="stylesheet" media="screen">
		<link href="${ctxContents }/vendor/bootstrap-datepicker/bootstrap-datepicker3.standalone.min.css" rel="stylesheet" media="screen">
		<link href="${ctxContents }/vendor/bootstrap-timepicker/bootstrap-timepicker.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" href="${ctxContents }/assets/css/styles.css">
		<link rel="stylesheet" href="${ctxContents }/assets/css/plugins.css">
        <link rel="stylesheet" href="${ctxContents }/assets/css/add.css">
		<link rel="stylesheet" href="${ctxContents }/assets/css/themes/theme-1.css" id="skin_color" />
		<link rel="stylesheet" href="${ctxContents }/assets/css/styles.css">
		<link rel="stylesheet" href="${ctxContents }/assets/css/plugins.css">
        <link rel="stylesheet" href="${ctxContents }/assets/css/add.css">
		<link rel="stylesheet" href="${ctxContents }/assets/css/themes/theme-1.css" id="skin_color" />
		<!-- end: CLIP-TWO CSS -->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
		<style>
		.app-navbar-fixed {
	    padding-top: 75px;
		}
		</style>
	</head>
	<!-- end: HEAD -->
	<body>
		<c:import url='/navbar' />
		<div id="app">
			<!-- sidebar -->
			<div id="sidebar" class="sidebar app-aside sidebar_add">
				<div class="sidebar-container perfect-scrollbar">
					<nav>
						<!-- start: MAIN NAVIGATION MENU -->
						<c:import url='/toLeftQueryBar' />
						<!-- end MAIN NAVINGATION MENU -->
						
                       <!-- start: 数据报告分析开始 -->
					   <c:import url='/toLeftBar'/>
                       <!-- end: 数据报告分析开始 -->
                        
						<!-- end: MAIN NAVIGATION MENU -->
						
					</nav>
				</div>
			</div>
			<!-- / sidebar -->
			<div class="app-content">
				<!-- start: TOP NAVBAR -->
				<!-- end: TOP NAVBAR -->
				<div class="main-content" >
					<c:import url='/navigateBar' />
					<div class="wrap-content container" id="container">
						<!-- start: FEATURED BOX LINKS -->
						<div class="container-fluid container-fullw bg-white">
							<div id="report_1" class="row city_row">
								<div class="col-sm-3 city">
									<div class="city_l"><span class="glyphicon glyphicon-list-alt font_add"></span></div>
                                    <div class="city_r">
                                    	<span class="city_s1" id="gbCode"></span>
                                        <span class="city_s2">区县编码</span>
                                    </div>
								</div>
								<div class="col-sm-3 city">
									<div class="city_l"><i class="fa fa-pie-chart font_add"></i></div>
                                    <div class="city_r">
                                    	<span class="city_s1" id="squareArea"></span>
                                        <span class="city_s2">区县面积</span>
                                    </div>
								</div>
                                <div class="col-sm-3 city">
									<div class="city_l"><i class="fa fa-cny font_add"></i></div>
                                    <div class="city_r">
                                    	<span class="city_s1" id="gdp"></span>
                                        <span class="city_s2">生产总值</span>
                                    </div>
								</div>
                                
								<div class="col-sm-3 city">
									<div class="city_l"><i class="fa fa-group font_add"></i></div>
                                    <div class="city_r">
                                    	<span class="city_s1" id="sumPopulation"></span>
                                        <span class="city_s2">人口规模</span>
                                    </div>
								</div>
							</div>
						</div>
						<!-- end: FEATURED BOX LINKS -->
						<!-- start: map -->
						<div class="container-fluid container-fullw padding-bottom-10 bj_main">
                           <div class="bj_main_r_cont" id="bj_main_r_cont">
                            
                                <div id="communityUserCapacityByDate" class="bj_main_r_cont_Report_user1"></div><!--report_user1结束-->
                                 <div id="communityUserOrderByDate" class="bj_main_r_cont_Report_order1"></div><!--report_order1结束-->
                                  <br clear="all"/>
                                 
                                <div id="communityUserCapacityByArea" class="bj_main_r_cont_Report_user2"></div><!--report_user2结束-->
                                 <br clear="all"/>
                           
                         
                               
                                <div id="communityUserOrderByArea" class="bj_main_r_cont_Report_order2"></div><!--report_order2结束-->
                                 <br clear="all"/>
                                 <div id="housingPricesByDate" class="bj_main_r_cont_Report_residence1" style="display:none"></div><!--report_order1结束-->
                                <br clear="all"/>
                       
                               
                                <div id="housingPricesByArea" class="bj_main_r_cont_Report_residence2"></div><!--report_order2结束-->
                                <br clear="all"/>
                                <div id="sexStructure" class="bj_main_r_cont_Report_consumption_qu"></div><!--report_order1结束-->
                                <br clear="all"/>
                                
                         
                        </div><!--bj_main_r_cont结束-->
                         
						</div>
						<!-- end:  map -->
						
					</div><!--头部以上的三个DIV1-->
				</div><!--头部以上的三个DIV2-->
			</div><!--头部以上的三个DIV3-->
            
            
			<!-- start: FOOTER -->
			<footer>
				<div class="footer-inner">
					<div class="pull-left">
						&copy; <span class="current-year"></span><span class="text-bold text-uppercase">中信国安</span>. <span>All rights reserved</span>
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
			<div class="settings panel panel-default hidden-xs hidden-sm" id="settings">
				<button ct-toggle="toggle" data-toggle-class="active" data-toggle-target="#settings" class="btn btn-default">
					<i class="fa fa-spin fa-gear"></i>
				</button>
				<div class="panel-heading">
					Style Selector
				</div>
				<div class="panel-body">
					<!-- start: FIXED HEADER -->
					<div class="setting-box clearfix">
						<span class="setting-title pull-left"> Fixed header</span>
						<span class="setting-switch pull-right">
							<input type="checkbox" class="js-switch" id="fixed-header" />
						</span>
					</div>
					<!-- end: FIXED HEADER -->
					<!-- start: FIXED SIDEBAR -->
					<div class="setting-box clearfix">
						<span class="setting-title pull-left">Fixed sidebar</span>
						<span class="setting-switch pull-right">
							<input type="checkbox" class="js-switch" id="fixed-sidebar" />
						</span>
					</div>
					<!-- end: FIXED SIDEBAR -->
					<!-- start: CLOSED SIDEBAR -->
					<div class="setting-box clearfix">
						<span class="setting-title pull-left">Closed sidebar</span>
						<span class="setting-switch pull-right">
							<input type="checkbox" class="js-switch" id="closed-sidebar" />
						</span>
					</div>
					<!-- end: CLOSED SIDEBAR -->
					<!-- start: FIXED FOOTER -->
					<div class="setting-box clearfix">
						<span class="setting-title pull-left">Fixed footer</span>
						<span class="setting-switch pull-right">
							<input type="checkbox" class="js-switch" id="fixed-footer" />
						</span>
					</div>
					<!-- end: FIXED FOOTER -->
					<!-- start: THEME SWITCHER -->
					<div class="colors-row setting-box">
						<div class="color-theme theme-1">
							<div class="color-layout">
								<label>
									<input type="radio" name="setting-theme" value="theme-1">
									<span class="ti-check"></span>
									<span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span>
									<span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span>
								</label>
							</div>
						</div>
						<div class="color-theme theme-2">
							<div class="color-layout">
								<label>
									<input type="radio" name="setting-theme" value="theme-2">
									<span class="ti-check"></span>
									<span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span>
									<span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span>
								</label>
							</div>
						</div>
					</div>
					<div class="colors-row setting-box">
						<div class="color-theme theme-3">
							<div class="color-layout">
								<label>
									<input type="radio" name="setting-theme" value="theme-3">
									<span class="ti-check"></span>
									<span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span>
									<span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span>
								</label>
							</div>
						</div>
						<div class="color-theme theme-4">
							<div class="color-layout">
								<label>
									<input type="radio" name="setting-theme" value="theme-4">
									<span class="ti-check"></span>
									<span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span>
									<span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span>
								</label>
							</div>
						</div>
					</div>
					<div class="colors-row setting-box">
						<div class="color-theme theme-5">
							<div class="color-layout">
								<label>
									<input type="radio" name="setting-theme" value="theme-5">
									<span class="ti-check"></span>
									<span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span>
									<span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span>
								</label>
							</div>
						</div>
						<div class="color-theme theme-6">
							<div class="color-layout">
								<label>
									<input type="radio" name="setting-theme" value="theme-6">
									<span class="ti-check"></span>
									<span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span>
									<span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span>
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
		<script src="${ctxContents }/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
		<script src="${ctxContents }/vendor/switchery/switchery.min.js"></script>
		<!-- end: MAIN JAVASCRIPTS -->
		<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<script src="${ctxContents }/vendor/Chart.js/Chart.min.js"></script>
		<script src="${ctxContents }/vendor/jquery.sparkline/jquery.sparkline.min.js"></script>
		<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<!-- start: CLIP-TWO JAVASCRIPTS -->
		<script src="${ctxContents }/assets/js/main.js"></script>
		<!-- start: JavaScript Event Handlers for this page -->
		<!--<script src="${ctxContents }/assets/js/index.js"></script>-->
        <script src="${ctxContents }/vendor/maskedinput/jquery.maskedinput.min.js"></script>
		<script src="${ctxContents }/vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.js"></script>
		<script src="${ctxContents }/vendor/autosize/autosize.min.js"></script>
		<script src="${ctxContents }/vendor/selectFx/classie.js"></script>
		<script src="${ctxContents }/vendor/selectFx/selectFx.js"></script>
		<script src="${ctxContents }/vendor/select2/select2.min.js"></script>
		<script src="${ctxContents }/vendor/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
		<script src="${ctxContents }/vendor/bootstrap-timepicker/bootstrap-timepicker.min.js"></script>
		<script src="${ctxContents }/assets/js/form-elements.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/echarts-all.js"></script>
        <script src="${ctxContents }/master/js/report.js"></script>
        <script src="${ctxContents }/master/js/reportData.js"></script>
		<script type="text/javascript" src="${ctxContents }/master/js/loadLinkageData.js"></script>
		
		<script>
			jQuery(document).ready(function() {
				Main.init();
				//Index.init();
				FormElements.init();
				//$("#logo").attr("src", basePath+"/assets/images/logo.png");
			});
			initSumHouse('${id}', '${type}');
			initSumPopulation('${id}','${type}');
			initGdp('${id}', '${type}');
			getUsersCount('${id}','${type}',null);
			getEveryArea('${id}','${type}');
			getUsersOrders('${id}','${type}');
			everyOrdersCounts('${id}','${type}');
			
			getChartSexData('${id}','townsexcount','${type}');
			getAreaHomePriceByArea('${id}','countryHomePriceTown','${type}');
			getAreaHomePriceByDate('${id}','countryHomePrice');
			window.onload = function(){ 
				changeDivCitySize(); 
			};
		</script>
		<!-- end: JavaScript Event Handlers for this page -->
		<!-- end: CLIP-TWO JAVASCRIPTS -->
	</body>
</html>
