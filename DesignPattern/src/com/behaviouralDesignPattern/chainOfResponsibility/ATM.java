 package com.behaviouralDesignPattern.chainOfResponsibility;

public class ATM extends PaymentHandler{
   
	@Override
	public void handlePayment(double amount) {
		if(amount <= 500){
			System.out.println("Payment done using ATM :"+amount);
		}else{
			paymentHandler.handlePayment(amount);
		}
		
	}

}
