package com.reven.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.reven.core.Mapper;
import com.reven.model.entity.SysPermission;

public interface SysPermissionMapper extends Mapper<SysPermission> {
    List<SysPermission> findPermissionByRoleId(@Param("roleId") Integer roleId);
}