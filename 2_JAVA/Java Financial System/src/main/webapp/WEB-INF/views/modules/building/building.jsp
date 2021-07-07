<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<html>
<head>
<title>3D楼栋</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>
body {
	/* background-color: #d8e7ff; */
	font-family: "微软雅黑", Monospace;
	cursor: url(cursor.png), auto;
	margin: 0;
	padding: 0;
	overflow: hidden;
	font-size: 14px;
	background: #293f60;
}

ul, li {
	list-style-type: none;
	padding: 0;
}

table {
	color: #fff;
}

.mask {
	width: 100%;
	height: 100%;
	position: fixed;
	background: #000;
	opacity: 0.5;
	filter: alpha(opacity = 50);
	z-index: 30;
	display: none;
}

.wrap {
	width: 900px;
	height: 700px;
	position: absolute;
	left: 50%;
	top: 50%;
	background: #fff;
	margin-left: -450px;
	margin-top: -350px;
	z-index: 50;
	visibility: hidden;
}

.close-btn {
	
}

.close {
	float: right;
	background: transparent;
	border: none;
	padding: 5px 10px;
	cursor: pointer;
	font-size: 20px;
}

#bigpicarea {
	POSITION: relative;
	MARGIN: 0px auto;
	WIDTH: 900px;
	HEIGHT: 550px;
	OVERFLOW: hidden;
}

#bigpicarea ul {
	width: 7205px;
	position: absolute;
	left: 0;
	padding: 0;
	top: -10px;
}

#bigpicarea ul li {
	float: left;
}

.bigbtnPrev {
	Z-INDEX: 100;
	POSITION: absolute;
	WIDTH: 35px;
	HEIGHT: 51px;
	TOP: 255px;
	CURSOR: pointer;
	LEFT: 30px;
}

#divHousePhoto label {
	color: #fff;
}

.bigbtnNext {
	Z-INDEX: 100;
	POSITION: absolute;
	WIDTH: 35px;
	HEIGHT: 51px;
	TOP: 255px;
	CURSOR: pointer;
	RIGHT: 30px;
}

#big-play-prev {
	background-image: url(${ctxContents}/photo/leftbig.png);
	WIDTH: 35px;
	DISPLAY: block;
	HEIGHT: 51px;
}

#big-play-next {
	background-image: url(${ctxContents}/photo/rightbig.png);
	WIDTH: 35px;
	DISPLAY: block;
	HEIGHT: 51px;
}

#smallpicarea {
	width: 900px;
	border-top: 1px solid #ececec;
	padding-top: 20px;
}

#thumbs {
	width: 710px;
	margin: 0 auto;
	overflow: hidden;
	height: 78px;
	position: relative;
}

#thumbs ul {
	position: absolute;
	left: 0;
	width: 1000px;
}

#thumbs ul li {
	float: left;
	padding: 0 7px;
	width: 118px;
	height: 64px;
}

.first {
	width: 9px;
	height: 16px;
	cursor: pointer;
	position: absolute;
	bottom: 60px;
	left: 70px;
}

.last {
	width: 9px;
	height: 16px;
	cursor: pointer;
	position: absolute;
	bottom: 60px;
	right: 80px;
}

#thumbs li a {
	border: #fff 2px solid;
	display: block;
}

#thumbs li.current a {
	border: #f8ae0f 2px solid;
	display: block;
}

#bigpicarea .image span {
	display: block;
	width: 100%;
	background: #000;
	position: absolute;
	bottom: 0;
	height: 30px;
	line-height: 22px;
	padding: 10px;
	color: #fff;
	opacity: 0.3;
	filter: alpha(opacity = 30);
}

.clearfix:after {
	content: ".";
	display: block;
	clear: both;
	visibility: hidden;
	line-height: 0;
	height: 0;
	font-size: 0;
}

.clearfix {
	*zoom: 1;
}

.imgList {
	width: 30%;
	text-align: center;
	padding: 20px 0 20px 0px;
	position: fixed;
	top: 69px;
	right: -30.1%;
	border: 1px solid #c8c7cc;
	background: #293f60;
	z-index: 1000;
}

.showHideBut {
	width: 78px;
	height: 40px;
	border-radius: 6px 0 0 6px !important;
	border: 1px solid #c8c7cc;
	background: #e2e2e2;
	position: absolute;
	left: -78px;
	top: 50px;
	z-index: 99;
}

