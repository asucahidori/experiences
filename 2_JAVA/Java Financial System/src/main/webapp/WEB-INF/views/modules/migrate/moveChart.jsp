<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="ECharts">
<meta name="author" content="kener.linfeng@gmail.com">
<title>行人流动统计</title>
<link href="${ctxContents}/assets/echarts/asset/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet" href="${ctxContents }/resource/css/styles.css">
<link rel="stylesheet" href="${ctxContents }/resource/css/add.css">
<link rel="shortcut icon"
	href="${ctxContents}/assets/echarts/asset/ico/favicon.png">
<link
	href="${ctxContents}/assets/echarts/asset/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${ctxContents }/resource/dist/css/bootstrap-datetimepicker.css">
<link href="${ctxContents}/assets/echarts/asset/css/carousel.css"
	rel="stylesheet">
<link href="${ctxContents}/assets/echarts/asset/css/echartsHome.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${ctxContents}/master/js/BMap/jquery.js"></script>
<script src="${ctxContents}/assets/echarts/asset/js/jquery.min.js"></script>
<script src="${ctxContents}/assets/echarts/asset/js/bootstrap.min.js"></script>
<script
	src="${ctxContents }/resource/dist/js/bootstrap-datetimepicker.min.js"></script>
<%-- <script src="${ctxContents}/assets/echarts/build/source/echarts.js"></script> --%>
<!-- <script src="vendor/echarts/asset/js/echartsExample.js"></script> -->
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
<!-- <script type="text/javascript"
		src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script> -->
</head>
<body style="padding: 0px;">
	<c:import url='/navbar' />
	<div class="container-fluid"
		style="padding-top: 60px; background: #fff;">
		<div class="row-fluid example" style="padding: 0px;">
			<!--/span-->
			<p
				style="float: left; margin: 5px 0 15px 15px; height: 30px; line-height: 30px;">选择日期：</p>
			<div class="input-group"
				style="width: 180px; float: left; margin: 5px 0 15px 10px;">
				<input type="text" value="2016-05-11"
					class="form-control form_datetime1">
				<div class="input-group-addon">
					<i class="fa fa-calendar"></i>
				</div>
			</div>
			<!--/span-->
		</div>
		<!--/row-->
	</div>
	<div class="row">
		<div class="col-md-6">
			<c:import url='./lines-bmap-effect.jsp' />
		</div>
		<div id="graphic" class="col-md-6">
			<div id="main" class="main" style="height: 320px;"></div>
			<div id="main1" class="main" style="height: 320px;"></div>
			<div style="display: none;">
				<button type="button" class="btn btn-sm btn-success"
					onclick="refresh(true)">刷 新</button>
				<span class="text-primary">切换主题</span> <select id="theme-select"></select>

				<span id='wrong-message' style="color: red"></span>
			</div>
		</div>
	</div>
</body>
<script>
	$(function() {
		$(".form_datetime1").datetimepicker({
			format : 'yyyy-mm-dd',
			language : 'fr',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		}).on('changeDate', function(ev) {
			/* myChart.restore();
			myChart1.restore(); */
			myChart.refresh();
			myChart1.refresh();
		});
	});
