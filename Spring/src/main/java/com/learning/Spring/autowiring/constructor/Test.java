package com.learning.Spring.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoWire.xml");
		System.out.println(context.getBean("vehicle",Vehicle.class));

	}

}
