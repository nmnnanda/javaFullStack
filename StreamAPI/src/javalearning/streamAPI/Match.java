 package javalearning.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		List<String> names =  Arrays.asList("Ankit","Harsh","Vikram","Aman");
        boolean result = names.stream()
                         .allMatch(name ->name.startsWith("A"));
	                  
         
        
        
        
	   System.out.println(result);
	
	}

}
