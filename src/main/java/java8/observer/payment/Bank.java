package java8.observer.payment;

public class Bank implements Observer{

	@Override
	public void notify(Offer c) {
		System.out.println("Bank" + c);		
	}

}
