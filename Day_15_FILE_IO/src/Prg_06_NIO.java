import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
*	@Author : Sagar_Pokale
*	@Date		 : 15-Oct-2022 5:30:05 PM
**/

public class Prg_06_NIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String pathStr = sc.nextLine();
		Path path = Paths.get(pathStr);
		
		if(!Files.exists(path)) {
			System.out.println("Invalid Path");
			System.exit(0);
		}
		
		if(Files.isDirectory(path)) {
			try {
				Files.list(path)
					.forEach(p -> System.out.println(p.getFileName()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(Files.isRegularFile(path)) {
			try {
				System.out.println("File Name: " + path.getFileName());
				System.out.println("File Size: " + Files.size(path));
				System.out.println("Is Hidden: " + Files.isHidden(path));
				
				System.out.println("\nFile Contents: ");
				List<String> list = Files.readAllLines(path);
				list.forEach(System.out::println);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else 
			System.out.println("Neither file nor directory path.");
		
		sc.close();
	}

}
