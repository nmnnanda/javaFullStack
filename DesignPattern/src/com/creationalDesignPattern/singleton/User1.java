package com.creationalDesignPattern.singleton;

public class User1 {
   
	public void getConnection(){
		DB db = DB.getDB();
		System.out.println("from User1 "+db.hashCode());
		if(db.getUserName().equals("admin") && db.getPassword().equals("admin")){
		  System.out.println("Connection established");
		}else{
			System.out.println("Connection failed..");
		}
	}
}
