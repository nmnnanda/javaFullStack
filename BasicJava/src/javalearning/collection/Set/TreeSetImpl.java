 package javalearning.collection.Set;

import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("E");
		treeSet.add("A");
		treeSet.add("F");
		treeSet.add("D");
		treeSet.add("B");
		treeSet.add("C");
		System.out.println(treeSet);
		
		treeSet.add(null);
		System.out.println(treeSet);
		

	}

}
