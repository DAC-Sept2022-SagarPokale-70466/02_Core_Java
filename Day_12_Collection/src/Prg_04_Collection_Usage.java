import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prg_04_Collection_Usage {

	public static void main(String[] args) {

		List<Distance> dlist = new ArrayList<>();

		dlist.add(new Distance(4, 7));
		dlist.add(new Distance(5, 9));
		dlist.add(new Distance(6, 1));
		dlist.add(new Distance(5, 4));
		dlist.add(new Distance(4, 9));

		Distance d = new Distance(4, 7);

//		if (dlist.contains(d)) {					// Here d is Up-Casted to Object 
//			System.out.println("Found " + d);
//		}
//		else
//			System.out.println("Not Found " + d);
//		
//		int index = dlist.indexOf(d);				// IndexOf uses the Equals
//		if(index != -1)
//			System.out.println(d + " is found at index " + index);
//		else
//			System.out.println(d + " is not found in list");

		//////////////////////////////////////////////////////////////////////////////////

		List<Staff> elist = new ArrayList<>();
		elist.add(new Staff(1, "Sarang", 50000.0));
		elist.add(new Staff(2, "Nitin", 40000.0));
		elist.add(new Staff(3, "Nilesh", 60000.0));
		elist.add(new Staff(4, "Yogesh", 70000.0));
		elist.add(new Staff(5, "Vishal", 55000.0));
		elist.add(new Staff(6, "Rohan", 80000.0));

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empno to be searched: ");
		int empno = sc.nextInt();

		Staff e = new Staff(empno, "", 0.0);
		if (elist.contains(e)) // Internally calls the equals from object, Override in your class
			System.out.println("Values is : " + e.getName());

		int index1 = elist.indexOf(e); // Internally calls the equals from object, Override in your class
		if (index1 != -1) {
			e = elist.get(index1);
			System.out.println(e + " is found at index " + index1);
		} else
			System.out.println(e + " is not found in list");
		sc.close();

		System.out.println("end");

//		for (int i = 0; i < elist.size(); i++) {
//			e = elist.get(i);
//			if (empno == e.getEmpno())
//				System.out.println(e);
//		}

	}
}
