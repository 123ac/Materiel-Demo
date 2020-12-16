package com.jykj.materiel.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jykj.materiel.system.entity.SysLog;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
public interface SysLogService extends IService<SysLog> {
    //添加用户操作日志
    void InsertSysLog(SysLog sysLog);
}
