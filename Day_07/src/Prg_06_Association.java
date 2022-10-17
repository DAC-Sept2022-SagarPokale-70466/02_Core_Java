import java.util.Scanner;

public class Prg_06_Association {

	public static void main(String[] args) {

//		Degree degree = new Degree("B.E", "Electrical");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name : ");
		String name = sc.nextLine();
		System.out.println("Enter Your Degree And Branch");
		String degree = sc.next();
		String branch = sc.next();
		CdacStudent dac1 = new CdacStudent(name, new Degree(degree, branch));
		System.out.println(dac1.toString());
		
	}
}

class Degree {
	String name;
	String branch;

	Degree() {
		this(null, null);
	}

	Degree(String name, String branch) {
		this.name = name;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Degree [name=" + name + ", branch=" + branch + "]";
	}
}

class Exp {
	String job;
	int months;

	Exp() {
		this(null, 0);
	}

	Exp(String job, int months) {
		this.job = job;
		this.months = months;
	}

	@Override
	public String toString() {
		return "Exp [job=" + job + ", months=" + months + "]";
	}
}

class CdacStudent {
	String name;
	Degree degree;
	Exp exp;

	public CdacStudent(String name, Degree degree) {
		this.name = name;
		this.degree = degree;
	}
	
	public CdacStudent(String name, Degree degree, Exp exp) {
		this.name = name;
		this.degree = degree;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "CdacStudent [name=" + name + ", " + degree + ", exp=" + exp + "]";
	}
}
