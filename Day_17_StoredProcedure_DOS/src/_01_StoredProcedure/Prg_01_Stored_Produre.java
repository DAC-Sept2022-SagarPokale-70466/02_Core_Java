/**
 * @Author : Sagar_Pokale
 * @Date : 18-Oct-2022 2:14:33 PM
 */

package _01_StoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * CREATE PROCEDURE sp_deptemps(p_dname CHAR(40)) BEGIN SELECT e.empno, e.ename,
 * e.sal FROM emp e INNER JOIN dept d ON e.deptno = d.deptno WHERE d.dname =
 * p_dname; END; $$
 */

public class Prg_01_Stored_Produre {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String DB_USER = "Sagar";
	public static final String DB_PW = "Sagar@123";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		String dname = "ACCOUNTING";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
			String sql = "call sp_deptemps (?);";
			try (CallableStatement stmt = con.prepareCall(sql)) {
				stmt.setString(1, dname);
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int empno = rs.getInt("empno");
						String name = rs.getString("ename");
						double sal = rs.getDouble("sal");
						System.out.printf("%d, %s, %.2f\n", empno, name, sal);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
