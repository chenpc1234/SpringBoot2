package com.chen.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.admin.bean.User;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/2/23/02/23  17:24
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 使用名字查询用户
     * @param name 名字
     * @return 用户
     */
    public User queryUserByName(String name);
}
