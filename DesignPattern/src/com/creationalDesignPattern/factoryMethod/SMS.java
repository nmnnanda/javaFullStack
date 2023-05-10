package com.creationalDesignPattern.factoryMethod;

public class SMS implements Notification{
   
	SMS(){
		System.out.println("SMS object created...");
	}
	
	@Override
	public void userNotification() {
		System.out.println("SMS service activated");
		
	}
     
}
