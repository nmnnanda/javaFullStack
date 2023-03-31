package javalearning.basics.arrays;


//passing an array to function
public class Program1 {

//	public static void printEvenNumber(int[] a){
//		for(int i=0;i<a.length;i++){
//			if(a[i]%2==0){
//				System.out.println(a[i]);
//			}
//		}
//	}
	
	
	public static int[] printEvenNumber(int[] a){
		for(int i=0,j=0;i<a.length;i++){
			if(a[i]%2==0){
				a[j++] = a[i];
			}
			else{
				a[j++]=0;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int arr[] = {12,13,15,16,11,18};
		arr = Program1.printEvenNumber(arr);//
		for(int num:arr){
			System.out.print(num+" ");
		}
		
		

	}

}
