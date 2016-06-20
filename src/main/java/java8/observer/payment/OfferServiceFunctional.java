package java8.observer.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OfferServiceFunctional {

	private List<Consumer<Offer>>  observers = new ArrayList<Consumer<Offer>>();

	public void registerObserver(Consumer<Offer> o) {
		observers.add(o);		
	}
	
	public void newOffer(Offer o){
		notifyObservers(o);
	}

	private void notifyObservers(Offer o) {
		observers.forEach(ob -> ob.accept(o));
	}

}
