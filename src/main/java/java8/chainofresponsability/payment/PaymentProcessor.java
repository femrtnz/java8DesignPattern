package java8.chainofresponsability.payment;

public abstract class PaymentProcessor {

	private PaymentProcessor next;

	public void setNext(PaymentProcessor processor){
		if(next == null ){
			next = processor;
		} else {
			next.setNext(processor);
		}
	}

	public PaymentObj process(PaymentObj p){
		handle(p);
		if(next != null ){
			return next.process(p);
		} else {
			return p;
		}
	}

	protected abstract void handle(PaymentObj p);
	
}
