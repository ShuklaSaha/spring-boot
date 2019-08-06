package com.app.springbootmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.app.springbootmybatis.model.Employee;

@Mapper
public interface EmployeeMapper {
	
	@Insert("INSERT INTO employee(empId,empName,empRole) VALUES(#{empId},#{empName},#{empRole})")
	public  int addEmployee(Employee employee);
	
	@Select("SELECT * FROM employee where empId=#{empId}")
	public Employee findByEmpId(Integer empId);

	@Select("SELECT * FROM employee")
	public List<Employee> findAll();
	
	@Update("update employee set empName=#{empName},empRole=#{empRole} where empId=#{empId}")
	public int updateEmployee(Employee employee);
	
	@Delete("DELETE FROM employee WHERE empId=#{empId}")
	public int deleteByEmpId(Integer empId);
	
}
