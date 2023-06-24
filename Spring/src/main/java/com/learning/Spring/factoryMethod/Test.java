 package com.learning.Spring.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new 
			ClassPathXmlApplicationContext("factoryMethod.xml");

	Developer dev = context.getBean("developer",Developer.class);
	dev.getJob();
	
	}

}
