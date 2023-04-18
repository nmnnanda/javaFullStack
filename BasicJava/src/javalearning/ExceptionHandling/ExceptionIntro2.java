package javalearning.ExceptionHandling;

public class ExceptionIntro2 {
    public void sumOfElements(int []arr){
    	int sum=0;
    	for(int i=0;i<=arr.length;i++){
    		//sum = sum +arr[i];
    	}
    	System.out.println("Sum of elements"+sum);
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		new ExceptionIntro2().sumOfElements(arr);

	}

}
