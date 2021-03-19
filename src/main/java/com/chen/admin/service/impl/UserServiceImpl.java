package com.chen.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.admin.bean.User;
import com.chen.admin.mapper.UserMapper;
import com.chen.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/18/03/18  14:39
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUser(User user){
        return userMapper.queryUserByName(user.getUserName());
    }
}
