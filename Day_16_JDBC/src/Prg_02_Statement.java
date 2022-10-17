import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author : Sagar_Pokale
 * @Date : 17-Oct-2022 2:13:42 PM
 **/

public class Prg_02_Statement {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String DB_USER = "Sagar";
	public static final String DB_PASSWORD = "Sagar@123";

	static {
		try {
			// Step 1 : Load and register JDBC Driver Class
			Class.forName(DB_DRIVER); // Class.forName() Load the Driver
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// step 2: Create JDBC connection with help of DriverManager
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			// step 3: Create the statement
			try (Statement stmt = con.createStatement()) {
				// step 4: Execute the SQL query using the statement and process the result.
				String sql = "Select * from emp";
				try (ResultSet rs = stmt.executeQuery(sql)) {
					while (rs.next()) {
						int empno = rs.getInt("eno");
						String name = rs.getString("ename");
						int sal = rs.getInt("SALARY");
						int deptno = rs.getInt("Deptno");
//						BigDecimal comm = (BigDecimal) rs.getObject("comm");		// For Null values use getObject
//						Integer mgr = (Integer) rs.getObject("mgr");
						System.out.printf("%d, %s,  %d, %d \n", empno, name, sal, deptno);
					}
				} // rs.close();
			} // step 5: stmt.close();
		} // step 5: con.close();
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}

