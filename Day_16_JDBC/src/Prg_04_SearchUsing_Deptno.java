import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author : Sagar_Pokale
 * @Date : 17-Oct-2022 3:50:20 PM
 */

public class Prg_04_SearchUsing_Deptno {

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
		Scanner sc = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			try (Statement stmt = con.createStatement()) {
				System.out.println("Enter the dept no : ");
				String dno = sc.nextLine();
				String sql = "Select eno, ename, salary, deptno from emp where deptno=" + dno;
				System.out.println("SQL : " + sql);
				try (ResultSet rs = stmt.executeQuery(sql)) {				// ResultSet because here it is Select Statement
					while (rs.next()) {
						int empno = rs.getInt("eno");
						String ename = rs.getString("ename");
						int salary = rs.getInt("Salary");
						int deptno = rs.getInt("deptno");
						System.out.printf("%d, %s, %d,%d", empno, ename, salary, deptno);

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
