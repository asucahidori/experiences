//经济指标命名映射
var eNameMap = {
    'GDP' : 'GDP',
    'Financial' : '金融',
    'Estate' : '房地产',
    'PI' : '第一产业',
    'SI' : '第二产业',
    'TI' : '第三产业'
};
//颜色映射
var eColorMap = {
    'GDP' : '#1e90ff',
    'Financial' : '#ff7f50',
    'Estate' : '#da70d6',
    'PI' : '#32cd32',
    'SI' : '#6495ed',
    'TI' : '#ff69b4'
};
//---------

var developMode = false;
if (developMode) {
    window.esl = null;
    window.define = null;
    window.require = null;
    (function () {
        var script = document.createElement('script');
        script.async = true;

        var pathname = location.pathname;

        var pathSegs = pathname.slice(pathname.indexOf('doc')).split('/');
        var pathLevelArr = new Array(pathSegs.length - 1);
        script.src ='esl.js';
        if (script.readyState) {
            script.onreadystatechange = fireLoad;
        }
        else {
            script.onload = fireLoad;
        }
        (document.getElementsByTagName('head')[0] || document.body).appendChild(script);
        
        function fireLoad() {
            script.onload = script.onreadystatechange = null;
            setTimeout(loadedListener,100);
        }
        function loadedListener() {
            // for develop
            require.config({
                packages: [
                    {
                        name: 'echarts',
                        location: '../echarts/src',
                        main: 'echarts'
                    },
                    {
                        name: 'zrender',
                        //location: 'http://ecomfe.github.io/zrender/src',
                        location: 'zrender/src',
                        main: 'zrender'
                    }
                ]
            });
            launchExample();
        }
    })();
}
else {
	require.config({
         packages: [
             {
                 name: 'echarts',
                 location: './../echarts/src',
                 main: 'echarts'
             },
             {
                 name: 'zrender',
                 location: 'zrender/src',
                 main: 'zrender'
             }
         ]
     });
    launchExample();
}


var EC_READY = false;
var myChart0;

var isExampleLaunched;
function launchExample() {
    if (isExampleLaunched) {
        return;
    }

    // 按需加载
    isExampleLaunched = 1;
    require(
        [
            'echarts',
            'echarts/chart/line',
            'echarts/chart/bar',
            'echarts/chart/map'
        ],
        function (ec) {
            EC_READY = true;
            //myChart0 = ec.init(document.getElementById('g0')).setOption(option0()); 
            //showTabContent(1);
        }
    );
}

/*var curTabIdx = 1;
$('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
    // e.target // activated tab
    // e.relatedTarget // previous tab
    if (!EC_READY) {
        return;
    }
    hideTabContent(curTabIdx);
    curTabIdx = e.target.id.replace('tab','');
    showTabContent(curTabIdx);
});*/

var curYear = '2002';
$('button').on('click', function (e) {
    $('#' + curYear)[0].className = 'btn btn-info';
    curYear = e.target.id;
    $('#' + curYear)[0].className = 'btn btn-success';
    showTabContent();
});

var functionMap = {};
function showTabContent() {
    functionMap.chart2("2");
}

// second chart
var myChart20;
var myChart21;
var myChart22;
functionMap.chart2 = function (idx) {
    functionMap.chart2dispose(idx);
    var ec = require('echarts');
    myChart20 = ec.init(document.getElementById('g20'));
    myChart21 = ec.init(document.getElementById('g21'));
    myChart22 = ec.init(document.getElementById('g22'));
    
    myChart20.setOption(option2('GDP'));
    myChart21.setOption(option2('Financial'));
    myChart22.setOption(option2('Estate'));
}
functionMap.chart2dispose = function () {
        myChart20.dispose();
        myChart21.dispose();
        myChart22.dispose();
        myChart20 = false; 
        myChart21 = false;
        myChart22 = false;
}