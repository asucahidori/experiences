package com.gatz.discovery.modules.sys.service.impl;

import com.gatz.discovery.core.feature.test.TestSupport;
import com.gatz.discovery.modules.cidm.model.SysUser;
import com.gatz.discovery.modules.cidm.service.SysUserService;
import com.github.pagehelper.PageInfo;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by baibing on 16/1/27.
 */
public class SysUserServiceImplTest extends TestSupport {

    @Resource
    private SysUserService testService;

    @Test
    public void testGetDao() throws Exception {

    }

    @Test
    public void testGetAllSysUsers() throws Exception {
        PageInfo<SysUser> model = testService.getAllSysUsers(new SysUser());
        Assert.assertEquals(model.getPageNum(),1);


    }
}