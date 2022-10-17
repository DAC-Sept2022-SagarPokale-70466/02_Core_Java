package assignment.day08;

public abstract class Electronics {
	String model;
	String desc;
	double prize;

	public void accept(String model, String desc, double prize) {
		this.model = model;
		this.desc = desc;
		this.prize = prize;
	}

	public String print() {
		return "Model = " + this.model + " Desc = " + this.desc + " Prize = " + this.prize;
	}

	abstract void acceptData(String model, String desc, double prize);

	abstract String printData();

	public void checkDetails() throws MobileException {
	};

	public void checkDetails1() throws TvException {
	};

	@Override
	public String toString() {
		return "Electronics [model=" + model + ", desc=" + desc + ", prize=" + prize + "]";
	}

}
