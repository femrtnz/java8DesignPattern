package java8.strategy.payment;

public class Money implements Payment {

	public void pay(int value) {
		System.out.println("Money payment");
	}

}
