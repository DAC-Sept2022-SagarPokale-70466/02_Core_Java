package assignment.day09_01;

import java.util.Arrays;
import java.util.Comparator;

public class Prg_03_Sorting {

	public static void main(String[] args) {

		Student[] student = { new Student(105, "Sagar", "Nashik", 90.99),
					new Student(103, "Saurabh", "Sinner", 94.99),
					new Student(102, "Saurabh", "Sinner ", 80.99), 
					new Student(104, "Anukes", "Sinner", 80.99),
					new Student(101, "Akshay", "Mumbai", 58.99) };

		System.out.println("Sort by : City");
		
		class SortCity implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {
				int diff = o1.getCity().compareTo(o2.getCity());				// For Comparing String Use CompareTo method 
				if (diff == 0) {
					if (o1.getMarks() == o2.getMarks())
						return (o1.getName().compareTo(o2.getName()));
					else if (o1.getMarks() > o2.getMarks())
						return -1;
					else
						return +1;
				}
				return diff;
			}
		}
		SortCity sCity = new SortCity();
		Arrays.sort(student, sCity);
		for (Student s : student) {
			System.out.println(s);
		}
	}
}

class Student implements Comparable<Student> {
	int roll;
	String name;
	String city;
	double marks;

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		int diff = this.roll - o.roll;
		return diff;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
}
