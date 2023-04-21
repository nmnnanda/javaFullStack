package javalearning.collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class List2 {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(11);
		linkedList.add(12);
		linkedList.add(13);
		linkedList.add(16);
		linkedList.add(18);
		linkedList.add(null);
		System.out.println(linkedList);
		
		//add at middle:
		linkedList.add(2, 21);
		System.out.println(linkedList);
		
		
		//add first and last
		linkedList.addFirst(100);
		linkedList.addLast(200);
		
		

		//fetching the value:
		System.out.println(linkedList.get(2));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		Iterator<Integer> itr = linkedList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
