package java8.chainofresponsability.payment;

public class PaymentObj {
	private int amount;
	
	public PaymentObj(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
