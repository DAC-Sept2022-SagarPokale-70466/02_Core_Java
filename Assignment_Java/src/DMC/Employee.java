/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 3:49:21 PM
*/

package DMC;

import java.util.Objects;
import java.util.Scanner;

public class Employee {

	private int empId;
	private String name;
	private Gender gender;
	private int age;
	private String email_id;
	private double salary;
	private String dept;
	private static int rating;

	public Employee() {
		
	}
	public Employee(int empId) {
		this.empId = empId;
		this.name = null;
		this.gender = null;
		this.age = 0;
		this.email_id = null;
		this.salary = 0.0;
		this.dept = null;
		
	}
	public Employee(String dept) {
		this.empId = 00;
		this.name = null;
		this.gender = null;
		this.age = 0;
		this.email_id = null;
		this.salary = 0.0;
		this.dept = dept;
		
	}
	public Employee(int empId, String name, Gender gender, int age, String email_id, double salary, String dept) {
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email_id = email_id;
		this.salary = salary;
		this.dept = dept;
	}

	Scanner sc = new Scanner(System.in);


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static int getRating() {
		return rating;
	}

	public static void setRating(int rating) {
		Employee.rating = rating;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", email_id=" + email_id + ", salary="
				+ salary + ", dept=" + dept + ", sc=" + sc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, email_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) || Objects.equals(email_id, other.email_id);
	}


	
	
}
