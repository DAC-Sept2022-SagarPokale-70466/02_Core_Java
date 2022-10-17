import java.time.DateTimeException;
import java.util.Scanner;

public class Prg_03_Unchecked_Exception {

	public static void multiplication()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no for multiplication");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == 0 || b == 0) {
			throw new RuntimeException("Your message can be here");
		}
		if(a== 0 || b == 0) {
			throw new DateTimeException("Your message");
		}
		System.out.println("Multiplication : "+a*b);
		
	}
	public static void main(String[] args) {
		
		try
		{
			multiplication();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception");
		}
		catch(RuntimeException e)
		{
			System.out.println("Errpe in runTime");
		}
		catch(Throwable e) {
			System.out.println("Enter name");
		}
		finally
		{
			System.out.println();
			System.out.println("Inside finally");
		}
	}
}
