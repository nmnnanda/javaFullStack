package javalearning.MultiThreading;


class TableData{
	public  void printTable(int num) throws InterruptedException{
		 System.out.println(Thread.currentThread().getName() +" is trying to get the block");
		
		 synchronized(this){
			 for(int i=1;i<=10;i++){
					System.out.println(Thread.currentThread().getName() +" - "+num+" X "+i+" = "+(num*i));
					
				}
		 }
		//Thread.sleep(1000);
		
	}
}

class T1 extends Thread{
	private TableData td;
	private int num;
	T1(TableData td,int num){
		this.td = td;
		this.num = num;
	}
	
	public void run(){
		try {
			td.printTable(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class T2 extends Thread{
	private TableData td;
	private int num;
	T2(TableData td,int num){
		this.td = td;
		this.num = num;
	}
	
	public void run(){
		try {
			td.printTable(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Test1 {

	public static void main(String[] args) {
		TableData td = new TableData();
		T1 t1 = new T1(td,2);
		T2 t2 = new T2(td,3);
		
		t1.start();
		t2.start();

	}

}
