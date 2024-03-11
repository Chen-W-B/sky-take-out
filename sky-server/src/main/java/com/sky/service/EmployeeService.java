package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    public Employee login(EmployeeLoginDTO employeeLoginDTO);

    public void save(EmployeeDTO employeeDTO);//新增员工

    public PageResult page(EmployeePageQueryDTO employeePageQueryDTO);//员工分页查询

    public void startOrStop(Integer status,Long id);//启用禁用员工账号

    public Employee getById(Long id); //根据id查询员工信息

    public void update(EmployeeDTO employeeDTO);

}
