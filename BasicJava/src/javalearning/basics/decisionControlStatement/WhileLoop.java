 package javalearning.basics.decisionControlStatement;

//reverse a number:  = 123456 = 12345*10 +6  12345/10
public class WhileLoop {
    public static void reverseNumber(int number){
    	int rev = 0;
    	while(number>0){          //0>0
    		int rem = number%10;  //1%10 = 1
    		int quo = number/10;  //1/10 = 0
    		number = quo;         //number = 0
    		rev = rev*10+ rem;   //rev =65432*10+1=654321
    		
    	}
    	System.out.println("Reverse = "+rev);
    }
    
    
    public static void sumOfDigits(int number){
    	int sum = 0;
    	while(number>0){          
    		int rem = number%10;  
    		int quo = number/10;  
    		number = quo;         
    		   
    		sum = sum +rem;
    	}
    	System.out.println("Sum = "+ sum);
    }
	public static void main(String[] args) {
		int num = 123456;
		reverseNumber(num);
		int number = 123456;
		sumOfDigits( number);
       
	}

}

