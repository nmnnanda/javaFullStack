 package javalearning.basics.decisionControlStatement;

import java.util.Scanner;

//if statement
//Syntax:   if(condition){} =>condition is true,if block will execute
//          else            =>condition is false,else block will execute
public class VotingSystem {
    public static void ageVerifier(int age){
    	if(age>=18){
    		System.out.println("Age Verification passed");
    		System.out.println("welcome to Voting");
    	
       	}else{
    		System.out.println("Age Verification failed");
    	}
    	System.out.println("Thank you");
    }
	public static void main(String[] args) {
	    System.out.println("Enter your age to continue...");
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
		VotingSystem.ageVerifier(age);

	}

}
