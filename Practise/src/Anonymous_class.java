
//class A
//{
//	public void show()
//	{
//		System.out.println("Hello");
//	}
//}
//
//public class Anonymous_class {
//
//	public static void main(String[] args) {
//		
//		A obj = new A()			// Object
//				{				// Annonymus class
//					public void show()				// Rather than creating an another class we can implement an another method which will override the same method from giving object.
//					{
//						System.out.println("Im Sagar Pokale");	// implementation
//					}
//				};
//	obj.show();
//
//	}
//
//}

// ANONYMOUS CLASS WITH INTERFACE

interface abc
{
	public void show();
	
}
// For implementing inteface we have to implement the show method using implement keyword.
public class Anonymous_class {

	public static void main(String[] args) {
		
		abc obj = new abc()			// Object	(BUT WE CAN NOT CREATE AN OBJECT OF INTERFACE 
				{				// Annonymus class	(BUT HERE WE CAN IMPLEMENT USING ANNONYMOYS CLASS)
					public void show()				
					{
						System.out.println("Im Sagar Pokale");	// implementation
					}
				};
	obj.show();

	}

}
