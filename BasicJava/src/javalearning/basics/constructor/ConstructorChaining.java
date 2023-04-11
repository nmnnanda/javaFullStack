package javalearning.basics.constructor;

//Constructor Chaining:Calling one constructor from another


class A1{
	A1(){
		this("hello");
		System.out.println("No-arg constructor");
	}
	A1(int data){
		this();
		System.out.println(data);
	}
	A1(String data){
		System.out.println(data);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		A1 obj = new A1();

	}

}
