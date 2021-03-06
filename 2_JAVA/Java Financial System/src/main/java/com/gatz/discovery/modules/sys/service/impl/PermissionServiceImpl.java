package com.gatz.discovery.modules.sys.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;
import com.gatz.discovery.modules.sys.dao.PermissionMapper;
import com.gatz.discovery.modules.sys.model.Permission;
import com.gatz.discovery.modules.sys.service.PermissionService;

/**
 * 权限Service实现类
 *
 * @author
 * @since 2014年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
