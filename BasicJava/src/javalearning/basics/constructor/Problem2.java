package javalearning.basics.constructor;

import java.util.Scanner;

class EmployeeRecord{
	int empId;
	String empfname;
	String emplname;
	
	EmployeeRecord(int id,String fname,String lname){
		empId = id;
		empfname = fname;
		emplname = lname;
	}
	
//	public String getDetails(){
//		System.out.println("Employee Details :"+this.empId+" "+this.empfname+" "+this.emplname);
//	}
	
	public String toString(){
		//return "Employee Details :"+this.empId+" "+this.empfname+" "+this.emplname;
	    return "Employee Id :" + this.empId;
	}
}

public class Problem2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of employee records");
		Scanner sc = new Scanner(System.in);
		int numberOfRecords = sc.nextInt();
		EmployeeRecord emp[] = new EmployeeRecord[numberOfRecords];
		
		for(int i=0;i<emp.length;i++){
			System.out.println("Enter the id of "+(i+1)+"  Employee");
			int id = sc.nextInt(); 
			System.out.println("Enter the fname of "+(i+1)+"  Employee");
			String fname = sc.next();
			System.out.println("Enter the lname of "+(i+1)+"  Employee");
			String lname = sc.next();
			emp[i] = new EmployeeRecord(id,fname,lname);
		}
		
		 for(EmployeeRecord empData : emp){
			 //empData.getDetails();
			 System.out.println(empData);
		 }
		

	}

}
