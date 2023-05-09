package javalearning.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class CountIntro {
    public static void getCount(List<EmployeeData> list){
     	long count = list.stream()
     			    .filter(obj->obj.getWorkingYears()>=4)
     			    .count();
     	
     	System.out.println(count);
    }
    public static void getEmployee(List<EmployeeData> list){
     	       list.stream()
     			    .filter(obj->obj.getWorkingYears()>=4)
     			    .forEach(obj->System.out.println(obj));
     	
     	
    }
	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData(1,"Ankit",15000,3);
		 EmployeeData e2 = new EmployeeData(2,"Harsh",14000,5);
		 EmployeeData e3 = new EmployeeData(3,"Mayank",18000,4);
		 EmployeeData e4 = new EmployeeData(4,"Sunish",10000,6);
		 EmployeeData e5 = new EmployeeData(5,"Adarsh",25000,2);
		 EmployeeData e6 = new EmployeeData(6,"Vijay",21000,9);
		 
		 List<EmployeeData> list = new ArrayList<>();
		 
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 list.add(e4);
		 list.add(e5);
		 list.add(e6);
		// getCount(list);
		 getEmployee(list);
	}

}
