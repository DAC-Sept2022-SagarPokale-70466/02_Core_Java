import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prg_05_Menu {

	public static void addStaff(Staff s, Scanner sc) {
		System.out.println("Enter Staff no : ");
		s.setEmpno(sc.nextInt());
		System.out.println("Enter Staff Name : ");
		s.setName(sc.next());
		System.out.println("Enter Salary :  ");
		s.setSal(sc.nextDouble());
	}

	public static void main(String[] args) {

		List<Staff> staff = new ArrayList<>();
		Staff s = null;
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n\n0.   Exit\n1.   Add Staff\n2.   Display All\n3.   Find Staff\n4.   Save File\n5.   Load File ");
			System.out.println("6.   Delete From no; ");
			System.out.println("0.   Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Byeee !!!!!!!!!!!!!!!!");
				break;
			case 1:
				s = new Staff();
				addStaff(s, sc);
				staff.add(s);
				break;

			case 2:
				for (int i = 0; i < staff.size(); i++) {
					s = staff.get(i);
					System.out.println(s);
				}
				break;

			case 3:
				System.out.println("Enter the Empno You want to seatch");
				int num = sc.nextInt();
				Staff search = new Staff(num, "", 0.0);
				int index = staff.indexOf(search);
				if (index != -1)
					System.out.println(" Searched : " + staff.get(index));
				else
					System.out.println("Not Found");
				break;

			case 4:
				saveFile(staff);
				break;
			case 5:
				List<Staff> list = new ArrayList<>();
				loadFIle(list);
				list.forEach(i -> System.out.println(i));
				break;
			case 6:
				System.out.println("Enter the Empno you want to delete : ");
				System.out.println(staff.size());
				int delete = sc.nextInt();
				Staff sta = new Staff(delete, "", 0.0);
				System.out.println("Index of delete :"+ staff.indexOf(sta));
				if(staff.indexOf(sta) < staff.size()) {
					staff.remove(staff.indexOf(sta));
					System.out.println("Deleted "+ delete);
				}
				else {
						System.out.println("Wrong No !!!!");
					}
			}
		} while (choice != 0);
	}

	public static void saveFile(List<Staff> staff) {
		final String FILE = "Staff.db";
		try (FileOutputStream fout = new FileOutputStream(FILE)) {
			try (DataOutputStream dout = new DataOutputStream(fout)) {
				for (Staff sf : staff) {
					dout.writeInt(sf.getEmpno());
					dout.writeUTF(sf.getName());
					dout.writeDouble(sf.getSal());
				}
				System.out.println("File Saved");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void loadFIle(List<Staff> list) {
		final String FILE = "Staff.db";
		try (FileInputStream fin = new FileInputStream(FILE)) {
			try (DataInputStream din = new DataInputStream(fin)) {
				while (true) {
					int empno = din.readInt();
					String name = din.readUTF();
					double sal = din.readDouble();
					Staff s = new Staff(empno, name, sal);
					list.add(s);
				}
			} catch (EOFException e) {
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("No fetch : "+list.size() );
	}
}

class Staff {
	private int empno;
	private String name;
	private double sal;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(int empno, String name, double sal) {
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Staff))
			return false;
		Staff s = (Staff) o;
		return this.empno == s.empno ; // This will find match of empno							// This will load match of empno
//		return this.empno == s.empno && this.name == s.name && this.sal == s.sal;			// This will find all 3 matches
	}
}
