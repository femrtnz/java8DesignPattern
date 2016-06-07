package java8project;

import org.junit.Test;

import java8.observer.payment.Bank;
import java8.observer.payment.Buyer;
import java8.observer.payment.Offer;
import java8.observer.payment.OfferService;

public class ObserverTest {

	@Test
	public void testSomth(){
		Bank bank = new Bank();
		Buyer buyer = new Buyer();
		OfferService offerService = new OfferService();
		
		offerService.registerObserver(bank);
		offerService.registerObserver(buyer);
		
		offerService.newOffer(new Offer(11));
		
	}
}
