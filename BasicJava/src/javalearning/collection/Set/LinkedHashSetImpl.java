 package javalearning.collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		Set<String> hashSet = new LinkedHashSet<>();
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("B");
		hashSet.add("C");
		
		System.out.println(hashSet);
		
		hashSet.add(null);
		System.out.println(hashSet);
	}

}
