package com.reven.service.impl;

import com.reven.dao.SysRolePermissionMapper;
import com.reven.model.entity.SysRolePermission;
import com.reven.service.ISysRolePermissionService;
import com.reven.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/23.
 */
@Service
@Transactional
public class SysRolePermissionServiceImpl extends AbstractService<SysRolePermission> implements ISysRolePermissionService {
    @Resource
    private SysRolePermissionMapper sysRolePermissionMapper;

}
