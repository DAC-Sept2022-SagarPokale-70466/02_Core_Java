@FunctionalInterface
interface standard
{
	double getsal();
	
	public static double calTotalSal(standard arr[]) {
		double total = 0;
		for(int i = 0; i < arr.length; i++) {
			total = total + arr[i].getsal();
		}
		return total;
	}
}
public class Prg_10_Interface_Static_Method {

	public static void main(String[] args) {

		standard[] arr = new standard[] {
				new Clerk(1200.0),
				new Employe(30000.0),
				new Clerk(1300.0),
				new Employe(250.0),
				new Employe(270.0)
			};
		double total = standard.calTotalSal(arr);
		System.out.println(total);
		
	}
}
class Employe implements standard
{
	double sal;
	
	public Employe(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public double getsal() {
		return this.sal;
	}
}
class Clerk implements standard{
	double sal;

	public Clerk(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public double getsal() {
		return this.sal;
	}
}
