 package javalearning.oop.Polymorphism;

//compilation-----Runtime
class Employee{
	public void show(){
		System.out.println("Hello");
	}
}

class FTE extends Employee{
//	public void show(){
//		System.out.println("Hello from child");
//	}
}
public class Binding {

	public static void main(String[] args) {
		Employee e = new FTE();
		e.show();
		//FTE e1 = new Employee();

	}

}
