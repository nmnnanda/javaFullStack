 package javalearning.ExceptionHandling;

public class TryCatch3 {
	 public static void showCharacter(String str){
		 
		 for(int i=0;i<=str.length();i++){
               System.out.println(str.charAt(i));
        	}
	    	try{
	    		String str1 = null;
	    		System.out.println(str1.length());
	    	}catch(Exception e){
	    		System.out.println("Exception handled");
	    	}
	    	System.out.println("After exception");
	    }
	public static void main(String[] args) {
		String str = "Java";
		showCharacter(str);

	}

}
