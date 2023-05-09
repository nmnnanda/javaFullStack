package javalearning.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class MapIntro {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		list.stream()
		.filter(x->x%2==0)
		.map(x-> x*x)
		.forEach(obj ->System.out.println(obj));

	}

}
