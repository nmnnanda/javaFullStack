 package javalearning.ExceptionHandling;


public class TryCatchIntro {
	 public static void sumOfElements(int []arr){
	    	int sum=0;
	    	try{
	    		for(int i=0;i<=arr.length;i++){
		    		sum = sum +arr[i];
		    	}
	    		System.out.println("Sum of elements"+sum);
	    	}catch(ArrayIndexOutOfBoundsException obj){
	    		//System.out.println("Exception handled");
	    		obj.printStackTrace();
	    	}
	    	System.out.println("After exception");
	    	
	    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		sumOfElements(arr);

	}

}
