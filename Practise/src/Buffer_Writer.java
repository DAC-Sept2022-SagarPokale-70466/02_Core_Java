import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffer_Writer {

	public static void main(String[] args) {
		
//		try {
//			BufferedWriter bw =new BufferedWriter(new FileWriter("C:\\Users\\Sagar\\Desktop\\output.txt"));
//			bw.write("Hello ");
//			bw.write(" my Name is Sagar Pokale");
//			bw.close();
//
//	}
//		catch(Exception e) {
//			return;
//		}

//		try {
//			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sagar\\Desktop\\output.txt"));
//			String s;
//			while((s = br.readLine()) != null)
//			{
//				System.out.println(s);
//			}
//			br.close();
//		}
//		catch(Exception e)
//		{
//			return;
//		}
		
		
		 
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Sagar\\Desktop\\output_copy.txt"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sagar\\Desktop\\output.txt"));
			String s;
			while((s = br.readLine()) != null)
			{
				bw.write(s);
			}
			bw.close();
			br.close();
		}
		catch(Exception e)
		{
			return;
		}
	}

}
