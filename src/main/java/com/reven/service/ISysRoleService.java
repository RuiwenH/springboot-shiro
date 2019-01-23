package com.reven.service;
import com.reven.model.entity.SysRole;
import com.reven.model.vo.SysRoleVo;

import java.util.List;

import com.reven.core.IBaseService;


/**
 * Created by CodeGenerator on 2019/01/23.
 */
public interface ISysRoleService extends IBaseService<SysRole> {

    List<SysRoleVo> findRoleVoByUserId(Integer userId);


}
