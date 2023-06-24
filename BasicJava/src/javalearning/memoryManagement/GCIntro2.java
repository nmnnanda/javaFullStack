 package javalearning.memoryManagement;

//1.Nullifying the object reference
class Test{
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object removed successfully");
	}
}


public class GCIntro2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Test t1 = new Test();
		t1=null;
		System.gc();
		System.out.println("Program terminates");

	}

}
