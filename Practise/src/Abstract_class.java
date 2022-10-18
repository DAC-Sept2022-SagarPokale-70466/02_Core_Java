abstract class human 			// This will not have any object
{	
	public abstract void walk();	// If there is more than 1 abstract method then the whole clas become the abstract class
									// and if you just declare the method then you must have to extend and define the method
	
	public void speak()
	{
		
	}
	
}

class men extends human		// Concrete class
{
	public void walk()
	{
		
	}
}

public class Abstract_class {

	
	public static void main(String[] args) 
	{
			human obj = new men();
			
	}
}
