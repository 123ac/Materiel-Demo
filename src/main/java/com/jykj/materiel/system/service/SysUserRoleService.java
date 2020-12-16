package com.jykj.materiel.system.service;

import com.jykj.materiel.system.entity.SysUserRole;

import java.util.List;

/**
 * @Author: hjl
 * @Date: 2020/12/7 0007 17:32
 */
public interface SysUserRoleService {
   List<SysUserRole> listByUserId(String userId);

   Boolean insertUserRole(SysUserRole sysUserRole);
}
