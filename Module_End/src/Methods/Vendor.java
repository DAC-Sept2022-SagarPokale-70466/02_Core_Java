/**
*	@Developer : 220944220183
*	@Date		 	   : 27-Oct-2022 11:07:41 AM
*/

package Methods;

import java.util.Objects;
import java.util.Scanner;

public class Vendor {
	int id;
	String name;
	String email;
	String password;
	String city;
	int cell_no;
	double reg_amount;
	String reg_date;
	String role;
	Scanner sc = new Scanner(System.in);

	public Vendor() {

	}

	public Vendor(int id, String name, String email, String password, String city, int cell_no, double reg_amount,
			String reg_date, String role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.cell_no = cell_no;
		this.reg_amount = reg_amount;
		this.reg_date = reg_date;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", city=" + city
				+ ", cell_no=" + cell_no + ", reg_amount=" + reg_amount + ", reg_date=" + reg_date + ", role=" + role
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCell_no() {
		return cell_no;
	}

	public void setCell_no(int cell_no) {
		this.cell_no = cell_no;
	}

	public double getReg_amount() {
		return reg_amount;
	}

	public void setReg_amount(double reg_amount) {
		this.reg_amount = reg_amount;
	}

	public void setReg_date(String date) {
		this.reg_date = date;
	}
	public String getReg_date() {
		return reg_date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vendor))
			return false;
		Vendor other = (Vendor) obj;
		return id == other.id;
	}

	public Vendor add() {
		Vendor v = new Vendor(101,"Sagar","abc@gmail.com","Sagar@123","Nashik",501,1001,"2022","Sales");
//		System.out.println("Enter Vendor ID : ");
//		this.id = sc.nextInt();
//		System.out.println("Enter Vendor Name : ");
//		this.name = sc.next();
//		System.out.println("Enter Email Id : ");
//		this.email = sc.next();
//		System.out.println("Enter Password : ");
//		this.password = sc.next();
//		System.out.println("Enter City : ");
//		this.city = sc.next();
//		System.out.println("Enter Cell no : ");
//		this.cell_no = sc.nextInt();
//		System.out.println("Enter Registration Amount : ");
//		this.reg_amount = sc.nextDouble();
//		System.out.println("Enter Registration Date");
//		this.reg_date = sc.next();
//		System.out.println("Enter Role : ");
//		this.role = sc.next();
		return v;
	}
}