package javalearning.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIntro {

	public static void main(String[] args) {
	      List<String> list = new ArrayList<>();
	      
	      //add()
	      //list of string object
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add(null);
	      
	      //list of integers
	       List<Integer> list2 = new ArrayList<>();
	      list2.add(1);
	      list2.add(new Integer(2));
	      list2.add(3);
	      list2.add(1);
	      
	      System.out.println(list);
	      System.out.println(list2);
	      
	      list2.add(2, 51);
	      System.out.println(list2);
	      
	      //list2.addAll(list);
	      List<Integer> list3 = new ArrayList<>();
	      list3.add(11);
	      list3.add(12);
	      
	      
	      list2.addAll(list3);
	      System.out.println(list2);
	      
	      System.out.println(list2.contains(51));
	      System.out.println(list2.size());
	      
	      System.out.println(list2.get(3));
	      System.out.println(list2.remove(3));
	      System.out.println(list2);
	      
	      //enhanced for loop
	      for(Integer obj:list2){
	    	  System.out.println(obj);
	      }
	      
	      //Iterator
	      Iterator<Integer> itr = list2.iterator();
	      while(itr.hasNext()){
	    	  System.out.println(itr.next());
	    	  //list2.add(25);
	    	  //list2.set(2, 100);
	    	  //list2.remove(1);
	      }
	      
	      List<Integer> list4 = new ArrayList<>();
	      

	}

}
