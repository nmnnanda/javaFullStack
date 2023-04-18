package javalearning.accessModifiers.newPack;

import javalearning.accessModifiers.A;

public class Child2 extends A{
	@Override
    protected void m1(){
    	System.out.println("Calling from Child2");
    }
}
