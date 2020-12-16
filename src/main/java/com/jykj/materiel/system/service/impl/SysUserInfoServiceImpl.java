package com.jykj.materiel.system.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jykj.materiel.system.dao.SysUserinfoMapper;
import com.jykj.materiel.system.entity.SysUserinfo;
import com.jykj.materiel.system.service.SysUserInfoService;

import com.jykj.materiel.system.vo.UserInfoVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@Service
public class SysUserInfoServiceImpl extends ServiceImpl<SysUserinfoMapper, SysUserinfo> implements SysUserInfoService {



    @Override
    public IPage<SysUserinfo> UserInfoPages(Page<SysUserinfo> page, QueryWrapper<SysUserinfo> wrapper) {
        return this.baseMapper.UserInfoPages(page,wrapper);
    }
}
