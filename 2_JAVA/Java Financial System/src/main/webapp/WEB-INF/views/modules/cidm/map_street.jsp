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
<link rel="stylesheet" href="${ctxContents }/assets/css/styles.css">
<link rel="stylesheet" href="${ctxContents }/assets/css/plugins.css">
<link rel="stylesheet" href="${ctxContents }/assets/css/themes/theme-1.css" id="skin_color" />
<link rel="stylesheet" href="${ctxContents }/assets/css/add.css">
<!-- end: CLIP-TWO CSS -->
<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
</head>
<!-- end: HEAD -->
<style type="text/css">
.app-navbar-fixed {
    padding-top: 55px;
}
</style>
<body>
<c:import url='/navbar' />
<div id="app"> 
  <div class="app-content"> 
    <div class="main-content  main-content_map" >
      <c:import url='/navigateBar' />
      <div class="wrap-content container" id="container"> 
        <!-- start: FEATURED BOX LINKS --> 
        <!-- end: FEATURED BOX LINKS --> 
        <!-- start: map -->
        <div class="row row_bg">
          <div class="col-lg-9">
          	<div class="map_bg">
	            <div class="map_region">
	              	<div class="partition-light-grey padding-15 text-center margin-bottom-20 map_search" style="display:none;">
						<input type="text" id="suggestId" size="30" value="百度" style="display:none;"/> <input type="button" value="查询" onclick="searchByStationName();" style="display:none;"/>
					</div>
	              	<div class="panel-body" id="containerMap"></div>
	               <div class="map_lick" id="dataReport" style="display:none;"><i class="fa fa-bar-chart map_font"></i><span class="s_data">数据报告，<a href="report_street.html" id="clickDetail">点击详情&gt;&gt;</a></span></div>
	            </div>
	       	 </div>
          </div>
          <!-- 核心数据 -->
          <c:import url='/coreData' />
        </div>
        <!--row--><!-- end:  map --> 
        
      </div>
      <!--头部以上的三个DIV1--> 
    </div>
    <!--头部以上的三个DIV2--> 
  </div>
  <!--app-content DIV--> 
  
  <!-- start: FOOTER -->
  <footer class="footer_map">
    <div class="footer-inner">
      <div class="pull-left"> &copy; <span class="current-year"></span><span class="text-bold text-uppercase">2016 中信国安</span>. <span>All rights reserved</span> </div>
      <div class="pull-right"> <span class="go-top"><i class="ti-angle-up"></i></span> </div>
    </div>
  </footer>
  <!-- end: FOOTER --> 
  <!-- start: OFF-SIDEBAR --> 
  <!-- end: OFF-SIDEBAR --> 
  <!-- start: SETTINGS -->
  <div class="settings panel panel-default hidden-xs hidden-sm" id="settings">
    <button ct-toggle="toggle" data-toggle-class="active" data-toggle-target="#settings" class="btn btn-default"> <i class="fa fa-spin fa-gear"></i> </button>
    <div class="panel-heading"> Style Selector </div>
    <div class="panel-body"> 
      <!-- start: FIXED HEADER -->
      <div class="setting-box clearfix"> <span class="setting-title pull-left"> Fixed header</span> <span class="setting-switch pull-right">
        <input type="checkbox" class="js-switch" id="fixed-header" />
        </span> </div>
      <!-- end: FIXED HEADER --> 
      <!-- start: FIXED SIDEBAR -->
      <div class="setting-box clearfix"> <span class="setting-title pull-left">Fixed sidebar</span> <span class="setting-switch pull-right">
        <input type="checkbox" class="js-switch" id="fixed-sidebar" />
        </span> </div>
      <!-- end: FIXED SIDEBAR --> 
      <!-- start: CLOSED SIDEBAR -->
      <div class="setting-box clearfix"> <span class="setting-title pull-left">Closed sidebar</span> <span class="setting-switch pull-right">
        <input type="checkbox" class="js-switch" id="closed-sidebar" />
        </span> </div>
      <!-- end: CLOSED SIDEBAR --> 
      <!-- start: FIXED FOOTER -->
      <div class="setting-box clearfix"> <span class="setting-title pull-left">Fixed footer</span> <span class="setting-switch pull-right">
        <input type="checkbox" class="js-switch" id="fixed-footer" />
        </span> </div>
      <!-- end: FIXED FOOTER --> 
      <!-- start: THEME SWITCHER -->
      <div class="colors-row setting-box">
        <div class="color-theme theme-1">
          <div class="color-layout">
            <label>
              <input type="radio" name="setting-theme" value="theme-1">
              <span class="ti-check"></span> <span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span> <span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span> </label>
          </div>
        </div>
        <div class="color-theme theme-2">
          <div class="color-layout">
            <label>
              <input type="radio" name="setting-theme" value="theme-2">
              <span class="ti-check"></span> <span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span> <span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span> </label>
          </div>
        </div>
      </div>
      <div class="colors-row setting-box">
        <div class="color-theme theme-3">
          <div class="color-layout">
            <label>
              <input type="radio" name="setting-theme" value="theme-3">
              <span class="ti-check"></span> <span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span> <span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span> </label>
          </div>
        </div>
        <div class="color-theme theme-4">
          <div class="color-layout">
            <label>
              <input type="radio" name="setting-theme" value="theme-4">
              <span class="ti-check"></span> <span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span> <span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span> </label>
          </div>
        </div>
      </div>
      <div class="colors-row setting-box">
        <div class="color-theme theme-5">
          <div class="color-layout">
            <label>
              <input type="radio" name="setting-theme" value="theme-5">
              <span class="ti-check"></span> <span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span> <span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span> </label>
          </div>
        </div>
        <div class="color-theme theme-6">
          <div class="color-layout">
            <label>
              <input type="radio" name="setting-theme" value="theme-6">
              <span class="ti-check"></span> <span class="split header"> <span class="color th-header"></span> <span class="color th-collapse"></span> </span> <span class="split"> <span class="color th-sidebar"><i class="element"></i></span> <span class="color th-body"></span> </span> </label>
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
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.3"></script>
<script type="text/javascript" src="${ctxContents }/master/js/esl.js"></script> 
<script type="text/javascript" src="${ctxContents }/master/js/loadCoreData.js"></script> 
<script>
	
		jQuery(document).ready(function() {
			Main.init();
		});
		function G(id) {
			return document.getElementById(id);
		}

		var map = new BMap.Map("containerMap");
		var point = new BMap.Point(116.3964, 39.9093);

		map.addControl(new BMap.NavigationControl({type: BMAP_NAVIGATION_CONTROL_SMALL}));
		map.centerAndZoom(point, 13);
		
		//第3步：启用滚轮放大缩小  
        map.enableScrollWheelZoom(false);  
        //第4步：向地图中添加缩放控件  
      /*   var ctrlNav = new window.BMap.NavigationControl({  
            anchor: BMAP_ANCHOR_TOP_LEFT,  
            type: BMAP_NAVIGATION_CONTROL_LARGE  
        });  
        map.addControl(ctrlNav);   */
        //第5步：向地图中添加缩略图控件  
        var ctrlOve = new window.BMap.OverviewMapControl({  
            anchor: BMAP_ANCHOR_BOTTOM_RIGHT,  
            isOpen: 1  
        });  
        map.addControl(ctrlOve);  

        //第6步：向地图中添加比例尺控件  
        var ctrlSca = new window.BMap.ScaleControl({  
            anchor: BMAP_ANCHOR_BOTTOM_LEFT  
        });  
        map.addControl(ctrlSca);  
        var markerArr = null;
		var markerOffArr = null;
                        

		/* var ac = new BMap.Autocomplete( //建立一个自动完成的对象
		{
			"input" : "suggestId",
			"location" : map
		}); */


		function setPlace() {// 创建地址解析器实例
			var myGeo = new BMap.Geocoder();// 将地址解析结果显示在地图上,并调整地图视野
			myGeo.getPoint(myValue, function(point) {
				if (point) {
					map.centerAndZoom(point, 16);
					 //第7步：绘制点    
			        for (var i = 0; i < markerArr.length; i++) {  
			            var p0 = markerArr[i].point.split(",")[0];  
			            var p1 = markerArr[i].point.split(",")[1];  
			            var pp =new window.BMap.Point(p0, p1); 
			            var markInfo = new BMap.Marker(pp);
			            map.addOverlay(markInfo);
			        }  
					map.addOverlay(new BMap.Marker(point));
				}
			}, "北京");
		}

		//点击查询按钮
		var localSearch = new BMap.LocalSearch(map);
		localSearch.enableAutoViewport(); //允许自动调节窗体大小
		var keyword = "${name}";
		var type = "${type}";
		function searchByStationName() {
			
			//map.clearOverlays();//清空原来的标注
			
			localSearch.setSearchCompleteCallback(function(searchResult) {
				var poi = searchResult.getPoi(0);
				if(type=="4"){
					map.centerAndZoom(poi.point, 12);
				}else{
					map.centerAndZoom(poi.point, 16);
				}
				
				//var marker = new BMap.Marker(new BMap.Point(poi.point.lng,poi.point.lat)); // 创建标注，为要查询的地方对应的经纬度
				addMarker();
				//map.addOverlay(marker);
				//var marker0 = new BMap.Marker(new BMap.Point("116.457703","39.92843")); // 创建标注，为要查询的地方对应的经纬度
				//map.addOverlay(marker0);
				var content = "经度：" + poi.point.lng + "<br/>纬度：" + poi.point.lat;
				var infoWindow = new BMap.InfoWindow("<p style='font-size:14px;'>" + content + "</p>");
				// marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
				myValue = searchResult.province + searchResult.city;
			});
			localSearch.search(keyword);
		}

		function show(x, y,id,name,type) {
			var report_box = $("#dataReport");
			report_box.css("display", "block");
			var offset = report_box.offset();
			report_box.css("left", x - 210);
			report_box.css("top", y - 200);
			var url = encodeURI(encodeURI("${ctxContents }/map/toReportPage?name="+name+"&id="+id+"&type="+type+"&tinyVillageId=0"));
			$("#clickDetail").attr("href",url);
		}
		
        //获得动态数据
        function getMarkPointDatas(id,name,type){
        	//$.ajax带json数据的异步请求
        	var ajaxURL = basePath+"/discovery/map/getBaiduMap";
			$.ajax({
				type : "POST",
				dataType : "html",
				async : false, //默认为true 异步  
				cache:false,   
				url : ajaxURL,
				data:{  
	                id : id,  
	                type : type 
		        },
				success : function(result) {
					var strresult = eval("(" + result + ")");
					if(strresult.message!=undefined && strresult.message!=null){
						   alert(result.message);
					}
					else{
						markerArr = strresult.list;
						/* if(strresult.officeBuildingMap!=undefined&&strresult.officeBuildingMap!=null){
							markerOffArr = strresult.officeBuildingMap;
						} */
						searchByStationName();
					}
				},
				error : function(data) {
					alert("失败:" + data.message);
				}
			});
        }
        
        // 添加标注  
        function addMarker() { 
        	if(markerArr!=null&&markerArr!=undefined){
	        	for (var i = 0; i < markerArr.length; i++) {  
		            var p0 = markerArr[i].longitudeX;  
		            var p1 = markerArr[i].longitudeY;  
		            var pp =new window.BMap.Point(p0, p1); 
		            var markTmp = new BMap.Marker(pp)
		            markTmp.id = markerArr[i].id;
		            markTmp.type = markerArr[i].type;
		            markTmp.name = markerArr[i].areaName;
					markTmp.addEventListener("click", function() {
						if(7<=markTmp.type){//小区点击转到楼栋页面
							location.href=encodeURI(encodeURI("${ctxContents }/map/toReportPage?name="+this.name+"&id="+this.id+"&type="+this.type+"&tinyVillageId=0"));
							//location.href=encodeURI(encodeURI(basePath+"/discovery/map/toBuildingPage?id="+markTmp.id+"&name="+markTmp.name+"&type="+markTmp.type));
						}
						else{//街道点击到小区
							//$("#suggestId").val(markTmp.name);
							//getMarkPointDatas(markTmp.id,markTmp.name,markTmp.type);
		                	 window.open(encodeURI(encodeURI("<%=basePath %>/discovery/map/toBaiduMap/?name="+this.name+"&id="+this.id+"&type=6")),"_self");  //这里的 open 方法的 第二个 参数 是传值用的  ， 当然我们也可以这样写 window.open("map9_test02(1).html?ID="+myprovince_id,'');
						}
					});
					markTmp.addEventListener("mouseover", function(e) {
						//var data = "{id :"+ markTmp.id+", areaType :"+ markTmp.type+"}";
						var type = "${type}";
						var data = "id="+ this.id+"&areaType="+type;
						getCoreData(data,this.name);
						show(e.clientX, e.clientY,this.id,this.name,this.type);
					});
					
				/* 	markTmp.addEventListener("mouseout", function(e) {
						var report_box = $("#dataReport");
						report_box.css("display", "none");
					}); */
					
		            map.addOverlay(markTmp);
		        }  
        	}
        	/* if(markerOffArr!=null&&markerOffArr!=undefined){
	        	for (var i = 0; i < markerOffArr.length; i++) {  
		            var p0 = markerOffArr[i].longitudeX;  
		            var p1 = markerOffArr[i].longitudeY;  
		            var pp =new window.BMap.Point(p0, p1); 
		            var markTmp = new BMap.Marker(pp)
		            markTmp.id = markerOffArr[i].id;
		            markTmp.type = markerOffArr[i].type;
		            markTmp.name = markerOffArr[i].areaName;
					markTmp.addEventListener("click", function() {
						if(7<=markTmp.type){//小区点击转到楼栋页面
							location.href=encodeURI(encodeURI(basePath+"/discovery/map/toBuildingPage?id="+markTmp.id+"&name="+markTmp.name+"&type="+markTmp.type));
						}
						else{//街道点击到小区
							$("#suggestId").val(markTmp.name);
							getMarkPointDatas(markTmp.id,markTmp.name,markTmp.type);
						}
					});
					markTmp.addEventListener("mouseover", function(e) {
						var data = "{id :"+ markTmp.id+", areaType :"+ markTmp.type+"}";
						getCoreData(data);
						show(e.clientX, e.clientY,markTmp.id,markTmp.name,markTmp.type);
					});
		            map.addOverlay(markTmp);
		        }  
        	} */
        }  

        // 添加信息窗口  
       /*  function addInfoWindow(marker, poi) {  
            //pop弹窗标题  
            var title = '<div style="font-weight:bold;color:#CE5521;font-size:14px">' + poi.title + '</div>';  
            //pop弹窗信息  
            var html = [];  
            html.push('<table cellspacing="0" style="table-layout:fixed;width:100%;font:12px arial,simsun,sans-serif"><tbody>');  
            html.push('<tr>');  
            html.push('<td style="vertical-align:top;line-height:16px;width:38px;white-space:nowrap;word-break:keep-all">地址:</td>');  
            html.push('<td style="vertical-align:top;line-height:16px">' + poi.address + ' </td>');  
            html.push('</tr>');  
            html.push('</tbody></table>');  
            var infoWindow = new BMap.InfoWindow(html.join(""), { title: title, width: 200 });  
            var openInfoWinFun = function () {  
                marker.openInfoWindow(infoWindow);  
            };  
            marker.addEventListener("click", openInfoWinFun);  
            return openInfoWinFun;  
        } */
        //$("#suggestId").val("${name}");
		//$(".map_data_title").html("${name}核心数据");
		
        
        //getMarkPointDatas("${id}","${name}","${type}");
        
        //对选中的区域加遮罩
        function getBoundary(){   
    		var bdary = new BMap.Boundary();
    		bdary.get("${name}", function(rs){       //获取行政区域
    			map.clearOverlays();        //清除地图覆盖物       
    			var count = rs.boundaries.length; //行政区域的点有多少个
    			if (count === 0) {
    				//alert('未能获取当前输入行政区域');
    				return ;
    			}
              	var pointArray = [];
    			for (var i = 0; i < count; i++) {
    				var ply = new BMap.Polygon(rs.boundaries[i], {strokeWeight: 2, strokeColor: "#ff0000"}); //建立多边形覆盖物
    				map.addOverlay(ply);  //添加覆盖物
    				pointArray = pointArray.concat(ply.getPath());
    			}    
    			map.setViewport(pointArray);    //调整视野                 
    		});   
    	}
        
        //页面初始化加载
        function loadPageInfo(){
        	//getBoundary();
        	//调用异步程序获取数据
        	var type = "${type}";
        	if(type=="4"){
        		type="3";
        	}else if(type=="6"){
        		type="4";
        	}
        	getMarkPointDatas("${id}","${name}","${type}");
        	var data = "id=${id}&areaType="+type;
			getCoreData(data,"${name}");
        }
        loadPageInfo();
       
	</script>
		
<!-- end: JavaScript Event Handlers for this page --> 
<!-- end: CLIP-TWO JAVASCRIPTS -->
</body>
</html>
