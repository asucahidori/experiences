package com.gatz.discovery.modules.sys.controller;

import com.gatz.discovery.core.feature.cache.redis.RedisCache;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gatz.discovery.modules.sys.model.User;
import com.gatz.discovery.core.security.PermissionSign;
import com.gatz.discovery.core.security.RoleSign;
import com.gatz.discovery.core.util.CookieUtil;
import com.gatz.discovery.core.util.ReadAuthorityPropertiesTool;
import com.gatz.discovery.modules.sys.service.UserService;

import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;

/**
 * 用户控制器
 * 
 * @author
 * @since 2014年5月28日 下午3:54:00
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     * 
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
        try {
            Subject subject = SecurityUtils.getSubject();
            // 已登陆则 跳到首页
            if (subject.isAuthenticated()) {
                return "redirect:/";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "modules/sys/login";
            }
            // 身份验证
            subject.login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
            // 验证成功在Session中保存用户信息
            final User authUserInfo = userService.selectByUsername(user.getUsername());
            request.getSession().setAttribute("userInfo", authUserInfo);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "modules/sys/login";
        }
        return "redirect:/";
    }

       /**
     * 用户登出
     * 
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletResponse response,
			HttpServletRequest request) {
        // 登出操作
        removeRedisByCookieSid(request,response);
        return "redirect:/index";
    }

    public void removeRedisByCookieSid(HttpServletRequest request,HttpServletResponse response) {
		Cookie cookie = CookieUtil.getCookie(request, Constants.MEMBER);
//		if(!username.equals("")||username!=null){
//			RedisCache.removeObject("allUserModule"+username);
//			RedisCache.removeObject("listModule"+username);
//			RedisCache.removeObject("listAllUrl"+username);
//		}
		/** 判断cookie是否为空 */
		String sid = "";
		if (!StringUtils.isEmpty(cookie)) {
			sid = cookie.getValue();
			RedisCache.removeObject(sid);
			CookieUtil.deleteCookie(response, cookie);
		}
	}
    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    /**
     * 基于权限标识的权限控制案例
     */
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionSign.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }
    
    public static void  main(String[] args){
        System.out.println(ReadAuthorityPropertiesTool.getValue("authority.domain"));
    }
}
