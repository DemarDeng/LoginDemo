package com.example.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web.model.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface userMapper extends BaseMapper<user> {
}
