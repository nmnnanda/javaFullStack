 package javalearning.basics.operators;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operator:
		int a = 10;
		int b=5;
		System.out.println("Add :"+(a+b));
		System.out.println("Sub :"+(a-b));
		System.out.println("Multiply :"+(a*b));
		System.out.println("Division :"+(a/b));
		System.out.println("Modulus :"+(a%b));
		
		
		//Unary operator:++ = +1
		
		//pre-increment :++a post-increment=a++
		int c = 20;
		int d = ++c;//21
		System.out.println(c + d);//21 + 21 = 42
		
		int e = 50;
		int f = e++;
		System.out.println(e+" "+f);
		System.out.println(e+f);//51 +50
		
		
		int x = 8; // -(x+1) = -(-x+1)
		System.out.println(~(x));
		
		
		//Relation operator :boolean: true or false
		//1.greater than <
		int x1 = 10;
		int y1 = 20;
		
		//1.less than
		System.out.println(x1<y1);//true
		
		
		System.out.println(x1<=y1);//true
		
		
		System.out.println(x1>y1);//false
		
		System.out.println(x1>=y1);//fasle
		
		//equal to
		System.out.println(x1==y1);//false
		
		//not eqaul to = !=
		System.out.println(x1!=y1);//true
		
		
		
		
		//Logical operator:boolean:&& || !
		x1 = 100;
		y1 = 50;
		
		System.out.println((x1<y1)&&(x1==y1));
		
		System.out.println((x1<y1)||(x1!=y1));
		
		System.out.println(!(!(x1==y1) && (x1>y1)));
		
		
		//Bitwise
		int x2 = 20; //  0001 0100
		int y2 = 15;  // 0000 1111 
		             // -------
		            //       0000  0100
		System.out.println(x2 & y2);
		System.out.println(x2 | y2);
		
		int x3 = -5;
		int y3 = -6;
		System.out.println(x3 & y3);
		
		
		//Ternary operator:
		//condition ? (if true)case1 : (if false)case2
		
		System.out.println((x3>y3)?"condition is true":"condition is false");
		
		
		//Assigment
		int z = 20;
		z +=10;//compound statement  -= ,*=,/=,%=
		System.out.println(z);
		
		//instance of
		String str = "Hello";
		System.out.println(str instanceof String);
		
		System.out.println(str instanceof Object);
		
		Integer m = new Integer(10);
		System.out.println(m instanceof Integer);
		
		int n = 20;
		Integer n1 = new Integer(n);
		System.out.println(n1 instanceof Integer);
		
		
		//Shift
		//   >>(Signed Right Shift)  >>>(unsigned right shift)
	   //Right : num/2^bit 
		int num = 20;
		System.out.println(num>>>2);
		
		int num1 = 30;
		//left shift : num * 2^bits
		System.out.println(num1<< 2);
		
		
	}

}
