

// JavaScript Document
// ///////////**************** 国安社区用户量***********/////////////////
function initCommunityUserCapacityByDate() {
	var myChartyonghu = echarts.init(document.getElementById("communityUserCapacityByDate"),theme);
	option_ga_yonghu = {
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar", "stack", "tiled" ]
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
			type : "category",
			boundaryGap : false,
			data : x_car,

			/*
			 * axisLabel: { rotate: 60, }
			 */
			
			formatter : function(data) {
				return data.split("").join("\n");
			},
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		grid : {
			x : 50,
			x2 : 40,
			y2 : 40,
		},

		yAxis : [ {
			type : "value",
			scale : true,
			
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			name : "国安社区用户量",
			type : "line",
			stack : "总量",
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			},
			data : y_car
		} ],
		title : {
			text : "",
			textStyle:{
				   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
				   fontWeight:'normal', 
			}
		},
		/*color : [ "rgb(110, 158, 221)" ],
		backgroundColor : "#3b3b3d"*/
	}
	myChartyonghu.setOption(option_ga_yonghu);
	
}




//JavaScript Document
/////////////**************** 国安社区用户量***********/////////////////
function initChartsnCharts1a() {
	var myChart1a = echarts.init(document.getElementById("nCharts1a"),theme);
	option_1a = {
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data :  ['年来总人数', '男性人口', '女性人口', '城镇人口', '乡村人口'],
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}

		}

		],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			name : "总人数",
			barMaxWidth : 50,
			type : "bar",
			data : ycounts,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		}

		],
		title : {
			
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		    }	
		},
		/*backgroundColor : "#3b3b3d",
		//color : [ "rgb(43, 102, 219)" ]
		color : [ "rgb(44, 238, 126)" ]*/
	}
	myChart1a.setOption(option_1a);
	
}


















// 各区国安社区用户量****************///////////////////////////////
function initCommunityUserCapacityByArea(name) {
	var myChart_gq_yonghu = echarts.init(document
			.getElementById("communityUserCapacityByArea"),theme);
	option_gq_yonghu = {
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data : xnames,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}

		}

		],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			name : "国安用户",
			barMaxWidth : 50,
			type : "bar",
			data : ycounts,
			itemStyle : {
				normal : {
					/*label : {
						show : true,
						formatter : '{c}'
					},*/
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		}

		],
		title : {
			text : name,
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		    }	
		},
		/*backgroundColor : "#3b3b3d",
		//color : [ "rgb(43, 102, 219)" ]
		color : [ "rgb(44, 238, 126)" ]*/
	}
	myChart_gq_yonghu.setOption(option_gq_yonghu);
}

