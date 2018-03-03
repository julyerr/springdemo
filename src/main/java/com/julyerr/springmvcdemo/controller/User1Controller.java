package com.julyerr.springmvcdemo.controller;

import com.julyerr.springmvcdemo.model.User1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User1Controller {

    @RequestMapping("")
    public String Create(Model model) {
        return "create";
    }

    @RequestMapping("/save")
    public String Save(@ModelAttribute("form") User1 user, Model model) {
        // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
        model.addAttribute("user", user);
        return "detail";
    }
}
