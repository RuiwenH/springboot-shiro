package com.reven.service.impl;

import com.reven.dao.UserRoleMapper;
import com.reven.model.entity.UserRole;
import com.reven.service.IUserRoleService;
import com.reven.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/23.
 */
@Service
@Transactional
public class UserRoleServiceImpl extends AbstractService<UserRole> implements IUserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

}
