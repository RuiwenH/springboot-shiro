package com.reven.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.reven.core.Mapper;
import com.reven.model.entity.SysRole;
import com.reven.model.vo.SysRoleVo;

public interface SysRoleMapper extends Mapper<SysRole> {

    List<SysRoleVo> findRoleVoByUserId(@Param("userId") Integer userId);
}