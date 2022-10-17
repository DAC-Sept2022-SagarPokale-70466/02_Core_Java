import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author : Sagar_Pokale
 * @Date : 17-Oct-2022 4:33:59 PM
 */

public class Prg_06_Menu_Driven {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String DB_USER = "Sagar";
	public static final String DB_PASSWORD = "Sagar@123";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		int choice, count;
		int deptno;
		String dname, dloc;
		Dept d;
		Scanner sc = new Scanner(System.in);
		List<Dept> list;
		do {
			System.out.println(
					"\n0.   EXIT\n1.   Add Dept\n2.   Display all\n3.   Find Dept\n4.   Update Dept\n5.   Delete Dept\nEnter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0: // Exit
				System.out.println("Bye !!!!!");
				break;

			case 1: // Add Dept
				System.out.print("Enter Deptno :");
				deptno = sc.nextInt();
				System.out.print("Enter Department Name : ");
				dname = sc.next();
				System.out.print("Enter the Department Location : ");
				dloc = sc.next();
				d = new Dept(deptno, dname, dloc);
				count = save(d);
				System.out.println(count + " Rows Affected.");
				break;

			case 2: // Display All
				list = findAll();
				list.forEach(i -> System.out.println(i));
				System.out.println();
				break;

			case 3: // Find Dept
				System.out.println("Enter the Depno You want to Search : ");
				deptno = sc.nextInt();
				d = findById(deptno);
				if (d == null)
					System.out.println("Not Found ! ");
				else
					System.out.println("Found " + d);
				break;

			case 4: // Update Dept
				System.out.println("Updating Dept : ");
				count = updateDept();
				System.out.println(count + " Rows Affeted");
				break;

			case 5:
				remove();
				list = findAll();
				list.forEach(i -> System.out.println(i));
				break;

			default:
				System.out.println("Enter Valid Choice : ( ");
				break;
			}

		} while (choice != 0);
	}

	// Save a new to DB

	public static int save(Dept d) {
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "Insert into dept(deptno, dname, loc) values(?,?,?)";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, d.getDeptno());
				stmt.setString(2, d.getDname());
				stmt.setString(3, d.getLoc());
				int cont = stmt.executeUpdate();
				return cont;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// Display ALL

	public static List<Dept> findAll() {
		List<Dept> list = new ArrayList<Dept>();
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "Select deptno, dname, loc from dept";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int deptno = rs.getInt("deptno");
						String dname = rs.getString("dname");
						String loc = rs.getString("loc");
						Dept d = new Dept(deptno, dname, loc);
						list.add(d);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// Find the Deptno

	public static Dept findById(int deptno) {
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "select deptno, dname, loc from dept where deptno=?";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, deptno);
				try (ResultSet rs = stmt.executeQuery()) { // resultset because here it is select statement
					if (rs.next()) {
						int deptnum = rs.getInt("deptno");
						String dname = rs.getString("dname");
						String loc = rs.getString("loc");
						Dept d = new Dept(deptnum, dname, loc);
						return d;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Update Dept

	public static int updateDept() {
		Scanner sc = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "update dept set dname = ?, loc = ? where deptno=?";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.println("Enter the Deptno You want to modify : ");
				int deptno = sc.nextInt();
				System.out.println("Enter the Department Name you want to Modify : ");
				String dname = sc.next();
				System.out.println("Enter the New Location for new Department : ");
				String dloc = sc.next();

				stmt.setString(1, dname);
				stmt.setString(2, dloc);
				stmt.setInt(3, deptno);

				int count = stmt.executeUpdate();
				return count;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// Remove From DB

	public static void remove() {
		Scanner sc = new Scanner(System.in);
		try (Connection cons = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "delete from dept where deptno=?";
			try (PreparedStatement stmt = cons.prepareStatement(sql)) {
				System.out.println("Enter the Empno You want delete : ");
				int deptno = sc.nextInt();
				stmt.setInt(1, deptno);
				int count = stmt.executeUpdate();
				System.out.println(count + " Rows Affeted ");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Dept {
	private int deptno;
	private String dname;
	private String loc;

	public Dept() {
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
}