 package com.businessLayerPattern.transferObject;

import java.util.ArrayList;
import java.util.List;


public class StudentService {
	List<Student> list = new ArrayList<>();
	public String addStudent(Student student){
		list.add(student);
		return "Student added successfully";
	}
	
	
	
	public void getAll(){
		for(Student student :list){
			System.out.println(student);
		}
	}
	
	public Student getById(int id){
		for(Student student:list){
			if(student.getStudentId()==id){
				return student;
			}
		}
		return null;
		
	}
	
	
	
    public boolean deleteStudent(int id){
    	for(Student student:list){
    		if(student.getStudentId()==id){
    			list.remove(student);
    			return true;
    		}
    	}
    	return false;
    }
    
    public void updateStudent(int id){
    	for(Student student :list){
    		if(student.getStudentId()==id){
    			
    		   student.setStudentName("newName");
    		   student.setStudentAge(12);
    		   System.out.println("Student updated successfully");
    		   return;
    		}
    	}
    	System.out.println("No Student found");
    	
    }
}
