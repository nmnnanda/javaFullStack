package com.creationalDesignPattern.factoryMethod;

public class PushNotification implements Notification{

	
	PushNotification(){
		System.out.println("PushNotification object created...");
	}
	
	@Override
	public void userNotification() {
		System.out.println("PushNotification service activated");
		
	}

}
