package javalearning.oop.Abstraction;

//interface:
//variables : public static final(by default)
//methods

interface A{
	
	int data = 20;
}
 
class B implements A{
	
} 

public class InterfaceIntro {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.data);
		System.out.println(A.data);
		//A.data = 300;

	}

}
