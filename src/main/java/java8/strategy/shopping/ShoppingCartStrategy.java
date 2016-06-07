package java8.strategy.shopping;

import java8.strategy.payment.Payment;

public class ShoppingCartStrategy {
	
	private int amount;
	
	public ShoppingCartStrategy(int amount) {
		super();
		this.amount = amount;
	}

	public void pay(Payment method){
		method.pay(amount);
	}

}
