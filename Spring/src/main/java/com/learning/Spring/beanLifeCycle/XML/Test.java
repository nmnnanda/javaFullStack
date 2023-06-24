 package com.learning.Spring.beanLifeCycle.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle.xml");
        Book book = context.getBean("book",Book.class);
	    System.out.println(book);
	    context.registerShutdownHook();
	    
	}

}