// 国安社区订单额
function initCommunityUserOrderByDate() {
	var myChart_ga_order = echarts.init(document
			.getElementById("communityUserOrderByDate"),theme);
	option_ga_order = {
		title : {
			text : "",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis",
			show : true
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar", "stack", "tiled" ]
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
			type : "category",
			data : x_month,
			boundaryGap : false,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		grid : {
			x : 50,
			x2 : 40,
			y2 : 40,
		},
		yAxis : [ {
			type : "value",
			
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			name : "订单额",
			type : "line",
			smooth : true,
			data : y_order,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*color : [ "rgb(48, 173, 50)" ],
		backgroundColor : "#3b3b3d"*/
	}// ga_order

	myChart_ga_order.setOption(option_ga_order);
}

// 各区国安社区订单额
function initCommunityUserOrderByArea(name) {
	var myChart_gq_order = echarts.init(document.getElementById("communityUserOrderByArea"),theme);
	option_gq_order = {
		title : {
			text : name,
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data :x_everyName,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
		
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			name : "订单额",
			barMaxWidth : 50,
			type : "bar",
			data : y_everyCount,
			itemStyle : {
				normal : {
					/*label : {
						show : true,
						formatter : '{c}'
					},*/
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*backgroundColor : "#3b3b3d",
		//color : [ "rgb(162, 219, 100)" ]
		color : [ "rgb(244, 91, 91)" ]*/
	}// gq_order

	myChart_gq_order.setOption(option_gq_order);
}

// 收入支出
function initIncomeExpenditure() {
	var myChart_income = echarts.init(document.getElementById("income"),theme);
	option_income = {
		tooltip : {
			trigger : "axis"
		},
		legend : {
			left:'left',
			textStyle:{
				   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
				   fontWeight:'normal', 
				   fontSize : 18,
			},
			data : []
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			boundaryGap : false,
			data : x_IncomeExpenditure,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			name : "万元",
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [
				{
					name : "人均可支配收入",
					type : "line",
					data : y_Income,
					itemStyle : {
						normal : {
							label : {
								show : true,
								formatter : '{c}',
							},
							labelLine : {
								show : true,
							},

						}
					}
				},
				{
					name : "人均消费支出（单位：元）",
					type : "line",
					data : y_expend,
					itemStyle : {
						normal : {
							label : {
								show : true,
								formatter : '{c}'
							},
							labelLine : {
								show : true,
							},

						}
					}
				} ],
		/*color : [ "rgb(231, 23, 221)", "rgb(1, 111, 193)" ],
		backgroundColor : "#3b3b3d"*/
	}// income

	myChart_income.setOption(option_income);
}

// 性别结构

function initSexStructure(name) {
	
	var myChart_gq_age = echarts.init(document.getElementById("sexStructure"),theme);
	option_gq_age = {
		tooltip : {
			trigger : "axis",
			axisPointer : {
				type : "shadow"
			}
		},
		legend : {
			data : [ "男", "女" ],
			textStyle : {
				align : "left",
			},
			x : "right"
		},
		toolbox : {
			show : false,
			orient : "vertical",
			x : "right",
			y : "center",
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar", "stack", "tiled" ]
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
			type : "category",
			data : x_areaName,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			type : "bar",
			barMaxWidth : 50,
			name : "男",
			stack : '总量',
			data : y_boy,
			itemStyle : {
				normal : {
					/*label : {
						show : true,
						formatter : '{c}'
					},*/
					labelLine : {
						show : true,
					},
					
				}
			}
		}, {
			type : "bar",
			name : "女",
			stack : '总量',
			data : y_gril,
			itemStyle : {
				normal : {
					/*label : {
						show : true,
						formatter : '{c}'
					},*/
					labelLine : {
						show : true,
					},
					
				}
			}
		} ],
		title : {
			text : name,
			textStyle:{
				   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
				   fontWeight:'normal', 
			}
		},
		/*backgroundColor : "#3b3b3d",
		color : [ "rgb(242, 140, 58)", "rgb(60, 146, 196)", "#da70d6",
				"#32cd32", "#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c",
				"#ffa500", "#40e0d0", "#1e90ff", "#ff6347", "#7b68ee",
				"#00fa9a", "#ffd700", "#6699FF", "#ff6666", "#3cb371",
				"#b8860b", "#30e0e0" ]*/
	}// gq_age

	myChart_gq_age.setOption(option_gq_age);
	/*myChart_gq_age.setTheme('red');*/
}

// 各区住宅房价
function initHousingPricesByArea(name) {
	var myChart_gq_house = echarts.init(document
			.getElementById("housingPricesByArea"),theme);
	option_gq_house = {
		title : {
			text : name,
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		    }
		},
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data : x_areaPriceName,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			name : "房价",
			barMaxWidth : 50,
			type : "bar",
			data : y_areaPrice,
			itemStyle : {
				normal : {
					/*label : {
						show : true,
						formatter : '{c}'
					},*/
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*backgroundColor : "#3b3b3d",
		color : [ "rgb(57, 191, 239)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}// gq_house

	myChart_gq_house.setOption(option_gq_house);
}

//各区住宅房价（年）
function initHousingPricesByDate() {
	var myChart_gq_housePrices= echarts.init(document.getElementById("housingPricesByDate"),theme);
	option_gq_housePrices={
	title: {
	   text: "",
	   textStyle:{
		   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
		   fontWeight:'normal'
	   }
	},
	tooltip: {
	   trigger: "axis"
	},
	toolbox: {
	   show: false,
	   feature: {
	       mark: {
	           show: true
	       },
	       dataView: {
	           show: true,
	           readOnly: true
	       },
	       magicType: {
	           show: false,
	           type: ["line", "bar"]
	       },
	       restore: {
	           show: true
	       },
	       saveAsImage: {
	           show: true
	       }
	   }
	},
	calculable: true,
	xAxis: [
	   {
	       type: "category",
	       boundaryGap: false,
	       data: x_areaPriceMonth,
		   axisLabel:{
	          //rotate:45, //刻度旋转45度角
	           textStyle:{
	              fontSize:12
	           },
		 		interval:0,
	          
	       }
	
	   }
	],
	grid: {
	x: 50,
	x2: 40,
	y2: 40,
	     },
	yAxis: [
	   {
	       type: "value",
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		  
	   }
	],
	series: [
	   {
	       name: "住宅房价",
	       type: "line",
	       data: y_monthPrice,
		   itemStyle: {
	           normal: {
				   label:{
					   show:true,
					   formatter:'{c}'
					   },
					labelLine:{show:true,},
	              
	           }
			}
	   }
	],
	/*color: ["rgb(0, 176, 240)"],
	backgroundColor: "#3b3b3d"*/
	}//gq_housePrices
	
	myChart_gq_housePrices.setOption(option_gq_housePrices);
}


// ///////////****************表二 居民消费等级 日期 ***********/////////////////
function initConsumptionlevelByData() {
	var myChart_ConsumptionlevelByData = echarts.init(document
			.getElementById("ConsumptionlevelByData"),theme);
	option_ConsumptionlevelByData = {
		title : {
			text : "季度消费实力等级趋势（单位：级）",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		legend : {
			data : [ "消费等级" ],
			x : "right"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data : dataArrayTime,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		grid : {
			x : 50,
			x2 : 40,
			y2 : 40,
		},
		yAxis : [ {
			type : "value"
		} ],
		series : [ {
			name : "消费等级",
			barMaxWidth : 30,
			type : "bar",
			data : dataArraySum,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*backgroundColor : "rgb(255, 255, 255)",
		color : [ "rgb(58, 143, 209)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}// ConsumptionlevelByData

	myChart_ConsumptionlevelByData.setOption(option_ConsumptionlevelByData);
}

// ///////////*******表七 各社区居民消费等级 地区 ********/////////////////
function initConsumptionLevelByarea() {
	var myChart_ConsumptionLevelByarea = echarts.init(document
			.getElementById("ConsumptionLevelByarea"),theme);
	option_ConsumptionLevelByarea = {
		title : {
			text : "各社区居民消费等级",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal' 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		legend : {
			orient : "vertical",
			x : "right",
			y : "bottom",
			data : [ "消费等级" ]
		},
		toolbox : {
			show : false,
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
		polar : [

		{
			radius : 90,
			indicator : x_ResidentSalesLevel
		} ],

		calculable : true,
		series : [ {
			name : "",
			type : "radar",
			data : [ {
				value : y_ResidentSalesLevel,
				name : "消费等级",
				itemStyle : {
					normal : {
						label : {
							show : true,
							formatter : '{c}'
						},

						labelLine : {
							show : true,
						},
					}
				}
			} ]
		} ],
		/*backgroundColor : "rgb(255, 255, 255)",
		color : [ "rgb(52, 177, 239)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}

	myChart_ConsumptionLevelByarea.setOption(option_ConsumptionLevelByarea);
}

// ///////////****************表四 各社区消费TOP10 ***********/////////////////
function initCommunityConsumptionTopten() {
	var myChart_communityConsumptionTopten = echarts.init(document
			.getElementById("communityConsumptionTopten"),theme);
	option_communityConsumptionTopten = {
		title : {
			text : "近30天国安社区平台消费TOP10（单位：元）",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal'
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		legend : {
			data : [ "元" ],
			x : "right"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "value",
			boundaryGap : [ 0, 0.01 ],
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],

		grid : {
			x : 100,
			x2 : 30,
			y2 : 30,
		},
		yAxis : [ {
			type : "category",
			data : dataArrayName,
			axisLabel : {
				//rotate:15, //刻度旋转45度角
				textStyle : {
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					if(params.indexOf("【")!=-1){
						return params.substring(0,params.indexOf("【"));
					}else{
						return params.substring(0,8);
					}
				}
			}
		} ],
		series : [ {
			name : "元",
			type : "bar",
			data : dataArrayPrice,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*backgroundColor : "rgb(255, 255, 255)",
		color : [ "rgb(165, 219, 103)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}
	myChart_communityConsumptionTopten
			.setOption(option_communityConsumptionTopten);
}

// ///////////****************表五 家庭结构 ***********/////////////////

function initFamilyStructure() {
	var myChart_FamilyStructure = echarts.init(document
			.getElementById("FamilyStructure"),'red');
	option_FamilyStructure = {
		title : {
			text : "住户家庭结构类型分布",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal' 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		legend : {
			orient : "vertical",
			x : "right",
			y : "bottom",
			data : [ "占比" ]
		},
		toolbox : {
			show : false,
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
		polar : [ {

			radius : 90,
			indicator : [ {
				text : "1人户",
				min : 0,
				max : 40
			}, {
				text : "2人户",
				min : 0,
				max : 40
			}, {
				text : "3人户",
				min : 0,
				max : 40
			}, {
				text : "4人户",
				min : 0,
				max : 40
			}, {
				text : "5人户以上",
				min : 0,
				max : 40
			} ]
		} ],
		calculable : true,
		series : [ {
			name : "",
			type : "radar",
			data : [ {
				value : dataArray,
				name : "占比",
				itemStyle : {
					normal : {
						label : {
							show : true,
							formatter : '{c}%'
						},
						labelLine : {
							show : true,
						},

					}
				}
			} ]
		} ],
		/*backgroundColor : "rgb(255, 255, 255)",
		color : [ "rgb(1, 138, 244)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}

	myChart_FamilyStructure.setOption(option_FamilyStructure);
}

// ///////////****************表六 住宅性质 ***********/////////////////
function initResidentialProperties() {
	var myChart_ResidentialProperties = echarts.init(document
			.getElementById("ResidentialProperties"),theme);
	option_ResidentialProperties = {
		tooltip : {
			trigger : "item",
			formatter : "{a} <br/>{b} : {c} ({d}%)"
		},
		legend : {
			orient : "vertical",
			data : x_householdProperty,
			x : "right"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
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
		series : [ {
			name : "占比",
			type : "pie",
			radius : [ "50%", "70%" ],
			itemStyle : {
				normal : {
					label : {
						show : false
					},
					labelLine : {
						show : false
					}
				},
				emphasis : {
					label : {
						show : true,
						position : "center",
						textStyle : {
							fontSize : "30",
							fontWeight : "bold"
						}
					}
				}
			},
			data : y_householdProperty,
			itemStyle : {
				normal : {
					label : {
						show : true,
						textStyle : {
							fontSize : "18",
							fontWeight : "bold"
						},
						formatter : "{b}({d}%)"
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		title : {
			text : "住户住宅性质",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal' 
		    }
		},
		/*backgroundColor : "rgb(255, 255, 255)",
		color : [ "rgb(43, 206, 206)", "rgb(195, 103, 234)", "#da70d6",
				"#32cd32", "#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c",
				"#ffa500", "#40e0d0", "#1e90ff", "#ff6347", "#7b68ee",
				"#00fa9a", "#ffd700", "#6699FF", "#ff6666", "#3cb371",
				"#b8860b", "#30e0e0" ]*/
	}// ResidentialProperties

	myChart_ResidentialProperties.setOption(option_ResidentialProperties);
}

// /////////*************表五 各社区常住人口数（单位：人）**********/////////////////
function initResidentPopulationByArea() {
	var myChart_ResidentPopulationByArea = echarts.init(document
			.getElementById("ResidentPopulationByArea"),theme);
	option_ResidentPopulationByArea = {
		title : {
			text : "各社区常住人口数（单位：人）",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data : x_ResidentPopulation,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 100,
		},

		yAxis : [ {
			type : "value"
		} ],
		series : [ {
			name : "常住人口",
			type : "bar",
			barMaxWidth : 50,
			data : y_ResidentPopulation,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*color : [ "rgb(132, 149, 224)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ],
		backgroundColor : "rgb(255, 255, 255)"*/
	}// ResidentPopulationByArea

	myChart_ResidentPopulationByArea.setOption(option_ResidentPopulationByArea);
}

// ///////////****************表六 周边业态*****/////////////////
function initSurroundinTheFormats() {
	var myChart_SurroundinTheFormats = echarts.init(document
			.getElementById("SurroundinTheFormats"),theme);
	option_SurroundinTheFormats = {
		title : {
			text : "",
			x : "center",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "item",
			formatter : "{a} <br/>{b} : {c} ({d}%)"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
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
		series : [ {
			name : "百分比",
			type : "pie",
			radius : "45%",
			center : [ "58%", "50%" ],
			data : x_streetSurroundState,
			itemStyle : {
				normal : {
					label : {
						show : true,
						fontSize : 12,
						formatter : "{b}({d}%)"
					},
					labelLine : {
						show : true,
					},
				}
			}
		} ],
		/*backgroundColor : "#3b3b3d",
		color : [ "rgb(104, 217, 221)", "rgb(56, 162, 224)", "#da70d6",
				"#32cd32", "#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c",
				"#ffa500", "#40e0d0", "#1e90ff", "rgb(58, 196, 72)", "#7b68ee",
				"#00fa9a", "#ffd700", "#6699FF", "#ff6666", "#3cb371",
				"#b8860b", "#30e0e0" ]*/
	}// SurroundinTheFormats

	myChart_SurroundinTheFormats.setOption(option_SurroundinTheFormats);
}

// ///////////****************表十 各社区写字楼总面积（单位：平方米）*********/////////////////
function initOfficeSpaceByArea() {
	var myChart_OfficeSpaceByArea = echarts.init(document
			.getElementById("OfficeSpaceByArea"),theme);
	option_OfficeSpaceByArea = {
		title : {
			text : "",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data : x_areaVillageOffice,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 20,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			type : "bar",
			name : "平方米",
			barMaxWidth : 50,
			data :y_areaVillageOffice,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},
					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*backgroundColor : "#3b3b3d",
		color : [ "rgb(66, 206, 206)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}

	myChart_OfficeSpaceByArea.setOption(option_OfficeSpaceByArea);
}

// ///////////****************表十一
// 各社区写字楼平均租金（单位：元/㎡/天）***********/////////////////
function initOfficeRentsByArea() {
	var myChart_OfficeRentsByArea = echarts.init(document.getElementById("OfficeRentsByArea"),theme);
	option_OfficeRentsByArea = {
		title : {
			text : "",
			textStyle:{
			   fontFamily:'"微软雅黑",Verdana,Arial,Helvetica,sans-serif',
			   fontWeight:'normal', 
		   }
		},
		tooltip : {
			trigger : "axis"
		},
		toolbox : {
			show : false,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : true
				},
				magicType : {
					show : false,
					type : [ "line", "bar" ]
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
			type : "category",
			data : x_villageOfficeRents,
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
				formatter : function(params) {
					return params.split("").join("\n");
				}
			}
		} ],
		grid : {
			x : 50,
			x2 : 30,
			y2 : 90,
		},
		yAxis : [ {
			type : "value",
			
			axisLabel : {
				// rotate:45, //刻度旋转45度角
				textStyle : {
					fontSize : 12,
				},
				interval : 0,
			}
		} ],
		series : [ {
			type : "bar",
			name : "元",
			data : y_villageOfficeRents,
			barMaxWidth : 50,
			itemStyle : {
				normal : {
					label : {
						show : true,
						formatter : '{c}'
					},

					labelLine : {
						show : true,
					},
					areaStyle : {
						type : "default"
					}
				}
			}
		} ],
		/*backgroundColor : "#3b3b3d",
		color : [ "rgb(66, 206, 206)", "#87cefa", "#da70d6", "#32cd32",
				"#6495ed", "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500",
				"#40e0d0", "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a",
				"#ffd700", "#6699FF", "#ff6666", "#3cb371", "#b8860b",
				"#30e0e0" ]*/
	}

	myChart_OfficeRentsByArea.setOption(option_OfficeRentsByArea);
}