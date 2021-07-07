package com.gatz.discovery.modules.sys.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共视图控制器
 * 
 * @author starzou
 * @since 2014年4月15日 下午4:16:34
 **/
@Controller
@RequestMapping("")
public class CommonController {
    /**
     * dashboard页
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    /**
     * 侧边栏
     * 
     * @param request
     * @return
     */
    @RequestMapping("/toLeftBar")
    public String toLeftBar(HttpServletRequest request) {
        return "modules/cidm/leftBar";
    }

    /**
     * 表头
     *
     * @param request
     * @return
     */
    @RequestMapping("/navbar")
    public String getNavBar(HttpServletRequest request) {
        return "modules/cidm/navbar";
    }
    
    /**
     * 右侧核心数据
     *
     * @param request
     * @return
     */
    @RequestMapping("/coreData")
    public String getCoreData(HttpServletRequest request) {
        return "modules/cidm/coreData";
    }
    
    /**
     * 报表下拉列表查询
     *
     * @param request
     * @return
     */
    @RequestMapping("/toLeftQueryBar")
    public String toLeftQueryBar(HttpServletRequest request) {
        return "modules/cidm/leftQuery";
    }

    /**
     * 侧边栏
     *
     * @param request
     * @return
     */
    @RequestMapping("/footer")
    public String footer(HttpServletRequest request) {
        return "component/footer";
    }

    /**
     * 侧边栏
     *
     * @param request
     * @return
     */
    @RequestMapping("/offsidebar")
    public String offSideBar(HttpServletRequest request) {
        return "component/offsidebar";
    }

    /**
     * 侧边栏
     *
     * @param request
     * @return
     */
    @RequestMapping("/setting")
    public String index(HttpServletRequest request) {
        return "component/setting";
    }
    
    /**
     * 导航栏
     * @param request
     * @return
     */
    @RequestMapping("/navigateBar")
    public String getNavigateBar(HttpServletRequest request) {
        return "modules/cidm/navigateBar";
    }
}