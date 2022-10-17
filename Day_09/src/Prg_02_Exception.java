import java.util.InputMismatchException;
import java.util.Scanner;

public class Prg_02_Exception {

	static void division(int a, int b) {
		int result = a / b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		System.out.println("Enter two no for divison");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try { 
			division(a, b);
			System.out.println("Enter Something");
			Scanner ss = new Scanner(System.in);
			ss.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} catch (Exception e) {
			System.out.println("Error");

		} finally {
			System.out.println("In Finally block");
		}

		// Try with resource
//		try(Scanner sc1 = new Scanner(System.in))
//				{
//			
//				}
	}
}