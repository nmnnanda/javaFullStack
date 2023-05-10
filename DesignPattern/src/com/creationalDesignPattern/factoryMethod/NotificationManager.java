package com.creationalDesignPattern.factoryMethod;

public class NotificationManager {
     public Notification createNotification(String serviceName){
    	 if(serviceName==null || serviceName.isEmpty()){
    		 throw new IllegalArgumentException("Invalid service "+serviceName);
        	 
    	 }
    	 if(serviceName.equalsIgnoreCase("SMS")){
    		 return new SMS();
    	 }else if(serviceName.equalsIgnoreCase("Email")){
    		 return new Email();
    	 }else if(serviceName.equalsIgnoreCase("PushNotification")){
    		 return new PushNotification();
    	 }else{
    		 throw new IllegalArgumentException("Invalid service "+serviceName);
    	 }
     }
}
