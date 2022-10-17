import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Sagar_Pokale 3:04:18 PM 15-Oct-2022
 **/

public class Prg_02_FIleIO_Using_Object_Output {
	public static void main(String[] args) {

		List<Teacher> list = new ArrayList<Teacher>();
		list.add(new Teacher(101, "Sagar", 98.54));
		list.add(new Teacher(102, "Anukesh", 99.54));
		list.add(new Teacher(103, "Saurabh", 95.54));
		list.add(new Teacher(104, "Swarup", 90.54));

		saveTeacher(list);
		List<Teacher> viewTeacher1 = printTeacher();
		viewTeacher1.forEach(System.out::println);
		
		
		list.add(new Teacher(201,"Akshay", 94.54));
		
		
		// Second Time Save i.e Append
		saveTeacher(list);		
//		List<Teacher> viewTeacher2 = printTeacher();
//		viewTeacher2.forEach(System.out::println);
		
		
		
		
		
	}

	public static final String PATH = "Teacher.db";

	public static void saveTeacher(List<Teacher> list) {
		try (FileOutputStream fout = new FileOutputStream(PATH)) {
			try (ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(list);

			}
			System.out.println("Students saved in file " + PATH);
		} catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println("Saved !!!!!!!!!!!!!!");
	}
	
	public static List<Teacher> printTeacher() {
		List<Teacher> list = null;
		try(FileInputStream fin = new FileInputStream(PATH)){
			try(ObjectInputStream oin = new ObjectInputStream(fin)){
				list = (List<Teacher>) oin.readObject();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("Number of Result Fetched "+list.size());	
	return list;
	}
}

class Teacher implements Serializable {
	private int roll;
	private String name;
	private double marks;

	public Teacher() {
	}

	public Teacher(int roll, String name, double marks) {
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
