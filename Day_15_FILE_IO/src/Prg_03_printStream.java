import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Sagar_Pokale
 * @Date : 15-Oct-2022 3:59:05 PM
 **/

public class Prg_03_printStream {
	public static final String LOCATION = "Student1.db";

	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
		list.add(new Student1(11, "S1", 22.1));
		list.add(new Student1(33, "S2", 22.2));
		list.add(new Student1(22, "S3", 22.3));
		list.add(new Student1(55, "S4", 22.7));

		saveStudents(list);

	}

	public static void saveStudents(List<Student1> list) {
		// new PrintStream(DATA_FILE) internally creates FileOutputStream and chain
		// PrintStream to it
		try (PrintStream out = new PrintStream(LOCATION)) {
			for (Student1 s : list) {
				out.printf("%d  %s  %.2f\n", s.getRoll(), s.getName(), s.getMarks());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Student1 implements Serializable {
	private static final long serialVersionUID = 7L;
	private int roll;
	private String name;
	private double marks;
	transient private double percent;

	// ......
	public Student1() {
	}

	public Student1(int roll, String name, double marks) {
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
