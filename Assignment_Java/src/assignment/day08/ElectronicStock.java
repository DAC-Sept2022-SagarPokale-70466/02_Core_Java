package assignment.day08;

public class ElectronicStock implements StockManager{
	
	Electronics item;
	int qty;
	
	public ElectronicStock(Electronics item, int qty) {
		this.item = item;
		this.qty = qty;
	}
	
	@Override
	public void purchaseProduct() {
	double total = 0;
	total = total + (this.qty * this.item.prize);
	System.out.println("Total of "+this.item.model+" = "+total);
			
	}
	@Override
	public void displayStock() {
		System.out.println(this.item.printData()+" Quantity = "+this.qty);
			
	}
	@Override
	public void addStock(int nextInt) {
		this.qty = nextInt;
	}

		
}
