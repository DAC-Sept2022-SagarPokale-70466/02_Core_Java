import java.util.Arrays;
import java.util.Comparator;

public class Prg_11_Lambda_Expression {

	public static void fun() {
		class LocalClass {
		}
	}

	public static void main(String[] args) {
		Emp[] arr = { new Emp(101, "Sagar", 89.99),
								new Emp(105, "Sush", 99.99), 
								new Emp(103, "Anukesh", 89.99),			
								new Emp(102, "Saurabh", 85.50), 
								new Emp(104, "Akshay", 80.40) };
	
		Comparator<Emp> cmp = new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				return e1.getRoll() - e2.getRoll();
			}
		};
		
		Arrays.sort(arr, cmp);

		for (Emp e : arr) {
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
		
//		xArrays.sort(arr, (Emp e1, Emp e2) -> {	int diff = e1.getRoll() - e2.getRoll();		return diff;		});
		
//		Arrays.sort(arr, (e1, e2) -> {return e1.getRoll() - e2.getRoll();    }     );
		
//		Arrays.sort(arr, (e1, e2) -> e1.getRoll() - e2.getRoll()	  	);	
		
		Arrays.sort(arr, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		
		for(Emp e : arr)
			System.out.println(e);
		
		
	}
}

class Emp {
	int roll;
	String name;
	double marks;

	public Emp(int roll, String name, double marks) {
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
