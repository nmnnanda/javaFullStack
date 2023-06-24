 package com.learning.Spring.autowiring.byType;

public class Student {
    private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void m1(){
		course.m2();
	}
}
