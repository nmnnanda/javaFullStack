package com.learning.Spring.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("autoWire.xml");
//		Employee emp = context.getBean("emp",Employee.class);
//		emp.m2();
		
		System.out.println(context.getBean("emp",Employee.class));

	}

}
