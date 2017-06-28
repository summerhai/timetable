package com.canghailongyin.filter;

import com.canghailongyin.pojo.User;
import com.canghailongyin.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mingyue on 2017/6/27.
 */
public class RelamFilter extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String loginName = (String) principalCollection.fromRealm(getName()).iterator().next();
        //到数据库查是否有此对象
        User user = userService.getUserByAccount(loginName);
        if (user != null) {
            if(user.getU_available() != 1){
                throw new AuthenticationException("该账号已被禁用");
            }
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //用户的角色集合
            info.addRole(user.getRole());
//            info.setRoles(user.getRolesName());
            //用户的角色对应的所有权限，如果只使用角色定义访问权限，下面的四行可以不要
//            List<Role> roleList = user.getRoleList();
//            for (Role role : roleList) {
//                info.addStringPermissions(role.getPermissionsString());
//            }
            return info;
        }
        return null;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //查出是否有此用户
        User user = userService.getUserByAccount(token.getUsername());
        if (user != null) {
            if(user.getU_available() != 1){
                throw new AuthenticationException("该账号已被禁用");
            }
            //若存在，将此用户存放到登录认证info中
            return new SimpleAuthenticationInfo(user.getU_account(), user.getU_password(), getName());
        }
        return null;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
