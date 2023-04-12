package javalearning.oop.encapsultion;

class ATMCard{
	String username = "sbiUser";
	private int pin = 1234;
	
	public int getPin(){
		return this.pin;
	}
}
public class EncapsIntro {

	public static void main(String[] args) {
		ATMCard atm = new ATMCard();
//		System.out.println(atm.pin);
//		atm.pin = 5678;
//		System.out.println(atm.pin);
		int pin = atm.getPin();
		System.out.println(pin);
		//atm.pin = 5678;
		

	}

}
//setter and getter