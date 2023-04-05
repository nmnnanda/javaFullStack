package javalearning.basics.stringbuffer;

public class Problem1 {

	public static void main(String[] args) {
		
		String str = "Java is programming language";
		String[] words = str.split(" ");
		String str2 = "";
		for(int i=0;i<words.length;i++){
			StringBuffer sb=new StringBuffer(words[i]);
			sb.reverse();
			str2 = str2+sb.append(" ");
		}
		System.out.println(str2);
	}

}
