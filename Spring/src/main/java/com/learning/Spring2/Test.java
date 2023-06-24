 package com.learning.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new 
				ClassPathXmlApplicationContext("com/learning/Spring2/config.xml");
		HelloSpring springObj =(HelloSpring) context.getBean("spring");
	    springObj.greet();
	    context.close();
	}

}

