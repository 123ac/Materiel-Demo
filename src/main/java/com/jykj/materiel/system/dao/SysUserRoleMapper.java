package com.jykj.materiel.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jykj.materiel.system.entity.SysUserRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户-角色表 Mapper 接口
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(String userId);

    @Insert("Insert into sys_user_role values(#{userId},#{roleId})")
    Boolean insertUserRole(SysUserRole sysUserRole);
}
