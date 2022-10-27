/**
*	@Developer : 220944220183
*	@Date		 	   : 27-Oct-2022 11:19:54 AM
*/

package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Methods.Vendor;

public class VendorDao implements AutoCloseable {
	private Connection con;

	public VendorDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	public int add(Vendor v) throws SQLException {
		String sqlSave = "INSERT INTO Vendor(id, name, email, password, city, cell_no, reg_amount, reg_date,  role) VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmtSave = con.prepareStatement(sqlSave);
		stmtSave.setInt(1, v.getId());
		stmtSave.setString(2, v.getName());
		stmtSave.setString(3, v.getEmail());
		stmtSave.setString(4, v.getPassword());
		stmtSave.setString(5, v.getCity());
		stmtSave.setInt(6, v.getCell_no());
		stmtSave.setDouble(7, v.getReg_amount());
		stmtSave.setString(8, v.getReg_date());
		stmtSave.setString(9, v.getRole());
		int count = stmtSave.executeUpdate();
		
		return count;
	}

	public List<Vendor> findById() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String sqlFind = "Select id, name, email, password, city, cell_no, reg_amount, reg_date,  role from vendor where id = ?";
		PreparedStatement stmtFindAll = con.prepareStatement(sqlFind);
		System.out.println("Enter the Id You want to find : ");
		int id1 = sc.nextInt();
		stmtFindAll.setInt(1, id1);
		List<Vendor> list = new ArrayList<Vendor>();
		try (ResultSet rs = stmtFindAll.executeQuery()) {
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String city = rs.getString("city");
				int cell_no = rs.getInt("cell_no");
				double reg_amount = rs.getDouble("reg_amount");
				String reg_date = rs.getString("reg_date");
				String role = rs.getString("role");
				Vendor v = new Vendor(id, name, email, password, city, cell_no, reg_amount, reg_date, role);
				list.add(v);
			}
		}
		return list;
	}

	public List<Vendor> findByName() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String sqlFind = "Select id, name, email, password, city, cell_no, reg_amount, reg_date,  role from vendor where name = ?";
		PreparedStatement stmtFindAll = con.prepareStatement(sqlFind);
		System.out.println("Enter the Id You want to find : ");
		String namefind = sc.next();
		stmtFindAll.setString(1, namefind);
		List<Vendor> list = new ArrayList<Vendor>();
		try (ResultSet rs = stmtFindAll.executeQuery()) {
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String city = rs.getString("city");
				int cell_no = rs.getInt("cell_no");
				double reg_amount = rs.getDouble("reg_amount");
				String reg_date = rs.getString("reg_date");
				String role = rs.getString("role");
				Vendor v = new Vendor(id, name, email, password, city, cell_no, reg_amount, reg_date, role);
				list.add(v);
			}
		}
		return list;
	}

	public List<Vendor> findByEmail() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String sqlFind = "Select id, name, email, password, city, cell_no, reg_amount, reg_date,  role from vendor where name = ?";
		PreparedStatement stmtFindAll = con.prepareStatement(sqlFind);
		System.out.println("Enter the Id You want to find : ");
		String namefind = sc.next();
		stmtFindAll.setString(1, namefind);
		List<Vendor> list = new ArrayList<Vendor>();
		try (ResultSet rs = stmtFindAll.executeQuery()) {
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String city = rs.getString("city");
				int cell_no = rs.getInt("cell_no");
				double reg_amount = rs.getDouble("reg_amount");
				String reg_date = rs.getString("reg_date");
				String role = rs.getString("role");
				Vendor v = new Vendor(id, name, email, password, city, cell_no, reg_amount, reg_date, role);
				list.add(v);
			}
		}
		return list;
	}
	
	
	public int delete() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String sqlDelete = "DELETE from Vendor where id= ?";
		System.out.println("Enter the id You want to Delete : ");
		int deleteint = sc.nextInt();
		PreparedStatement stmtDelete = con.prepareStatement(sqlDelete);
		stmtDelete.setInt(1, deleteint);
		int count = stmtDelete.executeUpdate();
		sc.close();
		return count;
	}

//3. Find all

	public List<Vendor> findAll() throws SQLException {
		String sqlFindAll = "Select id, name, email, password, city, cell_no, reg_amount, reg_date,  role from vendor";
		PreparedStatement stmtFindAll = con.prepareStatement(sqlFindAll);
		List<Vendor> list = new ArrayList<Vendor>();
		try (ResultSet rs = stmtFindAll.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String city = rs.getString("city");
				int cell_no = rs.getInt("cell_no");
				double reg_amount = rs.getDouble("reg_amount");
				String reg_date = rs.getString("reg_date");
				String role = rs.getString("role");
				Vendor v = new Vendor(id, name, email, password, city, cell_no, reg_amount, reg_date, role);
				list.add(v);
			}
		}
		return list;
	}

	@Override
	public void close() throws Exception {
		con.close();
	}

}