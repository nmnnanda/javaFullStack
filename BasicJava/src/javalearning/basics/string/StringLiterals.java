 package javalearning.basics.string;

public class StringLiterals {

	public static void main(String[] args) {
		String str = "Java Code";
		System.out.println(System.identityHashCode(str));
		
		String str2 = "Java Code";
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("=============================");
		
		String st1 = "java";
		String st2 = st1;
		
		String st3 = new String("java");
		String st4 = new String("java");
		
		System.out.println(st1==st2);
        System.out.println(st3==st1);
        System.out.println(st3==st4);
		

	}

}
