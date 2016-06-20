package java8project;

import org.junit.Test;

import java8.observer.payment.Bank;
import java8.observer.payment.Buyer;
import java8.observer.payment.Offer;
import java8.observer.payment.OfferService;
import java8.observer.payment.OfferServiceFunctional;

public class ObserverTest {

	@Test
	public void testObserver(){
		Bank bank = new Bank();
		Buyer buyer = new Buyer();
		OfferService offerService = new OfferService();
		
		offerService.registerObserver(bank);
		offerService.registerObserver(buyer);
		
		offerService.newOffer(new Offer(11));
		
	}
	
	@Test
	public void testObserverFunctional(){
		OfferServiceFunctional offerService = new OfferServiceFunctional();
		
		offerService.registerObserver(b -> System.out.println("Bank "));
		offerService.registerObserver(b -> System.out.println("Buyer"));
		
		offerService.newOffer(new Offer(11));
		
	}
}
