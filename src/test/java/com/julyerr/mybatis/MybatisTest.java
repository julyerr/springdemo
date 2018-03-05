package com.julyerr.mybatis;

import com.julyerr.mybatis.dao.UserDao;
import com.julyerr.mybatis.mapper.UserMapper;
import com.julyerr.mybatis.po.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {
    @Test
//    基于Dao进行开发
    public void testDaoFind() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)ctx.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
//    基于mapper进行开发
    public void testMapperFind() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper)ctx.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
