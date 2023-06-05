package com.learning.Spring.factoryMethod;

public class Developer {
	private static final Developer dev = new Developer();
	private Developer(){}
	
	public  static Developer getDeveloper(){
		System.out.println("Inside factory method");
		return dev;
	}
	
	public void getJob(){
		System.out.println("To develop some application");
	}

}
