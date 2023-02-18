package User_Exception;

class Division {
	int a;
	int b;

	public Division() {
		this.a = 0;
		this.b = 0;
	}

	public Division(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void PerformDivison() {
		if (this.b == 0)
			throw new MyUnckeckedException("You cannot Divide by 0");
		else
			System.out.println("Divison : " + this.a / this.b);
	}

	public void PerfromMultiplication() throws MyUnckeckedException {
		if (this.a == 0 || this.b == 0)
			throw new MyUnckeckedException("Error in multiplication");
		else
			System.out.println("Multiplication : " + this.a * this.b);
	}

}

public class Test_Main {

	public static void main(String[] args) {
		Division d1 = new Division(10, 0);
		//Division d2 = new Division(0,20);
		try {
			d1.PerformDivison();
		} catch (MyUnckeckedException e) {
//			e.printStackTrace();
			e.printUserDefinedStackTrace();
		}
//		try
//		{
//			d2.PerfromMultiplication();
//		}
//		catch(MyUnckeckedException e)
//		{
//			e.printUserDefinedStackTrace();
//		}
		System.out.println("The remaining Code is here");
	}

}
