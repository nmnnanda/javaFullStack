 package javalearning.basics.variables;

public class Student {
	
	int studentId = 101;
	String studentName = "Arjun";
	
	static String collegeName = "ABC";
	
	
	
	public void show(){
		int deptId = 121;
		System.out.println(deptId);
	}
	
	
	
    
	public static void main(String[] args) {
		
		//creating an obj
		//ClassName objName = new ClassName();
		
		Student s1 = new Student();
		
		//access instance variable:
		//objName.variableName
		
	System.out.println(s1.studentId);
	System.out.println(s1.studentName);
	
	
	//using classname
	System.out.println(Student.collegeName);
	
	//Using object
	
	System.out.println(s1.collegeName);
	
	
	
	//
	//System.out.println(s1.deptId);
	
	s1.show();
	
	 // Student s2 = new Student();
	  
	

	}

}
