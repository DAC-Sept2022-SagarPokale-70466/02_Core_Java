import java.util.Scanner;

public class Person {
	String name;
	Dob1 dob;

	public Person() {
		acceptPerson();
	}

	public Person(String name) {
		this.name = name;
		this.dob = new Dob1(0, 0, 0);
	}

	public Person(String name, Dob1 dob) {
		this.name = name;
		this.dob = dob;
	}

	public void acceptPerson()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		this.name = sc.nextLine();
		this.dob = new Dob1();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}
}
