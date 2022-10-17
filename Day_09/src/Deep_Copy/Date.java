package Deep_Copy;

public class Date {
	int day;
	int month;
	int year;

	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void changeDate() {
		this.day = 15;
		this.month = 04;
		this.year = 2000;
	}

	@Override
	public String toString() {
		return "" + day + "/" + month + "/" + year;
	}
}
