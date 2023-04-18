package javalearning.ExceptionHandling;

public class TryCatch5 {
       public static void display(String str){
    	   try{
    		   System.out.println(str.toLowerCase());
    		   try{
    			   System.out.println(str.toUpperCase());
    		   }catch(NullPointerException npe){
    			   System.out.println("Exception handled by Inner catch");
    		   }
    	   }catch(Exception e){
    		   System.out.println("Exception handled");
    	   }
       }
	public static void main(String[] args) {
	    String str = null;
	    display(str);

	}

}
