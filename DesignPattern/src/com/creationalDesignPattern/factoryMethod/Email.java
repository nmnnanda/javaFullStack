package com.creationalDesignPattern.factoryMethod;

public class Email implements Notification{
    
	Email(){
		System.out.println("Email object created...");
	}
	@Override
	public void userNotification() {
		System.out.println("Email service activated");
		
	}

}
