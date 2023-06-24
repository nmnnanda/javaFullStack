package com.learning.Hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "course_enrolled")
    private String courseEnrolled;

    public Student() {
        super();
    }

    public Student(String studentName, String courseEnrolled) {
        super();
        this.studentName = studentName;
        this.courseEnrolled = courseEnrolled;
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

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled="
                + courseEnrolled + "]";
    }
}
