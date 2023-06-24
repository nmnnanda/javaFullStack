 package javalearning.oop.Polymorphism;
//Method Overloading


class Area{
	public void area(float radius){
		System.out.println(Math.PI*radius*radius);
	}
//	public double area(double radius){
//		System.out.println(Math.PI*radius*radius);
//	}
	public void area(int length,int breadth){
		System.out.println(length*breadth);
	}
	public void area(int radius){
		System.out.println(Math.PI*radius*radius);
	}
}


public class MethodOverloadingTest {

	public static void main(String[] args) {
		Area a = new Area();
		a.area(12,13);
		a.area(22.5f);

	}
	
	public static void main(Integer[] args){
		
	}

}
