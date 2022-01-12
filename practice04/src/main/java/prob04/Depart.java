package prob04;

public class Depart extends Employee{
	private String department;
	
	Depart(String name, int salary, String dep) {
		super.setName(name); 
		super.setSalary(salary);
		this.department = dep;
	}
	
	public void getInformation() {
		System.out.printf("이름: %s   연봉: %d   부서:%s\n", super.getName(), super.getSalary(), department);

	}
}
