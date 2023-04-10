package javalearning.basics.constructor;


class X{
	X(){
		System.out.println("Value of this --->"+this.hashCode());
	}
	
	public void m1(){
		System.out.println("Value of this --->"+this.hashCode());
	}
}
public class thisConcept {

	public static void main(String[] args) {
		X x1 = new X();
		System.out.println(x1.hashCode());
		x1.m1();
		X x2 = new X();
		System.out.println("Value of x2---->"+x2.hashCode());
        x2.m1();
	}

}
