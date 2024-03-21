package com.example.demo.mapper;

import com.example.demo.domain.Employees;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工记录表 Mapper 接口
 * </p>
 *
 * @author 小康
 * @since 2024-03-17 09:49:31
 */
@Mapper
public interface EmployeesMapper extends BaseMapper<Employees> {

}
