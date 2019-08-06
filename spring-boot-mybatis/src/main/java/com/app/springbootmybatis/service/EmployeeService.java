package com.app.springbootmybatis.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootmybatis.dao.EmployeeMapper;
import com.app.springbootmybatis.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;

	public int addEmployee(Employee employee) {
		return employeeMapper.addEmployee(employee);
	}

	public Employee findByEmpId(Integer empId) {
		return employeeMapper.findByEmpId(empId);
	}

	public List<Employee> findAll() {
		return employeeMapper.findAll();
	}

	
	public int updateEmployee(Employee employee) {
		return employeeMapper.updateEmployee(employee);
	}

	
	public int deleteByEmpId(Integer empId) {
		return employeeMapper.deleteByEmpId(empId);
	}

}
