package com.jykj.materiel.system.service.impl;

import com.jykj.materiel.system.entity.Department;
import com.jykj.materiel.system.dao.DepartmentMapper;
import com.jykj.materiel.system.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Override
    public List<Department> findDeptAndCount() {
        return this.baseMapper.findDeptAndCount();
    }
}