.iconSet {
	display: block;
	font-style: normal;
}

#buildingInfo {
	margin-left: 15px;
}

#infoButton {
	z-index: 2;
	background: transparent none repeat scroll 0% 0%;
	opacity: 0.9;
	position: absolute;
	top: 73px;
	left: 4px;
	cursor: pointer;
}

#familyNumber {
	line-height: 32px;
	text-align: left;
	z-index: 2;
	background: transparent none repeat scroll 0% 0%;
	opacity: 0.9;
	position: absolute;
	top: 105px;
	left: 10px;
	cursor: pointer;
}

#container {
	position: absolute;
	width: 100%;
	height: 100%;
}

#familyNumber label {
	font-size: 16px;
	color: #fff;
	display: inline-block;
}

#familyNumber label:nth-of-type(1) i {
	color: #FF522A;
}

#familyNumber label:nth-of-type(2) i {
	color: #00B0F0;
}

#familyNumber label:nth-of-type(3) i {
	color: #fb00f2;
}

#familyNumber label:nth-of-type(4) i {
	color: #f3eb0d;
}

#familyNumber label:nth-of-type(5) i {
	color: #080D5E;
}

#familyNumber input[type="checkbox"] {
	position: relative;
	top: 2px;
}

#buildingInfo h3, #personAttr h3 {
	color: #ffffff;
	text-align: left;
	font-size: 20px;
}

#personAttr {
	text-align: left;
}

#personAttr img {
	margin: 5px 0;
}

#ownerName a {
	text-decoration: underline !important;;
	color: #ffff00;
}
</style>
<link rel="stylesheet"
	href="${ctxContents }/resource/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${ctxContents }/resource/css/styles.css">
<link rel="stylesheet" href="${ctxContents }/resource/css/add.css">
<link rel="stylesheet"
	href="${ctxContents }/vendor/fontawesome/css/font-awesome.min.css">
