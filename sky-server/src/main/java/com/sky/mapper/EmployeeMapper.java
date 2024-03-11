package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    public Employee getByUsername(String username);

    @Insert("insert into employee(name, username, password, phone, sex, id_number, status, create_time, update_time, create_user, update_user)" +
            " values " +
            "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    public void insert(Employee employee); //新增员工

    public Page<Employee> page(EmployeePageQueryDTO employeePageQueryDTO); //员工分页查询

    public void update(Employee employee); //根据主键id动态修改员工的属性值

    @Select("select * from employee where id = #{id}")
    public Employee getById(Long id);

}
