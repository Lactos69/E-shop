package bankApi;

public abstract class PaymentSystem {
	protected double totalPrice;//bill without charge
	protected double payed;//bill with charge
	protected double charge;
	protected Bank account;
	
	
	
	public double getTotalPrice() {return totalPrice;}

	public void setTotalPrice(double totalPrice) {this.totalPrice = totalPrice;}

	public double getPayed() {return payed;}

	public void setPayed(double payed) {this.payed = payed;}

	public double getCharge() {return charge;}

	public void setCharge(double charge) {this.charge = charge;}



	public abstract void choosePaymentMethod(double totalPrice);
	

}