</script>
<script type="text/javascript">
	var myChart = null;
	var myChart1 = null;
	var townName = '${townName}';
	var townId = '${townId}';
	var option = {
		tooltip : {
			trigger : 'axis'
		},
		legend : {
			data : [ '内环方向人数', '外环方向人数', '总人数', '差量人数' ]
		},
		title : {
			color : '#fff',
			text : townName + '北路',
			subtext : '',
			x : 'left'
		},
		toolbox : {
			show : true,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : false
				},
				magicType : {
					show : true,
					type : [ 'line', 'bar', 'stack', 'tiled' ]
				},
				restore : {
					show : true
				},
				saveAsImage : {
					show : true
				}
			}
		},
		calculable : true,
		xAxis : [ {
			name : '时间',
			type : 'category',
			boundaryGap : false,
			data : [ '0:00', '1:00', '2:00', '3:00', '4:00', '5:00', '6:00',
					'7:00', '8:00', '9:00', '10:00', '11:00', '12:00', '13:00',
					'14:00', '15:00', '16:00', '17:00', '18:00', '19:00',
					'20:00', '21:00', '22:00', '23:00' ]
		} ],
		yAxis : [ {
			name : '人数(单位：100)',
			type : 'value'
		} ],
		series : [
				{
					name : '内环方向人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ 50, 20, 30, 20, 10, 55, 118, 326, 514, 539, 488,
							456, 232, 210, 120, 132, 211, 358, 486, 579, 549,
							412, 132, 101 ]
				},
				{
					name : '外环方向人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ -40, -20, -16, -12, -1, -67, -119, -335, -385,
							-287, -234, -214, -100, -99, -87, -69, -187, -289,
							-366, -354, -288, -212, -88, -55 ]
				},
				{
					name : '总人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ 90, 40, 46, 32, 11, 122, 127, 661, 899, 826, 722,
							770, 332, 309, 207, 201, 398, 647, 852, 933, 837,
							626, 220, 156 ]
				},
				{
					name : '差量人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ 10, 0, 14, 8, 9, -12, -1, -9, 129, 252, 254, 242,
							132, 111, 33, 63, 24, 69, 120, 225, 261, 200, 44,
							46 ]
				} ]
	};
	var option1 = {
		tooltip : {
			trigger : 'axis'
		},
		legend : {
			data : [ '内环方向人数', '外环方向人数', '总人数', '差量人数' ]
		},
		title : {
			color : '#fff',
			text : townName + '南路',
			subtext : '',
			x : 'left'
		},
		toolbox : {
			show : true,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : false
				},
				magicType : {
					show : true,
					type : [ 'line', 'bar', 'stack', 'tiled' ]
				},
				restore : {
					show : true
				},
				saveAsImage : {
					show : true
				}
			}
		},
		calculable : true,
		xAxis : [ {
			name : '时间',
			type : 'category',
			boundaryGap : false,
			data : [ '0:00', '1:00', '2:00', '3:00', '4:00', '5:00', '6:00',
					'7:00', '8:00', '9:00', '10:00', '11:00', '12:00', '13:00',
					'14:00', '15:00', '16:00', '17:00', '18:00', '19:00',
					'20:00', '21:00', '22:00', '23:00' ]
		} ],
		yAxis : [ {
			name : '人数(单位：100)',
			type : 'value'
		} ],
		series : [
				{
					name : '内环方向人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ 50, 20, 30, 20, 10, 55, 118, 326, 514, 539, 488,
							456, 232, 210, 120, 132, 211, 358, 486, 579, 549,
							412, 132, 101 ]
				},
				{
					name : '外环方向人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ -40, -20, -16, -12, -1, -67, -119, -335, -385,
							-287, -234, -214, -100, -99, -87, -69, -187, -289,
							-366, -354, -288, -212, -88, -55 ]
				},
				{
					name : '总人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ 90, 40, 46, 32, 11, 122, 127, 661, 899, 826, 722,
							770, 332, 309, 207, 201, 398, 647, 852, 933, 837,
							626, 220, 156 ]
				},
				{
					name : '差量人数',
					type : 'line',
					itemStyle : {
						normal : {
							areaStyle : {
								type : 'default'
							}
						}
					},
					data : [ 10, 0, 14, 8, 9, -12, -1, -9, 129, 252, 254, 242,
							132, 111, 33, 63, 24, 69, 120, 225, 261, 200, 44,
							46 ]
				} ]
	};
	/* require.config({
		paths : {
			echarts : '${ctxContents}/assets/echarts'
		}
	});
	require([ 'echarts', 'echarts/chart/bar', 'echarts/chart/line',
			'echarts/chart/map' ], function(ec) { */
	var main = document.getElementById("main");
	var main1 = document.getElementById("main1");
	myChart = echarts.init(main);
	myChart1 = echarts.init(main1);
	myChart.setOption(option);
	myChart1.setOption(option1);

	/* }); */
</script>
</html>