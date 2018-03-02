package com.julyerr.aopdemo.dao.impl;

import com.julyerr.aopdemo.dao.UserDao;
import com.julyerr.aopdemo.model.User;
import org.springframework.stereotype.Component;

@Component("u")
public class UserDaoImpl implements UserDao {

    public void save(User user) {

        System.out.println("user saved!");
        /*throw new RuntimeException("exception");*/ //抛异常
    }

}
