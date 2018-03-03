package com.julyerr.springmvcdemo.javaConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletException;

// 基于javaConfig和xml配置web的方式发生冲突，使用时先删除web.xml文件
//public class WebXmlAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    //    spring 容器配置
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class<?>[]{RootConfig.class};
//    }
//
//    //    spring mvc 配置
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[]{WebConfig.class};
//    }
//
//    //    映射关系
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    @Override
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        super.onStartup(servletContext);
//    }
//}
