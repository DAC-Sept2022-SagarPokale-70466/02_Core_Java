import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Sagar_Pokale 2:15:53 PM 15-Oct-2022
 **/

public class Prg_01_File_IO_StudentClass_Using_FILEIO {

	public static void main(String[] args) {

		List<Teacher> list = new ArrayList<Teacher>();
		list.add(new Teacher(101, "Sagar", 98.54));
		list.add(new Teacher(102, "Anukesh", 99.54));
		list.add(new Teacher(103, "Saurabh", 95.54));
		list.add(new Teacher(104, "Swarup", 90.54));

//		saveFile(list);
		
		List<Teacher> view = new ArrayList<Teacher>();
		displayStudent(view);
		view.forEach(i -> System.out.println(i));
		
		
	}

	public static final String FILE_Student = "studnet.db";

	public static void saveFile(List<Teacher> list) {
		try (FileOutputStream fout = new FileOutputStream(FILE_Student)) {
			try (DataOutputStream dout = new DataOutputStream(fout)) {
				for (Teacher s : list) {
					dout.writeInt(s.getRoll()); // roll (int) --> 4 bytes
					dout.writeUTF(s.getName()); // name (String) --> length (4 bytes) + chars (n bytes)
					dout.writeDouble(s.getMarks()); // marks (double) --> 8 bytes
				}
				System.out.println("Student save in file " + FILE_Student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displayStudent(List<Teacher> list) {
		try(FileInputStream fin = new FileInputStream(FILE_Student)){
			try(DataInputStream din = new DataInputStream(fin)) {
					while(true) {
						int roll = din.readInt();
						String name = din.readUTF();
						double marks = din.readDouble();
						Teacher s = new Teacher(roll, name, marks);
						list.add(s);
					}
			}catch(EOFException e) {
				System.out.println("");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Number of students loaded from file: " + list.size());
	}
}

class Student {
	private int roll;
	private String name;
	private double marks;

	public Student() {
	}

	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
