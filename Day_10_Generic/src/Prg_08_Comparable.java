import java.util.Arrays;
import java.util.Comparator;

public class Prg_08_Comparable {

	public static void main(String[] args) {

//		Employee e = new Employee(201, "Sagar",50000);
//		Employee e2 = new Employee(102, "Sush", 50000);
//		int cmp = e.compareTo(e2);
//		System.out.println(cmp);

		Employee[] arr = {
				new Employee(5, "S", 823.45),
				new Employee(6, "H", 623.30),
				new Employee(2, "A", 120.39),
				new Employee(3, "H", 983.42),
				new Employee(1, "B", 623.80),
				new Employee(4, "H", 723.39)
			};
			// class Arrays -- static void sort(Object[] arr);
			System.out.println("Sorted by EmpNo");
			Arrays.sort(arr);
			for (Employee e : arr) {
				System.out.println(e);
			}
			System.out.println(); 		
			
		// class Arrays -- static <T> void sort(T[] arr, Comparator<T> cmp);
		System.out.println("Another sort by Name");
		EmployeeNameComparator eComparator  = new EmployeeNameComparator();
		Arrays.sort(arr, eComparator);
		for(Employee e : arr)
		{
			System.out.println(e);
	
		}
		System.out.println("Sort by Salary : ");
		
		// Local Class
		class EmployeeSalComparator implements Comparator<Employee>
		{	@Override
			public int compare(Employee e1, Employee e2) {
			System.out.println("HEllo");
				if(e1.sal == e2.sal)
					return 0;
				else if(e1.sal > e2.sal)
					return 1;
				else
					return -1;
			}	
		}
		EmployeeSalComparator eSal = new EmployeeSalComparator();
		Arrays.sort(arr, eSal);
		for(Employee e : arr) {
			System.out.println(e);
		}
		// SELECT * from emp order by ename, sal
		
		class nameSalComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				if(diff == 0)
						if(e1.getSal() == e1.getSal())
							return 0;
						else if(e1.getSal() > e2.
								getSal())
							return 1;
						else
							return -1;
				return diff;
			}
		}
		nameSalComparator nameSalComp = new nameSalComparator();
		Arrays.sort(arr, nameSalComp);
		System.out.println("\nSort by Name and sal \n");
		for(Employee e : arr)
		{
			System.out.println(e);
		}
		
	}
}

class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = e1.getName().compareTo(e2.getName());
		return diff;
	}
}


class Employee implements Comparable<Employee> {
	int empno;
	String name;
	double sal;

	@Override
	public int compareTo(Employee other) {
		return this.empno - other.empno;
	}

	public Employee(int empno, String name, double sal) {
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	void setSal(double sal) {
		this.sal = sal;		
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}
}
