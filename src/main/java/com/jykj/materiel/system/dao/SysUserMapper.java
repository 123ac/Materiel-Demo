package com.jykj.materiel.system.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jykj.materiel.system.entity.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(String id);

    @Select("SELECT * FROM sys_user")
    List<SysUser> querys();

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);

    @Insert("insert into sys_user(name,password) values(#{name},#{password})")
    Boolean insertUser(SysUser sysUser);

    @Update("update sys_user set password = #{password} where name=#{name}")
    Integer modifyPass(@Param("name") String name, @Param("password") String password);

    IPage<SysUser> UserPages(Page<SysUser> page, @Param(Constants.WRAPPER) QueryWrapper<SysUser> queryWrapper);


}
