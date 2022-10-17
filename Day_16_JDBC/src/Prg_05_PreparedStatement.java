import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
*	@Author : Sagar_Pokale
*	@Date		 : 17-Oct-2022 4:05:40 PM
*/
// More Recommended way to connect and update the Databases connectivity

// Update Eg

public class Prg_05_PreparedStatement {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String DB_USER = "Sagar";
	public static final String DB_PASSWORD = "Sagar@123";

	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";				// Here ? is the placeholder tobe replaced 			
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				System.out.println("Enter the Deptno to be modified : ");
				int deptno = sc.nextInt();
				System.out.println("Enter the new dname :");
				String dname = sc.next();
				System.out.println("Enter the new Location :");
				String dloc = sc.next();
				
				stmt.setString(1, dname);		// SetString is mandatory for Placeholder ? tobe replaced and index start with 1.
				stmt.setString(2, dloc);		
				stmt.setInt(3, deptno);
				int count = stmt.executeUpdate();
						System.out.println(count+" Rows Affected ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
