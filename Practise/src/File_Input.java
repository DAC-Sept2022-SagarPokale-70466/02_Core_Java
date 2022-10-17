import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class File_Input {

	public static void main(String[] args) throws FileNotFoundException{
		
		File file = new File("G:\\C-Dac\\2_Core_Java\\core_java\\hello.txt");
		System.out.println(file.getAbsolutePath());
		
		Scanner sc = new Scanner(file);
		
//		System.out.println(sc.nextLine());
		
	}
}
		
		 //StringBuffer to store the contents
		
//		StringBuffer sb = new StringBuffer();
		
		//Appending each line to the buffer
		
		
		
		
//		try {
//			sc = new Scanner(file);
//			
//		while(sc.hasNextLine()) {
//			 	System.out.println(sc.nextLine());
//		 }
//		}
//		catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		sc.close();
	
		
//		InputStream is = new  FileInputStream("D:\\hello");
//		
//		Scanner sc = new Scanner(is);
//		
//		StringBuffer sb = new StringBuffer();
//		
//		while(sc.hasNext()) {
//			sb.append(" "+sc.nextLine());
//		}
//		System.out.println(sb);
//		
//		sc.close();
	


