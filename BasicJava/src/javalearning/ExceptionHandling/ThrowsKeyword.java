 package javalearning.ExceptionHandling;
//throws = declared exception

public class ThrowsKeyword {
	
	public static void m1(int num) throws Exception{
		if(num<0){
			throw new Exception();
		}else{
			System.out.println(num);
		}
	}
   public static void n1() throws Exception{
	   m1(-12);
   }
	public static void main(String[] args)  {
		try {
			n1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
