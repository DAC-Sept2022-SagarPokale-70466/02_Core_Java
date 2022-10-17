package assignment.day11_01;

public class Labor implements Emp{

	int hour;
	int rate;
	
	
	public Labor(int hour, int rate) {
		this.hour = hour;
		this.rate = rate;
	}

	@Override
	public double geSal() {
		return this.hour * this.rate;
	}
	
	@Override
	public double calcIncentives()
	{
		if(this.hour > 300)
			return (this.hour *this.rate)* 0.5;
		return 0.0;
	}
	
}
