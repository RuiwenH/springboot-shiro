package com.reven.service.impl;

import com.reven.dao.SysPermissionMapper;
import com.reven.model.entity.SysPermission;
import com.reven.service.ISysPermissionService;
import com.reven.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/01/23.
 */
@Service
@Transactional
public class SysPermissionServiceImpl extends AbstractService<SysPermission> implements ISysPermissionService {
    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> findPermissionByRoleId(Integer roleId) {
        return sysPermissionMapper.findPermissionByRoleId(roleId);
    }

}
