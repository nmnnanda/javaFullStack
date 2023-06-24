 package javalearning.basics.arrays;

public class DeepCopy2 {

	public static void main(String[] args) {
		int arr[] = {31,32,33};
		int[] b = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			b[i] = arr[i];
		}
		
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
//in -place =same array

