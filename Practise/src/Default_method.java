// Abstract class = Define and declare method
// Interface  = Only Declare method

interface aa
{
	int a = 10; 			// In interface the variable is by default final (constant)
	void abc();
	default void show()		// We cannot create a method body inside the inteface but with the help of default we can!
	{
		System.out.println("In show method");
	}
}

class demo implements aa
{
	public void abc()
	{
		System.out.println("In abc method");
	}
}
public class Default_method {
	
	public static void main(String[] args) {
			
		aa obj = new demo();
		obj.abc();
		obj.show();
	}

}
