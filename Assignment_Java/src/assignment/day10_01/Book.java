package assignment.day10_01;

import java.util.Objects;

public class Book implements Comparable<Book> {
	String name;
	double prize;
	String authorName;
	int qty;

	public Book() {
	};

	public Book(String name, double prize, String authorName, int qty) {
		this.name = name;
		this.prize = prize;
		this.authorName = authorName;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", prize=" + prize + ", authorName=" + authorName + ", qty=" + qty + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Book b = (Book) obj;
		return Objects.equals(name, b.name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(authorName, other.authorName) && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(prize) == Double.doubleToLongBits(other.prize) && qty == other.qty;
//	}

	@Override
	public int compareTo(Book other) {
		return (this.name.compareTo(other.name));
//		return Math.abs(prize - other.prize);
	}
}
