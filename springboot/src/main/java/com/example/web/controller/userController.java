package com.example.web.controller;

import com.example.web.common.Result;
import com.example.web.model.user;
import com.example.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public Result<?> login(@RequestBody user user){
        Result res = userService.login(user);
        return res;
    }

}
