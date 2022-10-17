package assignment.day11_01;

public class Clerk implements Emp {

	double salary;
	
	public Clerk(double salary) {
		this.salary = salary;
	}
	@Override
	public double geSal() {
		return this.salary;
	}
	
}
