 package com.learning.Spring.SetterInjection.p_namespace;

public class Employee {
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpId(int empId) {
		System.out.println(empId);
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	

}
