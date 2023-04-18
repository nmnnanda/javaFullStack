package javalearning.ExceptionHandling;

public class TryCatch4 {
        public static int sum(int []arr){
        	int sum = 0;
        	try{
        		for(int i=0;i<arr.length;i++){
        			sum = sum+arr[i];
        		}
        	}catch(Exception e){
        		return -1;
        	}
        	return sum;
        }
	public static void main(String[] args) {
		
          int[] arr = {1,2,3};
          int result = sum(arr);
          System.out.println(result);
	}
	
	public boolean verifyUser(String name){
		if(name.equals("admin")){
			return true;
		}
		return false;
	}

}








