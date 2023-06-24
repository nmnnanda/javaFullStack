 package javalearning.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 {
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

	public Employee2(int id, String fname, String lname, int salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}

	
	
}
class SortEmployeeById implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}
	
}

class SortEmployeeByFirstName implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 eA, Employee2 eB) {
		// TODO Auto-generated method stub
		return eA.getFname().compareTo(eB.getFname());
	}
	
}


class SortEmployeeBySalary implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getSalary() - o2.getSalary();
	}
	
}


public class ComparatorIntro {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(103,"Ankit","Kumar",1200);
		Employee2 e2 = new Employee2(105,"Vikas","Kumar",1100);
		Employee2 e3 = new Employee2(102,"Arnav","Swaroop",1400);
		Employee2 e4 = new Employee2(101,"Mayank","Swaroop",900);
		Employee2 e5 = new Employee2(100,"Sid","Kumar",1600);
		
		
		List<Employee2> listOfEmp = new ArrayList<>();
		
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		listOfEmp.add(e4);
		listOfEmp.add(e5);
		
      //Sort Employee2 based on Id
		Collections.sort(listOfEmp, new SortEmployeeById());
		System.out.println(listOfEmp);
	
		System.out.println("==========================================");
	 //Sort Employee2 based on fname
		
		Collections.sort(listOfEmp,new SortEmployeeByFirstName());
		System.out.println(listOfEmp);
		
		System.out.println("==========================================");
	//Sort Employee2 based on salary
		Collections.sort(listOfEmp,new SortEmployeeBySalary());
		System.out.println(listOfEmp);
		
		System.out.println("==========================================");
	}

}
