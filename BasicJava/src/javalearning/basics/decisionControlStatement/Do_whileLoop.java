package javalearning.basics.decisionControlStatement;

public class Do_whileLoop {
     static int count=0;
	public static void doWhile(){
		int a=11;
		do{
			count++;
		}while(a<10);
		System.out.println(count);
	}
	public static void main(String[] args) {
		doWhile();

	}

}
