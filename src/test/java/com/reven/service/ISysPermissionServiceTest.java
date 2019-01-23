package com.reven.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reven.model.entity.SysPermission;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ISysPermissionServiceTest {

    @Autowired
    private ISysPermissionService sysPermissionService;

    @Test
    public void testFindPermissionByRoleId() {
        List<SysPermission> list = sysPermissionService.findPermissionByRoleId(1);
        Assert.assertEquals(1, list.size());
    }

}
