package javalearning.methodReference;
//Refering to static method

@FunctionalInterface
interface Display{
	void show();
}

class ShowUtil{
	public static void  m1(){
		System.out.println("static method is called...");
	}
}
public class Test3 {

	public static void main(String[] args) {
		Display d = ShowUtil::m1;
		d.show();

	}

}
