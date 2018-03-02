package com.julyerr.aopdemo.service;

import com.julyerr.aopdemo.dao.UserDao;
import com.julyerr.aopdemo.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("userService")
public class UserService {

    private UserDao userDAO;

    public void init() {
        System.out.println("init");
    }

    public void add(User user) {
        userDAO.save(user);
    }
    public UserDao getUserDAO() {
        return userDAO;
    }

    @Resource(name="u")
    public void setUserDAO( UserDao userDAO) {
        this.userDAO = userDAO;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}