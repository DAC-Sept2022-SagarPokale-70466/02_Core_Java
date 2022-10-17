
public class Prg_03_LocalClass {

	private static int staticField = 10;
	private int normalField = 20;

	public static void main(String[] args) {

		
		
		final int finalInt = 15;
		int localvar = 50;
		int localvar2 = 60;
		localvar2++;

//		local class (in static method) -- behave like static member class
		class InSide {
			public void display() {
				System.out.println("Static Field outside main = "+staticField);
//				System.out.println("Normal Field outside main = "+normalField);			// Error
				System.out.println("Final Field Inside main = "+finalInt);
				System.out.println("Local Field Inside main = "+localvar);
//				System.out.println("Local2 Field Inside main = "+localvar2);				//	 Error
			}
		}


			InSide inside = new InSide();
			inside.display();

//			new InSide().display();
	}
}
