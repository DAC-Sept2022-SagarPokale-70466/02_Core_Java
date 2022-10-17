package assignment.day08;

public class WashingMachine extends Electronics {

	int capacity;
	String type;

	public WashingMachine(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	void acceptData(String model, String desc, double prize) {
		super.accept(model, desc, prize);
	}

	@Override
	public String printData() {
		return super.print()+" Capacity = " + this.capacity + " Type = " + this.type;
	}
}
