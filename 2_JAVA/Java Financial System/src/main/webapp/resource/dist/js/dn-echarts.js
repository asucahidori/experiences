 $(function () {
 	//国安社区订单
 $('#container').highcharts({
        chart: {
            type: 'column',
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 1,
                viewDistance: 25,
                depth: 40
            }
        },

        title: {
            text: ''
        },
        credits: {
    				enabled: false
				},

        xAxis: {
            categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月','10月', '11月', '12月']
        },

        yAxis: {
            allowDecimals: false,
            min: 0,
            title: {
                text: ''
            }
        },

        tooltip: {
            headerFormat: '<b>{point.key}</b><br>',
            pointFormat: '<span style="color:{series.color}">\u25CF</span> {series.name}: {point.y} / {point.stackTotal}'
        },

        plotOptions: {
            column: {
                stacking: 'normal',
                depth: 40
            }
        },

        series: [{
            name: '国安社区A',
            data: [5, 3, 4, 7, 2,5, 3, 4, 7, 2,1,2],
            stack: 'male'
        }, {
            name: '国安社区B',
            data: [3, 4, 4, 2, 5,4, 2, 5,4, 2, 5,2],
            stack: 'male'
        }, {
            name: '国安社区C',
            data: [3, 4, 4, 2, 5,3, 4, 4,3, 4, 4,7],
            stack: 'male'
        }]
    });

//人均可支配收入
$('#container1').highcharts({
        chart: {
            type: 'column',
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 1,
                viewDistance: 25,
                depth: 40
            }
        },

        title: {
            text:'' //'本月可支配收入<br/><span>18.88亿元</span>'
        },
        credits: {
    				enabled: false
				},

        xAxis: {
            categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月','10月', '11月', '12月']
        },

        yAxis: {
            allowDecimals: false,
            min: 0,
            title: {
                text: ''
            }
        },

        tooltip: {
            headerFormat: '<b>{point.key}</b><br>',
            pointFormat: '<span style="color:{series.color}">\u25CF</span> {series.name}: {point.y} / {point.stackTotal}'
        },

        plotOptions: {
            column: {
                stacking: 'normal',
                depth: 40
            }
        },

        series: [ {
            name: '本月可支配收入',
            data: [3, 4, 4, 2, 5,3, 4, 4,3, 4, 4,7],
            stack: 'male'
        }]
    });
//国安社区潜力用户
$('#container2').highcharts({
        chart: {
            type: 'column',
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 1,
                viewDistance: 25,
                depth: 40
            }
        },

        title: {
            text:'' //'本月可支配收入<br/><span>18.88亿元</span>'
        },
        credits: {
    				enabled: false
				},

        xAxis: {
            categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月','10月', '11月', '12月']
        },

        yAxis: {
            allowDecimals: false,
            min: 0,
            title: {
                text: ''
            }
        },

        tooltip: {
            headerFormat: '<b>{point.key}</b><br>',
            pointFormat: '<span style="color:{series.color}">\u25CF</span> {series.name}: {point.y} / {point.stackTotal}'
        },

        plotOptions: {
            column: {
                stacking: 'normal',
                depth: 40
            }
        },

        series: [ {
            name: '每月潜力用户人数',
            data: [3, 4, 4, 2, 5,3, 4, 4,3, 4, 4,7],
            stack: 'male'
        }]
    });
	
 $('#container3').highcharts({
        title: {
            text: '',
           
        },
        subtitle: {
            text: '消费收入支出趋势',
            x: -20
        },
        xAxis: {
            categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月','10月', '11月', '12月']
        },
       yAxis: {
            allowDecimals: false,
            min: 0,          
			title: {
                text: ''
            }
        },
        tooltip: {
            valueSuffix: '亿元'
        },
        
        series: [{
            name: '大型企业',
            data: [100, 180, 195, 145, 182, 215, 252, 265, 233, 183, 139, 96]
        }, {
            name: '中型企业',
            data: [45, 08, 57, 113, 270, 220, 248, 241, 201, 141, 86, 25]
        }, {
            name: '小型企业',
            data: [39, 47, 35, 84, 135, 170, 186, 179, 143, 90, 39, 10]
        }]
    });
 
 
 
 });