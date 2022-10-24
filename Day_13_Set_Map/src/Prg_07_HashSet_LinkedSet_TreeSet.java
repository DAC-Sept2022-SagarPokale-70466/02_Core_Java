import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Prg_07_HashSet_LinkedSet_TreeSet {

	public static void main(String[] args) {

// 		TYPES OF SETS : 
		
//		HashSet<Student> set = new HashSet<>();
		LinkedHashSet<Student> set = new LinkedHashSet<>();
//		TreeSet<Student> set = new TreeSet<>();

		set.add(new Student(33, "S5", 77.7));
		set.add(new Student(55, "S2", 88.8));
		set.add(new Student(11, "S4", 44.4));
		set.add(new Student(44, "S1", 99.9));
		set.add(new Student(22, "S3", 55.5));
		set.add(new Student(11, "S4", 44.4));

		// duplicates are not allowed (in HashSet & LinkedHashSet) -- if equals() is implemented
		// duplicates are not allowed (in TreeSet) -- if Comparable.compareTo() is implemented

		System.out.println("Using the ForEach Method");
		set.forEach(i -> System.out.println(i));
		System.out.println("Size of Set : "+set.size());
		
		System.out.println("Using the interator Method");
		Iterator<Student> itr = set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Size of Set : "+set.size());
		
//		==============================================================
		
		System.out.println("Removing the element");
		LinkedHashSet<Student> rm = new LinkedHashSet<Student>();
		rm.add(new Student(22,"",0.0));
//		set.removeAll(rm);							// This will remove From the Collection 
//		set.remove(new Student(22,"",0.0));			// remove will remove from specific Object
		set.forEach(i -> System.out.println(i));
		System.out.println("Size of Set : "+set.size());
		
	}
}

class Student implements Comparable<Student> {
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
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return roll == other.roll;
	}
	

	

}