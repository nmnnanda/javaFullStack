package javalearning.basics.constructor;

class B{
	int b;
	B(int b){
		this.b = b;
	}
	
	public void show(){
		int b = 20;
		System.out.println(b);     
		System.out.println(this.b);
	}
}


public class Problem3 {

	public static void main(String[] args) {
		B b = new B(10);
		b.show();
	}

}
