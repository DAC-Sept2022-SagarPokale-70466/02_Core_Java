
interface Employee {
	double getSal();

	default double getIns() {		// Default Interface
		return 0.0;
	}
}

public class Prg_06_Java8_Interface {

	public static void main(String[] args) {

		manager m = new manager(123.4, 1223.32);
		System.out.println("Sal = " + m.getIns());
		System.out.println("Sal = " + m.getSal());
		
		labor l = new labor(25, 50);
		labor l2 = new labor(350, 5);
		System.out.println("Labor sal = "+l.getSal());
		System.out.println("Labor Insentive = "+l.getIns());
	
	}
}

class manager implements Employee {
	double sal;
	double insentive;

	public manager(double sal, double insentive) {
		this.sal = sal;
		this.insentive = insentive;
	}

	@Override
	public double getSal() {
		return this.sal;
	}

	@Override
	public double getIns() {
		return this.sal * 0.2;
	}
}

class labor implements Employee {

	int hrs;
	int rate;

	public labor(int hrs, int rate) {
		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return this.hrs * this.rate;
	}

	@Override
	public double getIns() {
		if (this.hrs > 300)
			return (double) (this.rate * this.hrs) * 1.2;
		return (double) this.rate * this.hrs;
	}

}
