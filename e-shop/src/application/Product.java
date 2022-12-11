package application;

public class Product {
	protected String name;
	protected double price;
	
	public Product() {}
	public Product(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void displayInfo()
	{
		System.out.println(this.name+" : "+this.price+"tk");
		
	}

}
