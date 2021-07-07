<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>


	
	<div class="col-lg-3">
		<div class="map_data_bg">
			<div class="map_data">
				<div class="map_data_title" id="coreDateName">中国核心数据</div>
				<div class="map_data_main">
					<div class="map_data_main_ga">
						<img src="${ctxContents }/assets/images/main_data_shequ.png"
							width="80">
					</div>
					<div class="map_data_main_user">国安社区用户/潜力用户</div>
					<div class="progress">
						<div class="progress-bar" role="progressbar" aria-valuenow="60"
							aria-valuemin="0" aria-valuemax="100" style="width: 0%;" 
							id="proportionShow"></div>
					</div>
					<div class="map_data_main_acc" id="countUser" id="countUser">0万/0万</div>
					<div class="map_data_main_round" id="proportion">0%</div>
					<div class="map_data_main_details">
						<ul>
							<c:if test="${type!=4&&type!=6}">
								<li><span>人均收入：</span><span class="s_map" id="income">0万/年</span></li>
								<li><span>人均支出：</span><span class="s_map" id="expend">0万/年</span></li>
							</c:if>
							<c:if test="${type==4}">
								<li><span>住宅房价：</span><span class="s_map" id="income">0万/年</span></li>
								<li><span>写字楼租金：</span><span class="s_map" id="expend">0万/年</span></li>
							</c:if>
							
							<c:if test="${type==6}">
								<li><span>住宅房价：</span><span class="s_map" id="income">0万/年</span></li>
								<li><span>出租比例：</span><span class="s_map" id="expend">0万/年</span></li>
							</c:if>
							<li><span>消费等级：</span><span class="s_map" id="comsumeLevel">0级</span></li>
							<li><span>核心家庭：</span><span class="s_map" id="nuclearFamily">0%</span></li>
							<li><span>国安社区：</span><span class="s_map" id="storeNumber">0家</span></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

<%-- <div class="col-lg-3">
	<div class="map_data">
		<div class="map_data_title" id="coreDateName">中国核心数据</div>
		<div class="map_data_main">
			<div class="map_data_main_ga">
				<img src="${ctxContents }/assets/images/main_data_shequ.png"
					width="80">
			</div>
			<div class="map_data_main_user">国安社区用户/潜力用户</div>
			<div class="progress">
				<div class="progress-bar" role="progressbar" aria-valuenow="60"
					aria-valuemin="0" aria-valuemax="100" style="width: 22%;"
					id="proportionShow">22%</div>
			</div>
			<div class="map_data_main_acc" id="countUser">2.2万/100万</div>
			<div class="map_data_main_round" id="proportion">2.2%</div>
			<div class="map_data_main_details">
				<ul>
					<li><span>人均收入：</span><span class="s_map" id="income">4.4万/年</span></li>
					<li><span>人均支出：</span><span class="s_map" id="expend">2.3万/年</span></li>
					<li><span>消费等级：</span><span class="s_map" id="comsumeLevel">8级</span></li>
					<li><span>核心家庭：</span><span class="s_map" id="nuclearFamily">30%</span></li>
					<li><span>国安社区：</span><span class="s_map" id="storeNumber">200家</span></li>
				</ul>
			</div>
		</div>
	</div>
</div> --%>

