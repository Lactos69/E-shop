package application;

import java.util.ArrayList;

public class Customer extends User {
	
	private Customer() {}
	private static Customer customer = new Customer();
	
	public static Customer getObject() {
		return customer;
	}
	
	private String email;
	private ArrayList<Cart> carts = new ArrayList<Cart>();
	private Cart cart;
	
	
	public Cart getCart() { return cart; }

	public void setCart(Cart cart) { this.cart = cart; }

	public String getEmail() {return email;}
	
	public void setEmail(String email) {this.email = email;}

	@Override
	public void displayUserData() {
		System.out.println("***Customer Info***");
		System.out.println("Customer name : "+this.name);
		System.out.println("Email : "+this.email);
		System.out.println("Adress : "+this.adress);
		System.out.println("Contact no. : "+this.contact);
		
	}
	
	public void addCart(Cart cart)
	{
		this.cart=cart;
		this.carts.add(cart);
		
	}

	

}
