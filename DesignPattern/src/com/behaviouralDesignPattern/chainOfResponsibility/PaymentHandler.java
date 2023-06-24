 package com.behaviouralDesignPattern.chainOfResponsibility;

public abstract class PaymentHandler {
   protected PaymentHandler paymentHandler;
   
   public void setNext(PaymentHandler paymentHandler){
	   this.paymentHandler = paymentHandler;
   }
   
   public abstract void  handlePayment(double amount);
}
