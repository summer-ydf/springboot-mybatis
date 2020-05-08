package com.itboot.demo1.controller;

import com.alibaba.fastjson.JSONObject;
import com.itboot.demo1.pojo.User;
import com.itboot.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    /***
     * 查询所有List集合
     * @return
     */
    @GetMapping(value = "index")
    public JSONObject index(){
        List<User> userList = userService.findAll();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","200");
        jsonObject.put("msg","success");
        jsonObject.put("data",userList);
        return jsonObject;
    }
}
