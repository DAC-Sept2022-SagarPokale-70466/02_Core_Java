
interface a
{
	default void print()
	{
		System.out.println("Hello");
	}
}
interface b
{
	default void print()
	{
		System.err.println("Hii There");
	}
}

//Ambiguity error: Same default method inherited from multiple interfaces

class NewClass implements a,b{
	
	@Override
	public void print()
	{
		System.out.println("hfdsj");
	}
	
}

/*
//compiler error: duplicate default method from interfaces -- Ambiguity error
class MyClass implements Printable, Showable {
	
}
*/
public class Prg_07_Java8_Error_In_Multiple_Interface {

	public static void main(String[] args) {

		NewClass n = new NewClass();
		n.print();
	}

}
