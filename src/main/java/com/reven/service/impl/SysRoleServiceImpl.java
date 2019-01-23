package com.reven.service.impl;

import com.reven.dao.SysRoleMapper;
import com.reven.model.entity.SysRole;
import com.reven.model.vo.SysRoleVo;
import com.reven.service.ISysRoleService;
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
public class SysRoleServiceImpl extends AbstractService<SysRole> implements ISysRoleService {
    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRoleVo> findRoleVoByUserId(Integer userId) {
        // TODO Auto-generated method stub
        return sysRoleMapper.findRoleVoByUserId(userId);
    }

}
