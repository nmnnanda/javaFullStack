 package javalearning.oop.inheritance;

class GP{
	int a = 10;
	public void show(){
		System.out.println("Called from GP "+this.a);
	}
}
class P extends GP{
	int b = 20;
	public void show(){
		System.out.println("Called from P "+this.b);
		super.show();
	}
}

class Ch extends P{
	int c = 30;
	public void show(){
		System.out.println("Called from Ch "+this.c);
		super.show();
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Ch c = new Ch();
//		System.out.println(c.a);
//		System.out.println(c.b);
//		System.out.println(c.c);
       c.show();
	}

}
