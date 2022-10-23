
public class Staff{
		private int empno;
		private String name;
		private double sal;

		public Staff() {
			// TODO Auto-generated constructor stub
		}

		public Staff(int empno, String name, double sal) {
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

		public void setSal(double sal) {
			this.sal = sal;
		}

		@Override
		public String toString() {
			return "Emp [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (!(o instanceof Staff))
				return false;
			Staff s = (Staff) o;
			return this.empno == s.empno ; // This will find match of empno							// This will load match of empno
//			return this.empno == s.empno && this.name == s.name && this.sal == s.sal;				// This will find all 3 matches
		}
	}