
public class Prg_05_Overriding_While_Declaring {

	public static void main(String[] args) {

		Myclass newClass = new Myclass();
		newClass.print();
		
		Myclass c1 = new Myclass() {
			@Override
		public void print()				// Override the method while declaring new reference
			{
				System.out.println("Inside Main Class Print Method");
			}
		};
		c1.print();
	}
}

class Myclass
{
	public void print()
	{
		System.out.println("Inside Myclass Class");
	}
}
