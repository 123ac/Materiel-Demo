package com.jykj.materiel.system.controller;

import com.jykj.materiel.response.Result;
import com.jykj.materiel.system.entity.Department;
import com.jykj.materiel.system.service.DepartmentService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;



/**
 * @Author: hjl
 * @Date: 2020/12/11 0011 13:21
 */
@SpringBootTest
class DepartmentControllerTest {

    @Autowired
    private DepartmentService departmentService;


    @Test
    public void findAll() {
        List<Department> departments=departmentService.list();
        System.out.println(Result.ok().data("records",departments));
    }
}