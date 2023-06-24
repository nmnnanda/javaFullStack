package javalearning.oop.Abstraction;

public interface RBI {
	
	void bankName();
   
	default void consumerPolicy(){
    	System.out.println("Policies for consumer");
    }
}
 