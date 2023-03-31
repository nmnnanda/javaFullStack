package javalearning.basics.arrays;

public class ShallowCopy {

	public static void main(String[] args) {
		int arr[] = {21,22,23};
		int[] b = arr;//Shallow copy
		
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
