 package javalearning.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class FiterIntro2 {
    public static void getEmployee(List<Employee> list){
    	list.stream()
    	.filter(obj->obj.getSalary()>16000 
    			&& obj.getEmpName().startsWith("A"))
    	.forEach(obj->System.out.println(obj.getEmpId()+" "+obj.getEmpName()));
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
