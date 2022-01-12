package prob04;

public class Depart extends Employee{
	private String dep;
	
	Depart(String name, int salary, String dep) {
		super.setName(name); 
		super.setSalary(salary);
		this.dep = dep;
	}
}
