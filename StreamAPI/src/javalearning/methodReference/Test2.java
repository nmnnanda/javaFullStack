package javalearning.methodReference;

@FunctionalInterface
interface StringUtils{
	int getCount(String str);
}

class StringService{
	public int counter(String str){
		
		return str.length();
	}
}

public class Test2 {

	public static void main(String[] args) {
		StringService obj = new StringService();
		StringUtils util = obj::counter;
		System.out.println(util.getCount("Java"));;
	}

}
