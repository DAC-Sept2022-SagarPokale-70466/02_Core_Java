import java.util.Arrays;
import java.util.Comparator;

public class Prg_08_Comparable {

	public static void main(String[] args) {

//		Employee e = new Employee(201, "Sagar",50000);
//		Employee e2 = new Employee(102, "Sush", 50000);
//		This compareTo method just compare the natural order
//		int cmp = e.compareTo(e2);
//		System.out.println(cmp);

		Employee[] arr = { 
							new Employee(5, "S", 823.45), 
							new Employee(6, "H", 623.30), 
							new Employee(2, "A", 120.39),
							new Employee(3, "H", 983.42), 
							new Employee(1, "B", 623.80), 
							new Employee(4, "H", 723.39) };

//		====================================================================

		// class Arrays -- static void sort(Object[] arr);
		System.out.println("Sort By Empno : Natural Order : ");
		Arrays.sort(arr);
		for (Employee array : arr) {
			System.out.println(array);
		}
		System.out.println();

//		====================================================================

		// class Arrays -- static <T> void sort(T[] arr, Comparator<T> cmp);

		System.out.println("Another sort by Name");
		EmployeeNameComparator empComparator = new EmployeeNameComparator();
		Arrays.sort(arr, empComparator);
		for (Employee ar : arr) {
			System.out.println(ar);
		}
//		====================================================================

		// Local Class

		System.out.println("Sort by Salary : ");
		class EmployeeSalComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.salary == e2.salary)
					return 0;
				else if (e1.salary > e2.salary)
					return -1;
				else
					return +1;
			}
		}
		EmployeeSalComparator eSal = new EmployeeSalComparator();
		Arrays.sort(arr, eSal);
		for (Employee e : arr) {
			System.out.println(e);
		}

//		==================================================================

//		SELECT * from emp order by ename, sal
//		Comparison on Emp name and then Employee Salary

		System.out.println("Sort by Name and salary : ");
		class nameSalComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				if (diff == 0) {
					if (e1.getSalary() == e2.getSalary())
						return 0;
					if (e1.getSalary() > e2.getSalary())
						return -1;
					else
						return +1;
				}
				return diff;
			}
		}

		nameSalComparator namesalComp = new nameSalComparator();
		Arrays.sort(arr, namesalComp);
		for (Employee ar : arr) {
			System.out.println(ar);
		}

	}
}

//==============================================================
//Separate Class to Compare with Employee Name

class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}


class Employee {
	
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
