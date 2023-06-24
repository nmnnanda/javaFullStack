 package com.learning.Spring.SetterInjection.p_namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("config2.xml");
		Employee obj = context.getBean("emp",Employee.class);
       System.out.println(obj.getEmpId());

	}

}
