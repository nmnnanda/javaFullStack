 package javalearning.memoryManagement;


class Test5{
	
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object removed successfully");
	}
}


public class GCIntro5 {

	public static void main(String[] args) {
		new Test5();
		System.gc();

	}

}
