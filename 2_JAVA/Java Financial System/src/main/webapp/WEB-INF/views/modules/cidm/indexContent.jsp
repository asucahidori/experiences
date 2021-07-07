<%--
  Created by IntelliJ IDEA.
  User: baibing
  Date: 2016/1/26
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="wrap-content container" id="container">
    <!-- start: DASHBOARD TITLE -->
    <!-- start: MINI STATS WITH SPARKLINE -->
    <!-- end: MINI STATS WITH SPARKLINE -->
    <!-- end: DASHBOARD TITLE -->
    <!-- start: FEATURED BOX LINKS -->
    <!-- end: FEATURED BOX LINKS -->
    <!-- start: FIRST SECTION -->
    <div class="container-fluid container-fullw padding-bottom-10">
        <div class="row">
            <div class="col-sm-12">
                <div class="row">
                    <div class="col-md-7 col-lg-8">
                        <div class="panel panel-white no-radius" id="visits">
                            <div class="panel-heading border-light">
                                <h4 class="panel-title"> 中国地图 </h4>
                                <ul class="panel-heading-tabs border-light">
                                    <li>
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <a class="padding-10" data-toggle="dropdown">
                                                    <i class="ti-more-alt "></i>
                                                </a>
                                                <ul class="dropdown-menu dropdown-light" role="menu">
                                                    <li>
                                                        <a href="#">
                                                            Action
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#">
                                                            Another action
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#">
                                                            Something else here
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="rate">
                                            <i class="fa fa-caret-up text-primary"></i><span class="value">15</span><span class="percentage">%</span>
                                        </div>
                                    </li>
                                    <li class="panel-tools">
                                        <a data-original-title="Refresh" data-toggle="tooltip" data-placement="top" class="btn btn-transparent btn-sm panel-refresh" href="#"><i class="ti-reload"></i></a>
                                    </li>
                                </ul>
                            </div>
                            <div collapse="visits" class="panel-wrapper" id="main123" style="height: 600px;">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-5 col-lg-4">
                        <div class="panel panel-white no-radius">
                            <div class="panel-heading border-light">
                                <h4 class="panel-title"> Acquisition </h4>
                            </div>
                            <div class="panel-body">
                                <h3 class="inline-block no-margin">26</h3> visitors on-line
                                <div class="progress progress-xs no-radius">
                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%;">
                                        <span class="sr-only"> 40% Complete</span>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-4">
                                        <h4 class="no-margin">15</h4>
                                        <div class="progress progress-xs no-radius no-margin">
                                            <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
                                                <span class="sr-only"> 80% Complete</span>
                                            </div>
                                        </div>
                                        Direct
                                    </div>
                                    <div class="col-sm-4">
                                        <h4 class="no-margin">7</h4>
                                        <div class="progress progress-xs no-radius no-margin">
                                            <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                                <span class="sr-only"> 60% Complete</span>
                                            </div>
                                        </div>
                                        Sites
                                    </div>
                                    <div class="col-sm-4">
                                        <h4 class="no-margin">4</h4>
                                        <div class="progress progress-xs no-radius no-margin">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%;">
                                                <span class="sr-only"> 40% Complete</span>
                                            </div>
                                        </div>
                                        Search
                                    </div>
                                </div>
                                <div class="row margin-top-30">
                                    <div class="col-xs-4 text-center">
                                        <div class="rate">
                                            <i class="fa fa-caret-up text-green"></i><span class="value">26</span><span class="percentage">%</span>
                                        </div>
                                        Mac OS X
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <div class="rate">
                                            <i class="fa fa-caret-up text-green"></i><span class="value">62</span><span class="percentage">%</span>
                                        </div>
                                        Windows
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <div class="rate">
                                            <i class="fa fa-caret-down text-red"></i><span class="value">12</span><span class="percentage">%</span>
                                        </div>
                                        Other OS
                                    </div>
                                </div>
                                <div class="margin-top-10">
                                    <div class="height-180">
                                        <canvas id="chart2" class="full-width"></canvas>
                                        <div class="inline pull-left legend-xs">
                                            <div id="chart2Legend" class="chart-legend"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end: FIRST SECTION -->
    <!-- start: SECOND SECTION -->
    <div class="container-fluid container-fullw padding-bottom-10">
        <div class="row">
            <div class="col-sm-12">
                <div class="row">
                    <div class="col-md-7 col-lg-8">
                        <div class="panel panel-white no-radius" id="visits1">
                            <div class="panel-heading border-light">
                                <h4 class="panel-title"> 中国地图 </h4>
                                <ul class="panel-heading-tabs border-light">
                                    <li>
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <a class="padding-10" data-toggle="dropdown">
                                                    <i class="ti-more-alt "></i>
                                                </a>
                                                <ul class="dropdown-menu dropdown-light" role="menu">
                                                    <li>
                                                        <a href="#">
                                                            Action
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#">
                                                            Another action
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#">
                                                            Something else here
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="rate">
                                            <i class="fa fa-caret-up text-primary"></i><span class="value">15</span><span class="percentage">%</span>
                                        </div>
                                    </li>
                                    <li class="panel-tools">
                                        <a data-original-title="Refresh" data-toggle="tooltip" data-placement="top" class="btn btn-transparent btn-sm panel-refresh" href="#"><i class="ti-reload"></i></a>
                                    </li>
                                </ul>
                            </div>
                            <div collapse="visits" class="panel-wrapper" id="main456" style="height: 600px;">
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <!-- end: SECOND SECTION -->
    <!-- start: THIRD SECTION -->

    <!-- end: THIRD SECTION -->
    <!-- start: FOURTH SECTION -->

    <!-- end: FOURTH SECTION -->
</div>
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/assets/js/index.js"></script>
<script src="/vendor/Echarts/echarts.js"></script>
<script src="/vendor/Echarts/Data/china.js"></script>
<script language="javascript">
    jQuery(document).ready(function() {
        Index.init();
    });
</script>
