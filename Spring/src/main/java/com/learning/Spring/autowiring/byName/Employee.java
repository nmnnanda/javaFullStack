package com.learning.Spring.autowiring.byName;

public class Employee {
	private int empId;
	private String empName;
    private Dept dept;
    
    
    public Dept getDept() {
		return dept;
	}
 

	public void setDept(Dept dept) {
		System.out.println("Setter Injection happened");
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}


	
}
