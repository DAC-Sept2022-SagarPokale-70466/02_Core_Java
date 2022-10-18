/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 4:52:31 PM
*/

package _04_Properties_File;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

	public static String DB_DRIVER;
	public static String DB_URL;
	public static String DB_USER;
	public static String DB_PW;

	// METHOD 1 : OLD ONE

//	static {						// Static block because we want to run only once
//		try(FileInputStream in = new FileInputStream("G:\\C-Dac\\2_Core_Java\\Projects\\Day_17_StoredProcedure_DOS\\src\\_04_Properties_File\\jdbc.properties")){
//			Properties props = new Properties();
//			props.load(in);						// read in stream line by line, split by =, then add key & value into the props
//			DB_DRIVER = props.getProperty("db.driver");
//			DB_URL = props.getProperty("db.url");
//			DB_USER = props.getProperty("db.user");
//			DB_PW= props.getProperty("db.password");
//		}catch(IOException e) {
//			e.printStackTrace();
//			System.exit(0);
//		}	
//	}

	// METHOD 2 : NEW ONE

	static {
		try (InputStream in = DbUtil.class.getResourceAsStream("jdbc.properties")) {
			Properties props = new Properties();
			props.load(in); // read in stream line by line, split by =, then add key & value into the props
			DB_DRIVER = props.getProperty("db.driver");
			DB_URL = props.getProperty("db.url");
			DB_USER = props.getProperty("db.user");
			DB_PW = props.getProperty("db.password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
		return con;
	}

}
