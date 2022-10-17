import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Buffer_read {

	public static void main(String[] args) throws NumberFormatException, IOException {
			System.out.println("Enter the value : ");
			
//			InputStreamReader is = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(n);

	}
}
