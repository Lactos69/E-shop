package application;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Seller extends User {
	//public ArrayList<Product> products = new ArrayList<Product>();
	private HashSet<Product> products = new HashSet<Product>();
	Scanner input = new Scanner(System.in);
	
	public void addProduct()
	{
		System.out.print("Product name : ");
		String name = input.nextLine();
		System.out.print("price : ");
		double price = input.nextDouble();
		
		Product product = new Product(name,price);
		products.add(product);
	}
	
	public void addProduct(String name,double price)
	{
		products.add(new Product(name,price));
	}
	
	public HashSet<Product>getProducts()
	{
		return this.products;
	}
	

	@Override
	public void displayUserData() {
		System.out.println("***Seller Info***");
		System.out.println("Seller name : "+this.name);
		System.out.println("Contact no. : "+this.contact);
		System.out.println("Shop Adress : "+this.adress);
		
		System.out.println();
		System.out.println("***Product Info***");
		for(Product product: products)
		{
			product.displayInfo();
		}
	}

}
