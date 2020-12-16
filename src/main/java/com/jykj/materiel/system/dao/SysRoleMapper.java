package com.jykj.materiel.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jykj.materiel.system.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(String id);
}
