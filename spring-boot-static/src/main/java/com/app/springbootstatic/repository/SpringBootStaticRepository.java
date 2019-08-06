package com.app.springbootstatic.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.app.springbootstatic.model.Employee;

@Component
public class SpringBootStaticRepository {
	
	static List<Employee> empList=defaultEmployeeList();
			
	

	public List<Employee> getAllEmployees() {
		System.out.println("size is:"+empList.size());
		return empList;

	}

	public Employee getEmployeeById(Integer empId) {
		return empList.stream().filter(x -> x.getEmpId().equals(empId)).findFirst().get();
	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	public void updateEmployee(Employee emp, Integer id) {

		int count = 0;
		for (Employee e : empList) {
			if (e.getEmpId().equals(id)) {
				System.out.println("Inside update");
				empList.set(count, emp);
				break;
			}
			count++;
		}

	}
	public void deleteEmployee(Integer id) {
		empList.removeIf(emp->emp.getEmpId().equals(id));
	}

	private static List<Employee> defaultEmployeeList() {
		
		empList = new ArrayList<>(
				Arrays.asList(new Employee(1234, "Harish", "Co-ordinator"), 
						new Employee(1235, "Dinesh", "Developer"),
						new Employee(1236, "Jack", "Tester"), 
						new Employee(2376, "Ravi", "QA")));
		return empList;
	}
}
