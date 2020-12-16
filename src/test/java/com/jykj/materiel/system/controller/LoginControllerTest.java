package com.jykj.materiel.system.controller;

import com.jykj.materiel.system.entity.SysUser;
import com.jykj.materiel.system.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.HashMap;


/**
 * @Author: hjl
 * @Date: 2020/12/8 0008 10:42
 */
@SpringBootTest
class LoginControllerTest {
    @Autowired
    private SysUserService sysUserService;
    @Test
    void contextLoads() {
        List<SysUser> sysUser=sysUserService.list();
        System.out.println(sysUser.size());
    }
}