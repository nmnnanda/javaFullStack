 package javalearning.ExceptionHandling;

public class TryCatch2 {
    public static void showCharacter(String str){
    	try{
    		for(int i=0;i<=str.length();i++){
    			
    			//StringIndexOutOfBoundsException
        		System.out.println(str.charAt(i));
        	}
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
