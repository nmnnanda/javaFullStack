package javalearning.oop.Abstraction;


abstract class AccountDept{
	public static void CompanyPolicy(){
		System.out.println("ABC policy");
	}
	public abstract void calculateSalary(int bs);
}

class FTE extends AccountDept{

	@Override
	public void calculateSalary(int bs) {
		double monthlySalary  =(double) (bs +bs*0.5)*30;
		System.out.println("FullTimeEmployee "+monthlySalary);
	}
	
}

class PTE extends AccountDept{

	@Override
	public void calculateSalary(int bs) {
		double monthlySalary = (double) (bs +bs*0.5)*30;
		System.out.println("PartTimeEmployee "+monthlySalary);
	}
	
}

public class AbstractClassIntro {

	public static void main(String[] args) {
		AccountDept dept = new FTE();
		dept.calculateSalary(12000);
       
		AccountDept dept2 = new PTE();
		dept2.calculateSalary(5000);
	}

}
