package javalearning.basics.operators;

//"Java Is Popular Programming Language"
public class Problem3 {
    public static void capitalCharacter(String str){
    	   String[] word = str.split(" ");
    	   String str2 = "";
    	   for(String result:word){
    	     str2 = str2 +result.toUpperCase().charAt(0)+result.substring(1)+" " ; 
    	   }
    	System.out.println(str2);
    	
    }
	public static void main(String[] args) {
		String str = "java is popular programming language";
		//capitalCharacter(str);
		
		String data = "Java";
		StringBuffer sb = new StringBuffer(data);
		sb.reverse();
		System.out.println(sb);
	}

}
 