package assignment.day08;

public class Tv extends Electronics {

	int scr_inch;
	int pix_des;

	public Tv(int scr_inch, int pix_des) {
		this.scr_inch = scr_inch;
		this.pix_des = pix_des;
	}

	@Override
	void acceptData(String model, String desc, double prize) {
		super.accept(model, desc, prize);
	}

	@Override
	public String printData() {
		return super.print()+" Screen Inch = " + this.scr_inch + "Pixel Density = " + this.pix_des;
	}

	public void checkDetails1() throws TvException  {
		if (this.scr_inch > 0 && this.pix_des > 0) {
			System.out.println("OK Correct");
		} else {
			throw new TvException("You have Enter wrong Details");
		}
	}

}
