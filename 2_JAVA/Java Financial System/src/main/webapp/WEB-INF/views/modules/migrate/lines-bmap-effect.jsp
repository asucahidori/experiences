<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<!DOCTYPE html>
<html style="height: 100%">
<head>
<meta charset="utf-8">
</head>
<body style="height: 100%; margin: 0">
	<div id="container" style="height: 650px;"></div>
	<%-- <script type="text/javascript"
		src="${ctxContents}/master/js/BMap/jquery.js"></script> --%>
	<script type="text/javascript">
		//加载map路径
		/* require.config({
			paths : {
				echarts : '${ctxContents}/assets/echarts'
			}
		});
		require([ 'echarts', 'echarts/chart/bar', 'echarts/chart/line',
				'echarts/chart/map' ], function(ec) { */
		var dom = document.getElementById("container");
		var myChartMap = echarts.init(dom);
		var app = {};
		optionMap = null;
		app.title = '北京公交路线 - 线特效';

		$.get('${ctxContents}/master/js/BMap/lines-buso.json', function(data) {
			var hStep = 300 / (data.length - 1);
			var busLines = [].concat.apply([], data.map(function(busLine, idx) {
				var prevPt;
				var points = [];
				for (var i = 0; i < busLine.length; i += 2) {
					var pt = [ busLine[i], busLine[i + 1] ];
					if (i > 0) {
						pt = [ prevPt[0] + pt[0], prevPt[1] + pt[1] ];
					}
					prevPt = pt;

					points.push([ pt[0] / 1e4, pt[1] / 1e4 ]);
				}
				return {
					coords : points,
					lineStyle : {
						normal : {
							color : echarts.color.modifyHSL('#5A94DF', Math
									.round(hStep * idx))
						}
					}
				};
			}));
			myChartMap.setOption(optionMap = {
				bmap : {
					center : [ 116.46, 39.92 ],
					zoom : 10,
					roam : true,
					mapStyle : {
						'styleJson' : [ {
							'featureType' : 'water',
							'elementType' : 'all',
							'stylers' : {
								'color' : '#031628'
							}
						}, {
							'featureType' : 'land',
							'elementType' : 'geometry',
							'stylers' : {
								'color' : '#000102'
							}
						}, {
							'featureType' : 'highway',
							'elementType' : 'all',
							'stylers' : {
								'visibility' : 'off'
							}
						}, {
							'featureType' : 'arterial',
							'elementType' : 'geometry.fill',
							'stylers' : {
								'color' : '#000000'
							}
						}, {
							'featureType' : 'arterial',
							'elementType' : 'geometry.stroke',
							'stylers' : {
								'color' : '#0b3d51'
							}
						}, {
							'featureType' : 'local',
							'elementType' : 'geometry',
							'stylers' : {
								'color' : '#000000'
							}
						}, {
							'featureType' : 'railway',
							'elementType' : 'geometry.fill',
							'stylers' : {
								'color' : '#000000'
							}
						}, {
							'featureType' : 'railway',
							'elementType' : 'geometry.stroke',
							'stylers' : {
								'color' : '#08304b'
							}
						}, {
							'featureType' : 'subway',
							'elementType' : 'geometry',
							'stylers' : {
								'lightness' : -70
							}
						}, {
							'featureType' : 'building',
							'elementType' : 'geometry.fill',
							'stylers' : {
								'color' : '#000000'
							}
						}, {
							'featureType' : 'all',
							'elementType' : 'labels.text.fill',
							'stylers' : {
								'color' : '#857f7f'
							}
						}, {
							'featureType' : 'all',
							'elementType' : 'labels.text.stroke',
							'stylers' : {
								'color' : '#000000'
							}
						}, {
							'featureType' : 'building',
							'elementType' : 'geometry',
							'stylers' : {
								'color' : '#022338'
							}
						}, {
							'featureType' : 'green',
							'elementType' : 'geometry',
							'stylers' : {
								'color' : '#062032'
							}
						}, {
							'featureType' : 'boundary',
							'elementType' : 'all',
							'stylers' : {
								'color' : '#465b6c'
							}
						}, {
							'featureType' : 'manmade',
							'elementType' : 'all',
							'stylers' : {
								'color' : '#022338'
							}
						}, {
							'featureType' : 'label',
							'elementType' : 'all',
							'stylers' : {
								'visibility' : 'off'
							}
						} ]
					}
				},
				series : [ {
					type : 'lines',
					coordinateSystem : 'bmap',
					polyline : true,
					data : busLines,
					silent : true,
					lineStyle : {
						normal : {
							// color: '#c23531',
							// color: 'rgb(200, 35, 45)',
							opacity : 0.2,
							width : 1
						}
					},
					progressiveThreshold : 500,
					progressive : 200
				}, {
					type : 'lines',
					coordinateSystem : 'bmap',
					polyline : true,
					data : busLines,
					lineStyle : {
						normal : {
							width : 0
						}
					},
					effect : {
						constantSpeed : 20,
						show : true,
						trailLength : 0.2,
						symbolSize : 5
					},
					zlevel : 1
				} ]
			});
		});
		if (optionMap && typeof optionMap === "object") {
			myChartMap.setOption(optionMap, true);
		}
		var boundary = '${boundary}';
		var storelng = '${storelng}';
		var storelat = '${storelat}';
		var storeName = '${storeName}';
		/* }); */
	</script>
	<script type="text/javascript"
		src="${ctxContents}/master/js/BMap/bmap.js"></script>
</body>
</html>