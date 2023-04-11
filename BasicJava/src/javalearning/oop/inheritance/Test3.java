package javalearning.oop.inheritance;

class A{
	int a=10;
	A(){
		
	}
}

class B extends A{
	int a = 20;
	public void show(){
		int a = 30;
		System.out.println(a);//30
		System.out.println(this.a);//20
		System.out.println(super.a);//10
	}
}

public class Test3 {

	public static void main(String[] args) {
		new B().show();

	}

}
