package javalearning.collection.List;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("E");
		vector.add("B");
		vector.add("X");
		vector.add("D");
		
		System.out.println(vector);
		
		vector.add(null);
		System.out.println(vector);
		
		vector.add(2, "element");
		System.out.println(vector);
		
		
		//fetch
		
		System.out.println(vector.get(2));
	}

}
