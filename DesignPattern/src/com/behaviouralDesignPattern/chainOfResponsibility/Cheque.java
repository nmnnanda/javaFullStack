package com.behaviouralDesignPattern.chainOfResponsibility;

public class Cheque extends PaymentHandler{
	@Override
	public void handlePayment(double amount) {
		if(amount<=1500){
			System.out.println("Payment done using Cheque :"+amount);
		}else{
			paymentHandler.handlePayment(amount);
		}
	}
}
