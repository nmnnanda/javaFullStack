package com.learning.Spring;

public class Bank {
   private RBI rbi;
   Bank(RBI rbi){
	   this.rbi = rbi;
   }
   
   public void service(){
	   rbi.policy();
   }
}
