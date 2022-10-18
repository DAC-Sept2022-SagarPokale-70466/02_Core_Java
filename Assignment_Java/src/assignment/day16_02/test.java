/**
*	@Author : Sagar_Pokale
*	@Date		 : 17-Oct-2022 9:48:44 PM
*/

package assignment.day16_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class test {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String DB_USER = "Sagar";
	public static final String DB_PW = "Sagar@123";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	// CRUD OPERATION
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count, choice ;
		emp e = null;
		do {
			System.out.println(
					"\n0.   EXIT\n1.   Add Employee \n2.   Display all\n3.   Find Employee \n4.   Update Employee\n5.   Delete Employee\nEnter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Byee !!!!");
				break;

			case  1:	// Add Emp
				System.out.print("Enter Empno :");
				int empno = sc.nextInt();
				System.out.print("Enter Emp Name : ");
				String name = sc.next();
				System.out.print("Enter the Job: ");
				String job = sc.next();
				System.out.print("Enter Manager: ");
				int mgr = sc.nextInt();
				System.out.print("Enter the Hire Date: ");
				String hiredate = sc.next();
				System.out.print("Enter the Salary: ");
				double sal = sc.nextDouble();
				System.out.print("Enter the Commission: ");
				double comm = sc.nextDouble();
				System.out.print("Enter the deptno: ");
				int deptno = sc.nextInt();
				e = new emp(empno, name, job, mgr, hiredate, sal, comm, deptno);
				count = save(e);
				System.out.println(count+ " Rows affeted ");
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			}
			
		}while(choice != 0);	
	}
	
	public static int save(emp e) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)){
			String sql = "Insert into emp (empno, ename,job,mgr,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				stmt.setInt(1, e.getEmpno());
				stmt.setString(2, e.getName());
				stmt.setString(3, e.getJob());
				stmt.setInt(4, e.getMgr());
				stmt.setString(5, e.getHiredate());
				stmt.setDouble(6, e.getSal());
				stmt.setDouble(7, e.getComm());
				stmt.setInt(8, e.getDeptno());
				int count = stmt.executeUpdate();
				return count;
			}
		}catch(Exception i) {
			i.printStackTrace();
		}
		return 0;
	}
	
}
