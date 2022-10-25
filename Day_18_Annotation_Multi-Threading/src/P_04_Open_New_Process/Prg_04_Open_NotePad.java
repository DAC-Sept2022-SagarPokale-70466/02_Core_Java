/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 19-Oct-2022 4:24:41 PM
*/

package P_04_Open_New_Process;

import java.io.IOException;

public class Prg_04_Open_NotePad {

	public static void main(String[] args) {
		System.out.println("Hello");
//		String program = "C:/Windows/System32/notepad.exe";
//		String app = "G:/Shortcut_Key_STS";
		
		String program = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		String app = "https://www.google.com/";
		
		Runtime rt = Runtime.getRuntime();
		String[] cmd = { program, app };

		try {
			Process process = rt.exec(cmd);
			int status = process.waitFor();
			System.out.println("Child Process Exit status : " + status);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
