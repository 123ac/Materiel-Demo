package com.jykj.materiel.system.dao;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jykj.materiel.system.entity.SysUserinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@Mapper
public interface SysUserinfoMapper extends BaseMapper<SysUserinfo> {
    IPage<SysUserinfo> UserInfoPages(Page<SysUserinfo> page, @Param(Constants.WRAPPER) QueryWrapper<SysUserinfo> queryWrapper);
}