</head>
<body>
	<script src='${ctxContents}/resource/three.js/build/Three.js'></script>
	<script src='${ctxContents}/resource/three.js/build/Detector.js'></script>
	<script src="${ctxContents}/resource/three.js/build/OrbitControls.js"></script>
	<script src="${ctxContents}/resource/three.js/build/BuildingUtils.js"></script>
	<script src="${ctxContents}/resource/three.js/examples/js/tween.min.js"></script>
	<script
		src="${ctxContents}/resource/three.js/examples/font/helvetiker_bold.js"></script>
	<script
		src="${ctxContents}/resource/three.js/examples/font/helvetiker_regular.js"></script>
	<!-- <script src="src/examples/js/renderers/CanvasRenderer.js"></script> -->
	<script src="${ctxContents}/resource/three.js/build/Stats.js"></script>
	<script src="${ctxContents}/resource/Jquery/jquery-1.9.1.js"></script>
	<script src="${ctxContents}/resource/Jquery/jquery-ui.js"></script>
	<script src="${ctxContents}/resource/Jquery/slide.js"></script>
	<script src="${ctxContents}/resource/outline/info.js"></script>
	<script src="${ctxContents}/resource/outline/THREEx.FullScreen.js"></script>
	<script src="${ctxContents}/resource/outline/THREEx.KeyboardState.js"></script>
	<script src="${ctxContents}/resource/outline/THREEx.WindowResize.js"></script>
	<c:import url='/navbar' />
	<div id="container"></div>
	<div id="infoButton"
		class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only"
		role="button" aria-disabled="false" onclick="infoButtonClick()">
		<span class="ui-button-text"> <img width="32" height="32"
			src="${ctxContents}/images/icon-info.png">
		</span>
	</div>
	<div id="familyNumber"
		class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only"
		role="button" aria-disabled="false">
		<label> <input type="checkbox" id="familyNumberCheckBox"
			onclick="familyNumberCheckBox()">家庭成员数量<i
			class="fa fa-square"></i>
		</label><br /> <label> <input type="checkbox" id="incomeCheckBox"
			onclick="incomeCheckBox()">家庭月收入(万) <i class="fa fa-square"></i></label><br />
		<label> <input type="checkbox" id="costCheckBox"
			onclick="costCheckBox()">家庭月支出(万) <i class="fa fa-square"></i></label><br />
		<label> <input type="checkbox" id="orderNumCheckBox"
			onclick="orderNumCheckBox()">社区每户每月订单量 <i
			class="fa fa-square"></i></label><br /> <label> <input
			type="checkbox" id="orderbookCheckBox" onclick="orderbookCheckBox()">社区每户每月订单额(万)
			<i class="fa fa-square"></i></label><br />
		<!-- <span class="ui-button-text"> <img width="40" height="40"
			src="images/familyNumber4.png">
		</span> -->
	</div>
	<div class="imgList" style="height: 100%;">
		<button class="showHideBut">
			<i class="iconSet">户型图>></i>
		</button>
		<div id="buildingInfo">
			<!-- style="position:absolute; right:-35%;top:0;"  -->
			<h3>
				<i class="fa fa-users"></i>家庭属性
			</h3>
			<table>
				<tr>
					<td>小区名称：</td>
					<td><label id="communityName"></label></td>
				</tr>
				<tr>
					<td>小区地址：</td>
					<td><label id="communityAddress"></label></td>
				</tr>
				<tr>
					<td>小区楼号：</td>
					<td><label id="buildingName"></label></td>
				</tr>
			</table>
			<div id="divFamilyInfo">
				<table>
					<tr>
						<td style="text-align: right;">房 号：</td>
						<td><label id="roomName"></label></td>
					</tr>
					<tr>
						<td>业主姓名：</td>
						<td><label id="ownerName">张三</label></td>
					</tr>
					<tr>
						<td>业主电话：</td>
						<td><label id="ownerMobile">1234567890123</label></td>
					</tr>
					<tr>
						<td>家庭成员：</td>
						<td><label id="familyMember"></label></td>
					</tr>
					<tr>
						<td>家庭情况：</td>
						<td><label id="familyStatus">消费高</label></td>
					</tr>
				</table>
			</div>
			<div id="divHousePhoto" style="display: none;">
				<div>
					<label id="houseTypeLabel">户型图</label>
				</div>
				<img id="houseTypeImg" alt="" src=""
					style="width: 430px; height: 430px; margin: 10px 10px 10px 0;">
				<div>
					<label id="imgName"></label>
				</div>
			</div>
			<div id="personAttr" style="margin-top: 10px; display: none;">
				<h3>
					<i class="fa fa-user"></i>个人属性
				</h3>
				<img
					style="width: 100px; height: 120px; float: right; margin-right: 30px;"
					src="${ctxContents }/images/zhangsan.jpg">
				<table>
					<tr>
						<td style="text-align: right;">职业：</td>
						<td><label id="">房产销售</label></td>
					</tr>
					<tr>
						<td>消费偏好：</td>
						<td><label id="">电子产品、名牌服装、饮食</label></td>
					</tr>
					<tr>
						<td>特长爱好：</td>
						<td><label id="">聊天、打乒乓球</label></td>
					</tr>
					<tr>
						<td style="vertical-align: top;">体验情况：</td>
						<td><label id="">门店买过月饼<br />参加过国安社区好声音<br />参加过国安社区洗衣活动
						</label></td>
					</tr>
					<tr>
						<td>客户类型：</td>
						<td><label id="">潜在客户</label></td>
					</tr>
					<tr>
						<td>销售目标：</td>
						<td><label id="">发展成会员</label></td>
					</tr>
				</table>
			</div>
			<div id="houseIncome"
				style="padding-top: 10px; display: none; border-top: 1px solid #ddd; margin-top: 10px; margin-right: 20px;">
				<table>
					<tr>
						<th colspan="2">家庭月收入状况</th>

					</tr>
					<tr>
						<td>张三：</td>
						<td><label id="income1">4000</label></td>
					</tr>
					<tr>
						<td>张三太太：</td>
						<td><label id="income2">3000</label></td>
					</tr>
					<tr style="border-top: 1px solid #ccc">

						<td>总计</td>
						<td><label id="incomeTotal">750</label></td>
					</tr>
				</table>
			</div>
			<div id="houseSpend"
				style="padding-top: 10px; display: none; border-top: 1px solid #ddd; margin-top: 10px; margin-right: 20px;">
				<table>
					<tr>
						<th colspan="2">家庭月支出状况</th>

					</tr>
					<tr>
						<td>生活费用：</td>
						<td><label id="costLife">3000</label></td>
					</tr>
					<tr>
						<td>孩子教育：</td>
						<td><label id="costChildrenEdu">2000</label></td>
					</tr>
					<tr>
						<td>其他：</td>
						<td><label id="costElse">1000</label></td>
					</tr>
					<tr style="border-top: 1px solid #ccc">
						<td>总计</td>
						<td><label id="costTotal">750</label></td>
					</tr>
				</table>
			</div>
			<div id="ComOrder"
				style="padding-top: 10px; display: none; border-top: 1px solid #ddd; margin-top: 10px; margin-right: 20px;">
				<table>
					<tr>
						<th colspan="3">国安社区6月订单</th>
					</tr>
					<tr>
						<td width="100">时间</td>
						<td width="80">商品名称</td>
						<td>数量</td>
					</tr>
					<tr id="trZongzi">
						<td>2016.6.09</td>
						<td>粽子</td>
						<td><label id="orderZongzi">3件</label></td>
					</tr>
					<tr id="trApple">
						<td>2016.6.15</td>
						<td>苹果</td>
						<td><label id="orderApple">2件</label></td>
					</tr>
					<tr id="trEgg">
						<td>2016.6.17</td>
						<td>鸡蛋</td>
						<td><label id="orderEgg">3件</label></td>
					</tr>
					<tr style="border-top: 1px solid #ccc">
						<td></td>
						<td>总计</td>
						<td><label id="orderTotal">8件</label></td>
					</tr>
				</table>
			</div>
			<div id="orderbook"
				style="padding-top: 10px; display: none; border-top: 1px solid #ddd; margin-top: 10px; margin-right: 20px;">
				<table>
					<tr>
						<th colspan="3">国安社区6月订单</th>
					</tr>
					<tr>
						<td width="100">时间</td>
						<td width="80">订单额</td>
					</tr>
					<tr>
						<td id="orderbookTime1">2016.6.09</td>
						<td id="orderbook1">400</td>
					</tr>
					<tr>
						<td id="orderbookTime2">2016.6.15</td>
						<td id="orderbook2">200</td>
					</tr>
					<tr>
						<td id="orderbookTime3">2016.6.17</td>
						<td id="orderbook3">150</td>
					</tr>
					<tr style="border-top: 1px solid #ccc">
						<td>总计</td>
						<td><label id="orderbookTotal">750</label></td>
					</tr>
				</table>
			</div>
		</div>

	</div>
	<div class="mask"></div>
	<div class="wrap">
		<div class="close-btn">
			<button class="close" type="button">X</button>
		</div>
		<div id="picarea">
			<p class="bigbtnPrev">
				<span id="big-play-prev"></span>
			</p>
			<p class="bigbtnNext">
				<span id="big-play-next"></span>
			</p>
			<p class="first btnPrev">
				<img id="play_prev" src="${ctxContents}/photo/left.png">
			</p>
			<p class="last btnNext">
				<img id="play_next" src="${ctxContents}/photo/right.png">
			</p>
			<div id="bigpicarea">
				<ul class="clearfix">
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/yushi.jpg" width=900 height=550>
					</a> <span>111111111111</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/chufang.jpg" width=900 height=550>
					</a> <span>2222222222</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/yushi.jpg" width=900 height=550>
					</a> <span>333333333</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/chufang.jpg" width=900 height=550>
					</a> <span>444444444</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/yushi.jpg" width=900 height=550>
					</a> <span>55555555</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/chufang.jpg" width=900 height=550>
					</a> <span>66666666</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/yushi.jpg" width=900 height=550>
					</a> <span>7777777</span></li>
					<li class=image><a href="##"> <img alt=""
							src="${ctxContents}/photo/chufang.jpg" width=900 height=550>
					</a> <span>88888888888</span></li>


				</ul>
			</div>

			<div id="smallpicarea">
				<div id="thumbs">
					<ul class="clearfix">

						<li class="current"><a href="#"> <img
								src="${ctxContents}/photo/small_yushi.jpg" width=100 height=60>

						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_chufang.jpg" width=100 height=60>
						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_yushi.jpg" width=100 height=60>

						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_chufang.jpg" width=100 height=60>
						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_yushi.jpg" width=100 height=60>

						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_chufang.jpg" width=100 height=60>
						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_yushi.jpg" width=100 height=60>

						</a></li>
						<li><a href="#"> <img
								src="${ctxContents}/photo/small_chufang.jpg" width=100 height=60>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<script src="${ctxContents}/resource/three.js/buildingDom.js"></script>
</body>
</html>
