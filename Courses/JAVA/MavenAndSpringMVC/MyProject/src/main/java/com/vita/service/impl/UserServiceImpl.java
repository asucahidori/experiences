package com.vita.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vita.dao.UserMapper;
import com.vita.domain.User;
import com.vita.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
 
 @Autowired
 private UserMapper userDao;

 public User getUserById(int id) {
     return userDao.selectByPrimaryKey(id);
 }
}