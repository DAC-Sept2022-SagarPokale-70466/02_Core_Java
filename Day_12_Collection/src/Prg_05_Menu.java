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
				for (int i = 0; i < staff.size(); i++)
					s = staff.get(i);
				System.out.println(s);
				break;

			case 3:
				System.out.println("Enter the Empno You want to seatch");
				int search = sc.nextInt();
				s = new Staff(search,"",0.0);
				int index = staff.indexOf(s);
				if(index != -1) {
					System.out.println("Found "+staff.get(index));
				}
				else
					System.out.println("Not Found ! ");
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
				Staff sta = new Staff(delete,"",0.0);
				System.out.println("Index of the Emp You want to delete : "+staff.indexOf(sta));
				if(staff.indexOf(sta) < staff.size()) {
					staff.remove(staff.indexOf(sta));
				}
				else {
					System.out.println("Wrong");
				}
				System.out.println("Deleted");
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

	public static void addStaff(Staff s, Scanner sc) {
		System.out.println("Enter Staff no : ");
		s.setEmpno(sc.nextInt());
		System.out.println("Enter Staff Name : ");
		s.setName(sc.next());
		System.out.println("Enter Salary :  ");
		s.setSal(sc.nextDouble());
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
		System.out.println("No fetch : " + list.size());
	}

}