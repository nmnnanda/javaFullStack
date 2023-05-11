package com.structuralDesignPattern.decorator;

public class Main {

	public static void main(String[] args) {
//		Pizza pizza = new BasePizza();
//		
//		Pizza chicken_toppings = new ChickenDecorator(pizza);
//		
//		
//		Pizza cheese_toppings = new CheeseBurstDecorator(pizza);
//		//System.out.println(chicken_toppings.bake());
//		System.out.println(cheese_toppings.bake());
	
	    Pizza pizza = new ChickenDecorator(new CheeseBurstDecorator(new BasePizza()));
	    System.out.println(pizza.bake());
	}

}
