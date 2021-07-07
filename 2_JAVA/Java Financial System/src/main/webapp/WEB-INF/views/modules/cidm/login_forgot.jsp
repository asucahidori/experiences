﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<!-- Template Name: Clip-Two - Responsive Admin Template build with Twitter Bootstrap 3.x | Author: ClipTheme -->
<!--[if IE 8]><html class="ie8" lang="en"><![endif]-->
<!--[if IE 9]><html class="ie9" lang="en"><![endif]-->
<!--[if !IE]><!-->
<html lang="en">
	<!--<![endif]-->
	<!-- start: HEAD -->
	<!-- start: HEAD -->
	<head>
		<title>中信国安</title>
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
		<link href="http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic" rel="stylesheet" type="text/css" />
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
		<link rel="stylesheet" href="${ctxContents }/assets/css/styles.css">
		<link rel="stylesheet" href="${ctxContents }/assets/css/plugins.css">
		<link rel="stylesheet" href="${ctxContents }/assets/css/themes/theme-1.css" id="skin_color" />
        <link rel="stylesheet" href="${ctxContents }/assets/css/add.css"/>
		<!-- end: CLIP-TWO CSS -->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
	</head>
	<!-- end: HEAD -->
	<!-- start: BODY -->
	<body class="login login_bg">
		<!-- start: FORGOT -->
		<div class="row">
			<div class="main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
				<div class="logo margin-top-30 login_p">
					<img src="assets/images/logo.png" alt=""/><span class="login_s">数据服务平台</span>
				</div>
				<!-- start: FORGOT BOX -->
				<div class="box-forgot">
					<form class="form-forgot">
						<fieldset>
							<legend>
								忘记密码？
							</legend>
							<p>
								输入您的电子邮件地址重新设置您的密码
							</p>
							<div class="form-group">
								<span class="input-icon">
									<input type="email" class="form-control" name="email" placeholder="Email">
									<i class="fa fa-envelope-o"></i> </span>
							</div>
							<div class="form-actions">
								<a class="btn btn-primary btn-o" href="login_signin.html">
									<i class="fa fa-chevron-circle-left"></i> 登录
								</a>
								<button type="submit" class="btn btn-primary pull-right">
									提交 <i class="fa fa-arrow-circle-right"></i>
								</button>
							</div>
						</fieldset>
					</form>
					<!-- start: COPYRIGHT -->
					<div class="copyright">
						&copy; <span class="current-year"></span><span class="text-bold text-uppercase"> 中信国安</span>. <span>All rights reserved</span>
					</div>
					<!-- end: COPYRIGHT -->
				</div>
				<!-- end: FORGOT BOX -->
			</div>
		</div>
		<!-- end: FORGOT -->
		<!-- start: MAIN JAVASCRIPTS -->
		<script src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
		<script src="${ctxContents }/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="${ctxContents }/vendor/modernizr/modernizr.js"></script>
		<script src="${ctxContents }/vendor/jquery-cookie/jquery.cookie.js"></script>
		<script src="${ctxContents }/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
		<script src="${ctxContents }/vendor/switchery/switchery.min.js"></script>
		<!-- end: MAIN JAVASCRIPTS -->
		<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<script src="${ctxContents }/vendor/jquery-validation/jquery.validate.min.js"></script>
		<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<!-- start: CLIP-TWO JAVASCRIPTS -->
		<script src="${ctxContents }/assets/js/main.js"></script>
		<!-- start: JavaScript Event Handlers for this page -->
		<script src="${ctxContents }/assets/js/login.js"></script>
		<script>
			jQuery(document).ready(function() {
				Main.init();
				Login.init();
			});
		</script>
		<!-- end: JavaScript Event Handlers for this page -->
		<!-- end: CLIP-TWO JAVASCRIPTS -->
	</body>
	<!-- end: BODY -->
</html>