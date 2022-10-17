import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author : Sagar_Pokale
 * @Date : 15-Oct-2022 4:18:38 PM
 **/

public class Prg_04_ScanFromFile {
	public static final String Path = "G:\\C-Dac\\2_Core_Java\\core_java\\Day15\\Demo15_03\\students.txt";

	public static void main(String[] args) {

		List<Child> list = new ArrayList<Child>();
		loadData(list);
		list.forEach(i -> System.out.println(i));

	}

	public static void loadData(List<Child> list) {
		File file = new File(Path);
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextInt()) {
				int roll = sc.nextInt();
				String name = sc.next();
				double marks = sc.nextDouble();
				Child c = new Child(roll, name, marks);
				list.add(c);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Child implements Serializable {
	private static final long serialVersionUID = 7L;
	private int roll;
	private String name;
	private double marks;
	transient private double percent;

	// ......
	public Child() {
	}

	public Child(int roll, String name, double marks) {
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
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
