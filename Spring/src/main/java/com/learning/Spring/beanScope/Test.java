package com.learning.Spring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new 
				ClassPathXmlApplicationContext("beanScope.xml");
		
		System.out.println(context.getBean("vehicle"));
		System.out.println(context.getBean("vehicle"));
	}

}
