package com.reven.dao;

import org.apache.ibatis.annotations.Param;

import com.reven.core.Mapper;
import com.reven.model.entity.User;

public interface UserMapper extends Mapper<User> {

    User getUserByName(@Param("userName") String userName);
}