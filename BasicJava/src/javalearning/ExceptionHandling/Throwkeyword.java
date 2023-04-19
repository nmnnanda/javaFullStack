package javalearning.ExceptionHandling;

class Calculation{
	public static void doCalculation(int num){
		if(num<0){
			try{
			  throw new ArithmeticException();
			}catch(ArithmeticException ae){
				System.out.println("Unable to find sqrt of neg number");
			}
		}else{
			System.out.println(Math.sqrt(num));
		}
	}
}

public class Throwkeyword {

	public static void main(String[] args) {
		Calculation.doCalculation(-144);

	}

}
