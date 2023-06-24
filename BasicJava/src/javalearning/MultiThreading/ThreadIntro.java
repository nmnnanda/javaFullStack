package javalearning.MultiThreading;
 
//Thread 
class Work extends Thread{
	
	public void run(){  //Running
		System.out.println(Thread.currentThread().getName()+" is currently in run()");
		
		//Blocking
	}
	//terminate
}
public class ThreadIntro {

	public static void main(String[] args) {
		Work workerThread = new Work(); //New
		Work workerThread2 = new Work();
		Work workerThread3 = new Work();
		
		workerThread.start();//Runnable --->Thread Scheduler
		workerThread.setName("Worker-A");
		
		workerThread2.start();//Runnable
		workerThread2.setName("Worker-B");

	}

}
