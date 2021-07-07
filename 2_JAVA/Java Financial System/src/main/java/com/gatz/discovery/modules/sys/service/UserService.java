package com.gatz.discovery.modules.sys.service;

import com.gatz.discovery.core.generic.GenericService;
import com.gatz.discovery.modules.sys.model.User;

import java.util.List;

/**
 * 用户 业务 接口
 * 
 * @author
 * @since 2014年7月5日 上午11:53:33
 **/
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);

    List<User> findList();


}
