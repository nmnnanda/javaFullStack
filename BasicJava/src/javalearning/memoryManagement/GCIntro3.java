 package javalearning.memoryManagement;

class Test2{
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object removed successfully");
	}
}


public class GCIntro3 {

	public static void main(String[] args) {
//		Test2 t2 = new Test2();
//		t2 = new Test2();
//		
		Test2 t3 = new Test2();
		Test2 t4 = new Test2();
		t4  = t3;
		
		System.gc();

	}

}
