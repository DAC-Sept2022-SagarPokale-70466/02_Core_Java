/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 3:23:45 PM
*/

package _02_StoredProcedure_IN_OUT;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLType;
import java.sql.Types;

/*
CREATE PROCEDURE sp_depttotalsal(IN p_deptno INT, OUT p_totalsal DOUBLE)
BEGIN
    SELECT SUM(sal) INTO p_totalsal FROM emp WHERE deptno = p_deptno;
END;
$$
*/

public class StoredProcedure_IN_OUT {

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

		int deptno = 10;
		double total = 0.0;

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "call sp_depttotalsal(?, ?)";
			try (CallableStatement stmt = con.prepareCall(sql)) { // create a CallableStatement to execute the stored procedure
				stmt.setInt(1, deptno); // set all in-params
				stmt.registerOutParameter(2, Types.DOUBLE); // register all out-params // Types : The class that defines
															// the constants that are used to identify genericSQL types,
															// called JDBC types.
				stmt.execute();
				total = stmt.getDouble(2);
				System.out.println("Dept total sal is = " + total);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
