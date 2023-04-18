package javalearning.ExceptionHandling;

public class TryCatch6 {
	 public static void display(String str){
	  try{
		   System.out.println(str.toLowerCase());
	    
	      }catch(Exception e){
			   System.out.println("Exception handled");
		   }
	  
	  //compilation error as Unreachable catch block
//	      catch(NullPointerException npe){
//			   System.out.println("Exception handled by npe catch");
//		  }
}
	public static void main(String[] args) {
		String str= null;
		display(str);

	}

}
