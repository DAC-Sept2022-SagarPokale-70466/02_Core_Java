import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name;
		int age;

//			System.out.println("Enter your name and we are using nextline function :");
//			name = scanner.nextLine();
//			
//			System.out.println("Enter your age and we are using the nextInt()");
//			age = scanner.nextInt();
//			
//			System.out.println(name+age );

//			System.out.println("Enter int with nextInt()");
//			age = scanner.nextInt();
//			name = scanner.nextLine();
//			
//			System.out.println(age + " "+ name);

		float floatage = 0;
		boolean flag = false;
		do {
			System.out.println("Enter int with nextInt()");
			name = scanner.nextLine();

			try {
				floatage = Float.parseFloat(name);
				flag = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Enter valid age");
			}
		} while (flag == false);
		System.out.println("Age is " + floatage);

	}
}