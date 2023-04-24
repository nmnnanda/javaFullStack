package javalearning.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(4, "E");
		map.put(null, "F");
		
		
		//using key:
		System.out.println(map.get(2));
		System.out.println(map.get(5));
		System.out.println(map.get(4));
		System.out.println(map.get(null));
		
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
