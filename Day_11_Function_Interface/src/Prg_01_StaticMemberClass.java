
public class Prg_01_StaticMemberClass {

	public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Inner obj = new Outer.Inner();
		obj.print();
		
//		Outer.Inner.print();
	}
}

class Outer {
	private int nonStaticField = 20;
	private static int staticField = 30;

	public static class Inner {
		private int innerField = 90;

		public void print() {
//			System.out.println("Non-Static Field = "+nonStaticField);			//  Cannot Take NonStatic Field Inside the INNER STATIC CLASS
			System.out.println("Static Field of Outer class = " + Outer.staticField);
			System.out.println("Memeber Field of InnerClass = " + innerField);
//			System.out.println("Non-Static field = "+Outer.this.nonStaticField);
		}
	}
	public void outerPrint() {
		Inner i = new Inner();
		System.out.println("Inner Field = "+i.innerField);
		}
}
