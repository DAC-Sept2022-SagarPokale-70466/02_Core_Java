import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Prg_06_IO_Data {

	public static void main(String[] args) {

		String srcFilePath = "G:\\Shortcut_Key_STS.txt";
		String destFilePath = "C:\\Users\\Sagar\\Desktop\\newFile.txt";
		int b;

		// 1. open source file (for reading)
		try (FileInputStream in = new FileInputStream(srcFilePath)) {

			// 2. open destination file (for writing)
			try (FileOutputStream out = new FileOutputStream(destFilePath)) {
				// 3. read a byte from source file
				while ((b = in.read()) != -1) {
					// 4. write that byte into destination file
					out.write(b);
				} // 5. repeat 3 & 4 until end of source file
					// 6. close destination file
			} // out.close();
			System.out.println("File copied.");
			// 7. close source file
		} // in.close();
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
