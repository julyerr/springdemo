package com.julyerr.aopdemo.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
    @Pointcut("execution(public * com.julyerr.aopdemo.service..*.add(..))")
    public void myMethod(){};

    /*@Before("execution(public void com.julyerr.aopdemo.dao.impl.UserDaoImpl.save(com.julyerr.aopdemo.model.User))")*/
    @Before("myMethod()")
    public void before() {
        System.out.println("method start");
    }
    @After("myMethod()")
    public void after() {
        System.out.println("method after");
    }
    @AfterReturning("execution(public * com.julyerr.aopdemo.dao..*.*(..))")
    public void AfterReturning() {
        System.out.println("method AfterReturning");
    }
    @AfterThrowing("execution(public * com.julyerr.aopdemo.dao..*.*(..))")
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");
    }
}
