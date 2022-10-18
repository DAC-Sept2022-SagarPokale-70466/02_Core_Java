import java.util.Scanner;		// Ctrl + Shift + O

public class User_input {

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("Enter the no. = ");
		
		Scanner sc = new Scanner(System.in);	// Input come from system, file, etc.
		n = sc.nextInt();
		System.out.print(n);
	}

}
