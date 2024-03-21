package com.example.demo.service.impl;

import com.example.demo.domain.Employees;
import com.example.demo.mapper.EmployeesMapper;
import com.example.demo.service.EmployeesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工记录表 服务实现类
 * </p>
 *
 * @author 小康
 * @since 2024-03-17 09:49:31
 */
@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements EmployeesService {

}
