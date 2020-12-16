package com.jykj.materiel.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jykj.materiel.system.entity.SysUserRole;
import com.jykj.materiel.system.dao.SysUserRoleMapper;
import com.jykj.materiel.system.service.SysUserRoleService;
import com.jykj.materiel.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户-角色表 服务实现类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Override
    public List<SysUserRole> listByUserId(String userId) {
        return sysUserRoleMapper.listByUserId(userId);
    }

    @Override
    public Boolean insertUserRole(SysUserRole sysUserRole) {
        return sysUserRoleMapper.insertUserRole(sysUserRole);
    }

}
