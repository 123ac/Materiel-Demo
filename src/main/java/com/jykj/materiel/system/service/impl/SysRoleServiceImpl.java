package com.jykj.materiel.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jykj.materiel.system.entity.SysRole;
import com.jykj.materiel.system.dao.SysRoleMapper;
import com.jykj.materiel.system.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    @Autowired
    private com.jykj.materiel.system.dao.SysRoleMapper sysRoleMapper;

    @Override
    public SysRole selectById(String id) {
        return sysRoleMapper.selectById(id);
    }
}
