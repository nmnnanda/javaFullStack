package javalearning.basics.constructor;

//WAP to count the number of objects created

class Car{
	static int count=0;
	Car(){
		count++; 
	}
//	public void getCount(){
//		System.out.println(this.count);
//	}
}

public class Problem1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println("Number of Car object created "+Car.count);
//       c1.getCount();
//       c2.getCount();
//       c3.getCount();
	}

}
