package javalearning.oop.Abstraction;

public class Bank {
	private RBI bank;
	Bank(RBI bank){
		this.bank = bank;
	}
	
	
	public void callBank(){
		bank.bankName();
	}

}
 