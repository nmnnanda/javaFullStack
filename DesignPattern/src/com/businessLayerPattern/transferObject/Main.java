 package com.businessLayerPattern.transferObject;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Ankit",26);
		Student s2 =  new Student(2,"Harsh",18);
		
		StudentService service = new StudentService();
		System.out.println(service.addStudent(s1));
		System.out.println(service.addStudent(s2));
		
		
		service.getAll();
		
		
        System.out.println(service.getById(2));
      
        boolean result = service.deleteStudent(2);
        if(result){
        	System.out.println("Student deleted");
        }else{
        	System.out.println("Some error occurred");
        }
        service.getAll();
        service.updateStudent(1);
        service.getAll();
	}

}
