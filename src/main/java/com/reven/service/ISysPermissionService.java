package com.reven.service;
import java.util.List;

import com.reven.core.IBaseService;
import com.reven.model.entity.SysPermission;


/**
 * Created by CodeGenerator on 2019/01/23.
 */
public interface ISysPermissionService extends IBaseService<SysPermission> {

    List<SysPermission> findPermissionByRoleId(Integer roleId);
}
