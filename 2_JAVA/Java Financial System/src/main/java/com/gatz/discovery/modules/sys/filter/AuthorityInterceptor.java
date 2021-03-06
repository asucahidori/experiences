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
		/** ??????cookie */
		Cookie cookie = CookieUtil.getCookie(request, Constants.MEMBER);
		/** ??????cookie???????????? */
		String sid = "";

		if (!StringUtils.isEmpty(cookie)) {
			sid = cookie.getValue();
			try {
				/** ???cookie????????????????????????????????????????????????????????? */
				User user = (User) RedisCache.getObject(sid);
				request.setAttribute("loginUser", user);
				if (user == null) {
					PrintWriter out = response.getWriter();
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
					builder.append("alert(\"????????????????????? ???????????????\");");
					builder.append("window.location.href=\"");
					builder.append(loginPage);
					builder.append("\";</script>");
					out.print(builder.toString());
					out.close();
					return false;
				} else {
					// ??????url ???????????????????????????
					String url = request.getRequestURI();
					String urlStr = url.substring(request.getContextPath()
							.length(), url.length());
					boolean existUrl = false;
					boolean okUrl = false;

					// ??????????????????????????????????????? existUrl???true?????????????????????
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
					// ?????????????????????????????????????????????????????????,???????????????????????????????????????break????????????????????????????????????
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
							request.setAttribute("powerMessage", "????????????");
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
				
				/* ??????redis???????????? 30?????? */
				RedisCache.removeObject(sid);
				RedisCache.setObject(sid, user,Constants.OUT_TIME_1800);
				/** ??????user?????????????????? */
				request.setAttribute("loginUser", user);
			} catch (Exception e) {
				logger.error("redis?????????message=" + e.getMessage(), e);
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
				logger.error("???????????????message=" + e.getMessage(), e);
			}
		}
		/** ????????????????????????????????? */
		return true;
	}
}
