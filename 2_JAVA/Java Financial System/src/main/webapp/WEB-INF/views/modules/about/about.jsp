<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>国安社区CIDM</title>
		<!-- Tell the browser to be responsive to screen width -->
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<!-- Bootstrap 3.3.5 -->
		<link rel="stylesheet"
	href="${ctxContents }/resource/bootstrap/css/bootstrap.min.css">
		<!-- Font Awesome -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		<!-- Ionicons -->
		<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
		<!-- Theme style -->
		<link rel="stylesheet" href="${ctxContents }/resource/dist/css/AdminLTE.min.css">
		<link rel="stylesheet" href="${ctxContents }/resource/dist/css/dn-css.css">
		<style>
		body {
			    padding-bottom: 0;
			    background-color: rgb(247, 247, 247);
			    font-family: "微软雅黑";
			    color:#000;
			}
			.row {
			    margin-right: 0px;
			    margin-left: 0px;
			}	
			h1, .h1, h2, .h2, h3, .h3 {
			    margin-top: 20px;
			    margin-bottom: 10px;
			}
			.h2, h2 {
			    font-size: 30px;
			}
			body p {
			    line-height: 2;
			}
			.img-circle {
			    border: 1px solid rgba(0, 0, 0, 0.2);
			    padding: 4px;
			    margin: 5px;
			}
			a {
			    color: #d8361b;
			    text-decoration: none;
			}
			a:hover{    
				color: #99311c;
    			text-decoration: underline;
			}
			.container .jumbotron {
			    padding-right: 60px;
			    padding-left: 60px;
			    margin: 0;
    			text-align: center;
    			background-color: transparent;
			}
			.jumbotron h1 {
			    font-size: 100px;
			    line-height: 1;
			}
			.jumbotron .lead {
			    font-size: 24px;
			    line-height: 1.25;
			}
			.jumbotron .btn {
			    font-size: 21px;
			    padding: 14px 24px;
			}	
			
		</style>
	</head>
	<body>
		<header class="main-header clearfix">
			<div class="head_logo pull-left" style="padding: 10px 15px 0 15px;">
				<a href="#"><img
					src="${ctxContents }/resource/dist/img/logo.png" alt="国安大数据"></a>
			</div>
			<div class="head_btn pull-right" style="padding: 10px 15px 0 15px;">
				<a class="btn btn-bitbucket"> 退出 </a> <a class="btn btn-bitbucket">
					返回 </a>
			</div>
		</header>
		<div class="container">
				<div class="row featurette team">
		          <h2>CIDM背后的那些人</h2>
		          <p>CIDM的进步离不开其背后那些人的卓越贡献，他们有着不同的技能，来自不同的岗位甚至不同的公司。</p>
		          
		          <!-- 研发  -->
		          <h2>研发</h2>
		          <div class="row">
		            <div class="col-md-2 text-center">
		              <img class="img-circle" src="${ctxContents }/resource/dist/img/linfeng.jpg">
		              <h2><a href="#" target="_blank">林峰</a></h2>
		              <p>百度资深前端研发工程师</p>
		            </div>
		             <div class="col-md-2 text-center">
		              <img class="img-circle" src="${ctxContents }/resource/dist/img/linfeng.jpg">
		              <h2><a href="#" target="_blank">林峰</a></h2>
		              <p>百度资深前端研发工程师</p>
		            </div>
		             <div class="col-md-2 text-center">
		              <img class="img-circle" src="${ctxContents }/resource/dist/img/linfeng.jpg">
		              <h2><a href="#" target="_blank">林峰</a></h2>
		              <p>百度资深前端研发工程师</p>
		            </div>
		            
		          </div>
		          
		          
		          
		         
		         
		       
		          
		        
	      	</div>
				<div class="jumbotron">
			        <h1>加入我们!</h1>
			        <p class="lead">联系方式：13911111110</p>
			        <p class="lead">联系地址:XXXXXXXXXX</p>
			        <a class="btn btn-large btn-danger" href="mailto:echarts(a)baidu.com"><i class="glyphicon glyphicon-envelope"></i> Contact Us »</a>
			      </div>
		</div>
	<footer>© 2016 中信国安. All rights reserved</footer>
	</body>
</html>
