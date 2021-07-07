<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>国安大数据</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet"
	href="${ctxContents }/resource/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="${ctxContents }/resource/dist/css/AdminLTE.min.css">

<link rel="stylesheet"
	href="${ctxContents }/resource/dist/css/dn-css.css">
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
		<c:import url='header.jsp' />
		<%-- <header class="main-header clearfix">
			<div class="head_logo pull-left" style="padding: 10px 15px 0 15px;">
				<a href="#"><img
					src="${ctxContents }/resource/dist/img/logo.png" alt="国安大数据"></a>
			</div>
			<div class="head_btn pull-right" style="padding: 10px 15px 0 15px;">
				<a class="btn btn-bitbucket"> 退出 </a> <a class="btn btn-facebook">
					返回 </a>
			</div>
		</header> --%>
		<!-- Left side column. contains the logo and sidebar -->

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper1">

			<!-- Main content -->
			<section class="content">
				<!-- Small boxes (Stat box) -->
				<div class="row">
					<div class="col-lg-3 col-xs-12 connectedSortable">

						<div class="dash-unit box">
							<div class="box-header">
								<h3>国安社区订单(单位:万元)</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body">
								<div class="eacher" id="communityUserOrderByDate"
									style="height: 250px; width: 100%"></div>
							</div>
						</div>



						<div class="dash-unit box">
							<div class="box-header">
								<h3>国安社区用户量(单位:人)</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body">
								<div class="dnlr clearfix" id="communityUserCapacityByDate">
								</div>

								<!-- 	<div class="dnstrL">
										<p>总人数</p>
										<p>2000万人</p>
										<span style="margin-top:75px; display: inline-block;">各区用户量排名</span>
									</div>
									<div class="dnstrR">
										<div id="scrollDiv">
											<ul>
												<li>
													<div class="clearfix">
														<span class="pull-left">东城区</span>
														<small class="pull-right"><span>10</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 80%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">西城区</span>
														<small class="pull-right"><span>9</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 75%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">朝阳区</span>
														<small class="pull-right"><span>8</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 70%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">丰台区</span>
														<small class="pull-right"><span>7</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 65%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">石景山区</span>
														<small class="pull-right"><span>6</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 60%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">海淀区</span>
														<small class="pull-right"><span>5</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 50%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">门头沟区</span>
														<small class="pull-right"><span>4</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 45%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">平谷区</span>
														<small class="pull-right"><span>5</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 50%;"></div>
													</div>
												</li>
												<li>
													<div class="clearfix">
														<span class="pull-left">顺义区</span>
														<small class="pull-right"><span>4</span>万人</small>
													</div>
													<div class="progress xs">
														<div class="progress-bar progress-bar-blue" style="width: 45%;"></div>
													</div>
												</li>

											</ul>
										</div>

										<div class="scroltit">
											<div class="updown" id="but_down">向上</div>
											<div class="updown" id="but_up">向下</div>
										</div>

									</div> -->
							</div>
						</div>
						<div class="dash-unit box">
							<div class="box-header">
								<h3>各区住房房价(单位:万元)</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body">
								<div class="dnlr clearfix" id="housingPricesByArea"></div>

								<!-- <div class="dnstrL" style="text-align: center;">
										<p style="color: #b3c8d1; margin-top: 25px;">平均房价</p>
										<p><span style="font-size: 22px;">19.00</span>万人</p>
										<span style="margin-top:115px; display: inline-block;color: #b3c8d1;">性别结构</span>
									</div>
									<ul class="dnstrR" style="margin-top: 10px;">
										<li>
											<div class="clearfix">
												<span class="pull-left">东城区</span>
												<small class="pull-right"><span>51000</span>元/平</small>
											</div>
											<div class="progress xs">
												<div class="progress-bar progress-bar-blue" style="width: 80%;"></div>
											</div>
										</li>
										<li>
											<div class="clearfix">
												<span class="pull-left">西城区</span>
												<small class="pull-right"><span>61000</span>元/平</small>
											</div>
											<div class="progress xs">
												<div class="progress-bar progress-bar-blue" style="width: 65%;"></div>
											</div>
										</li>
										<li>
											<div class="clearfix">
												<span class="pull-left">朝阳区</span>
												<small class="pull-right"><span>55000</span>元/平</small>
											</div>
											<div class="progress xs">
												<div class="progress-bar progress-bar-blue" style="width: 50%;"></div>
											</div>
										</li>
									</ul>
									<ul class="dnstrR" style="margin-top: 55px;">
										<li>
											<div class="clearfix">
												<span class="pull-left">男</span>
												<small class="pull-right"><span>68.2%</span></small>
											</div>
											<div class="progress xs">
												<div class="progress-bar progress-bar-blue" style="width:68.2%;"></div>
											</div>
										</li>
										<li>
											<div class="clearfix">
												<span class="pull-left">女</span>
												<small class="pull-right"><span>31.8%</span></small>
											</div>
											<div class="progress xs">
												<div class="progress-bar progress-bar-blue" style="width: 31.8%;"></div>
											</div>
										</li>
									</ul> -->

							</div>

						</div>

					</div>
					<!-- ./col -->
					<div class="col-lg-6 col-xs-12">
						<div class="row">
							<div class="col-lg-2  col-xs-1">
								<div class="dropdown dnSelChart">
									<span>请选择图表 <i class="fa fa-sort-desc"></i></span>
									<ul class="dropdown-menu dnselChartList" id="selChartList"
										style="display: none;">
										<h4>人口属性</h4>
										<li><a href="javascript:;" dataValue="nCharts1">总人口</a></li>
										<li><a href="javascript:;" dataValue="nCharts2">户数</a></li>
										<li><a href="javascript:;" dataValue="nCharts3">人口密度</a></li>
										<li><a href="javascript:;" dataValue="nCharts4">性别分布</a></li>
										<li><a href="javascript:;" dataValue="nCharts5">年龄分布</a></li>
										<li><a href="javascript:;" dataValue="nCharts6">教育水平</a></li>
									</ul>
								</div>

							</div>
							<div class="col-lg-3 col-xs-4  heig50" style="padding-left: 4%;">
								<p class="font18">本年度国安社区累计订单总量</p>
								<p>
									<b class="bigfont" id="orderSum"></b>万件
								</p>
								<div style="width: 90%;">
									<div class="progress xs">
										<div class="progress-bar progress-bar-blue"
											style="width: 55%; background: #d8361b;"></div>
									</div>
								</div>
								<p id="contrastOrder"></p>
							</div>
							<div class="col-lg-3 col-xs-4  heig50" style="padding-left: 4%;">
								<p class="font18">本年度国安社区累计订单收入</p>
								<p>
									<b class="bigfont" id="sumPrice"></b>万元
								</p>
								<div style="width: 90%;">
									<div class="progress xs">
										<div class="progress-bar progress-bar-blue"
											style="width: 30%; background: #d26666;"></div>
									</div>
								</div>
								<p id="contrastPrice"></p>
							</div>
							<div class="col-lg-3 col-xs-4  heig50" style="padding-left: 4%;">
								<p class="font18">本年度国安社区累计客户人数</p>
								<p>
									<b class="bigfont" id="sumCustomer"></b>万人
								</p>
								<div style="width: 90%;">
									<div class="progress xs">
										<div class="progress-bar progress-bar-blue"
											style="width: 85%; background: #f7b4a9;"></div>
									</div>
								</div>
								<p id="contrastCustomer"></p>
							</div>
						</div>
						<c:import url='/navigateBar' />
						<div class="row">
							<div class="col-xs-12">
								<div class="nav-tabs-custom">
									<!-- <ul class="nav nav-tabs">
										<li class="active"><a href="#fa-icons" data-toggle="tab">社区地图</a></li>
										<li><a href="#glyphicons" data-toggle="tab">地图</a></li>
									</ul> -->
									<div class="tab-content">
										<!-- Font Awesome Icons -->
										<div class="tab-pane active" id="fa-icons">
											<div id="main" style="width: 100%; height: 540px;"></div>
										</div>
										<!-- /#fa-icons -->


										<!-- <div class="tab-pane" id="glyphicons">2222</div> -->


									</div>
									<!-- /.tab-content -->
								</div>
								<!-- /.nav-tabs-custom -->
							</div>

						</div>


						<div class="mapInfo clearfix">
							<div class="mapILeft">
								<h4>国安社区用户/潜力用户</h4>
								<p class="bigfont" style="margin: 5px 0 10px 0;">
									<span id="countUser">0万/0万</span>
								</p>
								<table border="0" cellspacing="0" cellpadding="0"
									style="font-size: 14px">
									<tr>
										<td width="85">人均收入:</td>
										<td width="90"><span id="pincome">0万/年</span></td>
										<td width="85">核心家庭:</td>
										<td width="70"><span id="nuclearFamily">0</span></td>
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
									<div class="knob-label" style="color: #9a311c">门店数量</div>
									<input id="storeNumber" type="text" class="knob"
										data-thickness="0.2" data-angleArc="250"
										data-angleOffset="-125" value="30" data-width="109"
										data-height="100" data-fgColor="#9a311c">

								</div>
								<div class="col-md-4  text-center">
									<div class="knob-label" style="color: #f26b4d">社区用户量</div>
									<input id="customerNumber" type="text" class="knob"
										data-thickness="0.2" data-angleArc="250"
										data-angleOffset="-125" value="30" data-width="109"
										data-height="100" data-fgColor="#f26b4d" data-min="-100"
										data-max="100000">

								</div>
								<div class="col-md-4  text-center">
									<div class="knob-label" style="color: #d76366">社区订单额</div>
									<input id="ordersum" type="text" class="knob"
										data-thickness="0.2" data-angleArc="250"
										data-angleOffset="-125" value="99" data-width="109"
										data-height="109" data-fgColor="#d76366" data-min="-100"
										data-max="2000000">

								</div>

							</div>
						</div>
					</div>
					<!-- ./col -->
					<div class="col-lg-3 col-xs-12 connectedSortable">
						<div class="dash-unit box">
							<div class="box-header">
								<h3>人均可支配收入支出(单位:万元)</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body">
								<div class="eacher" id="income"
									style="height: 250px; width: 100%"></div>
							</div>
						</div>
						<div class="dash-unit box">
							<div class="box-header">
								<h3>各区性别结构(单位:万元)</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body">
								<div class="eacher" id="sexStructure"
									style="width: 100%; height: 255px;"></div>
							</div>


						</div>
						<div class="dash-unit box">
							<div class="box-header">
								<h3>各区国安社区用户(单位:人)</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body">

								<div class="eacher" id="communityUserCapacityByArea"
									style="height: 250px; width: 100%"></div>
							</div>



						</div>
					</div>
					<!-- ./col -->
				</div>
				<!-- /.row -->
				<!-- Main row -->
				<div class="row " id="listBox">
					<!--<div class='col-lg-3 col-xs-12 connectedSortable'>
							
					
					</div>-->
				</div>

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		<!-- <footer>© 2016 中信国安. All rights reserved &nbsp;&nbsp;<a href="#">关于我们</a>&nbsp;&nbsp;<a href="#">帮助文档</a></footer> -->
		<c:import url='footer.jsp' />
	</div>
	<!-- ./wrapper -->
	<!-- jQuery 2.1.4 -->
	<script src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script src="${ctxContents }/resource/dist/js/excanvas.js"></script>
	<script src="${ctxContents }/resource/dist/js/jquery.knob.js"></script>
	<!-- Bootstrap 3.3.5 -->
	<script src="${ctxContents }/resource/bootstrap/js/bootstrap.min.js"></script>


	<!-- Sparkline -->
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/highcharts-3d.js"></script>
	<script src="http://cdn.hcharts.cn/highcharts/themes/dark-unica.js"></script>
	<script src="${ctxContents }/resource/dist/js/jq_scroll.js"
		type="text/javascript" charset="utf-8"></script>
	<script src="${ctxContents }/resource/dist/js/dn-echarts.js"
		type="text/javascript" charset="utf-8"></script>

	<script src="${ctxContents }/vendor/Chart.js/Chart.min.js"></script>

	<script type="text/javascript" src="${ctxContents }/master/js/esl.js"></script>

	<script type="text/javascript"
		src="http://webapi.amap.com/maps?v=1.3&key=369f6f5b1e98da4dadc70c3fa53bd66f&plugin=AMap.Geocoder"></script>
	<script type="text/javascript"
		src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
	<%-- --%>
	<script type="text/javascript"
		src="${ctxContents }/master/js/echarts-all.js"></script>

	<script type="text/javascript" src="${ctxContents }/master/js/red.js"></script>
	
	<script type="text/javascript"
		src="${ctxContents }/master/js/report.js"></script>
	<script type="text/javascript"
		src="${ctxContents }/master/js/reportData.js"></script>
	<script type="text/javascript"
		src="${ctxContents }/master/js/loadCoreData.js"></script>
	<script type="text/javascript"
		src="${ctxContents }/resource/dist/js/app.js"></script>
