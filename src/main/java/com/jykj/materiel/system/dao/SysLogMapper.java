package com.jykj.materiel.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jykj.materiel.system.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {
    void InsertSysLog(SysLog sysLog);
}
