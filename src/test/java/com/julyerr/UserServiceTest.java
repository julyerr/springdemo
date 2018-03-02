package com.julyerr;

import com.julyerr.aopdemo.model.User;
import com.julyerr.aopdemo.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        UserService service = (UserService)ctx.getBean("userService");
        System.out.println(service.getClass());
        service.add(new User());
        System.out.println("###");

        ctx.destroy();
    }

}