<script type="text/javascript"
		src="${ctxContents }/resource/dist/js/dnJs.js"></script>


	<script>
		getUsersOrders('1', '1');
		getUsersCount('1', '1', null);
		loadIncomeExpenditure('1', '1');
		getAreaHomePriceByArea('1', 'cityHomePriceCountry', '1');
		getChartSexData('1', 'countrysexcount', '1');
		getEveryArea('1', '1');
		initSumOrser('1', '1', null, null, null, null, null);
		initContrastOrser('1', '1', null, null, null, null, null);
		initContrastCustomer('1','1');
		initContrastPrice('1','1');
		var dataArray = [];
		//加载地图数据
		initMapOfChina();
		function initMapOfChina() {
			//1.加载地图数据
			$.ajax({
				async : false,
				type : "POST",
				url : "${basePath }/CIDM/map/mapOfChina",
				data : "",
				success : function(msg) {
					if (msg != null) {
						dataArray = msg;
						//dataArray = [{name: '北京',id:'110100',value: Math.round(Math.random()*1000),selected:true}];

						//异常处理
						showErrorMessage(dataArray[0]);

						var data = "areaType=1&" + "id=1";
						getCoreData(data, "北京");
					}
				}
			});
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
						},
						/* borderColor : 'rgba(100,149,237,1)', */
						borderWidth : 1.5,
					/* areaStyle : {
						color : 'red'
					} */
					},
					emphasis : {
						/* color : "#f9db0e", */
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
			var myChart = ec.init(main, theme);

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
					if (name.indexOf("市") > 0) {
						name = name.replace("市", "");
					}
					if (name.indexOf("省") > 0) {
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
								+ name + "&id=" + myprovince_id + "&gbCode="
								+ gbCode + "&type=3")), "_self"); //这里的 open 方法的 第二个 参数 是传值用的  ， 当然我们也可以这样写 window.open("map9_test02(1).html?ID="+myprovince_id,'');
			});
			myChart.setOption(option);
			window.onresize = myChart.resize;//根据窗口大小自适应
		});
	</script>
</html>