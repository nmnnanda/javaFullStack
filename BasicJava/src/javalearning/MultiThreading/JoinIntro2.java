 package javalearning.MultiThreading;

class Counter implements Runnable{
    private int counterValue;
	@Override
	public void run() {
		synchronized(this){
		for(int i=1;i<=1000;i++){
			
			  counterValue++;
		}
		}
		
	}
	public int getCount(){
		return counterValue;
	}
	
}

public class JoinIntro2 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);
		
		
		try {
			t1.start();
			t2.start();
			
			t1.join();	
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Counter Value"+counter.getCount());

	}

}
