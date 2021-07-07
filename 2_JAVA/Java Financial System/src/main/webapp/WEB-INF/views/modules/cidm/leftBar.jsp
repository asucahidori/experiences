<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>

<ul class="main-navigation-menu">
	<!-- 省、市 -->
	<c:if test="${type==1}">
		<li class="active open"><a href="#">
				<div class="item-content">
					<div class="item-media">
						<i class="ti-settings tu1 tu1_a"></i>
					</div>
					<div class="item-inner city_data_1">
						<div class="region">${name }</div>
						<span class="title font_16px_add"> 数据分析报告 </span>
					</div>
				</div>
		</a></li>
		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-group"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区总用户量</span>

					</div>
				</div>
		</a></li>

		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-money"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区分月订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserCapacityByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-user-plus"></i>
					</div>
					<div class="item-inner">
						<span class="title">各区国安社区用户量</span>
					</div>
				</div>
		</a></li>


		<li><a href="#communityUserCapacityByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-cny"></i>
					</div>
					<div class="item-inner">
						<span class="title">各区国安社区订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserOrderByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-arrow-circle-right"></i>
					</div>
					<div class="item-inner">
						<span class="title">人均可支配收入与支出</span>
					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#income">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">住宅房价</span>
					</div>
				</div>
		</a></li>

		<li><a href="#housingPricesByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">各区住宅房价</span>
					</div>
				</div>
		</a></li>

		<li><a href="#housingPricesByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-user"></i>
					</div>
					<div class="item-inner">
						<span class="title">各区性别结构</span>
					</div>
				</div>
		</a></li>
	</c:if>
	<!-- 区县 -->
	<c:if test="${type==3}">
		<li class="active open"><a>
				<div class="item-content">
					<div class="item-media">
						<i class="ti-settings tu1 tu1_a"></i>
					</div>
					<div class="item-inner city_data_1">
						<div class="region">${name }</div>
						<span class="title font_16px_add"> 数据分析报告 </span>
					</div>
				</div>
		</a></li>
		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-group"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区总用户量</span>

					</div>
				</div>
		</a></li>

		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-money"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区分月订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserCapacityByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-user-plus"></i>
					</div>
					<div class="item-inner">
						<span class="title">各街道国安社区用户量</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserCapacityByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-cny"></i>
					</div>
					<div class="item-inner">
						<span class="title">各街道国安社区订单额</span>
					</div>
				</div>
		</a></li>
		<li style="display:none"><a href="#communityUserOrderByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">住宅房价</span>
					</div>
				</div>
		</a></li>

		<li><a href="#housingPricesByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">各街道住宅房价</span>
					</div>
				</div>
		</a></li>

		<li><a href="#housingPricesByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-user"></i>
					</div>
					<div class="item-inner">
						<span class="title">各街道性别结构</span>
					</div>
				</div>
		</a></li>
	</c:if>
	<!-- 街道报表左侧 -->
	<c:if test="${type==4}">
		<li class="active open">
			<div class="item-content">
				<div class="item-media">
					<i class="ti-settings tu1_a"></i>
				</div>
				<br clear="all" />
				<div class="item-inner city_data_1">
					<div class="region">${name }</div>
					<span class="title font_16px_add"> 数据分析报告 </span>
				</div>
			</div>

		</li>
		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-group"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区总用户量</span>

					</div>

				</div>
		</a></li>


		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-money"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区分月订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserCapacityByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-user-plus"></i>
					</div>
					<div class="item-inner">
						<span class="title">各社区国安社区用户量</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserCapacityByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-cny"></i>
					</div>
					<div class="item-inner">
						<span class="title">各社区国安社区订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#communityUserOrderByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-user"></i>
					</div>
					<div class="item-inner">
						<span class="title">各社区常住人口</span>
					</div>
				</div>
		</a></li>

		<li><a href="#ResidentPopulationByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-cutlery"></i>
					</div>
					<div class="item-inner">
						<span class="title">街道周边业态分布</span>
					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#ResidentPopulationByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-line-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">各社区居民消费等级</span>
					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#FamilyStructure">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">住宅房价</span>
					</div>
				</div>
		</a></li>

		<li><a href="#housingPricesByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">各街道住宅房价</span>
					</div>
				</div>
		</a></li>

		<li><a href="#housingPricesByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-pie-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">各社区写字楼总面积</span>
					</div>
				</div>
		</a></li>

		<li><a href="#OfficeRentsByArea">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bitcoin"></i>
					</div>
					<div class="item-inner">
						<span class="title">各社区写字楼平均租金</span>
					</div>
				</div>
		</a></li>
	</c:if>
	<!-- 小区报表左侧菜单 -->
	<c:if test="${type==6}">
		<li class="active open"><a>
				<div class="item-content">
					<div class="item-media">
						<i class="ti-settings tu1 tu1_a"></i>
					</div>
					<div class="item-inner city_data_1">
						<div class="region">${name }</div>
						<span class="title font_16px_add"> 数据分析报告 </span>
					</div>
				</div>
		</a></li>
		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-group"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区总用户量</span>

					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-line-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">季节消费等级趋势</span>
					</div>
				</div>
		</a></li>
		

		<li><a href="#ConsumptionlevelByData">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-money"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区分月订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#ConsumptionlevelByData">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-list"></i>
					</div>
					<div class="item-inner">
						<span class="title">社区平台消费TOP10</span>
					</div>
				</div>
		</a></li>


		<li style="display:none"><a href="#communityUserOrderByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-bar-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">住宅房价</span>
					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#housingPricesByDate">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-users"></i>
					</div>
					<div class="item-inner">
						<span class="title">住户家庭结构类型分布</span>
					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#ResidentialProperties">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-building"></i>
					</div>
					<div class="item-inner">
						<span class="title">住户住宅性质</span>
					</div>
				</div>
		</a></li>
	</c:if>

	<!-- 楼栋 -->
	<c:if test="${type==7}">
		<li class="active open"><a>
				<div class="item-content">
					<div class="item-inner city_data_2">
						<div class="region">${name }</div>
						<div class="region_1">${buildingid }号楼</div>
						<span class="title font_16px_add"> 数据分析报告 </span>
					</div>
				</div>
		</a></li>

		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-group"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区用户量</span>

					</div>
				</div>
		</a></li>

		<li style="display:none"><a href="#building_postcode">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-line-chart"></i>
					</div>
					<div class="item-inner">
						<span class="title">季节消费等级</span>
					</div>
				</div>
		</a></li>


		<li><a href="#lou_ga_yonghu">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-money"></i>
					</div>
					<div class="item-inner">
						<span class="title">国安社区订单额</span>
					</div>
				</div>
		</a></li>

		<li><a href="#lou_ga_yonghu">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-list"></i>
					</div>
					<div class="item-inner">
						<span class="title">社区平台消费TOP10</span>
					</div>
				</div>
		</a></li>


		<li><a href="#report_1">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-users"></i>
					</div>
					<div class="item-inner">
						<span class="title">住户家庭结构类型分布</span>
					</div>
				</div>
		</a></li>

		<li><a href="#ResidentialProperties">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-building"></i>
					</div>
					<div class="item-inner">
						<span class="title">住户住宅性质</span>
					</div>
				</div>
		</a></li>
	</c:if>
	<c:if test="${type==8}">
		<li class="active open">
			<a>
				<div class="item-content">
                               	<div class="item-media">
                                   	<i class="ti-settings tu1 tu1_a"></i>
					</div>
					<div class="item-inner city_data_2">
                                   	<div class="region">${name}</div>
                                       <div class="font_16px_add">${buildingid}号楼${household }</div>
						<span class="title region_1"> 数据分析报告 </span>
					</div>
				</div>
			</a>
		</li>
        <li>
			<a href="report_household.html">
				<div class="item-content">
					<div class="item-media">
						<i class="fa fa-list"></i>
					</div>
					<div class="item-inner">
						<span class="title">社区平台消费TOP10</span>
					</div>
				</div>
			</a>
		</li>
	</c:if>
</ul>