package com.jykj.materiel.system.service;

import com.jykj.materiel.system.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
public interface DepartmentService extends IService<Department> {
    List<Department> findDeptAndCount();
}
