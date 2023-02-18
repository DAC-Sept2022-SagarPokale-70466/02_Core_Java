/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 6:24:38 PM
*/

package _05_DOS;

import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

	private static String DB_DRIVER;
	private static String DB_URL;
	private static String DB_USER;
	private static String DB_PW;

	static {
		try (InputStream in = DbUtil.class.getResourceAsStream("jdbc.properties")) {
			Properties props = new Properties();
			props.load(in); // read in stream line by line, split by =, then add key & value into the props
			DB_DRIVER = props.getProperty("db.driver");
			DB_URL = props.getProperty("db.url");
			DB_USER = props.getProperty("db.user");
			DB_PW = props.getProperty("db.password");

			// load and register driver
			Class.forName(DB_DRIVER);				// This is option step without it also run but use it

		} catch (Exception i) {
			i.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PW);
		return con;
	}

}
