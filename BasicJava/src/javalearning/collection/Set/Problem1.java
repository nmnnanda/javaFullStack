 package javalearning.collection.Set;

import java.util.TreeSet;

class Student implements Comparable<Student>{
	private int studentId;
	private String studentFname;
	private String studentLname;
	public Student(int studentId, String studentFname, String studentLname) {
		super();
		this.studentId = studentId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFname() {
		return studentFname;
	}
	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFname=" + studentFname + ", studentLname=" + studentLname
				+ "]";
	}
	@Override
	public int compareTo(Student student) {
		return this.getStudentFname().compareTo(student.getStudentFname()) ;
	}
	
	
	
	
}
public class Problem1 {

	public static void main(String[] args) {
		Student s1 = new Student(102,"Rahul","S");
        Student s2 = new Student(101,"Ankit","S");
        Student s3 = new Student(104,"Raghav","S");
        Student s4 = new Student(103,"Vaibhav","S");
        
        TreeSet<Student> treeset = new TreeSet<>();
        treeset.add(s1);
        treeset.add(s2);
        treeset.add(s3);
        treeset.add(s4);
        
        System.out.println(treeset);
	}

}
