 package javalearning.collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		Set<Integer> hashSet= new HashSet<>();
		hashSet.add(11);
		hashSet.add(12);
		hashSet.add(13);
		hashSet.add(14);
		hashSet.add(15);
		hashSet.add(16);
		
		System.out.println(hashSet);
		
		hashSet.add(12);
		System.out.println(hashSet);
		
		
		hashSet.add(null);
		System.out.println(hashSet);

		
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains(15));
		
	}

}
