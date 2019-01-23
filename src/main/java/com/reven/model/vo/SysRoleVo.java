package com.reven.model.vo;

import java.util.List;

import com.reven.model.entity.SysPermission;
import com.reven.model.entity.SysRole;

public class SysRoleVo extends SysRole {
    private static final long serialVersionUID = 1L;
    private List<SysPermission> permissions;

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

}
