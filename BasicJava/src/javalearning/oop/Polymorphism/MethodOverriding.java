package javalearning.oop.Polymorphism;

class X{
	public void m1(){
		System.out.println("m1() called");
	}
}

class Y extends X{
	
	@Override
	public void m1(){
		System.out.println("m1() called from Y");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		Y y = new Y();
		y.m1();

	}

}
