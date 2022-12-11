package application;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegrationClass {
	
	Scanner input = new Scanner(System.in);
	
	private IntegrationClass() {}
	public static IntegrationClass instance = new IntegrationClass();
	public static IntegrationClass getObject()
	{
		return instance;
	}
	
	public Customer customer = Customer.getObject();
	private ArrayList<Seller> sellers = new ArrayList<Seller>();
	private ArrayList<Product> products = new ArrayList<Product>();
	
	
	public void addSeller(Seller seller)
	{
		sellers.add(seller);
	}
	
	public void updateProducts()
	{
		for(Seller seller: sellers)
		{
			for(Product product:seller.getProducts())
			{
				this.products.add(product);
			}
		}
	}
	
	public void showProducts() {
		System.out.println("***All Products***");
		for(int i=0;i<this.products.size();i++)
		{
			System.out.print(i+". ");
			this.products.get(i).displayInfo();
		}
	}
	
	public void shop()
	{
		this.showProducts();
		Cart cart = new Cart();
		
		String shopMore="y";
		while(shopMore.equalsIgnoreCase("y")) {
			
			System.out.print("Add to cart(serial number) : ");
			int choice = input.nextInt();
			System.out.print("Quantity : ");
			int quantity = input.nextInt();
			cart.addToCart(this.products.get(choice), quantity);
			
			System.out.print("Contiune shopping?(Y/N) : ");
			shopMore=input.next();
		}
	System.out.println("*** Order Adout ***");
		this.customer.addCart(cart);
	}

}
