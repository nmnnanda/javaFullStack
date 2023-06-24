 package javalearning.basics.stringbuffer;

public class MutableStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
        sb.append("Code");
        System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
	}

}
