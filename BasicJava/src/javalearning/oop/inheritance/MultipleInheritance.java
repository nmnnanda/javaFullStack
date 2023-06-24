 package javalearning.oop.inheritance;

//class A{
//	int a=10;
//	public void show(){
//		System.out.println(this.a);
//	}
//}
//
//class B{
//	int b=10;
//	public void show(){
//		System.out.println(this.b);
//	}
//}
//
//class C extends A,B{
//	
//}

//Sol : use interface instead of class

//abstract method:function without body
//concrete method:function with body
interface A1{
	void show();//abstract methods
}

interface B1{
	void show();
}

class C implements A1,B1{
	public void show(){
		System.out.println("Hello from C");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.show();

	}

}
