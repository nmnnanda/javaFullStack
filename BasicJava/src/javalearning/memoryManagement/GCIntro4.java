package javalearning.memoryManagement;



class Test3{
	
	public Test3 m1(){
		return new Test3();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object removed successfully");
	}
}

public class GCIntro4 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		//Test3 t4 = t.m1();
		t.m1();
		
		System.gc();

	}

}
