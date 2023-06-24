 package javalearning.basics.stringbuffer;

public class SB_Constructor {

	public static void main(String[] args) {
		//1.StringBuffer(String)
		StringBuffer sb  = new StringBuffer("Java");
		
		//StringBuffer()
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());//16 = (oldCapacity *2)+2
		                                   //34
		//STringBuffer(int)
		StringBuffer sb2 = new StringBuffer(30);
		System.out.println(sb2.capacity());//30 
		
		
		

	}

}
