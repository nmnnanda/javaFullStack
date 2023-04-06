package javalearning.basics.decisionControlStatement;

public class Break {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++){
//			if(i==4){
//				break;
//			}
//			System.out.println(i);
//		}
         
		for(int i=1;i<=5;i++){   	                 
			if(i==3){
				break;
			}  
			for(int j=1;j<=5;j++){         	
	        System.out.println("Value of i = "+i+" and Value of j= "+j);
			}
		}
		
		
	}

}
