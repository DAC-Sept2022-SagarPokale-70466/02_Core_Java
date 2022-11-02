/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 30-Oct-2022 7:55:58 PM
*/

package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import Account.Account;
import User_Exception.invalidAccountException;
import Validation.ValidateAccount;

public class AccountDao implements AutoCloseable {
	private Connection con;

	public AccountDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}

	public void addAcc(HashMap<String, Account> map, Scanner sc) {
		try {
			String sqlAdd = "INSERT INTO EBANK VALUES(?,?,?,?,?,?);";
			PreparedStatement stmtAddAcc = con.prepareStatement(sqlAdd);
			System.out.println("enter accountNumber");
			String accountNumber = sc.next();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter email");
			String email = sc.next();
			System.out.println("enter phone");
			String phone = sc.next();
			System.out.println("enter balance");
			double bal = sc.nextDouble();
			System.out.println("enter accountType");
			String accountType = sc.next();
			String validAccType = ValidateAccount.getValidAcc(accountType, sc);

			stmtAddAcc.setString(1, accountNumber);
			stmtAddAcc.setString(2, name);
			stmtAddAcc.setString(3, email);
			stmtAddAcc.setString(4, phone);
			stmtAddAcc.setDouble(5, bal);
			stmtAddAcc.setString(6, validAccType);

			int cnt = stmtAddAcc.executeUpdate();
			System.out.println("Rows Affected: " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
		try {
			String sqlCreate = "Create table ebank (accountNumber varchar(25), name varchar(25), email varchar(20), phone varchar(25), balance double, accountType enum('Saving', 'Current'));";
			PreparedStatement stmtCreate = con.prepareStatement(sqlCreate);
			stmtCreate.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disAccId(String acno, Scanner sc) throws SQLException{
		String sqlDisacno = "select accountNumber,name,email,phone,balance,accountType from EBANK where accountNumber=?";
		try {
			PreparedStatement DisplayAccbyAcno = con.prepareStatement(sqlDisacno);
			DisplayAccbyAcno.setString(1, acno);
			try(ResultSet rs =DisplayAccbyAcno.executeQuery()){
				if(rs.next()) {
					String accountType = rs.getString("accountType");
					Enum validAccType = ValidateAccount.getValidAccE(accountType, sc);
					Account a = new Account(
														rs.getString("accountNumber"),
														rs.getString("name"), rs.getString("email"),
														rs.getString("phone"),
														rs.getDouble("balance"), 
								validAccType);
					
					System.out.println(a);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 

}
