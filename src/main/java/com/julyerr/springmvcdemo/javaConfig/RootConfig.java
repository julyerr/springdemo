package com.julyerr.springmvcdemo.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "com.julyerr",
excludeFilters = {
//        spring mvc专门配置加载信息
        @ComponentScan.Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class),
        @ComponentScan.Filter(type=FilterType.ANNOTATION, value=Controller.class)
})
@Configuration
public class RootConfig {

}
