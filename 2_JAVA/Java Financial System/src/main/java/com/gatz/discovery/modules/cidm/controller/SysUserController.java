package com.gatz.discovery.modules.cidm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gatz.discovery.modules.cidm.model.SysUser;
import com.gatz.discovery.modules.cidm.service.SysUserService;
import com.gatz.discovery.modules.cidm.util.Logger;
/**
 * Created by baibing on 2016/1/27.
 */
@Controller
@RequestMapping(value = "/sysUser")
public class SysUserController {

   // private Logger logger = LoggerFactory.getLogger(getClass());
	protected Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/listUsers")
    public ModelAndView userList(HttpServletRequest request){

        ModelAndView mv = new ModelAndView();

        mv.addObject("page",sysUserService.getAllSysUsers(new SysUser()));
        mv.setViewName("modules/cidm/userLists");

        return mv;
    }

}
