package com.learning.Spring.autowiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("autoWire.xml");
		Student student = context.getBean("student",Student.class);
		student.m1();

	}

}
