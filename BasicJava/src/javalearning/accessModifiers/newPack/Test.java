package javalearning.accessModifiers.newPack;

import javalearning.accessModifiers.A;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.data);
//        Child ch = new Child();
//        System.out.println(ch.data);
		
		Child2 ch2 = new Child2();
		//System.out.println(ch2.data);
		ch2.m1();
	}
	
	

}
