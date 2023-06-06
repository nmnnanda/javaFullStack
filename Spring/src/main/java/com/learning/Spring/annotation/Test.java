package com.learning.Spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("autowirebyannotation.xml");
        Student student = context.getBean("student",Student.class);
	    student.getdata();
	}

}
