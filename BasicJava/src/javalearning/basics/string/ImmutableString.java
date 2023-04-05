package javalearning.basics.string;

public class ImmutableString {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str);
		str.concat("is a programming language");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
//		String str2 = str;
//		System.out.println(str2);
		
         
		str = str.concat(" is programming language");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
	}

}
