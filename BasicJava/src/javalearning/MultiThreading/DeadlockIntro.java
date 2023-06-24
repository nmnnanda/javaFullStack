 package javalearning.MultiThreading;

class Resource{
	public static final String resource1 = "Pen";
	public static final String resource2 = "Paper";
}

class Student1 extends Thread{
	public void run(){
		synchronized(Resource.resource1){
			System.out.println("Student 1 got Pen ..waiting for paper");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(Resource.resource2){
				System.out.println("Student1 got paper.");
			}
			System.out.println("Student1 completed writing process ");
		}
	}
}

class Student2 extends Thread{
	public void run(){
		synchronized(Resource.resource2){
			System.out.println("Student 1 got Paper ..waiting for pen");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(Resource.resource1){
				System.out.println("Student2 got pen.");
			}
			System.out.println("Student2 completed writing process ");
		}
	}
}

public class DeadlockIntro {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student2 s2 = new Student2();
		s1.start();
		s2.start();

	}

}
