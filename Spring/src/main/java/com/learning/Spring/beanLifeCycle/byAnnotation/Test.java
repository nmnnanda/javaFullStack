package com.learning.Spring.beanLifeCycle.byAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("beanLifecyclebyAnnotation.xml");
     System.out.println(context.getBean("book",Book.class));
	context.registerShutdownHook();
	}

}
