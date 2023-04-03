package javalearning.basics.multi_dimesional_array;

public class Even_Count {
    public static int countOfEven(int[][] arr){
    	int count = 0;
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr[i].length;j++){
    			if(arr[i][j]%2==0){
    				count = count+1;
    			}
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		int arr[][]={{1,2,4,6},{22,23,24},{45,46,48}};
		int result = Even_Count.countOfEven(arr);
		if(result%2==0){
			System.out.println("Count of even numbers is even");
		}else{
			System.out.println("Count of even numbers is odd");
		}

	}

}
