package javalearning.basics.multi_dimesional_array;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{11,12,13},{21,22,23}};
		
		//System.out.println(arr[1][2]);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i%2==0|| j%2==0){
					arr[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
