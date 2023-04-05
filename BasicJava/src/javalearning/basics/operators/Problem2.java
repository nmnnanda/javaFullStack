package javalearning.basics.operators;

public class Problem2 {
   public static String reverse(String str){
	   String str2 = "";
	   for(int i=str.length()-1;i>=0;i--){
		   str2 = str2+str.charAt(i);
	   }
	   return str2;
   }
	public static void main(String[] args) {
		String str = "Java is a programming language";
		String str2 = Problem2.reverse(str);
		System.out.println(str2);

	}

}
