 package javalearning.MultiThreading;

class Table{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(" Thread Name :"+Thread.currentThread().getName()+"=>"+num+" X "+i+" = "+(num*i) );
		    
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

class MyThread1 extends Thread{
	private Table table;
	private int num;
	MyThread1(Table table,int num){
		this.table = table;
		this.num = num;
	}
	
	public void run(){
		table.printTable(num);
	}
}

class MyThread2 extends Thread{
	private Table table;
	private int num;
	MyThread2(Table table,int num){
		this.table = table;
		this.num = num;
	}
	
	public void run(){
		table.printTable(num);
	}
}

public class ConcurrencyIntro {

	public static void main(String[] args) {
		Table table = new Table();
	    MyThread1 t1 = new MyThread1(table,2);	
	    MyThread2 t2 = new MyThread2(table,5);
	    
	    t1.setName("Thread-A");
	    t2.setName("Thread-B");
	    
	    t1.start();
	    t2.start();

	}

}
