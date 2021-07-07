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
		<link rel="stylesheet" href="${ctxContents }/assets/css/themes/theme-1.css" id="skin_color" />
		<link rel="stylesheet" href="${ctxContents }/assets/css/add.css">
		<!-- end: CLIP-TWO CSS -->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
	</head>
<style type="text/css">
.app-navbar-fixed {
    padding-top: 75px;
}
</style>
	<!-- end: HEAD -->
	<body>
		<c:import url='/navbar' />
		<div id="app">
			<!-- sidebar -->
			<div id="sidebar" class="sidebar app-aside sidebar_add">
				<div class="sidebar-container perfect-scrollbar">
					<nav>
						<!-- start: SEARCH FORM -->
						<div class="search-form">
							<a class="s-open" href="#">
								<i class="ti-search"></i>
							</a>
							<form class="navbar-form" role="search">
								<a class="s-remove" href="#" target=".navbar-form">
									<i class="ti-close"></i>
								</a>
								<div class="form-group">
									<input type="text" class="form-control" placeholder="请输入要查找的地址...">
									<button class="btn search-button" type="submit">
										<i class="ti-search"></i>
									</button>
								</div>
							</form>
						</div>
						<!-- end: SEARCH FORM -->
						
						<!-- start: MAIN NAVIGATION MENU -->
						<c:import url='/toLeftQueryBar' />
						<!-- end MAIN NAVINGATION MENU -->
                        
                       <!-- start: 数据报告分析开始 -->
						<ul class="main-navigation-menu">
							<li class="active open">
								<a>
									<div class="item-content">
										<div class="item-inner city_data_2">
                                        	<div class="region">${name }</div>
                                            <!-- <div class="region_1">1号楼101</div>
											<span class="title font_16px_add"> 家庭数据报告分析 </span> -->
										</div>
									</div>
								</a>
							</li>
						
                            
                            <li>
								<a href="report_household.html">
									<div class="item-content">
										<div class="item-media">
											<i class="fa fa-list"></i>
										</div>
										<div class="item-inner">
											<span class="title">社区平台消费TOP10</span>
										</div>
									</div>
								</a>
							</li>
    
						</ul>
                       <!-- end: 数据报告分析开始 -->
                        
						<!-- end: MAIN NAVIGATION MENU -->
						
					</nav>
				</div>
			</div>
			<!-- / sidebar -->
			<div class="app-content">
				<!-- start: TOP NAVBAR -->
				<!-- end: TOP NAVBAR -->
				<div class="main-content">
					<div style="height: 45px;">
					<c:import url='/navigateBar' />
					</div>
                	<div class="row lou_bg">
                	<div class="hu_map1"> <span class="hu_map1_s">${name }</span>
                    	<!--<div class="map_lick map_lick_hu"><i class="fa fa-bar-chart map_font"></i><span class="s_data">数据报告，<a href="report_household.html">点击详情&gt;&gt;</a></span></div>-->
                    </div>
                    <div class="hu_map2">
                    	<div class="hu_map2_center">
                    	<form>
                    	<div class="hu_biao">
                        	<div class="hu_biao_logo1"><i class="fa fa-building hu_font1"></i></div>
                            <div class="position">
                        	<div class="form-group form-group1">
												<select class="js-example-placeholder-single js-states form-control"  id="building_1">
												<option></option>
												</select>
												</div>
                              </div>
                        </div>
                        
                        <div class="hu_biao_c">
                        	<div class="hu_biao_logo2"><i class="fa fa-users hu_font2"></i></div>
                            <div class="position">
                        	<div class="form-group form-group2">
							<select class="js-example-placeholder-single js-states form-control"  id="unit">
 										<option></option> -->
							</select>
							</div>
                            <div class="form-group form-group3">
							<select class="js-example-placeholder-single js-states form-control"  id="floor">
														<option></option>
													</select>
												</div>
                               </div>
                        </div>
                        
                        <div class="hu_biao_r">
                        	<div class="hu_biao_logo3"> <i class="fa fa-arrows hu_font3"></i></div>
                             <div class="position">
                       		<div class="form-group form-group4">
							<select class="js-example-placeholder-single js-states form-control" id="household">
														<option></option>
							</select>
							</div>
                                         <input id="search_household222" type="button" class="hu_submit" value="查询" />
                              </div>
                              
                            
                        </div>
                         
				    </form>
                  </div><br clear="all">
                  </div>
                  </div>
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
		<script src="${ctxContents }/master/js/loadLinkageData.js"></script>
		<script>
			jQuery(document).ready(function() {
				Main.init();
				//Index.init();
				FormElements.init();
				getStreetData('${id}',7,"building_1");
				//selecctholehouse();
			});
			$(function() {
				$("#search_household222").click(function(){
					var areaid = '${id}';
					var name = '${name}';
					var buildingid = $("#building_1").val();
					if(buildingid==""){
						alert("请选择楼房!");
						return false;
					}
					var unit = $("#unit").val();
					var floor = $("#floor").val();
					var household = $("#household").val();
					
					var type="";
					
					if(household!=""){
						type=9;
					}else{
						type = 8;
					}
					url=basePath+"/discovery/map/toReportHousehold?name="
							+ name + "&id=" + areaid+"&type=" + type+"&buildingid="+buildingid+ "&unit="+unit+"&household="+household;
					location.href = encodeURI(encodeURI(url));
				});
			});
		</script>
	
		<!-- end: JavaScript Event Handlers for this page -->
		<!-- end: CLIP-TWO JAVASCRIPTS -->
	</body>
</html>
