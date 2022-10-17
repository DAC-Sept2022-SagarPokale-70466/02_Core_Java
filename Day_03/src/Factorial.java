
public class Factorial {

	static int factorial(int x)
	{
		
		if(x == 0)
		{
			return 1;
		}
		return (x * factorial(x - 1));
	}
	public static void main(String[] args) {
		 
		 int num = 5;
		 int x = factorial(num);
		 System.out.println("Factorial of "+num+" is = "+x);
	}

}
