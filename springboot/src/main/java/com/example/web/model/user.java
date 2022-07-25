package com.example.web.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@TableName("user")
@Data
public class user extends Model<user> {
    @TableId(value = "name")
    private String name;
    private String password;
    private String phone;
    private Date birthday;
    private String email;
    private String gender;

}
