 package javalearning.basics.arrays;

public class Program2 {
   
	public static void cubeElement(int[] a){
		for(int i=0;i<a.length;i++){
			int cube = a[i]*a[i]*a[i];
			a[i]=cube;
		}
		for(int cube:a){
			System.out.print(cube+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Program2.cubeElement(arr);
	}

}

//1.WAP to find the sum of digits of an array
//2.WAP to count the even numbers and odd numbers;
//3.WAP to find the key element from an array and print index position.
//4.WAP to find the minimum and maximum element from an array
//5.WAP to find the pair of element whose sum is equals to key.