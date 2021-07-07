var eNameMap = {
    'Store' : '国安门店数量',
    'Village' : '国安社区用户量',
    'Order' : '国安社区订单额'
};
//颜色映射
var eColorMap = {
    'Store' : '#1e90ff',
    'Village' : '#ff7f50',
    'Order' : '#da70d6'
};
/***
$('button').on('click', function (e) {
    $('#' + curYear)[0].className = 'btn btn-info';
    curYear = e.target.id;
    $('#' + curYear)[0].className = 'btn btn-success';
    functionMap.chart2();
});
***/
var functionMap = {};
var myChart20;
var myChart21;
var myChart22;
/**
 * 加载国安门店数量、国安社区数量、国安社区订单额数据 方法
 * */
/**
functionMap.chart2 = function () {
    functionMap.chart2dispose();
    var ec = require('echarts');
    myChart20 = ec.init(document.getElementById('g20'));
    myChart21 = ec.init(document.getElementById('g21'));
    myChart22 = ec.init(document.getElementById('g22'));
    
    myChart20.setOption(option2('Store', proviceName));	//国安门店
    myChart21.setOption(option2('Village', proviceName));//国安社区数量
    myChart22.setOption(option2('Order', proviceName));	//国安社区订单额数据
}
***/
functionMap.chart2dispose = function () {
        //myChart20.dispose();
       // myChart21.dispose();
        //myChart22.dispose();
        myChart20 = false; 
        myChart21 = false;
        myChart22 = false;
}

/***
function dataFormatterCountyInfo(obj) {
    //var pList = ['朝阳区','丰台区','海淀区','门头沟区','通州区','平谷区','怀柔区','延庆县','顺义区','大兴区','昌平区','密云县','房山区','东城区','西城区','石景山区'];
    var pList = dataArray;//区县数组
	var temp;
    var max = 0;
    for (var year in obj) {
        temp = obj[year];
        for (var i = 0, l = temp.length; i < l; i++) {
            
            
            //1.区县ID
            var id = temp[i].id;
            
            //2. 统计数据
            var valueInfo = temp[i].value;
            if(valueInfo == null || valueInfo == ""){
            	valueInfo = 0;
            }
            
            //3. 区县名称
            var nameInfo = "";
            
            max = Math.max(max, valueInfo); //获取每一个年份中的最大值
            
            //3. 遍历区县数组
            if(pList != null && pList.length > 0){
            	
            	for(var k=0; k<pList.length; k++){
            	
            		var cId = pList[k].id; //区县ID
            		
            		var cname = pList[k].name; //区县名称
            		
            		if(id == cId){
            			nameInfo = cname;
            			break;
            		}
            	}
            }
            
            obj[year][i] = {
                name : nameInfo,  //区县名称
                value : valueInfo //统计数据
            }
        }
        obj[year+'max'] = Math.floor(max/100) * 100;
    }
    return obj;
}
***/

/**
 * @param name 年份
 * @param mapTypeName 市区名称
 * */
function option2 (name, mapTypeName) {
    var option = {
        title : {
            x: 'center',
            y: 'top',
            textStyle:{
                fontSize: 14
            }
        },
        tooltip : {
            trigger: 'item'
        },
        dataRange: {
            min: 0,
            itemWidth:8,
            itemGap: 5,
            x: 'left',
            y: 'bottom'
        },
        series : [
            {
                type: 'map',
                mapType: mapTypeName
            }
        ]
    };
    var color = eColorMap[name];
    option.title.text = eNameMap[name];
    option.title.textStyle.color = color;
    option.dataRange.color = [
        color, 
        require('zrender/tool/color').lift(color, -0.9)
    ];
    option.dataRange.max = dataMapCounty['data' + name][curYear + 'max'];
    
   
   
    for (var i = 0, l = option.series.length; i < l; i++) {
        option.series[i].name = eNameMap[name] + '(' + curYear + ')';
     
        option.series[i].data = dataMapCounty['data' + name][curYear];
    }
    
    return option;
}/**
 * 
 */