package javalearning.basics.decisionControlStatement;

import java.util.Scanner;

public class SwitchExample {
    public static void bal(){
    	System.out.println("bal is called");
    }
    public static void withdraw(){
    	System.out.println("withdraw is called");
    }
    public static void deposit(){
    	System.out.println("deposit is called");
    }
	public static void main(String[] args) {
		 char ch = 'n';
		 Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter the option ");
			System.out.println("1.bal   2.withdraw   3.deposit");
	       
	        int choice = sc.nextInt();
	        
	        switch(choice){
	        case 1: bal();
	                break;
	        case 2: withdraw();
	                break;
	        case 3: deposit();
	                break;
	        default:System.out.println("Invalid option");
	        }  
	        System.out.println("Do you want to continue");
	         ch = sc.next().charAt(0);
	 	
		    }while(ch=='y');
        System.out.println("Thank you for using SBI ATM");  
	}

}
