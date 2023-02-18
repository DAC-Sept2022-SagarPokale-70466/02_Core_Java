/**
 * @author Sagar
 *
 */
public class Prg_02_NonStaticMethod {

	public static void main(String[] args) {

		Outter outobj = new Outter();
//		Outter.Inner obj = outobj.new Inner();					//This or below this can be apply
		Outter.Inner obj = new Outter().new Inner();
		obj.print();
		
	}
}

class Outter {
	int outterfield = 10;
	static int outterStatic = 20;

	public class Inner {
		private int innerStatic = 50;

		public void print()
		{
			System.out.println("Inner field = "+innerStatic);
			System.out.println("Outer Field = "+Outter.this.outterfield);
			System.out.println("Outer Static Field = "+outterStatic);
			
		}

	}
}
