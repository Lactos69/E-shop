package application;

public class Order extends Product {
	private int quantity;
	
	public Order() {}
	public Order(Product product,int quantity)
	{
		this.name = product.name;
		this.price = product.price;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalPrice()
	{
		return this.price*this.quantity;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Quantity : "+this.quantity);
		System.out.println("Price : "+this.getTotalPrice());
	}

}
