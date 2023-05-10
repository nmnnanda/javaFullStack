package com.creationalDesignPattern.singleton;

public class Main {

	public static void main(String[] args) {
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		user1.getConnection();
		user2.getConnection();

	}

}
