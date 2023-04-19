package javalearning.ExceptionHandling;

class OnlineVoting{
	public static void ageVerifier(int age){
		if(age<18){
			try{
			throw new Exception();
			}catch(Exception e){
				System.out.println("App stopped.Age verification failed");
			}
		}else{
			System.out.println("Registered successfully");
		}
	}
}

public class ThrowKeyword2 {

	public static void main(String[] args) {
		
		OnlineVoting.ageVerifier(17);
	}

}
