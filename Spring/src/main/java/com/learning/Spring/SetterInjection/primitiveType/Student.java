package com.learning.Spring.SetterInjection.primitiveType;

public class Student {
	private int studentId;
	private String studentName;
	private String course_enrolled;
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse_enrolled() {
		return course_enrolled;
	}
	public void setCourse_enrolled(String course_enrolled) {
		this.course_enrolled = course_enrolled;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course_enrolled="
				+ course_enrolled + "]";
	}
	
	
	
	

}
