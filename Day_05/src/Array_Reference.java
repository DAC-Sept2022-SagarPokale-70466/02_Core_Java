import java.util.Scanner;

class std
{
	int rollno;
	String name;
	
	void accept_student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no = ");
		this.rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name = ");
		
		this.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Values Accepted");
		sc.close();
	}
	void print_detail()
	{
		System.out.println("Name = "+this.name);
		System.out.println("Roll No = "+this.rollno);
	}
}

public class Array_Reference {

	public static void main(String[] args) {

		std student_array[] = new std[3];
		
		for(int i = 0; i < student_array.length; i++) 
		{
			student_array[i] = new std();
			student_array[i].accept_student();
		}
		
		for(std std : student_array)
		{
			std.print_detail();
		}
		
		
		
//		int sum = 0;
//		for(int i = 0; i < student_array.length; i++)
//		{
//			sum = sum + student_array[i].rollno;
//		}
//		System.out.println("Total of Roll No : "+sum);
		
	}
}
