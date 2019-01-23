package com.reven.service.impl;

import com.reven.dao.UserMapper;
import com.reven.model.entity.User;
import com.reven.service.IUserService;
import com.reven.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/23.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

}
