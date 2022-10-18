/**
*	@Author : Sagar_Pokale
*	@Date		 : 18-Oct-2022 4:50:36 PM
*/

package _04_Properties_File;

import java.sql.Connection;

public class Properties_File {

	public static void main(String[] args) {

			try(Connection con = DbUtil.getConnection()){
				System.out.println("Connectiion Created !!!!");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}
