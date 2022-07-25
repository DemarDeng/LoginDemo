package com.example.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.web.common.Result;
import com.example.web.model.user;

public interface IUserService extends IService<user> {
    public Result<?> login(user user);
    public Result<?> register(user user);

}
