import java.util.Objects;

public class Distance {
	private int feet;
	private int inches;

	public Distance() {
	}

	public Distance(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof Distance)) {
			return false;
		}
		Distance obj = (Distance) other; // Here Object(Other) is Down-Casted to Distance
		return (this.feet == obj.feet && this.inches == obj.inches);
	}
}

class Emp {
	private int empno;
	private String name;
	private double sal;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empno, String name, double sal) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Emp))
			return false;
		Emp other = (Emp) obj;
		return this.empno == other.empno;
	}

	
}
