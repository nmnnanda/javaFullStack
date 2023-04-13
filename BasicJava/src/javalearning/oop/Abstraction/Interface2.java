package javalearning.oop.Abstraction;

//methods:public abstract
//concrete :function with body
//abstract :function without body
//Interface can't be instantiated,but we can have reference type
interface X{
	 void m1();//by default ->abstract
	 default void m2(){
		 System.out.println("m2() from Interface");
	 }
	 
	 public static void m3(){
		 System.out.println("m3() called ");
	 }
	 
	
}

//interface M{
//	default void m2(){
//		System.out.println("m2() from Interface M");
//	}
//}
 class Y implements X{

	@Override
	public void m1() {
		System.out.println("m1() implemented in Y");
	}

//	@Override
//	public void m2() {
//		// TODO Auto-generated method stub
//		X.super.m2();
//	}
}
 class Z implements X{

	@Override
	public void m1() {
		System.out.println("m1() implemented in Z");
		
	}
	 
 }

public class Interface2 {

	public static void main(String[] args) {
		Y y = new Y();
		y.m1();
		y.m2();

	}

}
