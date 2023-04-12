package javalearning.oop.encapsultion;

class Card{
	private int pin;//instance
	
	public void setPin(int pin){
		this.pin = pin;
	}
	
	public int getPin(){
		return this.pin;
	}
	
}


public class EncapsIntro2 {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.setPin(1234);
		Card card2 = new Card();
		card2.setPin(5678);
		
		int pin = card2.getPin();
       System.out.println(pin);
	}

}
