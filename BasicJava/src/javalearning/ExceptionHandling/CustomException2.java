package javalearning.ExceptionHandling;


class User{
	private int id;
	private String name;
	
	User(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId(){
		return this.id;
	}
	public String toString(){
		return "User :"+this.id+" "+this.name;
	}
}


class UserNotFoundException extends Exception{
	
}

class UserUtility{
	public static void getUserById(User[] users,int id){
		int count=0;
		for(User user:users){
			++count;
			if(user.getId()==id){
				System.out.println(user);
				break;
			}else{
				try {
					if(users.length==count)
					    throw new UserNotFoundException();
				} catch (UserNotFoundException e) {
					System.out.println("UserNotFound");
				}
			}
		}		
	}
}


public class CustomException2 {

	public static void main(String[] args) {
		User user1 = new User(1,"Arjun");
		User user2 = new User(2,"Akshay");
		User user3 = new User(3,"Hemant");
		User user4 = new User(4,"Rakesh");
		User user5 = new User(5,"Sanchit");
		
		User[] users = {user1,user2,user3,user4,user5};
		UserUtility.getUserById(users, 2);
		
	}

}
