package javalearning.basics.constructor;

class Vehicle{
	
	protected Vehicle(){
		System.out.println("Inside constructor");
	}
	
//	public void m1(){
//		Vehicle v1 = new Vehicle();
//	}
//	private void m2(){
//		Vehicle v1 = new Vehicle();
//	}
}


public class ConstructorIntro {
	public static void main(String[] args) {
	 //classname objname = new classname();
		Vehicle bike = new Vehicle();//creating an object  
		System.out.println(System.identityHashCode(bike));
		//bike.Vehicle();
	}

}
