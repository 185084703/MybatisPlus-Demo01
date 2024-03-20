package com.example.demo.controller;


import com.example.demo.domain.Employees;
import com.example.demo.service.EmployeesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 员工记录表 前端控制器
 * </p>
 *
 * @author 小康
 * @since 2024-03-17 09:49:31
 */
@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Resource
    private EmployeesService employeesService;



    @GetMapping("/getById")
    public Employees selectById(Integer id){
       return this.employeesService.getById(id);
    }

}

