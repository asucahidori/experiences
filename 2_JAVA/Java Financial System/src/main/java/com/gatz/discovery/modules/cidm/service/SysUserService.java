package com.gatz.discovery.modules.cidm.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.cidm.model.SysUser;
import com.github.pagehelper.PageInfo;

/**
 * Created by baibing on 2016/1/27.
 */
public interface SysUserService extends GenericService<SysUser, Long> {

    public PageInfo<SysUser> getAllSysUsers(SysUser u);

}
