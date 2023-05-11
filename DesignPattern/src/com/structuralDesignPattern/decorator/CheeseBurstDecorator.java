package com.structuralDesignPattern.decorator;

public class CheeseBurstDecorator extends PizzaDecorator{

	CheeseBurstDecorator(Pizza pizza) {
		super(pizza);
		
	}
	public String bake(){
		return pizza.bake()+addCheese();
	}
	private String addCheese() {
		
		return "Cheese toppings";
	}

}
