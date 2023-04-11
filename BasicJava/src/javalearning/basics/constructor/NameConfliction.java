package javalearning.basics.constructor;

//NamingConfliction :use of this keyword

class EmployeeInfo{
	int empId;//instance variable
	String empName;
	                 //local variable
	EmployeeInfo(int empId ,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
//	public void print(String empName){
//		System.out.println(this.empId);
//		System.out.println(empName);
//	}
	
	public String toString(){
		return empId+" "+empName;
	}
}

public class NameConfliction {

	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo(101,"Arjun");
		System.out.println(e1);
		//e1.print("Java");
        
	}

}
