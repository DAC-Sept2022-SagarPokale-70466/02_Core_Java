package assignment.day07;

public class Fruit {

	String name;
	String color;
	double weight;
	boolean isFresh;

	public Fruit() {
		this.name = null;
		this.color = null;
		this.weight = 0.0;
		this.isFresh = false;
	}

	public Fruit(String name, String color, double weight, boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

	public String taste()
	{
		if(this.name == "Fruit")
			return "No Specific taste";
		else if(this.name == "Apple")
			return "Sweet and Sour";
		else if(this.name == "Mango")
			return "Sweet";
		else
			return "Sour";
	}
	public String getName()
	{
		return this.name;
	}
	public boolean isFresh()
	{
		return this.isFresh;
	}
	public void setStale()
	{
		this.isFresh = false;
	}
	

}
