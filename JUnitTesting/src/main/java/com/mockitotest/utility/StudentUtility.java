package com.mockitotest.utility;

import com.mockitotest.StudentService;

public class StudentUtility {
	
	private StudentService service;
	public  StudentUtility(StudentService studentService){
		this.service = studentService;
	}
    public int getAverage(){
    	return service.getTotalMarks()/service.getTotalStudents();
    }
}
