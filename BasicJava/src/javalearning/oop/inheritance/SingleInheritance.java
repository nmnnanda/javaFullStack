 package javalearning.oop.inheritance;

class Car{
	public int numberOfWheels = 4;
	public void speed(){
		System.out.println("120km/hr");
	}
}

class Audi extends Car{
	String color = "Black";
}

public class SingleInheritance {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.numberOfWheels);
		//System.out.println(car.color);
		//Parent class can't access properties of child class
		car.speed();
		
		Audi audi = new Audi();
		System.out.println(audi.numberOfWheels);
		System.out.println(audi.color);
		audi.speed();
		
		//Reference of Child type points 
		//object of Parent type
		
		//Audi audi2 =new Car();
		
		//Reference of Parent type points 
		//object of Child type
		
		Car car2 = new Audi();//Binding
		
		

	}

}
