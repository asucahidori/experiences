<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/modules/cidm/taglib.jsp"%>

<div class="row head_head">
	<div class="col-lg-6 col-md-6 col-sm-4">
		<div class="head_logo">
			<a href="<%=basePath %>/discovery/index"><img
				src="${ctxContents }/assets/images/logo.png" alt="国安大数据" /></a>
		</div>
	</div>
	<div class="col-lg-6 col-md-6 col-sm-8">
		<div class="login_add">
			<span class="glyphicon glyphicon-user User_add"></span> <a
				href="${pageContext.request.contextPath}/user/logout"
				class="btn btn-primary btn-wide btn-scroll btn-scroll-top fa fa-reply login_exit">
				<span>退&nbsp;&nbsp;出</span>
			</a> <a href="#" onClick="javascript :history.back(-1);" 
				class="btn btn-primary btn-wide btn-scroll btn-scroll-top fa fa-mail-reply-all login_return">
				<span>返&nbsp;&nbsp;回</span>
			</a>
		</div>
		<br clear="all">
	</div>
	<br clear="all">
</div>