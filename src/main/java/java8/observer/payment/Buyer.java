package java8.observer.payment;

public class Buyer  implements Observer{

	@Override
	public void notify(Offer c) {
		System.out.println("Buyer amount: " + c.getAmount());
		
	}

}
