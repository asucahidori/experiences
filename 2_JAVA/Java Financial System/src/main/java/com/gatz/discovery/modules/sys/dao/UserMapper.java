package com.gatz.discovery.modules.sys.dao;

import java.util.List;

import com.gatz.discovery.modules.sys.model.UserExample;
import org.apache.ibatis.annotations.Param;
import com.gatz.discovery.core.feature.mybatis.PageBean;
import com.gatz.discovery.core.generic.GenericDao;
import com.gatz.discovery.modules.sys.model.User;

/**
 * 用户Dao接口
 * 
 * @author
 * @since 2014年7月5日 上午11:49:57
 **/
public interface UserMapper extends GenericDao<User, Long> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     * 
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(PageBean<User> page, UserExample example);
}