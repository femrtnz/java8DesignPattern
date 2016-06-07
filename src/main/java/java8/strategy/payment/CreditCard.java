package java8.strategy.payment;

public class CreditCard implements Payment {

	public void pay(int value) {
		System.out.println("Credit card payment");
	}

}
