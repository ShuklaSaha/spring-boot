package com.app.springbootmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootmybatis.model.Employee;
import com.app.springbootmybatis.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {

		return employeeService.findAll();
	}

	@RequestMapping(value = "/find/{empId}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable Integer empId) {
		return employeeService.findByEmpId(empId);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
		int count=employeeService.addEmployee(emp);
	
			return new ResponseEntity<String>(count+" Employee added successfully!", HttpStatus.OK);
		}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<String> updateEmployee(@RequestBody Employee emp) {
		int count=employeeService.updateEmployee(emp);
		return new ResponseEntity<String>(count+" Employee updated successfully!", HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {

		int count= employeeService.deleteByEmpId(id);
		return new ResponseEntity<String>(count+" Employee deleted successfully!", HttpStatus.OK);

	}

}
