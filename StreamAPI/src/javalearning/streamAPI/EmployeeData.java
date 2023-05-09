package javalearning.streamAPI;

public class EmployeeData {
	private int empId;
	private String empName;
	private int salary;
	private int workingYears;
	public EmployeeData(int empId, String empName, int salary, int workingYears) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.workingYears = workingYears;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkingYears() {
		return workingYears;
	}
	public void setWorkingYears(int workingYears) {
		this.workingYears = workingYears;
	}
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", workingYears="
				+ workingYears + "]";
	}
	
	
}
