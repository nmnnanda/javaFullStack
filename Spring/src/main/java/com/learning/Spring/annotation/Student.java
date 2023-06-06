package com.learning.Spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
   @Autowired
   private Course course;
   
   
   public Course getCourse() {
	return course;
}


public void setCourse(Course course) {
	
	this.course = course;
}


public void getdata(){
	System.out.println("Inside Student class");
	   course.getCourse();
   }
}
