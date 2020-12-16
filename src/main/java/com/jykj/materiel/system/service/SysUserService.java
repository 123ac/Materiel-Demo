package com.jykj.materiel.system.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jykj.materiel.system.entity.SysUser;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
public interface SysUserService extends IService<SysUser> {
    SysUser selectByName(String name);

    Integer modifyPass(String name, String password);

    String Register(SysUser sysUser);

    IPage<SysUser> UserPage(Page<SysUser> page, @Param(Constants.WRAPPER) QueryWrapper<SysUser> wrapper);

//    List<SysUserRole> listByUserId(String userId);
//
//    Boolean insertUserRole(SysUserRole sysUserRole);

}
