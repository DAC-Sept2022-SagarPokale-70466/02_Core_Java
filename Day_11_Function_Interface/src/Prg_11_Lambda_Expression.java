import java.util.Arrays;
import java.util.Comparator;

public class Prg_11_Lambda_Expression {

	public static void fun() {
		class LocalClass {
		}
	}

	public static void main(String[] args) {
		Emp1[] arr = { new Emp1(101, "Sagar", 89.99),
								new Emp1(105, "Sush", 99.99), 
								new Emp1(103, "Anukesh", 89.99),
								new Emp1(102, "Saurabh", 85.50), 
								new Emp1(104, "Akshay", 80.40) };
	
		Comparator<Emp1> cmp = new Comparator<Emp1>() {
			@Override
			public int compare(Emp1 e1, Emp1 e2) {
				return e1.getRoll() - e2.getRoll();
			}
		};
		
		Arrays.sort(arr, cmp);

		for (Emp1 e : arr) {
			System.out.println(e);
		}

		// Anonymous Inner Class
		
//		System.out.println("Sort by Name :");
//		Arrays.sort(arr, new Comparator<Emp>() {
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		// Lambda Expression
	
		System.out.println("Sorting with Lambda Expression\n");
		
		Arrays.sort(arr, (Emp1 e1, Emp1 e2) -> {	int diff = e1.getRoll() - e2.getRoll();		return diff;		});
		
		Arrays.sort(arr, (e1, e2) -> {return e1.getRoll() - e2.getRoll();    }     );
		
		Arrays.sort(	arr, (e1, e2) -> e1.getRoll() - e2.getRoll()	  	);	
		
		for(Emp1 e : arr)
			System.out.println(e);
		
		
	}
}

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
