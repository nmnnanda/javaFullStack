package com.learning.Hibernate.entity;

//POJO 
public class Student {

	private int studentId;
	private String studentName;
	private String course_enrolled;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String course_enrolled) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course_enrolled = course_enrolled;
	}

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
