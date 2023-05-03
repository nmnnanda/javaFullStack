package javalearning.memoryManagement;

class Demo{
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Object removed");
	}
}
public class GCIntro {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d = new Demo();
		d=new Demo();
		System.gc();
		System.out.println("Program terminate");
	}

}
