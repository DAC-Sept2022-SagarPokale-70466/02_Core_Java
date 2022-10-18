
public class first_class 
{
	public static void main(String args[])
	{
		outer obj = new outer();
		obj.hello();
		outer.inner obj1 = obj.new inner();
		obj1.hi();
		
		
	}
}

class outer
{
	int a;
	void hello()
	{
		System.out.println("Hello");
	}
	
	class inner
	{
		void hi()
		{
			System.out.println("Good morning");
		}
	}
}