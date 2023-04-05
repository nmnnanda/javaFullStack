package javalearning.basics.string;

public class String_Methods {

	public static void main(String[] args) {
		String str = "Encyclopedia";
		String str2 = "Wikipedia";
		//toLowercase
		System.out.println(str.toLowerCase());
		
		//touppercase
		System.out.println(str.toUpperCase());
		
		//charAt(index)
		System.out.println(str.charAt(1));
		
		//indexof
		System.out.println(str.indexOf('n'));
		
		//equals
		System.out.println(str.equals("encyclopedia"));
		
		//equalsIgnorecase
		System.out.println(str.equalsIgnoreCase("encyclopedia"));
		
		
		//== location
		System.out.println(str==str2);
		
       //length()
		System.out.println(str.length());
		
		//toCharArray
		char[] arr = str.toCharArray();
		for(char ch :arr){
			System.out.println(ch);
		}
		
		//compareTo
		String s1 = "Apple";//65
		String s2 = "apple";//97  -32
		System.out.println(s1.compareTo(s2));
		
		//split
		String s4 = "Hello Java Programming";
		String[] arr1 = s4.split(" ");
		for(String data:arr1){
			System.out.println(data);
		}
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		//join
		String result = String.join("*" , arr1);
		System.out.println(result);
	}

}
