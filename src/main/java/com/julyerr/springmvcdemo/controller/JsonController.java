package com.julyerr.springmvcdemo.controller;

import com.julyerr.springmvcdemo.model.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//json格式返回数据
@Controller
public class JsonController {
    @RequestMapping("/json")
    @ResponseBody
    public List<User1> JsonUser() {
        List<User1> rt = new ArrayList<User1>();
        rt.add(new User1(1, "julyerr1"));
        rt.add(new User1(2, "julyerr2"));
        return rt;
    }
}
