package java8.observer.payment;

import java.util.ArrayList;
import java.util.List;

public class OfferService implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}
	
	public void newOffer(Offer o){
		notifyObservers(o);
	}

	private void notifyObservers(Offer o) {
		observers.forEach(ob -> ob.notify(o));
	}

}
