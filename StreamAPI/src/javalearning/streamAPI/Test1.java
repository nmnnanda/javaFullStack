 package javalearning.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
        	list.add(i);
        }
        List<Integer> newList = list.stream()
        		                .filter(x -> x%2==0)
        		                .collect(Collectors.toList());
        
        System.out.println(newList);
        
	}

}
