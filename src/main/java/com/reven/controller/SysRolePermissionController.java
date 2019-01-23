package com.reven.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reven.model.entity.SysRolePermission;
import com.reven.service.ISysRolePermissionService;
import com.reven.controller.common.ResResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2019/01/23.
*/
@RestController
@RequestMapping("/sys/role/permission")
public class SysRolePermissionController {
    @Resource
    private ISysRolePermissionService sysRolePermissionService;

    @PostMapping("/add")
    public ResResult add(SysRolePermission sysRolePermission) {
        sysRolePermissionService.save(sysRolePermission);
        return ResResult.success();
    }

    @PostMapping("/delete")
    public ResResult delete(@RequestParam Integer id) {
        sysRolePermissionService.deleteById(id);
        return ResResult.success();
    }

    @PostMapping("/update")
    public ResResult update(SysRolePermission sysRolePermission) {
        sysRolePermissionService.update(sysRolePermission);
        return ResResult.success();
    }

    @GetMapping("/detail")
    public ResResult detail(@RequestParam Integer id) {
        SysRolePermission sysRolePermission = sysRolePermissionService.findById(id);
        return ResResult.success(sysRolePermission);
    }

    @GetMapping("/list")
    public ResResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysRolePermission> list = sysRolePermissionService.findAll();
        PageInfo<SysRolePermission> pageInfo = new PageInfo<SysRolePermission>(list);
        return ResResult.success(pageInfo);
    }
}
