import java.rmi.activation.ActivationGroupID;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public GUI()
	{
		JFrame frame = new JFrame();				//	Frame making
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,20,20));
//		panel.setLayout(new GridLayout(0, 1));
		
//		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		
		
		
	}
	
	public static void main(String[] args) {
		
	new GUI();
	

	}

}
