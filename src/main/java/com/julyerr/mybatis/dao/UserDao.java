package com.julyerr.mybatis.dao;

import com.julyerr.mybatis.po.User;

public interface UserDao {
    //根据用户id查询用户信息
    public User findUserById(int id) throws Exception;
}
