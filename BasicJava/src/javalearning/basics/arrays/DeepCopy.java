 package javalearning.basics.arrays;

public class DeepCopy {

	public static void main(String[] args) {
		int arr[] = {11,12,13};
		int[] b =arr.clone();
		
		System.out.println("Value of arr :"+arr);
		System.out.println("Value of b :"+b);
		System.out.println("Elements inside arr:");
		for(int element:arr){
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Elements inside b:");
		for(int element:b){
			System.out.print(element+" ");
		}
		
		System.out.println("After modification :");
		b[0] = b[0]*20;
		System.out.println("Elements inside arr:");
		for(int element:arr){
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Elements inside b:");
		for(int element:b){
			System.out.print(element+" ");
		}
         

	}

}
