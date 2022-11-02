/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 30-Oct-2022 7:54:39 PM
*/

package DB;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	public static String DB_DRIVER;
	public static String DB_URL;
	public static String DB_USER;
	public static String DB_PASSWORD;

	static {
		try (InputStream in = DbUtil.class.getResourceAsStream("db.properties")) {
			Properties props = new Properties();
			props.load(in);
			DB_DRIVER = props.getProperty("db.driver");
			DB_URL = props.getProperty("db.url");
			DB_USER = props.getProperty("db.user");
			DB_PASSWORD = props.getProperty("db.password");
			
			Class.forName(DB_DRIVER);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return con;
	}

}