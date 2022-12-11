package bankApi;

import java.util.Scanner;

public class OnlinePayment extends PaymentSystem {

	Scanner input = new Scanner(System.in);
	
	@Override
	public void choosePaymentMethod(double totalPrice) {
		this.totalPrice = totalPrice;
		String bkash="bkash";
		String rocket="rocket";
		String nagad="nagad";
		
		System.out.println("***Payment methods***");
		System.out.println("1. Bkash");
		System.out.println("2. Rocket");
		System.out.println("3. Nagad");
		System.out.print("Enter choice : ");
		String choice=input.nextLine();
		
		if(choice.equals("1")||choice.equalsIgnoreCase(bkash))
		{
			account = Bkash.getBkash();
			this.pay(account);
		}
		else if(choice.equals("2")||choice.equalsIgnoreCase(rocket))
		{
			account = Rocket.getRocket();
			this.pay(account);
		}
		else if(choice.equals("3")||choice.equalsIgnoreCase(nagad))
		{
			account = Nagad.getNagad();
			this.pay(account);
		}
	}
	
	private void pay(Bank account)
	{
		double totalBill=account.makePayment(totalPrice);
		if(totalBill>0)
		{
			this.payed = totalBill;
			this.charge = this.payed-this.totalPrice;
		}
	}

}
