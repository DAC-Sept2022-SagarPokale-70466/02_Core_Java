package constructor;

import java.util.Scanner;

class User
{
	int real;
	int img;
	
	User()
	{
		this(5, 2);
	}
	User(int real, int img)
	{
		this.real = real;
		this.img = img;
	}
	void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no for real value");
		this.real = sc.nextInt();
		
		System.out.println("Enter another one for imaginary");
		this.img = sc.nextInt();
	}
	void printData()
	{
		System.out.println("Addition is = "+(this.img + this.real));
	}
}
public class User_input {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.acceptData();
		u1.printData();
		
		User u2 = new User();
		u2.printData();

	}

}
