package com.jykj.materiel.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jykj.materiel.system.entity.SysRole;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
public interface SysRoleService extends IService<SysRole> {
    SysRole selectById(String id);
}
