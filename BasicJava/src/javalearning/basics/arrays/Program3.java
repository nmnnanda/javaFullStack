 package javalearning.basics.arrays;

//WAP to find the sum of elements of an array


public class Program3 {
    public static void sumOfElements(int[] a){
    	int sum = 0;
    	for(int i=0;i<a.length;i++){
    		sum = sum +a[i];
    	}
    	System.out.println(sum);
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};//1+2+3+4+5+6=21
        Program3.sumOfElements(arr);
	}
}

