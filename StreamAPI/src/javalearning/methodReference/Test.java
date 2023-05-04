package javalearning.methodReference;

@FunctionalInterface
interface A{
	void show();
}

class Service{
	public void doSomething(){
		System.out.println("We are learning MethodReference..");
	}
	
	public void doSomething2(){
		System.out.println("Nothing to do...");
	}
}

public class Test {

	public static void main(String[] args) {
		Service service = new Service();
		A a = service::doSomething;
		a.show();

	}

}
