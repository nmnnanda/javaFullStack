 package javalearning.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapIntro2 {
   public static void getEmployee(List<Employee> list)
   {
//	  list.stream()
//	  .map(emp -> {
//		  emp.setSalary((int)(emp.getSalary()+(emp.getSalary()*0.1)));	  
//		  return emp;
//	  })
//	  .forEach(emp->System.out.println(emp));
//	   
	   
//	   list.stream()
//	   .forEach(emp -> {
//		   emp.setSalary((int)(emp.getSalary()+(emp.getSalary()*0.1)));
//	   });
//	   
//	   list.stream()
//	   .forEach(emp->System.out.println(emp));
	   
	   list.stream()
	   .map(emp->new Employee(emp.getEmpId(),emp.getEmpName(),(int)(emp.getSalary()*1.1)))
			   .forEach(emp->System.out.println(emp));
	   
	   
   }
   
   public static void main(String[] args) {
		Employee e1 = new Employee(1,"Ankit",15000);
		 Employee e2 = new Employee(2,"Harsh",14000);
		 Employee e3 = new Employee(3,"Mayank",18000);
		 Employee e4 = new Employee(4,"Sunish",10000);
		 Employee e5 = new Employee(5,"Adarsh",25000);
		 Employee e6 = new Employee(6,"Vijay",21000);
		 
		 List<Employee> list = new ArrayList<>();
		 
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 list.add(e4);
		 list.add(e5);
		 list.add(e6);
		 getEmployee(list);
	}

}
