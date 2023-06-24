package com.behaviouralDesignPattern.chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		PaymentHandler atm = new ATM();
		PaymentHandler creditCard = new CreditCard();
		PaymentHandler cheque = new Cheque();
		
		atm.setNext(creditCard);
		creditCard.setNext(cheque);
		
		atm.handlePayment(1000);
		
		

	}

}
