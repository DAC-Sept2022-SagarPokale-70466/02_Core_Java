package Classwork;

public class Static_Field {

	public static void main(String[] args) {
		new student();
		new student();
		new student(101, "Sagar");
		new student(102, "Sushama");
		System.out.println("Counter is : " + student.counter);

	}

}

class student {
	private int rollno;
	private String name;
	static int counter;

	static {
		counter = 1001;
		System.out.println("Inside the Static Initilizer");
	}

	student() {
		this(0000, "NO NAME");
	}

	student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		System.out.println("Inside the constructor and Counter is : " + counter);
		counter++;
	}

	public int getCounter() {
		return this.counter;
	}

}
