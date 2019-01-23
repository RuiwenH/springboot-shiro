package com.reven.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reven.model.entity.UserRole;
import com.reven.service.IUserRoleService;
import com.reven.controller.common.ResResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by CodeGenerator on 2019/01/23.
*/
@RestController
@RequestMapping("/user/role")
public class UserRoleController {
    @Resource
    private IUserRoleService userRoleService;

    @PostMapping("/add")
    public ResResult add(UserRole userRole) {
        userRoleService.save(userRole);
        return ResResult.success();
    }

    @PostMapping("/delete")
    public ResResult delete(@RequestParam Integer id) {
        userRoleService.deleteById(id);
        return ResResult.success();
    }

    @PostMapping("/update")
    public ResResult update(UserRole userRole) {
        userRoleService.update(userRole);
        return ResResult.success();
    }

    @GetMapping("/detail")
    public ResResult detail(@RequestParam Integer id) {
        UserRole userRole = userRoleService.findById(id);
        return ResResult.success(userRole);
    }

    @GetMapping("/list")
    public ResResult list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserRole> list = userRoleService.findAll();
        PageInfo<UserRole> pageInfo = new PageInfo<UserRole>(list);
        return ResResult.success(pageInfo);
    }
}
