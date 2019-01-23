package com.reven.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reven.model.entity.SysPermission;
import com.reven.service.ISysPermissionService;
import com.reven.controller.common.ResResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2019/01/23.
*/
@RestController
@RequestMapping("/sys/permission")
public class SysPermissionController {
    @Resource
    private ISysPermissionService sysPermissionService;

    @PostMapping("/add")
    public ResResult add(SysPermission sysPermission) {
        sysPermissionService.save(sysPermission);
        return ResResult.success();
    }

    @PostMapping("/delete")
    public ResResult delete(@RequestParam Integer id) {
        sysPermissionService.deleteById(id);
        return ResResult.success();
    }

    @PostMapping("/update")
    public ResResult update(SysPermission sysPermission) {
        sysPermissionService.update(sysPermission);
        return ResResult.success();
    }

    @GetMapping("/detail")
    public ResResult detail(@RequestParam Integer id) {
        SysPermission sysPermission = sysPermissionService.findById(id);
        return ResResult.success(sysPermission);
    }

    @GetMapping("/list")
    public ResResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysPermission> list = sysPermissionService.findAll();
        PageInfo<SysPermission> pageInfo = new PageInfo<SysPermission>(list);
        return ResResult.success(pageInfo);
    }
}
