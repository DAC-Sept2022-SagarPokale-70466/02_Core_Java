import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author : Sagar_Pokale
 * @Date : 17-Oct-2022 2:56:27 PM
 */

public class Prg_03_Insert_into_DB {

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

	// Insert into emp table

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			try (Statement stmt = con.createStatement()) {
				System.out.print("Enter the Deptno :");
				int deptno = sc.nextInt();
				System.out.print("Enter Department Name : ");
				String dname = sc.next();
				System.out.print("Enter Department Location : ");
				String loc = sc.next();
				// String sql = "INSERT INTO dept VALUES ("+deptno+", '"+dname+"', '"+loc+"')";
				String sql = String.format("insert into dept values (%d, '%s', '%s')", deptno, dname, loc);
//				String sql = String.format("INSERT INTO dept VALUES (%d, '%s', '%s')",deptno, dname, loc);				
				
				System.out.println("SQL : " + sql);
				int count = stmt.executeUpdate(sql);
				System.out.println("Rows Inserted : " + count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
