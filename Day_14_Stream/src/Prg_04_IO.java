import java.io.File;

public class Prg_04_IO {

	public static void main(String[] args) {

		File[] drive = File.listRoots();
		
		for(File f : drive)
		{
			System.out.println(f);
//			System.out.println("Drive: " + drive.toString());
			System.out.println(" - Total Space: " + f.getTotalSpace()/1024/1024/1024);
			System.out.println(" - Free Space: " + f.getFreeSpace()/1024/1024/1024);
			System.out.println(" - Usable Space: " + f.getUsableSpace()/1024/1024/10);
			
		}
	}

}
