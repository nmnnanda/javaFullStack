 package javalearning.MultiThreading;

public class joinIntro extends Thread{
	
	
	public void run(){
		for(int i=21;i<=25;i++){
    		System.out.println(Thread.currentThread().getName()+" "+i);
    	}
	}
     
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		joinIntro t1 = new joinIntro();
		joinIntro t2 = new joinIntro();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	
		System.out.println("Main ended");
	}

}
