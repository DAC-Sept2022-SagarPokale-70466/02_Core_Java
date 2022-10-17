import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Prg_05_IO_FILE {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String path = sc.nextLine();
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("Invalid Path.");
			System.exit(0);
		}
		
		if(file.isDirectory()) {
			System.out.println(file.getName() + " Listing");
			File[] files = file.listFiles();
			for(File f : files)
				System.out.println(f.getName());
		}
		else if(file.isFile()) {
			System.out.println("Name: " + file.getName());
			System.out.println("Directory: " + file.getParent());
			System.out.println("Length: " + file.length() + " bytes");
			System.out.println("Last Modified: " + new Date(file.lastModified()));
			System.out.println("Is Hidden: " + file.isHidden());
		}
		else
			System.out.println("Neither file nor directory path");
		sc.close();

	}
}
