package javalearning.MultiThreading;

class A extends Thread{
	public void run(){

		System.out.println("A started");
		for(int i=1;i<=5;i++){
			System.out.println("A =>"+i);
		}
	}
}

class B extends Thread{
	public void run(){
		System.out.println("B started");
		for(int i=1;i<=5;i++){
			System.out.println("B =>"+i);
		}
	}
}

class C extends Thread{
	public void run(){
		System.out.println("C started");
		for(int i=1;i<=5;i++){
			System.out.println("C =>"+i);
		}
	}
}
public class ThreadPriorityIntro {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		b.setPriority(Thread.MAX_PRIORITY);   //b>a>c
		c.setPriority(Thread.MIN_PRIORITY);
		a.setPriority(Thread.NORM_PRIORITY);
		
		c.start();
		b.start();
		a.start();
		
		
		
		
	}

}
