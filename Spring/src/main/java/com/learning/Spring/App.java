package com.learning.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //PNB pnb = new PNB();
       //IOB iob = new IOB();
//    	SBI sbi = new SBI();
//       Bank bank = new Bank(sbi);
//       bank.service();
    	
    	//Using Spring:
    	ApplicationContext context = new 
    			ClassPathXmlApplicationContext("config.xml");
    	Bank bank =  (Bank) context.getBean("bank");
    	bank.service();
    	
    	
    	
    	
       
    }
}
