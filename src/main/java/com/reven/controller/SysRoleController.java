package com.reven.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reven.model.entity.SysRole;
import com.reven.service.ISysRoleService;
import com.reven.controller.common.ResResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2019/01/23.
*/
@RestController
@RequestMapping("/sys/role")
public class SysRoleController {
    @Resource
    private ISysRoleService sysRoleService;

    @PostMapping("/add")
    public ResResult add(SysRole sysRole) {
        sysRoleService.save(sysRole);
        return ResResult.success();
    }

    @PostMapping("/delete")
    public ResResult delete(@RequestParam Integer id) {
        sysRoleService.deleteById(id);
        return ResResult.success();
    }

    @PostMapping("/update")
    public ResResult update(SysRole sysRole) {
        sysRoleService.update(sysRole);
        return ResResult.success();
    }

    @GetMapping("/detail")
    public ResResult detail(@RequestParam Integer id) {
        SysRole sysRole = sysRoleService.findById(id);
        return ResResult.success(sysRole);
    }

    @GetMapping("/list")
    public ResResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysRole> list = sysRoleService.findAll();
        PageInfo<SysRole> pageInfo = new PageInfo<SysRole>(list);
        return ResResult.success(pageInfo);
    }
}
