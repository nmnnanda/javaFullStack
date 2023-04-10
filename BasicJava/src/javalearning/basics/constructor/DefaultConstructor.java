package javalearning.basics.constructor;

class A{
	int data = 100;
	static int data2 = 200;
	A(){
		//System.out.println(data2);
	}
	
	
}

public class DefaultConstructor {

	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.data);
		System.out.println(A.data2);

	}

}
