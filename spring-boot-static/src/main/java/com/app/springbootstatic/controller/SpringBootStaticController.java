package com.app.springbootstatic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootstatic.model.Employee;
import com.app.springbootstatic.service.SpringBootStaticService;

@RestController
@RequestMapping("/employee")
public class SpringBootStaticController {
	@Autowired
	SpringBootStaticService springBootStaticService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {

		return springBootStaticService.getAllEmployees();
	}

	@RequestMapping(value = "/get/{empId}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable Integer empId) {
		return springBootStaticService.getEmployeeById(empId);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
		springBootStaticService.addEmployee(emp);
		return new ResponseEntity<String>("Employee added successfully!", HttpStatus.OK);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateEmployee(@RequestBody Employee emp, @PathVariable Integer id) {
		springBootStaticService.updateEmployee(emp, id);
		return new ResponseEntity<String>("Employee updated successfully!", HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {

		springBootStaticService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted successfully!", HttpStatus.OK);

	}
}
