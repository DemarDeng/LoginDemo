package com.example.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.web.common.Result;
import com.example.web.dao.userMapper;
import com.example.web.model.user;
import com.example.web.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceImpl extends ServiceImpl<userMapper, user> implements IUserService {
    @Resource
    userMapper userMapper;
    @Override
    public Result<?> login(user user){
        QueryWrapper<user> wrapper = new QueryWrapper<>();
        wrapper.eq("name",user.getName()).eq("password",user.getPassword());
        user user1 = userMapper.selectOne(wrapper);
        if(user1!=null){
            return Result.success();
        }
        return Result.error("-1","登陆失败：用户和密码不匹配！");
    }
    @Override
    public Result<?> register(user user){

        return null;
    }

}
