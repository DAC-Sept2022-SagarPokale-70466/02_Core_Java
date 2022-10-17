package assignment.day08;

public class Mobile extends Electronics {

	int ram;
	int storage;

	public Mobile(int ram, int storage) {
		this.ram = ram;
		this.storage = storage;
	}

	void acceptData(String model, String desc, double prize) {
		super.accept(model, desc, prize);
	}

	@Override
	public String printData() {		
		return super.print()+" Ram = " + this.ram + "Storage = " + this.storage;
	}

	@Override
	public void checkDetails() throws MobileException {
		if (this.ram > 0 && this.storage > 0) {
			System.out.println("OK Correct");
		} else {
			throw new MobileException("You have Enter wrong Details");
		}
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", storage=" + storage + "]";
	}

}
