package com.structuralDesignPattern.decorator;

public class ChickenDecorator extends PizzaDecorator{

	ChickenDecorator(Pizza pizza) {
		super(pizza);
		
	}
	public String bake(){
		return pizza.bake() + addChicken();
	}
	private String addChicken() {
		return "Chicken toppings";
	}

}
