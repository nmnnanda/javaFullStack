 package javalearning.MultiThreading;

//What will happen if we call start() method twice on same thread

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Run() is executed...");
		
	}
	
	
	
}
public class RunnableIntro {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread th = new Thread(t1);
		th.start();
		//th.start();
	}

}
