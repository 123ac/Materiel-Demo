package com.jykj.materiel.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jykj.materiel.system.dao.SysUserRoleMapper;
import com.jykj.materiel.system.entity.SysUser;
import com.jykj.materiel.system.dao.SysUserMapper;
import com.jykj.materiel.system.entity.SysUserRole;
import com.jykj.materiel.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public SysUser selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }

    @Override
    public Integer modifyPass(String name, String password) {
        return sysUserMapper.modifyPass(name,password);
    }

    @Override
    public String Register(SysUser sysUser) {
        SysUser user=sysUserMapper.selectByName(sysUser.getName());
        if (user !=null){
            System.out.println("用户名称重复");
            return "500";
        }
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        String Password = bcryptPasswordEncoder.encode(sysUser.getPassword());//加密
        sysUser.setPassword(Password);
        System.out.println("加密pwd;"+ sysUser.getPassword());
        Boolean in=sysUserMapper.insertUser(sysUser);
        SysUser user1=sysUserMapper.selectByName(sysUser.getName());
        //给用户默认user权限
        SysUserRole sysUserRole=new SysUserRole();
        sysUserRole.setUserId(user1.getId());
        sysUserRole.setRoleId("2");//ROLE_USER：2
        Boolean is=sysUserRoleMapper.insertUserRole(sysUserRole);
        return "login";
    }

    @Override
    public IPage<SysUser> UserPage(Page<SysUser> page, QueryWrapper<SysUser> wrapper) {
        return this.baseMapper.UserPages(page,wrapper);
    }
}
