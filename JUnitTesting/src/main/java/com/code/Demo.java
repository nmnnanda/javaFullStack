package com.code;

public class Demo {
	
	public int sumOfDigit(int num){
		int sum=0;
		if(num<0){
			return -1;
		}
		while(num>0){
			int rem = num%10;
			int quo = num/10; 
			sum = sum+rem;
			num = quo;
		}
		return sum;
	}
	
	
	public boolean isEven(int num){
		
		if(num%2==0)return true;
		return false;
	}
	
	 

}
