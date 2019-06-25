package com.njupt.shrio;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
public class AuthenticationDemo {
    public static void main(String[] args) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shrio.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject  =SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("lisi","1111");
        try{
            subject.login(token);
            if (subject.isAuthenticated()){
                System.out.println("用户登录成功");
            }

        }catch (AuthenticationException e){
            e.printStackTrace();
            System.out.println("用户登录失败");

        }
    }
}

