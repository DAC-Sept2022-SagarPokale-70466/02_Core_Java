import java.util.Objects;
import java.util.TreeSet;

public class Prg_07_HashSet_LinkedSet_TreeSet {

	public static void main(String[] args) {

//		 HashSet<Student> set = new HashSet<>();
		// LinkedHashSet<Student> set = new LinkedHashSet<>();
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(33, "S5", 77.7));
		set.add(new Student(55, "S2", 88.8));
		set.add(new Student(11, "S4", 44.4));
		set.add(new Student(44, "S1", 99.9));
		set.add(new Student(22, "S3", 55.5));
		set.add(new Student(11, "S4", 44.4));
		
		// duplicates are not allowed (in HashSet & LinkedHashSet) -- if equals() is implemented
		// duplicates are not allowed (in TreeSet) -- if Comparable.compareTo() is implemented
		
		set.forEach(i -> System.out.println(i));
		System.out.println("Number of elements: " + set.size());
		
//		Iterator<Student> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}

class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
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

	@Override
	public int compareTo(Student o) {
		return this.roll - o.roll;
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll == other.roll;
	}

}