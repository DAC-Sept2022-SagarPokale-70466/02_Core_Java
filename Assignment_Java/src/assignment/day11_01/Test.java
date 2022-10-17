package assignment.day11_01;

public class Test {

	public static void main(String[] args) {

		Emp[] arr= {
							new Manager(500, 100),
							new Labor(350,10),
							new Clerk(1000)
							};
		
		double total = Emp.calcTotalIncome(arr);
		System.out.println(total);
	}

}
