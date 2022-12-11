package application;

import java.util.ArrayList;
import bankApi.OnlinePayment;
import bankApi.PaymentSystem;

public class Cart {
	private ArrayList<Order> orders = new ArrayList<Order>();
	private double totalPrice=0;
	PaymentSystem paymentSystem;
	
	public double getTotalPrice() {return totalPrice;}
	
	public void setTotalPrice(double totalPrice) {this.totalPrice = totalPrice;}
	
	public void addToCart(Product product,int quantity)
	{
		Order order = new Order(product,quantity);
		//totalPrice+=order.getPrice();
		this.totalPrice+=product.price*quantity;
		orders.add(order);
	}
	
	public void displayAllOrder()
	{
		for(Order order: orders)
		{
			order.displayInfo();
			System.out.println();
		}
		System.out.println("Price of All Products : "+this.totalPrice);
	}
	
	public void makePayment()
	{
		paymentSystem = new OnlinePayment();
		paymentSystem.choosePaymentMethod(this.totalPrice);
		IntegrationClass app = IntegrationClass.getObject();
		app.customer.addCart(app.customer.getCart());
	}

}
