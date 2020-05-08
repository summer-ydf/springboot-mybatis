package com.itboot.demo1.mapper;

import com.itboot.demo1.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();
}
