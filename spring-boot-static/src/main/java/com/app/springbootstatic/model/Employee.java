package com.app.springbootstatic.model;

public class Employee {
	private Integer empId;
	private String empName;
	private String empRole;
	
	
	
	public Employee(Integer empId, String empName, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}
	public Employee(Employee emp) {
		
		emp.setEmpId(empId);
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	

}
