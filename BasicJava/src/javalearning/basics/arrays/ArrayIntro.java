 package javalearning.basics.arrays;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
	
     //creating an array
		
		//1. declaration and definition
		//Syntax:   data_type  nameOfArray[] = {e1,e2,e3,e4,...,en};
		
		int arr[] = {1,2,3,4,5,6};
		
		// length == number of elements
		
		System.out.println(arr.length);//6
		
		//2. declaration and then definition
		//Syntax: data_type nameOfArray[] = new data_type[size];
		
		String arr2[] = new String[5];
		arr2[0] = "ABC";
		arr2[1] = "BCD";
		arr2[2] = "CDE";
		arr2[3] = "DEF";
		arr2[4] = "EFG";
		
		System.out.println(arr2.length);//5
		
		
		//Accessing the value 
		System.out.println("Printing the elements");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
		//index = length-1
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.println(arr[i]);//arr[0]
		}
		
		
		for(int element:arr){
			System.out.println(element);
		}
		
		//System.out.println(arr);
		
		
		// User input:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int num[] = new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++){
			num[i] = sc.nextInt();
		}
		
		System.out.println("Elements entered by user:");
		for(int nums:num){
			System.out.println(nums);
		}
		
		
		
		
		
	}

}
