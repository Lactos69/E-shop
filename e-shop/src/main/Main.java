package main;

import application.*;
import bankApi.Bkash;
import bankApi.Nagad;
import bankApi.Rocket;

public class Main {

	public static void main(String[] args) {
		IntegrationClass app = IntegrationClass.getObject();
		Bkash bkash = Bkash.getBkash();
		bkash.setBalance(2000);
		bkash.setCharge(18.50);
		
		Nagad nagad = Nagad.getNagad();
		nagad.setBalance(3000);
		nagad.setCharge(14.99);
		
		Rocket rocket = Rocket.getRocket();
		rocket.setBalance(3000);
		rocket.setCharge(14.50);
		
		Customer customer = app.customer;
		
		Seller seller1 = new Seller();
		seller1.addProduct("i phone XS", 97990);
		seller1.addProduct("i phone XR",85000);
		seller1.addProduct("i phone X", 84999);
		seller1.addProduct("i phone 13",118999);
		seller1.addProduct("i phone 12",107999);
		
		Seller seller2 = new Seller();
		seller2.addProduct("QKZ headset",650);
		seller2.addProduct("Fantech HG11",2700);
		seller2.addProduct("A4T Mouse", 280);
		seller2.addProduct("HDMI cable", 500);
		seller2.addProduct("Sony Monitor",21300);
		
		Seller seller3 = new Seller();
		seller3.addProduct("kacchi half", 250);
		seller3.addProduct("morag polaw", 390);
		seller3.addProduct("Beefsteak", 1180);
		seller3.addProduct("Gazpacho",750);
		seller3.addProduct("oysters",900);
		app.addSeller(seller1);
		app.addSeller(seller2);
		app.addSeller(seller3);
		app.updateProducts();
		
		
		
		customer. setName("Mr. X");
		customer.setEmail("mrx@gmail.com");
		customer.setAdress("Daffodil Smart City");
		customer.setContact("00000000000");
		customer.displayUserData();
		
		app.showProducts();
		app.shop();
		customer.getCart().displayAllOrder();
		bkash.displayAccountInfo();
		nagad.displayAccountInfo();
		rocket.displayAccountInfo();
		customer.getCart().makePayment();
		
		

	}

}
