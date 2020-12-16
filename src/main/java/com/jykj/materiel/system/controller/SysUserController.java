package com.jykj.materiel.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jykj.materiel.response.Result;
import com.jykj.materiel.system.entity.SysUser;
import com.jykj.materiel.system.service.SysUserService;
import com.jykj.materiel.system.vo.SysUserVo;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: hjl
 * @Date: 2020/12/7 0007 15:12
 */
@RestController
@RequestMapping("/user")
//@CrossOrigin
public class SysUserController {
    @Autowired
    private SysUserService  sysUserService;


    @PostMapping("/findUserList")
    @ApiOperation(value="测试分页",notes = "测试查询所有用户数据")
    public Result  findUserList(@Param("current")long current,@Param("size")long size) {
        // 对用户进行分页，泛型中注入实体类
        Page<SysUser> page=new Page<>(current,size);
        Page<SysUser> userPage=sysUserService.page(page);
        long total=userPage.getTotal();
        List<SysUser> users=userPage.getRecords();
        return Result.ok().data("total",total).data("users",users);
    }
    @PostMapping("/finds")
    @ApiOperation(value="多表条件分页",notes = "测试条件查询多表所有用户数据")
    public Result  finds(@RequestBody SysUserVo userVo , @RequestParam("current")long current, @RequestParam("size")long size) {
        // 对用户进行分页，泛型中注入实体类
        Page<SysUser> page=new Page<>(current,size);
        QueryWrapper<SysUser> queryWrapper = getUserWrapper(userVo);
        IPage<SysUser> userPage=sysUserService.UserPage(page,queryWrapper);
        long total=userPage.getTotal();
        List<SysUser> users=userPage.getRecords();
        return Result.ok().data("total",total).data("users",users);
    }

    private QueryWrapper<SysUser> getUserWrapper(SysUserVo userVo){
        QueryWrapper<SysUser> queryWrapper=new QueryWrapper<>();
        if (userVo!=null){
            if (!StringUtils.isEmpty(userVo.getName())){
                queryWrapper.eq("name",userVo.getName());
            }
            if (!StringUtils.isEmpty(userVo.getRoleName())){
                queryWrapper.eq("roleName",userVo.getRoleName());
            }
        }
        return queryWrapper;
    }

    @PostMapping("/changeDelflag")
    @ApiOperation(value="更改账号状态",notes = "根据账号id更改状态是否禁用")
    public Result  changeDelflag(@Param("id")String id,@Param("delflag")Boolean delflag) {
        //更新账号状态

        return null;
    }
}
