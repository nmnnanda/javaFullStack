package javalearning.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int id;
	private String fname;
	private String lname;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String fname, String lname, int salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//		Employee obj = (Employee)o;
//		return this.getId() - obj.getId();
//	}

	

	@Override
	public int compareTo(Employee emp) {
		
		//return this.getId() - emp.getId();
		//return emp.getId() - this.getId();
		
		return this.getFname().compareTo(emp.getFname());//String
	}	
	
}

public class ComparableIntro {

	public static void main(String[] args) {
		Employee e1 = new Employee(103,"Ankit","Kumar",1200);
		Employee e2 = new Employee(105,"Vikas","Kumar",1200);
		Employee e3 = new Employee(102,"Arnav","Swaroop",1200);
		Employee e4 = new Employee(101,"Mayank","Swaroop",1200);
		Employee e5 = new Employee(100,"Sid","Kumar",1200);
		
		
		List<Employee> listOfEmp = new ArrayList<>();
		
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		listOfEmp.add(e4);
		listOfEmp.add(e5);
		
		System.out.println("before sorting");
		for(Employee obj:listOfEmp){
			System.out.println(obj);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("after sorting");
		Collections.sort(listOfEmp);
		
		System.out.println(listOfEmp);
		
		
	}

}
