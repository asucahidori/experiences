package com.gatz.discovery.modules.sys.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.gatz.discovery.modules.sys.dao.RoleMapper;
import com.gatz.discovery.modules.sys.model.Role;
import com.gatz.discovery.modules.sys.service.RoleService;
import org.springframework.stereotype.Service;
import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;

/**
 * 角色Service实现类
 *
 * @author
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
