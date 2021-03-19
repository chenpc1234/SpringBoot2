package com.chen.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.admin.bean.User;

/**
 * @author chenpc
 * @version 1.0
 * @since 2021/3/18/03/18  17:23
 */
public interface UserService extends IService<User> {
  /**
     * 用户查询
     * @param user 用户
     * @return 用户
     **/
    public User queryUser(User user);
}
