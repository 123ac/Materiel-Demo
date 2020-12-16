package com.jykj.materiel.system.controller;


import com.jykj.materiel.handler.BusinessException;
import com.jykj.materiel.response.Result;
import com.jykj.materiel.response.ResultCode;
import com.jykj.materiel.system.entity.Department;
import com.jykj.materiel.system.service.DepartmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/findAll")
    @ApiOperation(value="查询部门",notes = "查询所有部门信息")
    public Result findAll() {
        List<Department> departments=departmentService.list();
        return  Result.ok().data("departments",departments);
    }
    @PostMapping("/findDeptAndCount")
    @ApiOperation(value="查询部门和人数",notes = "查询所有部门信息和人数")
    public Result findDeptAndCount() {
        List<Department> departments = departmentService.findDeptAndCount();
        if (departments.size()==0){
            //使用业务异常处理
            throw new BusinessException(ResultCode.DEPARTMENT_NOT_EXIST.getCode(),
                    ResultCode.DEPARTMENT_NOT_EXIST.getMessage());
        }
        return  Result.ok().data("departments",departments);
    }
}

