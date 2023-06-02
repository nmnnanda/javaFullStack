package com.learning.Spring.SetterInjection.collectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("config.xml");
		//System.out.println(context.getBean("category",Category.class));
		System.out.println(context.getBean("category2",Category2.class));

	}

}
