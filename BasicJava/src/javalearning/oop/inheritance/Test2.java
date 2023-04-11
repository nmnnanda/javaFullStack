package javalearning.oop.inheritance;

class Parent{
	int a=10;
	public void show(){
		System.out.println("Hello from Parent");
	}
	
}
class Child extends Parent{
	int a = 20;
	
	public void show(){
		System.out.println(a);
		System.out.println(super.a);
		super.show();
	}
}

public class Test2 {

	public static void main(String[] args) {
		Child ch = new Child();
		//System.out.println(ch.a);
		ch.show();
	}
}
//variable : based on reference type
//methods :type of object