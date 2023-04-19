package javalearning.ExceptionHandling;

//custom exception = checked exception if we extends Exception class
//custom exception = unchecked if we extends RuntimeTimeException class

class NegativeNumberFoundException extends Exception{
	
}

class PositiveNumber{
	public static void setNumber(int num){
		if(num<0){
			try {
				throw new NegativeNumberFoundException();
			} catch (NegativeNumberFoundException e) {
				System.out.println(e.getClass()+"\n Negative number not allowed");
			}
		}else{
			System.out.println(num);
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		PositiveNumber.setNumber(-17);

	}

}
