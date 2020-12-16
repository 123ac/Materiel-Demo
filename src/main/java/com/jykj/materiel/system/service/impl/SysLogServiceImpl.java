package com.jykj.materiel.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jykj.materiel.system.entity.SysLog;
import com.jykj.materiel.system.dao.SysLogMapper;
import com.jykj.materiel.system.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public void InsertSysLog(SysLog sysLog) {
        sysLogMapper.InsertSysLog(sysLog);
    }
}
