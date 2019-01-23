package com.reven.core.shiro;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.reven.model.entity.SysPermission;
import com.reven.model.entity.User;
import com.reven.model.vo.SysRoleVo;
import com.reven.service.ISysRoleService;
import com.reven.service.IUserService;

public class EnceladusShiroRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;
    @Autowired
    private ISysRoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String username = (String) principals.getPrimaryPrincipal();
        
        User user = userService.getUserByName(username);
        List<SysRoleVo> userRoleList=roleService.findRoleVoByUserId(user.getId());
        
        for (SysRoleVo role : userRoleList) {
            authorizationInfo.addRole(role.getRoleName());
            for (SysPermission permission : role.getPermissions()) {
                authorizationInfo.addStringPermission(permission.getName());
            }
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        User user = userService.getUserByName(username);

        if (user == null) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(),
                ByteSource.Util.bytes(user.getUserName()+user.getSalt()+user.getSalt()), getName());
        return authenticationInfo;
    }

}