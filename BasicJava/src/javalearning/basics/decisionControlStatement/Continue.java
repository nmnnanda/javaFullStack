 package javalearning.basics.decisionControlStatement;

public class Continue {

	public static void main(String[] args) {
//		for(int i=1;i<=10;i++){
//			if(i%2==1)continue;
//			System.out.println(i);
//		}
		
		for(int i=1;i<=5;i++){ 
			if(i==2)continue;
			for(int j=1;j<=5;j++){
				System.out.println(i+" "+j);
			}
			
		}
		
		
		

	}

}
