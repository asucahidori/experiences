package com.gatz.discovery.modules.cidm.service.impl;

import com.gatz.discovery.core.feature.mybatis.PaginationContext;
import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.core.util.DateUtil;
import com.gatz.discovery.modules.cidm.dao.SysUserMapper;
import com.gatz.discovery.modules.cidm.model.SysUser;
import com.gatz.discovery.modules.cidm.model.SysUserExample;
import com.gatz.discovery.modules.cidm.service.SysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by baibing on 2016/1/27.
 */
@Service
public class SysUserServiceImpl extends GenericServiceImpl<SysUser,Long> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public GenericDao<SysUser, Long> getDao() {
        return sysUserMapper;
    }

    @Override
    public PageInfo<SysUser> getAllSysUsers (SysUser user) {

        PageHelper.startPage(PaginationContext.getPageNum(), PaginationContext.getPageSize());
        SysUserExample e = new SysUserExample();
        e.or().andCreateDateGreaterThan(DateUtil.parseStr("2015-01-01"));
        List<SysUser> rtnUsers = sysUserMapper.selectByExample(e);

        return new PageInfo<SysUser>(rtnUsers);


    }


}
