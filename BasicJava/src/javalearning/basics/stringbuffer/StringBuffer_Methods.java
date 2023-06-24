 package javalearning.basics.stringbuffer;

public class StringBuffer_Methods {

	public static void main(String[] args) {
		//append()
		StringBuffer sb = new StringBuffer(" ");
		sb.append("Java is amazing");
		System.out.println(sb);
       
		
		//insert()
		StringBuffer sb1 = new StringBuffer("Python");
		sb1.insert(2,"Java");
		System.out.println(sb1);
		
		//reverse()
		StringBuffer sb2 = new StringBuffer("Wikipedia");
		sb2.reverse();
		System.out.println(sb2);
		
		
	}

}
