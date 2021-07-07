<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- ${pageContext.request.contextPath} --%>
<c:set var="ctxContents" value="${pageContext.request.contextPath}" />

<%
String basePath = "";
basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();

%>
<script type="text/javascript">
	 var basePath = "<%=basePath%>";
</script>
