package com.example.demo.mapper;

import com.example.demo.entity.User;

/**
 * 用户功能的持久层接口
 */
public interface UserMappeer {

    /**
     * 用户注册的方法
     *
     * @param user 用户数据
     * @return 受影响的行数
     */
    Integer addnew(User user);
}
