class a
{
	final int a = 5;	// final will make a constant
	void hello()
	{
		//a = 10;
		System.out.println("Hello");
	}
}

class b extends a
{
	
}

public class Final {

	public static void main(String[] args) {
		
//		a obj = new a();
//		obj.hello();
//		System.out.println("a = "+ obj.a);

		b obj = new b();
		obj.hello();
	}

}
