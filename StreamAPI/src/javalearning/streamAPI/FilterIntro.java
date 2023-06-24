 package javalearning.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class FilterIntro {
    public static void evenNumber(List<Integer> list){
    	for(Integer element:list){
    		if(element%2==0){
    			System.out.println(element);
    		}
    	}
    }
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		//evenNumber(list);
		
		 list.stream()
		 .filter(element->element%2==0)
		 .forEach(element->System.out.println(element));

	}

}

//Employee : id name salary  cont setter/getter toString
