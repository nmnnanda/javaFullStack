 package javalearning.oop.inheritance;

class Vehicle{
	//int a = 10;
	String color ="grey";
	public void speed(){
		System.out.println("40km/hr");
	}
}
class FourWheeler extends Vehicle{
	int a = 20;
	int numberOfWheels = 4;
	public void speed(){
		System.out.println("60km/hr");
	}
}
class TwoWheeler extends Vehicle{
	int numberOfWheels = 2;
	public void speed(){
		System.out.println("10km/hr");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.speed();
		System.out.println(fourWheeler.color);
		System.out.println(fourWheeler.numberOfWheels);
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.speed();
		System.out.println(twoWheeler.color);
		System.out.println(twoWheeler.numberOfWheels);
		
		//dynamic dispatch
		Vehicle vehicle = new FourWheeler();//Runtime polymorphism
		//vehicle.speed();
		//System.out.println(vehicle.a);
	}

}
