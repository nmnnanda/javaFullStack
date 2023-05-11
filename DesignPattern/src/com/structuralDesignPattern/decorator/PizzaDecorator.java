package com.structuralDesignPattern.decorator;

public abstract class PizzaDecorator implements Pizza {
   protected Pizza pizza;
   PizzaDecorator(Pizza pizza){
	   this.pizza = pizza;
   }
   public  String bake()
   {
	   return pizza.bake();
   }
}
