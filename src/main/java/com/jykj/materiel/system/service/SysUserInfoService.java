package com.jykj.materiel.system.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jykj.materiel.system.entity.SysUserinfo;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
public interface SysUserInfoService extends IService<SysUserinfo> {

    IPage<SysUserinfo> UserInfoPages(Page<SysUserinfo> page, @Param(Constants.WRAPPER)QueryWrapper<SysUserinfo> wrapper);
}
