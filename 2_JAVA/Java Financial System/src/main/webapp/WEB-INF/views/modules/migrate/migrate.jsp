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
<title>人口迁徙</title>

<link rel="shortcut icon"
	href="${ctxContents}/assets/echarts/asset/ico/favicon.png">

<link
	href="${ctxContents}/assets/echarts/asset/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${ctxContents}/assets/echarts/asset/css/bootstrap.css"
	rel="stylesheet">
<link href="${ctxContents}/assets/echarts/asset/css/carousel.css"
	rel="stylesheet">
<link href="${ctxContents}/assets/echarts/asset/css/echartsHome.css"
	rel="stylesheet">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<script src="${ctxContents}/assets/echarts/build/source/echarts.js"></script>
<!-- <script src="vendor/echarts/doc/asset/js/codemirror.js"></script>
<script src="vendor/echarts/doc/asset/js/javascript.js"></script>
<link href="vendor/echarts/doc/asset/css/codemirror.css"
	rel="stylesheet">
<link href="vendor/echarts/doc/asset/css/monokai.css" rel="stylesheet"> -->
<!-- Le javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${ctxContents}/assets/echarts/asset/js/jquery.min.js"></script>
<!-- <script type="text/javascript"
		src="vendor/echarts/asset/js/echartsHome.js"></script> -->
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=HyeoYYK9le5xwgeZbtbYXTSQzCamOQyz"></script>
<script src="${ctxContents}/assets/echarts/asset/js/bootstrap.min.js"></script>
<script src="${ctxContents}/assets/echarts/extension/BMap/doc/BMap.js"></script>
<%-- <script src="${ctxContents}/assets/echarts/extension/BMap/src/main.js"></script> --%>
<!-- <script src="vendor/timelineOption.js"></script> -->
<!-- <script src="vendor/echarts/asset/js/echartsExample.js"></script> -->
</head>
<body style="padding: 0px;">
	<div class="container-fluid" style="padding: 0px;">
		<div class="row-fluid example" style="padding: 0px;">
			<!--/span-->
			<div id="graphic">
				<div id="main" class="main" style="height: 100%;"></div>
				<div style="display: none;">
					<button type="button" class="btn btn-sm btn-success"
						onclick="refresh(true)">刷 新</button>
					<span class="text-primary">切换主题</span> <select id="theme-select"></select>
					<span id='wrong-message' style="color: red"></span>
				</div>
			</div>
			<!--/span-->
		</div>
		<!--/row-->
	</div>
	<!--/.fluid-container-->
	<!--/span-->
	<script type="text/javascript">
		var townId = '${townId}';
		var myChartOption = {
			timeline : {
				data : [ '8:00-9:00', '9:00-10:00', '10:00-11:00',
						'18:00-20:00' ],
				label : {
					textStyle : {
						color : '#fff'
					}
				},
				controlStyle : {
					normal : {
						color : '#fff'
					},
				},
				type : 'number',
				autoPlay : false,
				playInterval : 3000
			},
			options : [ {
				color : [ 'gold', 'aqua', 'lime' ],
				title : {
					color : '#fff',
					text : '人口流动',
					subtext : '',
					x : 'right'
				},
				tooltip : {
					trigger : 'item',
					formatter : function(v) {
						return v[1].replace(':', ' > ');
					}
				},
				toolbox : {
					show : true,
					orient : 'vertical',
					x : 'right',
					y : 'center',
					feature : {
						mark : {
							show : true
						},
						dataView : {
							show : true,
							readOnly : false
						},
						restore : {
							show : true
						},
						saveAsImage : {
							show : true
						}
					}
				},
				dataRange : {
					min : 0,
					max : 100,
					y : '60%',
					calculable : true,
					color : [ '#ff3333', 'orange', 'yellow', 'lime', 'aqua' ],
					textStyle : {
						color : '#fff'
					}
				},
				series : [ {
					name : '北京',
					type : 'map',
					mapType : 'none',
					data : [],
					geoCoord : {},
					markLine : {
						smooth : true,
						effect : {
							show : true,
							scaleSize : 1,
							period : 30,
							color : '#fff',
							shadowBlur : 10
						},
						itemStyle : {
							normal : {
								borderWidth : 1,
								lineStyle : {
									type : 'solid',
									shadowBlur : 10,
									width : 2
								}
							}
						},
						data : []
					},
					markPoint : {
						symbol : 'emptyCircle',
						symbolSize : function(v) {
							return 5 + v / 1000
						},
						effect : {
							show : true,
							shadowBlur : 0
						},
						itemStyle : {
							normal : {
								label : {
									show : false
								}
							}
						},
						data : []
					}
				} ]
			}, {
				series : [ {
					markLine : {
						data : []
					},
					markPoint : {
						data : []
					}
				} ]
			}, {
				series : [ {
					markLine : {
						data : []
					},
					markPoint : {
						data : []
					}
				} ]
			}, {
				series : [ {
					markLine : {
						data : []
					},
					markPoint : {
						data : []
					}
				} ]
			} ]
		};

		var ecConfig;
		require.config({
			paths : {
				echarts : '${ctxContents}/assets/echarts'
			}
		});
		// 使用
		require([ 'echarts', 'echarts/src/theme/default', 'echarts/chart/line',
				'echarts/chart/bar', 'echarts/chart/scatter',
				'echarts/chart/k', 'echarts/chart/pie', 'echarts/chart/radar',
				'echarts/chart/force', 'echarts/chart/chord',
				'echarts/chart/gauge', 'echarts/chart/funnel',
				'echarts/chart/eventRiver', 'echarts/chart/venn',
				'echarts/chart/treemap', 'echarts/chart/tree',
				'echarts/chart/wordCloud', 'echarts/chart/heatmap',
				'echarts/chart/map' // 使用柱状图就加载bar模块，按需加载
		], function(ec) {
			ecConfig = require('echarts/config');
			developModeMethod();
		});

		var domain, BMapExt, map, container;
		// 百度地图API功能
		function initBMap() {
			domMain = document.getElementById('main');
			BMapExt = new BMapExtension(domMain, BMap, require('echarts'),
					require('zrender'));
			map = BMapExt.getMap();
			container = BMapExt.getEchartsContainer();
			map.enableScrollWheelZoom(true);
			map.setMapStyle({
				style : 'midnight'
			});
			loadMigrateData();
		}

		//绘制行政区域边界
		function getBoundary() {
			var bdary = new BMap.Boundary();
			bdary.get("北京市朝阳区", function(rs) { //获取行政区域
				//map.clearOverlays(); //清除地图覆盖物
				var count = rs.boundaries.length; //行政区域的点有多少个
				if (count === 0) {
					alert('未能获取当前输入行政区域');
					return;
				}
				var pointArray = [];
				for (var i = 0; i < count; i++) {
					var ply = new BMap.Polygon(rs.boundaries[i], {
						strokeWeight : 2,
						strokeColor : "#ff0000"
					}); //建立多边形覆盖物
					map.addOverlay(ply); //添加覆盖物
					pointArray = pointArray.concat(ply.getPath());
				}

				map.setViewport(pointArray); //调整视野
			});
		}

		//加载迁徙数据
		function loadMigrateData() {
			//1.加载地图数据
			$
					.ajax({
						async : true,
						type : "POST",
						url : "${basePath}/CIDM/migrate/villageMigrate?townId="
								+ townId,
						data : "",
						success : function(result) {
							myChart = BMapExt.initECharts(container, curTheme);
							window.onresize = myChart.resize;
							myChartOption.timeline.data = result.timeline;
							myChartOption.options[0].series[0].geoCoord = result.geoCoord;
							myChartOption.options[0].dataRange.max = result.dataMax;
							myChartOption.options[0].series[0].markLine.data = result.option1.markLine;
							myChartOption.options[0].series[0].markPoint.data = result.option1.markPoint;

							myChartOption.options[1].series[0].markLine.data = result.option2.markLine;
							myChartOption.options[1].series[0].markPoint.data = result.option2.markPoint;

							myChartOption.options[2].series[0].markLine.data = result.option3.markLine;
							myChartOption.options[2].series[0].markPoint.data = result.option3.markPoint;

							myChartOption.options[3].series[0].markLine.data = result.option4.markLine;
							myChartOption.options[3].series[0].markPoint.data = result.option4.markPoint;

							BMapExt.setOption(myChartOption, true);
							BMapExt.refresh();
							map.centerAndZoom(new BMap.Point(result.townx,
									result.towny), 16);
							initEvent();
						}
					});
		}

		function initEvent() {
			myChart.on(ecConfig.EVENT.TIMELINE_CHANGED,
					function(paramA, paramB) {
						BMapExt.refresh();
					});
		}
	</script>

</body>
</html>
