package bankApi;

public class Bkash implements Bank {
	
	private double balance;
	private double charge;
	
	public static Bkash bkash = new Bkash();
	
	private Bkash() {}
	
	public static Bkash getBkash()
	{
		return bkash;
	}

	public double getBalance() {return balance;}
	
	public void setBalance(double balance) {this.balance = balance;}
	
	public double getCharge() {return charge;}
	
	public void setCharge(double charge) {this.charge = charge;}

	@Override
	public double makePayment(double bill) {
		double totalCharge = bill*this.charge/1000;
		double totalBill = bill + totalCharge;
		if(this.balance>=totalBill)
		{
			this.balance-=totalBill;
			System.out.println("Total charge : "+totalCharge);
			System.out.println("Paid : "+totalBill);
			System.out.println("Payment successful!");
			System.out.println("Current balance : "+this.balance);
			return totalBill;
		}
		else
		{
			System.out.println("Total charge : "+totalCharge);
			System.out.println("Payable : "+totalBill);
			System.out.println("Not enough balance!");
			System.out.println("Current balance : "+this.balance);
			
			return -1;
		}
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("***Bkash account Info***");
		System.out.println("Current balance : "+this.balance);
		System.out.println("Charge : "+this.charge+"tk per 1000tk");
	}

}
