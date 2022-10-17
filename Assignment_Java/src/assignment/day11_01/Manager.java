package assignment.day11_01;

interface Emp{
	double geSal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(Emp arr[]) {
		double total = 0.0;
		for(int i = 0; i < arr.length; i++)
			total = total + arr[i].geSal() + arr[i].calcIncentives();
		return total;
		
	}
}
public class Manager implements Emp{
	
	double basicSalary;
	double dearanceAllowance;
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double geSal() {
		return this.basicSalary + this.dearanceAllowance;
	}
	
	@Override
	public double calcIncentives()
	{
		return basicSalary * 0.2;
	}
	
	

}
 