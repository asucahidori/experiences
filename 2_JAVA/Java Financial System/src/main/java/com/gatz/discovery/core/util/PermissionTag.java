package com.gatz.discovery.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.gatz.discovery.core.feature.cache.redis.RedisCache;
import com.gatz.discovery.core.util.bean.UserBean;
import com.gatz.discovery.modules.sys.controller.Constants;
import com.gatz.discovery.modules.sys.model.authority.Module;
import com.gatz.discovery.modules.sys.model.authority.User;

/**
 * 权限控制标签
 * 
 * @author xyl
 *
 */
@Repository
public class PermissionTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PermissionTag.class);

	private String url;

	private String parameter;

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int doStartTag() throws JspException {
		boolean result = false;
		// 从cookie中获取权限集合
		HttpServletRequest request = (HttpServletRequest) pageContext
				.getRequest();
		Object listModule = request.getAttribute("listModule");
		if(listModule==null){
			Cookie cookie = CookieUtil.getCookie(request, Constants.MEMBER);
			String sid = cookie.getValue();
			Object obj = RedisCache.getObject(sid);
			User user = null;
			if(obj instanceof UserBean){
				user = ((UserBean) obj).getUser();
			}
			if(obj instanceof User){
				user = (User) obj;
			}

			listModule = (List<Module>) RedisCache.getObject("listModule" + user.getUsername());
		}
		if(listModule instanceof List){
			for(Module temp : (ArrayList<Module>)listModule){
				if(temp.getUrl().equals(url)){
					if(temp.getParameter()!=null&&!"".equals(temp.getParameter())){
						if(temp.getParameter().contains("&")){
							List<String> listParam = Arrays.asList(temp.getParameter().split("&"));
							if(listParam.contains(parameter)){
								result = true;
								break;
							}
						}else{
							if(temp.getParameter().equals(parameter)){
								result = true;
								break;
							}
						}
					} else {
						result = true;
						break;
					}
				}
			}
		}
		if (result) {
			return EVAL_BODY_INCLUDE;
		} else {
			return SKIP_BODY;
		}
		// return result? EVAL_BODY_INCLUDE :
		// SKIP_BODY;//真：返回EVAL_BODY_INCLUDE（执行标签）；假：返回SKIP_BODY（跳过标签不执行）
	}

	@Override
	public int doEndTag() throws JspException {

		return super.doEndTag();
	}

	@Override
	public int doAfterBody() throws JspException {
		return super.doAfterBody();
	}
	
	public static void main(String[] args) {
		System.out.println("status=1&".substring(0, "status=1&".indexOf("&")));
	}
}
