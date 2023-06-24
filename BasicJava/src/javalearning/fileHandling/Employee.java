 package javalearning.fileHandling;

import java.io.Serializable;

public class Employee implements Serializable{
    int empid;
    String empName;
    double empSalary;
	public Employee(int empid, String empName, double empSalary) {
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
    
}
