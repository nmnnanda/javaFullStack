 package javalearning.collection.List;

import java.util.Iterator;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("First item");
		stack.push("second item");
		stack.push("tthird item");
		stack.push("fourth item");
		stack.push("fifth item");
		stack.push("sixth item");
		System.out.println(stack);
		
		//pop()
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.remove(2));
		System.out.println(stack);
		
		
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
