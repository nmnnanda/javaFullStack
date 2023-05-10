package com.creationalDesignPattern.singleton;

public class User2 {
	public void getConnection(){
		DB db = DB.getDB();
		System.out.println("from User2 "+db.hashCode());
		if(db.getUserName().equals("admin") && db.getPassword().equals("admin")){
		  System.out.println("Connection established");
		}else{
			System.out.println("Connection failed..");
		}
	}
}
