package com.app.springbootstatic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootstatic.model.Employee;
import com.app.springbootstatic.repository.SpringBootStaticRepository;

@Service
public class SpringBootStaticService {

	@Autowired
	private SpringBootStaticRepository springBootStaticRepository;
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> empList = springBootStaticRepository.getAllEmployees();		
		return empList;
	}

	public Employee getEmployeeById(Integer empId) {
		Employee emp=springBootStaticRepository.getEmployeeById(empId);
		return emp;
	}
	
	public void addEmployee(Employee emp) {
		springBootStaticRepository.addEmployee(emp);
	}

	public void updateEmployee(Employee emp, Integer id) {
		springBootStaticRepository.updateEmployee(emp, id);
	}
	
	public void deleteEmployee(Integer id) {
		springBootStaticRepository.deleteEmployee(id);
	}
}
