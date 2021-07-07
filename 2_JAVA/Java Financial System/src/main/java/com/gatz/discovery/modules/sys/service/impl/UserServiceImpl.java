package com.gatz.discovery.modules.sys.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.gatz.discovery.modules.sys.dao.UserMapper;
import com.gatz.discovery.modules.sys.model.User;
import com.gatz.discovery.modules.sys.model.UserExample;
import com.gatz.discovery.modules.sys.service.UserService;
import org.springframework.stereotype.Service;
import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.core.generic.GenericServiceImpl;

/**
 * 用户Service实现类
 *
 * @author
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

    public List<User> findList(){
        return null;
    }

}
