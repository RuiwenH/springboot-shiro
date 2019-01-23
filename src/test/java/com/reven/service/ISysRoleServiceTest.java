package com.reven.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reven.model.vo.SysRoleVo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ISysRoleServiceTest {

    @Autowired
    private ISysRoleService sysRoleService;

    @Test
    public void testFindRoleVoByUserId() {
        List<SysRoleVo> sysRoles = sysRoleService.findRoleVoByUserId(1);
        Assert.assertEquals(2, sysRoles.size());
    }

}
