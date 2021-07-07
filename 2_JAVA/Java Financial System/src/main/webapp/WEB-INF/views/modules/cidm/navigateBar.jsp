<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>
<style>

</style>
<%
    HttpSession s = request.getSession();  
%>



<nav>
<ul class="nav navbar-nav">
	<c:if test="${type==1}">
		<li class="active"><a id ="province1" href="#"><i class="fa fa-dashboard"></i>中国地图</a></li>
	</c:if>
	<c:if test="${type==3}">
		<li><a id ="province3" href="#"><i class="fa fa-dashboard"></i>&nbsp;中国地图</a></li>
		<li class="active"><a id ="city3" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("city"))).get("name") %></a></li>
	</c:if>
	<c:if test="${type==4}">
		<li><a id ="province4" href="#"><i class="fa fa-dashboard"></i>&nbsp;中国地图</a></li>
		<li><a id ="city4" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("city"))).get("name") %></a></li>
		<li class="active"><a id="county4" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("county"))).get("name") %></a></li>
	</c:if>
	
	<c:if test="${type==6}">
		<li class="active"><a id ="province6" href="#"><i class="fa fa-dashboard"></i>&nbsp;中国地图</a></li>
		<li><a id ="city6" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("city"))).get("name") %></a></li>
		<li><a id="county6" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("county"))).get("name") %></a></li>
		<li class="active"><a id="town6" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("town"))).get("name") %></a></li>
	</c:if>
	
	<c:if test="${type==7}">
		<li class="active"><a id ="province7" href="#"><i class="fa fa-dashboard"></i>&nbsp;中国地图</a></li>
		<li><a id ="city7" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("city"))).get("name") %></a></li>
		<li><a id="county7" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("county"))).get("name") %></a></li>
		<li><a id="town7" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("town"))).get("name") %></a></li>
		<%-- <c:if test="${not empty sessionScope.tinyvillage.id}">
		<li class="active"><a id="tinyvillage7" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("tinyvillage"))).get("name") %></a></li>
		</c:if> --%>
		<%-- <li class="active"><a id="village7" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("village"))).get("name") %></a></li> --%>
	</c:if>
	<c:if test="${type==8}">
		<li class="active"><a id ="province8" href="#"><i class="fa fa-dashboard"></i>&nbsp;中国地图</a></li>
		<li><a id ="city8" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("city"))).get("name") %></a></li>
		<li><a id="county8" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("county"))).get("name") %></a></li>
		<li><a id="town8" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("town"))).get("name") %></a></li>
		<%-- <c:if test="${not empty sessionScope.tinyvillage.id}">
		<li><a id="tinyvillage8" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("tinyvillage"))).get("name") %></a></li>
		</c:if> --%>
		<%-- <li class="active"><a id="village8" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("village"))).get("name") %></a></li>
		<li class="active"><a id="building8" href="#"><i class="fa fa-angle-right"></i>&nbsp;<%=((Map)(s.getAttribute("building"))).get("name") %></a></li> --%>
	</c:if>
   
</ul>
</nav>
<script src="${ctxContents }/vendor/jquery/jquery.min.js"></script>
<script src="${ctxContents }/vendor/bootstrap/js/bootstrap.min.js"></script>
<script>
jQuery(document).ready(function() {
	var tinyvillage = '${sessionScope.tinyvillage.id}';
	var type = '${type}';
	if(type=="1"){
		//alert(encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.county.name}&id=${sessionScope.county.id}&type=${sessionScope.county.type}&gbCode=${sessionScope.county.gbCode}')));
		$("#province1").attr("href", encodeURI(encodeURI('${ctxContents }/map')));
	
	}
	if(type=="3"){
		$("#province3").attr("href", encodeURI(encodeURI('${ctxContents }/map')));
		//alert(encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.county.name}&id=${sessionScope.county.id}&type=${sessionScope.county.type}&gbCode=${sessionScope.county.gbCode}')));
		$("#city3").attr("href", encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.city.name}&id=${sessionScope.city.id}&type=${sessionScope.city.type}&gbCode=${sessionScope.city.gbCode}')));
	
	}
	if(type=="4"){
		$("#province4").attr("href", encodeURI(encodeURI('${ctxContents }/map')));
		$("#city4").attr("href", encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.city.name}&id=${sessionScope.city.id}&type=${sessionScope.city.type}&gbCode=${sessionScope.city.gbCode}')));
		$("#county4").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.county.name}&id=${sessionScope.county.id}&type=${sessionScope.county.type}')));
	}
	if(type=="6"){
		$("#province6").attr("href", encodeURI(encodeURI('${ctxContents }/map')));
		$("#city6").attr("href", encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.city.name}&id=${sessionScope.city.id}&type=${sessionScope.city.type}&gbCode=${sessionScope.city.gbCode}')));
		$("#county6").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.county.name}&id=${sessionScope.county.id}&type=${sessionScope.county.type}')));
		$("#town6").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.town.name}&id=${sessionScope.town.id}&type=${sessionScope.town.type}')));
	
	}
	if(type=="7"){
		$("#province7").attr("href", encodeURI(encodeURI('${ctxContents }/map')));
		$("#city7").attr("href", encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.city.name}&id=${sessionScope.city.id}&type=${sessionScope.city.type}&gbCode=${sessionScope.city.gbCode}')));
		$("#county7").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.county.name}&id=${sessionScope.county.id}&type=${sessionScope.county.type}')));
		$("#town7").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.town.name}&id=${sessionScope.town.id}&type=${sessionScope.town.type}')));		
		//$("#village7").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.village.name}&id=${sessionScope.village.id}&type=${sessionScope.village.type}')));
		/* if (tinyvillage !== null && tinyvillage !== undefined && tinyvillage !== "") {
			$("#tinyvillage7").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBuildingPage?name=${sessionScope.tinyvillage.name}&id=${sessionScope.tinyvillage.id}&type=${sessionScope.tinyvillage.type}')));
		} */

	}
	if(type=="8"){
		$("#province8").attr("href", encodeURI(encodeURI('${ctxContents }/map')));
		$("#city8").attr("href", encodeURI(encodeURI('${ctxContents }/map/areaMap?name=${sessionScope.city.name}&id=${sessionScope.city.id}&type=${sessionScope.city.type}&gbCode=${sessionScope.city.gbCode}')));
		$("#county7").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.county.name}&id=${sessionScope.county.id}&type=${sessionScope.county.type}')));
		$("#town8").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.town.name}&id=${sessionScope.town.id}&type=${sessionScope.town.type}')));		
		//$("#village8").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBaiduMap?name=${sessionScope.village.name}&id=${sessionScope.village.id}&type=${sessionScope.village.type}')));
		/* if (tinyvillage !== null && tinyvillage !== undefined && tinyvillage !== "") {
			$("#tinyvillage8").attr("href", encodeURI(encodeURI('${ctxContents }/map/toBuildingPage?name=${sessionScope.tinyvillage.name}&id=${sessionScope.tinyvillage.id}&type=${sessionScope.tinyvillage.type}')));
		} */
		//$("#building8").attr("href", encodeURI(encodeURI('${ctxContents }/map/toReportHousehold?name=${sessionScope.building.name}&id=${sessionScope.building.id}&type=${sessionScope.building.type}')));
	}
});
</script>
