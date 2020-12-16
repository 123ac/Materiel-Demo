package com.jykj.materiel.system.controller;

import com.jykj.materiel.system.entity.SysUser;
import com.jykj.materiel.system.service.SysUserRoleService;
import com.jykj.materiel.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: hjl
 * @Date: 2020/11/11 0011 10:12
 */
@Controller
public class RegController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @GetMapping("/regis")
    public String register(){
        return "regis";
    }

    @RequestMapping("/register")
    public String Register(SysUser sysUser){
        System.out.println("name ;"+sysUser.getName()+"  pwd:"+sysUser.getPassword());
        return sysUserService.Register(sysUser);
    }

    /**
     * 修改密码并加密
     * @param name
     * @param password
     * @param rePassword
     * @return
     */
    @RequestMapping("/modifyPass")
    public String modifyPass(String name,String password,String rePassword){
        System.out.println("name ;"+name + " 旧密码："+password +" 新密码："+rePassword);
        SysUser sysUser=sysUserService.selectByName(name);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(password,sysUser.getPassword())) {
            String encode = encoder.encode(rePassword);
            rePassword = encode;
            Integer i=sysUserService.modifyPass(name,rePassword);
            System.out.println("成功！"+i);
            return "home";
        }else {
            return "home";
        }
    }
}
