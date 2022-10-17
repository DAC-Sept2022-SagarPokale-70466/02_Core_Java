import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	
	
	void acceptStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roll No :");
		this.rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		this.name = sc.nextLine();
		System.out.println();
		System.out.println("Values Accepted");
	}
	
	void print()
	{
		System.out.println("Roll No : "+this.rollno);
		System.out.println("Name :"+this.name);
	}
}

public class Array_Multi_Dimensional {

	public static void main(String[] args) {
		
		Student[][] student_arr = new Student[3][];
		
		student_arr[0] = new Student[3];
		student_arr[1] = new Student[2];
		
		for(int row = 0;  row < student_arr.length; row++)
		{
			for(int col = 0; col < student_arr[row].length; col++)
			{
				student_arr[row][col] = new Student();
				student_arr[row][col].acceptStudent();
			}
		}
		
		
		for(Student[] std_array : student_arr)
		{
			for(Student std : std_array)
			{
				std.print();
			}
		}

	}

}
