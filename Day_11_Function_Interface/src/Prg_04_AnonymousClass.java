import java.util.Arrays;
import java.util.Comparator;

public class Prg_04_AnonymousClass {

	public static void fun() {
		class LocalClass {

		}
	}

	public static void main(String[] args) {
		Emp1[] arr = { 
						new Emp1(101, "Sagar", 89.99), 
						new Emp1(105, "Sush", 99.99), 
						new Emp1(103, "Anukesh", 89.99),
						new Emp1(102, "Saurabh", 85.50), 
						new Emp1(104, "Akshay", 80.40) };
		
//		rollComparator cmp = new rollComparator();
		
		System.out.println("Sort By Roll no : ");
		
		Arrays.sort(arr, new Comparator<Emp1>() {		// This also work
			@Override
			public int compare(Emp1 e1, Emp1 e2) {
				return e1.getRoll() - e2.getRoll();
			}
		});

		for (Emp1 e : arr) {
			System.out.println(e);
		}

		System.out.println("Sort by Name :");


		Arrays.sort(arr, new Comparator<Emp1>() {
			@Override
			public int compare(Emp1 e1, Emp1 e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		
		for (Emp1 e : arr) {
			System.out.println(e);
		}
		
		System.out.println("Sort by Marks : ");
		Arrays.sort(arr, new Comparator<Emp1>() {
			@Override
			public int compare(Emp1 o1, Emp1 o2) {
				return (int) Math.signum(o1.getMarks() - o2.getMarks());
			}	
		});
		
		for(Emp1 e : arr)
		{
			System.out.println(e);
		}
	}
}
//class rollComparator implements Comparator<Emp1>{
//	@Override
//	public int compare(Emp1 o1, Emp1 o2) {
//		return o1.getRoll() - o2.getRoll();
//	}
//}

class Emp1 {
	int roll;
	String name;
	double marks;

	public Emp1(int roll, String name, double marks) {
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
		return "Emp [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
