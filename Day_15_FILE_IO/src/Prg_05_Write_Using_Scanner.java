import java.io.FileReader;
import java.io.FileWriter;

/**
 * @Author : Sagar_Pokale
 * @Date : 15-Oct-2022 5:16:33 PM
 **/

public class Prg_05_Write_Using_Scanner {

	public static void main(String[] args) {

		String srcFile = "C:\\Users\\Sagar\\Desktop\\PRNNO.txt";
		String desFile = "C:\\Users\\Sagar\\Desktop\\New.txt";

		int ch;
		try (FileReader fr = new FileReader(srcFile)) {
			try (FileWriter fw = new FileWriter(desFile)) {
				while ((ch = fr.read()) != -1) {
					fw.write(ch);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
