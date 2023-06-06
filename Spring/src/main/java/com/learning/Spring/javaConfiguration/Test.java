package com.learning.Spring.javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Employee emp = context.getBean("emp",Employee.class);
//        emp.setEmpId(102);
//        emp.setEmpName("Amit");
//        emp.setDept("Development");
//        System.out.println(emp);
//        
//        Address adr = context.getBean("getAddress",Address.class);
//        System.out.println(adr);
        
		
		Employee emp = context.getBean("emp",Employee.class);
		emp.setEmpId(102);
		emp.setEmpName("Amit");
		 emp.setDept("Development");
		 
		 System.out.println(emp);
		
	}

}
