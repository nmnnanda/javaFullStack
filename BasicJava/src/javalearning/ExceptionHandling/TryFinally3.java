 package javalearning.ExceptionHandling;
class Demo3 {
	public static void show(){
		try{
			//int result=12/0;	
			int result = 12/12;
			try{
				String str = null;
				System.out.println(str.toLowerCase());
			}catch(ArithmeticException npe){
				System.out.println("Inner catch block handled the exception");
			}finally{
				System.out.println("Inner finally block");
			}
		}catch(Exception e){
			System.out.println("Outer catch handled exception");
		}finally{
			System.out.println("Outer finally block");
		}
	}
}

public class TryFinally3 {

	public static void main(String[] args) {
		Demo3.show();

	}

}
