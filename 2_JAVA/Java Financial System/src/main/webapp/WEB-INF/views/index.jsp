<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<%@ taglib prefix="sec" uri="http://localhost/permission"%>
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
	href="<%=basePath%>/CIDM/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=basePath%>/CIDM/vendor/fontawesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=basePath%>/CIDM/vendor/themify-icons/themify-icons.min.css">
<link href="<%=basePath%>/CIDM/vendor/animate.css/animate.min.css"
	rel="stylesheet" media="screen">
<link
	href="<%=basePath%>/CIDM/vendor/perfect-scrollbar/perfect-scrollbar.min.css"
	rel="stylesheet" media="screen">
<link href="<%=basePath%>/CIDM/vendor/switchery/switchery.min.css"
	rel="stylesheet" media="screen">
<!-- end: MAIN CSS -->
<!-- start: CLIP-TWO CSS -->
<link rel="stylesheet" href="<%=basePath%>/CIDM/assets/css/styles.css">
<link rel="stylesheet" href="<%=basePath%>/CIDM/assets/css/plugins.css">
<link rel="stylesheet" href="<%=basePath%>/CIDM/assets/css/themes/theme-1.css" id="skin_color" />
<link rel="stylesheet" href="<%=basePath%>/CIDM/assets/css/add.css">
<!-- end: CLIP-TWO CSS -->
<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
</head>
<!-- end: HEAD -->
<body>
	<c:import url='/navbar' />
	<div id="app">
		<div class="app-content">
			<!-- start: map -->
			<div class="shouye">
				<ul>
                                   <%--  <sec:security url="/map"> --%>
					<li><a href="<%=basePath%>/CIDM/map"><img
							src="assets/images/index_08.png" width="250"></a></li>
                                    <%-- </sec:security> --%>
					<li><a href="#"><img src="assets/images/index_10.png"
							width="250"></a></li>
					<li><a href="#"><img src="assets/images/index_03.png"
							width="250"></a></li>
					<li><a href="#"><img src="assets/images/index_05.png"
							width="250"></a></li>
				</ul>
			</div>
			<br clear="all" />
			<!-- end:  map -->
			<!-- start: FOOTER -->
			<div class="shouye_footer">
				<div class="shoye_footer_1">
					<div class="copyright">
						<ul>
							<li class="li1">帮助</li>
							<li><a href="">产品简介</a></li>
							<li><a href="">使用方法</a></li>
							<li><a href="">名词解释</a></li>
							<li><a href="">模块简介</a></li>
						</ul>
					</div>

					<div class="copyright">
						<ul>
							<li class="li1">相关数据服务</li>
							<li><a href="">社区服务指数</a></li>
							<li><a href="">社区服务专业版</a></li>
						</ul>
					</div>

					<div class="copyright">
						<ul>
							<li class="li1">关注我们</li>
							<li><a href="">企业介绍</a></li>
							<li><a href="">官方微信</a></li>
						</ul>
					</div>
					<br clear="all">
					<div class="copy_b">
						&copy; <span class="current-year"></span><span
							class="text-bold text-uppercase">GuoAn
							使用中信国安指数前必读&nbsp;&nbsp;&nbsp;&nbsp;中信国安指数版权声明&nbsp;&nbsp;&nbsp;
							&nbsp;京ICP证030173号</span>. <span>All rights reserved</span>
					</div>
				</div>
			</div>

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
	</div>
	<!-- start: MAIN JAVASCRIPTS -->
	<script src="<%=basePath%>/CIDM/vendor/jquery/jquery.min.js"></script>
	<script src="<%=basePath%>/CIDM/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="<%=basePath%>/CIDM/vendor/modernizr/modernizr.js"></script>
	<script src="<%=basePath%>/CIDM/vendor/jquery-cookie/jquery.cookie.js"></script>
	<script src="<%=basePath%>/CIDM/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script src="<%=basePath%>/CIDM/vendor/switchery/switchery.min.js"></script>
	<!-- end: MAIN JAVASCRIPTS -->
	<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<script src="<%=basePath%>/CIDM/vendor/Chart.js/Chart.min.js"></script>
	<script src="<%=basePath%>/CIDM/vendor/jquery.sparkline/jquery.sparkline.min.js"></script>
	<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
	<!-- start: CLIP-TWO JAVASCRIPTS -->
	<script src="<%=basePath%>/CIDM/assets/js/main.js"></script>
	<!-- start: JavaScript Event Handlers for this page -->

	<script>
		jQuery(document).ready(function() {
			Main.init();
			//Index.init();
		});
	</script>
	<!-- end: JavaScript Event Handlers for this page -->
	<!-- end: CLIP-TWO JAVASCRIPTS -->
</body>
</html>