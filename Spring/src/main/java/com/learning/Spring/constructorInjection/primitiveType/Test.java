 package com.learning.Spring.constructorInjection.primitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context =new 
			ClassPathXmlApplicationContext("config2.xml");
    System.out.println(context.getBean("vehicle",Vehicle.class));
	}

}
