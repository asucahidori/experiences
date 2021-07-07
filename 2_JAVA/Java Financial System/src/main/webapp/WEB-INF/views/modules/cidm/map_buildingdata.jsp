<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>国安大数据-社区</title>
		<!-- Tell the browser to be responsive to screen width -->
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<!-- Bootstrap 3.3.5 -->
		<link rel="stylesheet" href="${ctxContents }/resource/bootstrap/css/bootstrap.min.css">
		<!-- Font Awesome -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		<!-- Ionicons -->
		<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
		<!-- Theme style -->
		<link rel="stylesheet" href="${ctxContents }/resource/dist/css/AdminLTE.min.css">

		<link rel="stylesheet" href="${ctxContents }/resource/dist/css/dn-css.css">
		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
		<style>
			.scroltit {
				height: 26px;
				line-height: 26px;
				padding-bottom: 4px;
				margin-bottom: 4px;
			}
			
			.scroltit h3 {
				width: 100px;
				float: left;
			}
			
			.scroltit .updown {
				float: right;
				width: 32px;
				height: 22px;
				margin-left: 4px
			}
			
			#but_up {
				background: url(dist/img/up.gif) no-repeat 0 0;
				text-indent: -9999px
			}
			
			#but_down {
				background: url(dist/img/down.gif) no-repeat 0 0;
				text-indent: -9999px
			}
		</style>
	</head>

	<body class="hold-transition skin-blue sidebar-mini">
		<div class="wrapper">
			<header class="main-header clearfix">
				<div class="head_logo pull-left" style="padding: 10px 15px 0 15px;">
					<a href="#"><img
						src="${ctxContents }/resource/dist/img/logo.png" alt="国安大数据"></a>
				</div>
				<div class="head_btn pull-right" style="padding: 10px 15px 0 15px;">
					<a class="btn btn-bitbucket"> 退出 </a> <a class="btn btn-facebook">
						返回 </a>
				</div>
			</header>
			<!-- Left side column. contains the logo and sidebar -->

			<!-- Content Wrapper. Contains page content -->
			<div class="content-wrapper1">

				<!-- Main content -->
				<section class="content">
					<!-- Small boxes (Stat box) -->
					<div class="row">
						<div class="col-lg-3 col-xs-12">
							<div class="dash-unit box">
								<div class="box-header">
									<h3>各社区国安社区用户量（单位：人）</h3>
									<div class="box-tools pull-right">
										<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
									</div>
						        </div>
						        <div class="box-body">
						            <div class="eacher" id="communityUserCapacityByDate" style="height: 250px;width:100%"></div>
						        </div>	
							</div>
							
							<div class="dash-unit box">
								<div class="box-header">
									<h3>周边业态分布</h3>
									<div class="box-tools pull-right">
										<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
									</div>
						        </div>
						        <div class="box-body">
						            <div class="dnlr clearfix" id="SurroundinTheFormats"></div>
						        </div>		
							</div>
							<div class="dash-unit box">
								<div class="box-header">
									<h3>住户住宅性质</h3>
									<div class="box-tools pull-right">
										<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
									</div>
						        </div>
						        <div class="box-body">
						            <div class="eacher" id="ResidentialProperties" style="height: 250px;width:100%"></div>
						        </div>	
							</div>
						</div>
						<!-- ./col -->
						<div class="col-lg-6 col-xs-12">
							<div class="row">
								<div class="col-lg-4 col-xs-4  heig50" style="padding-left:4%;">
									<p class="font18">本年度国安社区累计订单总量</p>
									<p><b class="bigfont" id="orderSum"></b>万件</p>
									<div style=" width:90%; ">
									<div class="progress xs">
										<div class="progress-bar progress-bar-blue" style="width: 55%;background:#d8361b; "></div>
									</div>
									</div>
									<p id="contrastOrder"></p>
								</div>
								<div class="col-lg-4 col-xs-4  heig50" style="padding-left:4%;">
									<p class="font18">本年度国安社区累计订单收入</p>
									<p><b class="bigfont" id="sumPrice"></b>万元</p>
									<div style=" width:90%; ">
									<div class="progress xs">
										<div class="progress-bar progress-bar-blue" style="width: 30%;background: #d26666; "></div>
									</div>
									</div>
									<p id="contrastPrice"></p>
								</div>
								<div class="col-lg-4 col-xs-4  heig50" style="padding-left:4%;">
									<p class="font18">本年度国安社区累计客户人数</p>
									<p><b class="bigfont" id="sumCustomer"></b>万人</p>
									<div style=" width:90%; ">
									<div class="progress xs">
										<div class="progress-bar progress-bar-blue" style="width: 85%;background: #f7b4a9; "></div>
									</div>
									</div>
									<p id="contrastCustomer"></p>
								</div>
							</div>
							<c:import url='/navigateBar' />
							<div class="row">
									<div class="col-xs-12">
              <div class="nav-tabs-custom">
               <!--  <ul class="nav nav-tabs">
                  <li class="active"><a href="#fa-icons" data-toggle="tab">社区地图</a></li>
                  <li><a href="#glyphicons" data-toggle="tab">地图</a></li>
                </ul> -->
                <div class="tab-content">
                  <!-- Font Awesome Icons -->
                  <div class="tab-pane active" id="fa-icons">
                  <div id="main" style="width: 100%; height: 530px;"></div>
                  </div><!-- /#fa-icons -->

                  
                  <!-- <div class="tab-pane" id="glyphicons">
					2222
                    </div>-->
                </div><!-- /.tab-content -->
              </div><!-- /.nav-tabs-custom -->
            </div>
							
							</div>
						
											
							<div class="mapInfo clearfix">
								<div class="mapILeft">
									<h4>国安社区用户/潜力用户</h4>
									<p class="bigfont" style="margin:5px 0 10px 0;"><span id="countUser" >0万/0万</span></p>
									<table border="0" cellspacing="0" cellpadding="0" style="font-size:14px">
										<tr>
											<td width="85">人均收入:</td>
											<td width="90"><span id="pincome">0万/年</span></td>
											<td width="85">核心家庭:</td>
											<td width="70"><span id="nuclearFamily">0%</span></td>
										</tr>
										<tr>
											<td>人均支出:</td>
											<td><span id="expend">0万/年</span></td>
											<td>全国排名:</td>
											<td>6</td>
										</tr>
										<tr>
											<td>消费等级:</td>
											<td><span id="comsumeLevel">0级</span></td>
										</tr>
									</table>
								</div>
								<div class="mapIRight">

									<div class="col-md-4  text-center">
										<div class="knob-label" style="color:#9a311c">门店数量</div>
										<input id="storeNumber" type="text" class="knob" data-thickness="0.2" data-angleArc="250" data-angleOffset="-125" value="30" data-width="109" data-height="100" data-fgColor="#9a311c">

									</div>
									<div class="col-md-4  text-center">
										<div class="knob-label" style="color:#f26b4d">社区用户量</div>
										<input id="customerNumber" type="text" class="knob" data-thickness="0.2" data-angleArc="250" data-angleOffset="-125" value="30" data-width="109" data-height="100" data-fgColor="#f26b4d" data-min="-100" data-max="100000">

									</div>
									<div class="col-md-4  text-center">
										<div class="knob-label" style="color:#d76366">社区订单额</div>
										<input id="ordersum" type="text" class="knob" data-thickness="0.2" data-angleArc="250" data-angleOffset="-125" value="99" data-width="109" data-height="109" data-fgColor="#d76366" data-min="-100" data-max="2000000">

									</div>

								</div>
							</div>
						</div>
						<!-- ./col -->
						<div class="col-lg-3 col-xs-12">
							<div class="dash-unit box">
								<div class="box-header">
									<h3>国安社区分月订单额（单位：元）</h3>
									<div class="box-tools pull-right">
										<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
									</div>
						        </div>
						        <div class="box-body">
						            <div class="eacher" id="communityUserOrderByDate" style="width:100%;height:255px;"></div>
						        </div>	
							</div>
							
							<div class="dash-unit box">
								<div class="box-header">
									<h3>各社区写字楼平均租金（单位：元/㎡/天）</h3>
									<div class="box-tools pull-right">
										<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
									</div>
						        </div>
						        <div class="box-body">
						            <div class="eacher" id="OfficeRentsByArea" style="height: 250px;width:100%"></div>
						        </div>		
							</div>
							<div class="dash-unit box">
								<div class="box-header">
									<h3>住宅房价（单位：元/平米）</h3>
									<div class="box-tools pull-right">
										<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
									</div>
						        </div>
						        <div class="box-body">
						            <div class="eacher" id="housingPricesByDate" style="height: 250px;width:100%"></div>
						        </div>			
							</div>
						</div>
						<!-- ./col -->
					</div>
					<!-- /.row -->
					<!-- Main row -->

				</section>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
			<footer>© 20162016 中信国安. All rights reserved</footer>
		</div>
		<!-- ./wrapper -->
		<script type="text/javascript" src="${ctxContents }/resource/js/coordtransform.js"></script>
		<!-- jQuery 2.1.4 -->
		<script src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
		<!-- jQuery UI 1.11.4 -->
		<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
		<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->

		<!-- Bootstrap 3.3.5 -->
		<script src="${ctxContents }/resource/bootstrap/js/bootstrap.min.js"></script>

		<script src="${ctxContents }/resource/dist/js/jquery.knob.js"></script>
		<!-- Sparkline -->
		<script src="https://code.highcharts.com/highcharts.js"></script>
		<script src="https://code.highcharts.com/highcharts-3d.js"></script>
		<script src="http://cdn.hcharts.cn/highcharts/themes/dark-unica.js"></script>
		<script src="${ctxContents }/resource/dist/js/jq_scroll.js" type="text/javascript" charset="utf-8"></script>
		<script src="${ctxContents }/resource/dist/js/dn-echarts.js" type="text/javascript" charset="utf-8"></script>

		<script src="${ctxContents }/vendor/Chart.js/Chart.min.js"></script> 
		<script type="text/javascript" src="${ctxContents }/master/js/esl.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=369f6f5b1e98da4dadc70c3fa53bd66f&plugin=AMap.Geocoder"></script>
		<script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
		
		<script type="text/javascript" src="${ctxContents }/master/js/echarts-all.js"></script>
		<script type="text/javascript" src="${ctxContents }/master/js/red.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/report.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/reportData.js"></script>
        <script type="text/javascript" src="${ctxContents }/master/js/loadCoreData.js"></script>
		<script type="text/javascript" src="${ctxContents }/resource/dist/js/app.min.js"></script>
		<script>
			$(function() {
				/* jQueryKnob */

				$(".knob").knob({
					/*change : function (value) {
					 //console.log("change : " + value);
					 },
					 release : function (value) {
					 console.log("release : " + value);
					 },
					 cancel : function () {
					 console.log("cancel : " + this.value);
					 },*/
					draw: function() {

						// "tron" case
						if (this.$.data('skin') == 'tron') {

							var a = this.angle(this.cv) // Angle
								,
								sa = this.startAngle // Previous start angle
								,
								sat = this.startAngle // Start angle
								,
								ea // Previous end angle
								, eat = sat + a // End angle
								,
								r = true;

							this.g.lineWidth = this.lineWidth;

							this.o.cursor && (sat = eat - 0.3) && (eat = eat + 0.3);

							if (this.o.displayPrevious) {
								ea = this.startAngle + this.angle(this.value);
								this.o.cursor && (sa = ea - 0.3) && (ea = ea + 0.3);
								this.g.beginPath();
								this.g.strokeStyle = this.previousColor;
								this.g.arc(this.xy, this.xy, this.radius - this.lineWidth, sa, ea, false);
								this.g.stroke();
							}

							this.g.beginPath();
							this.g.strokeStyle = r ? this.o.fgColor : this.fgColor;
							this.g.arc(this.xy, this.xy, this.radius - this.lineWidth, sat, eat, false);
							this.g.stroke();

							this.g.lineWidth = 2;
							this.g.beginPath();
							this.g.strokeStyle = this.o.fgColor;
							this.g.arc(this.xy, this.xy, this.radius - this.lineWidth + 1 + this.lineWidth * 2 / 3, 0, 2 * Math.PI, false);
							this.g.stroke();

							return false;
						}
					}
				});
				/* END JQUERY KNOB */
				/*向上向下滚动*/
				$("#scrollDiv").Scroll({
					line: 1,
					speed: 500,
					timer: 3000,
					up: "but_up",
					down: "but_down"
				});

			});
		
			//var bd09togcj02 = coordtransform.bd09togcj02(116.404, 39.915);
			var map = new AMap.Map('main',{
		        resizeEnable: true,
		        //center: bd09togcj02,
		        zoom: 12
	   		});
			var markerArr = null;
			var markerOffArr = null;
			var keyword = "${name}";
			var type = "${type}";
			var gaodeCoordinates=null;
			
			function searchByStationName() {
		        var geocoder = new AMap.Geocoder({
		            city: "010", //城市，默认：“全国”
		            radius: 1000 //范围，默认：500
		        });
		        //地理编码,返回地理编码结果
		        geocoder.getLocation(keyword, function(status, result) {
		            if (status === 'complete' && result.info === 'OK') {
		                geocoder_CallBack(result);
		            }
		        });
		    }
		    function addMarker(i, d) {
		        var loc = [d.location.getLng(), d.location.getLat()];
		        if(type=="4"){
		        	map.setZoomAndCenter(13, [d.location.getLng(), d.location.getLat()]);
		        	/* var marker = new AMap.Marker({
			            map: map,
			            position: [d.location.getLng(), d.location.getLat()]
			        }); */
				}else{
					map.setZoomAndCenter(22, [d.location.getLng(), d.location.getLat()]);
					/* var marker = new AMap.Marker({
			            map: map,
			            position: [d.location.getLng(), d.location.getLat()]
			        });
					marker.on("click", function(e) {
						location.href=encodeURI(encodeURI("${ctxContents }/map/toBuilding"));
	 			   }); */
				}
		        
		        addMarkers();
		        addOverlay();
		      
		    }
		    //地理编码返回结果展示
		    function geocoder_CallBack(data) {
		        //地理编码结果数组
		        var geocode = data.geocodes;
		        for (var i = 0; i < geocode.length; i++) {
		            //拼接输出html
		            addMarker(i, geocode[i]);
		        }
		        if (document.createElement('canvas') && document.createElement('canvas').getContext && document.createElement('canvas').getContext('2d')) {
		            // 实例化3D楼块图层
		            var buildings = new AMap.Buildings();
		            // 在map中添加3D楼块图层
		            buildings.setMap(map);
		        } else {
		            document.getElementById('tip').innerHTML = "对不起，运行该示例需要浏览器支持HTML5！";
		        }
		        map.setFitView();
		    }
		    function addMarkers(){
			 	var markers = [];
			     if(markerArr!=null&&markerArr!=undefined){
			     	for (var i = 0; i < markerArr.length; i++) {  
				     		//var p0 = markerArr[i].longitudeX;  
				            //var p1 = markerArr[i].longitudeY; 
				            var p0 = markerArr[i].gaodeLat;  
				            var p1 = markerArr[i].gaodeLng;  
	 						if(null==p0){
	 							continue;
				            }
				            //var bd09togcj01 = coordtransform.bd09togcj02(p0, p1);
				            bd09togcj01 = [p0, p1];
				            /* if(markerArr[i].areaName=="左家庄街道"){
								var sss = bd09togcj01;
								continue;
							} */
				            var marker;
							marker = new AMap.Marker({
								position: bd09togcj01,
								offset: new AMap.Pixel(-12,-12),
								zIndex: 101,
								title: markerArr[i].areaName,
								map: map
							});
							
							/* var _onMouseover = function(e){
							    var ss = e.target;
								var type = "${type}";
								var data = "id="+ ss.id+"&areaType="+type;
								getCoreData(data,ss.name);
								//var x = String(e.pixel.x);
								//var y = String(e.pixel.y);
								var x = parseInt(e.pixel.x);
								var y = parseInt(e.pixel.y);
								//x=x.substring(0,x.indexOf("."));
								//y=y.substring(0,y.indexOf("."));
								//show(x+80,y+150,ss.id,ss.name,ss.type);
								var url = "${ctxContents }/map/toReportPage?name=" + ss.name + "&id="+ ss.id + "&type="+ss.type+"&tinyVillageId=0";
								 var infoWindow = new AMap.InfoWindow({
								     content: "<i class='fa fa-bar-chart'></i>&nbsp;&nbsp;数据报告,<a href='"+encodeURI(encodeURI(url))+"'>&nbsp;点击详情>></a>",
								     offset: {x: 0, y: -15}
								 });
								infoWindow.open(map, ss.getPosition()); 
							}
						    AMap.event.addListener(marker, 'mouseover', _onMouseover); */
							
							markers.push(marker);
				            
				            
				        }  
			 	}
			 	
			 }
		     
		    
		    
		    //获得动态数据
	        function getMarkPointDatas(id,name,type){
	        	//$.ajax带json数据的异步请求
	        	var ajaxURL = basePath+"/CIDM/map/getBaiduMap";
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
			
	        //获得动态数据
	        function getMapWithBLOBsGaode(id){
	        	$.ajax({
	        		type : "post",
	        		url : basePath + "/CIDM/areaData/selectMapWithBLOBsGaode",
	        		dataType : "json",
	        		data : {
	        			areacode : id
	        		},
	        		success : function(result) {
	        			if (result.success) {
	        				if (result.data.length > 0) {
	        					gaodeCoordinates = result.data[0];
	        				}
	        			}else{
	        				alert("失败:" + result.data[0].message);
	        			}
	        		},
	        		error : function(XMLHttpRequest, textStatus, errorThrown) {
	        			alert("请求异常，请检查服务器是否正常运行！" + XMLHttpRequest.status + "  "
	        					+ XMLHttpRequest.readyState + "  " + textStatus);
	        		}
	        	});
	    	  
	        }
		    
		    function addOverlay(){
		       var gaodeCoordinate = gaodeCoordinates.replace("[[","").replace("]]","").split("],[");
		       
		       var polygonArr = new Array();
		       for(var i=0;i<gaodeCoordinate.length;i++){
		    	   var Arr = new Array();
		    	   var str = gaodeCoordinate[i];
		    	   Arr.push(str.substring(0,str.indexOf(",")));
		    	   Arr.push(str.substring(str.indexOf(",")+1));
		    	   polygonArr.push(Arr);
		       }
	           var  polygon = new AMap.Polygon({
	                path: polygonArr,//设置多边形边界路径
	                strokeColor: "#FF33FF", //线颜色
	                strokeOpacity: 0.2, //线透明度
	                strokeWeight: 3,    //线宽
	                fillColor: "#1791fc", //填充色
	                fillOpacity: 0.35//填充透明度
	            });
	            polygon.setMap(map);
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
	        	searchByStationName();
	        	getMarkPointDatas("${id}","${name}","${type}");
	        	getMapWithBLOBsGaode("${id}");
	        	var data = "id=${id}&areaType="+type;
				getCoreData(data,"${name}");
	        }
	        loadPageInfo();
			
			/****更换数据展示 start****/
			jQuery(document).ready(function() {
				//Main.init();
				//Index.init();
				//FormElements.init();
			});
			//1. 住户住宅性质
			getHouseholdProperty('${id}','areaHomeProperty');
			//getHouseholdProperty('58','areaHomeProperty');
			
			//2. 国安社区总用户量（单位：人）
			getUsersCount('${id}', '${type}',null);
			//getUsersCount('58', '5',null);
			
			//3. 住宅房价（单位：元/平米）
			getAreaHomePriceByDate('${id}','villageHomePrice');
			//getAreaHomePriceByDate('58','villageHomePrice');
			
			//4. 国安社区分月订单额（单位：元）
			getUsersOrders('${id}', '${type}');
			//getUsersOrders('58', '4');
			
			
			//7. 周边业态分布
			getStreetSurroundState('${id}','streetSurroundState');
			//getStreetSurroundState('58','streetSurroundState');
			
			//8. 各社区写字楼平均租金（单位：元/㎡/天）
			getVillageOfficeRents('${id}','villageAverageRent');
			//getVillageOfficeRents('58','villageAverageRent');
			
			initSumOrser('1','1','5','${id}',null,null,null);
			initContrastOrser('1','1','5','${id}',null,null,null);
			/****更换数据展示 end****/
		</script>

</html>