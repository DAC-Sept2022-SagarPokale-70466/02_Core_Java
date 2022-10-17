package Deep_Copy;

public class Person implements Cloneable {

	String name;
	Date date;

	public Person() {
		this.name = null;
		this.date = new Date();
	}

	public Person(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.date = new Date(day, month, year);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void changeDate() {
		this.date.changeDate();
	}

	public void chageName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		Person person_copy = new Person(this.name, this.date.day, this.date.month, this.date.year);
		return person_copy;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "], Date= [" + date + "]";
	}

}
