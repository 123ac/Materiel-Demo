package com.jykj.materiel.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.jykj.materiel.config.logConfig.SystemLogController;
import com.jykj.materiel.response.Result;
import com.jykj.materiel.system.dao.SysUserMapper;
import com.jykj.materiel.system.entity.SysUser;
import com.jykj.materiel.system.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

/**
 * @Author: hjl
 * @Date: 2020/11/10 0010 15:11
 *
 * 如代码所示，获取当前登录用户：SecurityContextHolder.getContext().getAuthentication()
 *
 * 注解 @PreAuthorize 用于判断用户是否有指定权限，没有就不能访问
 */
@Controller
@CrossOrigin //跨域
@Api(description = "登录相关api")
public class LoginController {
    private Logger logger= LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/test")
    @ResponseBody
    @ApiOperation(value="测试接口",notes = "测试查询所有用户信息")
    public Result test(){
        //int i=1/0; //测试捕获算数异常ArithmeticException
        List<SysUser> sysUser=sysUserService.list();
        return Result.ok().data("user",sysUser);
    }


    @GetMapping("/")
    @SystemLogController(description = "访问主页")
    @ApiOperation(value="页面跳转",notes = "访问主页")
    public String showHome(){
        String name= SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println("当前登录用户:"+ name);
        return "home.html";
    }
    @GetMapping("/login")
    @ApiOperation(value="访问登录页面")
    public String showLogin() {
        return "login";
    }



    @GetMapping("/modify")
    public ModelAndView modifyPass(){
        ModelAndView mav=new ModelAndView();
        String name= SecurityContextHolder.getContext().getAuthentication().getName();
        mav.addObject("name",name);
        mav.setViewName("modifyPass");
        return mav;
    }
    @GetMapping("/500")
    public String error() {
        return "500";
    }

    @GetMapping("/400")
    public String error1() {
        return "400";
    }

    @GetMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色";
    }

    @GetMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER')")
    public String printUser() {
        return "如果你看见这句话，说明你有ROLE_USER角色";
    }
}
