/**
*	@Developer : Sagar_Pokale
*	@Date		 	   : 26-Oct-2022 3:23:03 PM
*/

package vehicle;

import java.util.Objects;

public class Vehicle {

	String company;
	String model;
	String color;
	String type;
	double price;

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehicle))
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(model, other.model);
	}

	public Vehicle(String company, String model, String color, String type, double price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [company=" + company + ", model=" + model + ", color=" + color + ", type=" + type + ", price="
				+ price + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
