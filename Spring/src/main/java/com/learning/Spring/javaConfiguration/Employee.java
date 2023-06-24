 package com.learning.Spring.javaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	
	@Autowired
	@Qualifier("addr2")
	private Address address;
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", address=" + address + "]";
	}
	

}
