package javalearning.basics.constructor;

class Student{
	String studentId;
	
	//parameterized constructor
	Student(String id){
		studentId = id;
	}
	
	public void getStudentId(){
		System.out.println(this.studentId);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student s1 = new Student("EW12CS01");
		Student s2 = new Student("EW12CS02");
		Student s3 = new Student("EW12CS03");
		s1.getStudentId();
		s2.getStudentId();
		s3.getStudentId();
		
		

	}

}
