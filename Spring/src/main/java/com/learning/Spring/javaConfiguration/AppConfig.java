 package com.learning.Spring.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("emp")
	public Employee getEmployee(){
		return new Employee();
	}
	
	@Bean("addr1")
	public Address getAddress(){
		return new Address("Bhopal","MP","India");
	}
	
	@Bean("addr2")
	public Address getAddress2(){
		return new Address();
	}

}
