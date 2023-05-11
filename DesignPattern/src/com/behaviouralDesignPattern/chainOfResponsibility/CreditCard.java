package com.behaviouralDesignPattern.chainOfResponsibility;

public class CreditCard extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		if(amount<=1000){
			System.out.println("Payment done using CreditCard :"+amount);
		}else{
			paymentHandler.handlePayment(amount);
		}
		
	}

}
