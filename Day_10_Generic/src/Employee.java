class Employee implements Comparable<Employee> {
	int empno;
	String name;
	double sal;

//	This is must when you declare your own class  for using Comparable
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
