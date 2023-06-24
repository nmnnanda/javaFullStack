package javalearning.accessModifiers;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.data);
        Child ch = new Child();
        System.out.println(ch.data);
        ch.m1();
        
	}

}  
