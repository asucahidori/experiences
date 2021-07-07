package com.gatz.discovery.modules.sys.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gatz.discovery.core.feature.cache.redis.RedisCache;
import com.gatz.discovery.core.util.CookieUtil;
import com.gatz.discovery.core.util.ReadAuthorityPropertiesTool;
import com.gatz.discovery.modules.sys.controller.Constants;
import com.gatz.discovery.modules.sys.dto.RoleInfoDTO;
import com.gatz.discovery.modules.sys.model.authority.Module;
import com.gatz.discovery.modules.sys.model.authority.User;
import java.util.Properties;


public class AuthorityInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory
			.getLogger(AuthorityInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle
	 * (javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
		} catch (UnsupportedEncodingException e2) {

		}
                String pbName = ReadAuthorityPropertiesTool.getValue("authority.pubName");
                String domain = ReadAuthorityPropertiesTool.getValue("authority.domain");
                String port = ReadAuthorityPropertiesTool.getValue("authority.port");
                String protocol = ReadAuthorityPropertiesTool.getValue("authority.protocol");
                String projectName = ReadAuthorityPropertiesTool.getValue("authority.projectName");
                String systemCode = ReadAuthorityPropertiesTool.getValue("systemCode");
                
		String loginPage = protocol+pbName+domain+":"+port+projectName+"/login?systemCode="+systemCode;
                Cookie mpCookie = CookieUtil.getCookie(request, "system_code");
                if(!StringUtils.isEmpty(mpCookie)){
                    
                }
                    CookieUtil.setCookie(response, "system_code", systemCode, Constants.MAX_AGE_ONE_MONTH);
		/** 获取cookie */
		Cookie cookie = CookieUtil.getCookie(request, Constants.MEMBER);
		/** 判断cookie是否为空 */
		String sid = "";

		if (!StringUtils.isEmpty(cookie)) {
			sid = cookie.getValue();
			try {
				/** 在cookie不为空的情况下，获取用户并判断是否为空 */
				User user = (User) RedisCache.getObject(sid);
				request.setAttribute("loginUser", user);
				if (user == null) {
					PrintWriter out = response.getWriter();
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
					builder.append("alert(\"登录用户已失效 请重新登录\");");
					builder.append("window.location.href=\"");
					builder.append(loginPage);
					builder.append("\";</script>");
					out.print(builder.toString());
					out.close();
					return false;
				} else {
					// 判断url 用户是否有权限访问
					String url = request.getRequestURI();
					String urlStr = url.substring(request.getContextPath()
							.length(), url.length());
					boolean existUrl = false;
					boolean okUrl = false;

					// 请求路径是否存在于数据库中 existUrl为true，即为存在库中
					List<String> listAllUrl = (List<String>) RedisCache.getObject("listAllUrl" + user.getUsername());
					if (!listAllUrl.isEmpty()) {
						for (String str : listAllUrl) {
							if (str != null && !"".equals(str.trim())) {
								if (urlStr.replaceAll("/", "").trim()
										.equals(str.replaceAll("/", "").trim())) {
									existUrl = true;
									break;
								}
							}
						}
					}
					// 请求路径存在数据库中，再判断是否有权限,不存在数据库就直接过，存在break循环继续往下执行不做拦截
					if (existUrl) {
						List<Module> listModule = (List<Module>) RedisCache.getObject("listModule" + user.getUsername());
						for (Module md : listModule) {
							if (md.getUrl() != null
									&& !"".equals(md.getUrl().trim())) {
								if (urlStr
										.replaceAll("/", "")
										.trim()
										.equals(md.getUrl().replaceAll("/", "")
												.trim())) {
									okUrl = true;
									break;
								}
							}
						}
						if (!okUrl) {
							request.setAttribute("powerMessage", "权限不够");
							response.sendRedirect(loginPage);
							return false;
						} else {
							request.setAttribute("listModule", listModule);
						}
					}
					Map<String, RoleInfoDTO> permissionUrlList = (Map<String, RoleInfoDTO>)RedisCache.getObject("allUserModule" + user.getUsername());

					RedisCache.setObject("listAllUrl" + user.getUsername(), listAllUrl,Constants.OUT_TIME_1800);
					RedisCache.setObject("allUserModule" + user.getUsername(), permissionUrlList,Constants.OUT_TIME_1800);
//					UserUtil.userOpRecord(user.getId(), user.getUsername(), request);
				}
				
				/* 更新redis的有效期 30分钟 */
				RedisCache.removeObject(sid);
				RedisCache.setObject(sid, user,Constants.OUT_TIME_1800);
				/** 放入user显示登录状态 */
				request.setAttribute("loginUser", user);
			} catch (Exception e) {
				logger.error("redis异常，message=" + e.getMessage(), e);
				try {
					response.sendRedirect(loginPage);
					return false;
				} catch (IOException e1) {
				}
			}

		} else {
			sid = request.getSession().getId() + UUID.randomUUID();
			CookieUtil.setCookie(response, Constants.MEMBER, sid,
					Constants.MAX_AGE_ONE_MONTH);
			try {
				response.sendRedirect(loginPage);
				return false;
			} catch (IOException e) {
				logger.error("跳转异常，message=" + e.getMessage(), e);
			}
		}
		/** 不需要登录直接可以访问 */
		return true;
	}
}
