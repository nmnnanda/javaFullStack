package javalearning.basics.decisionControlStatement;

import java.util.Scanner;

public class Login {
   
	public static boolean verifyUser(String user){
		if(user.equals("admin")){
			return true;
		}
		return false;
	}
	
	public static boolean verifyPassword(String pass){
		if(pass.equals("admin")){
			return true;
		}
		return false;
	}
	
	public static String login(String user){
		boolean result = verifyUser( user);
		if(result){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your password....");
			String pass = sc.next();
			
			
			boolean pass_result = verifyPassword(pass);
			if(pass_result){
				return "Login Successful";
			}
			return "Password is not valid";
		}
		return "Username is not correct";
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to App");
		System.out.println("Enter your username....");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		String data = login(user);
		System.out.println(data);

	}

}
