package com.jykj.materiel.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jykj.materiel.response.Result;
import com.jykj.materiel.system.vo.UserInfoVo;
import com.jykj.materiel.system.entity.SysUserinfo;
import com.jykj.materiel.system.service.SysUserInfoService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@RestController
@RequestMapping("/sysUserInfo")
@CrossOrigin
public class SysUserInfoController {

    @Autowired
    private SysUserInfoService userInfoService;

    /**
     * 单表无条件分页查询
     * @param current
     * @param size
     * @return
     */
    @PostMapping("/findUserInfoList")
    @ApiOperation(value="测试分页",notes = "测试查询所有用户数据")
    public Result findUserList(@Param("current")long current, @Param("size")long size) {
        // 对用户进行分页，泛型中注入实体类
        Page<SysUserinfo> page=new Page<>(current,size);
        Page<SysUserinfo> userInfoPage=userInfoService.page(page);
        long total=userInfoPage.getTotal();
        List<SysUserinfo> userInfoList=userInfoPage.getRecords();
        return Result.ok().data("total",total).data("userInfoList",userInfoList);
    }

    /**
     * 多表条件分页查询
     * @param current
     * @param size
     * @return
     */
    @PostMapping("/findLists")
    @ApiOperation(value="多表条件分页",notes = "测试多表条件分页查询所有用户数据")
    public Result findLists(@RequestBody UserInfoVo userInfoVo, @RequestParam("current")long current, @RequestParam("size")long size) {
        // 自定义sql 进行分页查询
        Page<SysUserinfo> page=new Page<>(current,size);
        QueryWrapper<SysUserinfo> queryWrapper = getUserWrapper(userInfoVo);
        IPage<SysUserinfo> userInfoPage=userInfoService.UserInfoPages(page,queryWrapper);
        long total=userInfoPage.getTotal();
        List<SysUserinfo> userInfoList=userInfoPage.getRecords();
        return Result.ok().data("total",total).data("userInfoList",userInfoList);
    }

    private QueryWrapper<SysUserinfo> getUserWrapper(UserInfoVo userInfoVo){
        QueryWrapper<SysUserinfo> queryWrapper=new QueryWrapper<>();
        if (userInfoVo!=null){
            if (!StringUtils.isEmpty(userInfoVo.getDepId())){
                queryWrapper.eq("departmentId",userInfoVo.getDepId());
            }
            if (!StringUtils.isEmpty(userInfoVo.getUserName())){
                queryWrapper.eq("userName",userInfoVo.getUserName());
            }
            if (!StringUtils.isEmpty(userInfoVo.getNickname())){
                queryWrapper.eq("nickName",userInfoVo.getNickname());
            }
            if (!StringUtils.isEmpty(userInfoVo.getSex())){
                queryWrapper.eq("sex",userInfoVo.getSex());
            }
            if (!StringUtils.isEmpty(userInfoVo.getEmail())){
                queryWrapper.eq("email",userInfoVo.getEmail());
            }
            if (!StringUtils.isEmpty(userInfoVo.getPhone())){
                queryWrapper.eq("phone",userInfoVo.getPhone());
            }
       }
        return queryWrapper;
    }
}

