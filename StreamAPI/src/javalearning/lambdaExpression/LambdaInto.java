package javalearning.lambdaExpression;

@FunctionalInterface
interface A{
	//public void show();
	//void add(int a ,int b);
	
	//void changeToLowerCase(String str);
	
    //int sumOfElements(int[] arr);
	
    int countVowel(String str);
	
}


 



public class LambdaInto {

	public static void main(String[] args) {
//		A a = () -> System.out.println("Hello Java");
//		a.show();
		
//		A a = (num,num2) -> System.out.println(num+num2);
//		a.add(10, 12);
		
//		A a = (str) -> System.out.println(str.toLowerCase());
//		a.changeToLowerCase("JAVA");
		
		
//		A a = (arr) ->{
//			int sum=0;
//			for(int element:arr)
//				sum +=element;
//			return sum;
//		};
//		int[] arr = {1,2,3,4};
//		System.out.println(a.sumOfElements(arr));
		
//		A a  = (str)->{
//			int count = 0;
//			str = str.toLowerCase();
//			for(int i=0;i<str.length();i++){
//				char ch = str.charAt(i);
//				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//					count++;
//				}
//			}
//			return count;
//		};
//		System.out.println(a.countVowel("JAVa"));

	}

}
