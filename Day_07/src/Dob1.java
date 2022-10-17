import java.util.Scanner;

public class Dob1 {
	int day;
	int month;
	int year;

	public Dob1() {
		acceptDate();
	}

	public Dob1(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void acceptDate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB : ");
		this.day = sc.nextInt();
		sc.nextLine();
		this.month = sc.nextInt();
		sc.nextLine();
		this.year = sc.nextInt();
		sc.nextLine();
		
		
	}
	@Override
	public String toString() {
		return "Dob [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
}
