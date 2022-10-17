import java.util.HashMap;
import java.util.Map;

public class Prg_02_StreamIn_Map {

	public static void main(String[] args) {

		Map<Integer, Student> m = new HashMap<Integer, Student>();
		Student s;
		s = new Student(33, "S5", 22.2);
		m.put(s.getRoll(), s);
		s = new Student(44, "S2", 22.8);
		m.put(s.getRoll(), s);
		s = new Student(11, "S1", 22.1);
		m.put(s.getRoll(), s);
		s = new Student(22, "S3", 22.3);
		m.put(s.getRoll(), s);
		s = new Student(55, "S4", 22.7);
		m.put(s.getRoll(), s);


		m.values()
						.stream()
						.sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
						.forEach(System.out::println);
		
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