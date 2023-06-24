 package javalearning.ExceptionHandling;

class Demo4{
	@SuppressWarnings("finally")
	public static int show(){
		try{
			//int data =15/3;
			int data =15/0;
		}catch(Exception e){
			return 10;
		}finally{
			System.out.println("Controller comes here");
			return 20;
		}
	}
}
public class TryFinally4 {
   
	public static void main(String[] args) {
		int result = Demo4.show();
		System.out.println(result);

	}

}
