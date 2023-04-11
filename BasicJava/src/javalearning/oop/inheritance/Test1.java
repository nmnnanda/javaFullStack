package javalearning.oop.inheritance;

class Base{
	int a = 10;
	Base(int data){
		System.out.println("Base class constructor");
	}
	public void m1(){
		System.out.println("Base class method");
	}
}
// Must explicitly invoke another constructor
class Derived extends Base{
	int b = 20;
	Derived(){
		
		super(10);
		
		System.out.println("Derived class constructor");
		
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		Derived derived = new Derived();
//		System.out.println(derived.a);
//		System.out.println(derived.b);
//		derived.m1();

	}

}
//super: refers to parent class
//this:current class
//Both super and this can't be used at a same time inside constructor
