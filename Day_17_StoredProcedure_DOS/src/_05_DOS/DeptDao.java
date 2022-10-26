/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 6:25:04 PM
*/

package _05_DOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptDao implements AutoCloseable { // becaus DeptDao instace is used in try with resource

	private Connection con;

	DeptDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	public int save(Dept d) throws SQLException {
		String sqlSave = "INSERT INTO dept(deptno, dname, loc) VALUES(?,?,?)";
		PreparedStatement stmtSave = con.prepareStatement(sqlSave);
		stmtSave.setInt(1, d.getDeptno());
		stmtSave.setString(2, d.getDname());
		stmtSave.setString(3, d.getLoc());
		int count = stmtSave.executeUpdate();
		return count;
	}

//	2. Find Alls

	public List<Dept> findAll() throws SQLException {
		String sqlFindAll = "SELECT deptno, dname, loc from dept";
		PreparedStatement stmtFindAll = con.prepareStatement(sqlFindAll);
		List<Dept> list = new ArrayList<Dept>();
		try (ResultSet rs = stmtFindAll.executeQuery()) {
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Dept d = new Dept(deptno, dname, loc);
				list.add(d);
			}
		}
		return list;
	}

	public Dept findById() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Department you want to seach");
		int find = sc.nextInt();
		String sqlFindById = "SELECT deptno, dname, loc from dept where deptno = ?";
		PreparedStatement stmtFindById = con.prepareStatement(sqlFindById);
		stmtFindById.setInt(1, find);
		try (ResultSet rs = stmtFindById.executeQuery()) {
			if (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Dept d = new Dept(deptno, dname, loc);
				return d;
			}
		}
		sc.close();
		return null;
	}

	public int updateDept() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String sqlUpdate = "UPDATE dept set dname = ?, loc = ? where deptno = ?";
		System.out.println("Enter the Deptno You want to Update : ");
		int newDeptno = sc.nextInt();
		System.out.println("Enter new Department Name : ");
		String newDname = sc.next();
		System.out.println("Enter new Department Location : ");
		String newLoc = sc.next();

		PreparedStatement stmtUpdate = con.prepareStatement(sqlUpdate);
		stmtUpdate.setInt(3, newDeptno);
		stmtUpdate.setString(1, newDname);
		stmtUpdate.setString(2, newLoc);
		int count = stmtUpdate.executeUpdate();
		sc.close();
		return count;
	}

	public int deleteDept() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String sqlDelete = "DELETE from dept where deptno = ?";
		System.out.println("Enter the Deptno You want to Delete : ");
		int deptno = sc.nextInt();
		PreparedStatement stmtDelete = con.prepareStatement(sqlDelete);
		stmtDelete.setInt(1, deptno);
		int count = stmtDelete.executeUpdate();
		sc.close();
		return count;
	}

	@Override
	public void close() throws Exception {
		con.close();
	}
}

