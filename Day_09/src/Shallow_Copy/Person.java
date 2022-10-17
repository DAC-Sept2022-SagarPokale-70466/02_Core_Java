package Shallow_Copy;

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
	public void setName(String name)
	{
		this.name = name;
	}
	public void changeDate()
	{
		this.date.changeDate();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();				// Clone method from parent class
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "], Date = [" + date + "]";
	}
	
}
