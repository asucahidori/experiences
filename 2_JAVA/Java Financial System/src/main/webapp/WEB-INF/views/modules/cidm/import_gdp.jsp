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
		<!-- end: CLIP-TWO CSS -->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
		<script type="text/javascript" src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/modernizr/modernizr.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/jquery-cookie/jquery.cookie.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/switchery/switchery.min.js"></script>
		<!-- end: MAIN JAVASCRIPTS -->
		<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<script type="text/javascript" src="${ctxContents }/vendor/Chart.js/Chart.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/jquery.sparkline/jquery.sparkline.min.js"></script>
		<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<!-- start: CLIP-TWO JAVASCRIPTS -->
		<script type="text/javascript" src="${ctxContents }/assets/js/main.js"></script>
		<!-- start: JavaScript Event Handlers for this page -->
		<!--<script src="${ctxContents }/assets/js/index.js"></script> -->
        <script type="text/javascript" src="${ctxContents }/vendor/maskedinput/jquery.maskedinput.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/autosize/autosize.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/selectFx/classie.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/selectFx/selectFx.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/select2/select2.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/vendor/bootstrap-timepicker/bootstrap-timepicker.min.js"></script>
		<script type="text/javascript" src="${ctxContents }/assets/js/form-elements.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/echarts-all.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/report.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/reportData.js"></script>
        
        <script type="text/javascript" src="${ctxContents }/master/js/loadLinkageData.js"></script>
	</head>
	<!-- end: HEAD -->
	<body>
		<form name="fmName" id="fmName"  method="POST" enctype="multipart/form-data" accept-charset="utf-8">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" align="center"> 
					<tr>
					   <td> 年份<font color="red">*</font></td>
					   <td>
					   		<select id="myYear" name="myYear"></select> 
					   </td>
				  	</tr>
					<tr>
					   <td> 导入<font color="red">*</font></td>
					   <td>
					      <input type="file" name="file" id="exFile"  />
					      <input type="submit" value="导  入" onclick="importFile()"/>
					   </td>
				  	</tr>
				</table>
	    </form>
	    <script>
	     function importFile()
	     {
	        var file = $("#exFile").val();
			if(file=="" || file == null)
			{
				alert("请选择要导入的文件!");
				return ;
			}
			var myYear = $("#myYear").val();
			if(myYear=="" || myYear == null)
			{
				alert("请选择年份!");
				return ;
			}
	        document.fmName.action =  "${request.contextPath}/discovery/importGdp/importGdp";
	        document.fmName.submit();
	     }
	     
	     window.onload=function(){ 
	    	//设置年份的选择 
	    	var myDate= new Date(); 
	    	var startYear=myDate.getFullYear()-50;//起始年份 
	    	var endYear=myDate.getFullYear()+50;//结束年份 
	    	var obj=document.getElementById('myYear') 
	    	for (var i=startYear;i<=endYear;i++) 
	    	{ 
	    	obj.options.add(new Option(i,i)); 
	    	} 
	    	obj.options[obj.options.length-51].selected=1; 
	    	} 
	    </script>
	</body>
</html>
