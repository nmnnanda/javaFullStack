package javalearning.oop.Abstraction;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank(new ICICI());
		bank.callBank();
		

	}

}
 