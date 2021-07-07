package com.gatz.discovery.test.dao;

import java.util.List;
import javax.annotation.Resource;

import com.github.pagehelper.Page;
import org.junit.Test;
import com.gatz.discovery.core.feature.mybatis.PageBean;
import com.gatz.discovery.core.feature.test.TestSupport;
import com.gatz.discovery.modules.sys.dao.UserMapper;
import com.gatz.discovery.modules.sys.model.User;
import com.gatz.discovery.modules.sys.model.UserExample;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;

    @Test

    public void test_selectByExampleAndPage() {
        start();
        PageBean<User> page = new PageBean(new Page<User>(1,3));
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }
}
