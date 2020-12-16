package com.jykj.materiel.system.dao;

import com.jykj.materiel.system.entity.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

/**
 * <p>
 * 部门表 Mapper 接口
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> findDeptAndCount();
}
