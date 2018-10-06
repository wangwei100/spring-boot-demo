package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "index";
    }


    @RequestMapping("/getUsername")
    @ResponseBody
    public String getUsername(Long id) {
        return userMapper.selectByPrimaryKey(id).getUsername();
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
