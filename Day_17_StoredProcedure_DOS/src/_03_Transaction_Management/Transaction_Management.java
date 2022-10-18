/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 4:10:00 PM
*/

package _03_Transaction_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction_Management {

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

		int fromAccId, toAccId;
		double amount;
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		try {
			System.out.println("Enter From account : ");
			fromAccId = sc.nextInt();
			System.out.println("Enter to account : ");
			toAccId = sc.nextInt();
			System.out.println("Enter Amount : ");
			amount = sc.nextDouble();

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			con.setAutoCommit(false); // start transaction

			String sql = "UPDATE accounts set balance = balance + ? where id = ?";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setDouble(1, -amount);
				stmt.setInt(2, fromAccId);
				int cnt1 = stmt.executeUpdate();

				stmt.setDouble(1, +amount);
				stmt.setInt(2, toAccId);
				int cnt2 = stmt.executeUpdate();

						if (cnt1 == 0 || cnt2 == 0) {
							throw new RuntimeException("new Error");
						} // stmt.close()
				con.commit(); // commit transaction
				System.out.println("Transcation Completed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (con != null)
					System.out.println("error");
					con.rollback(); // Rollback the failed Transaction
			} catch (Exception b) {
				b.printStackTrace();
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		sc.close();
	}
}