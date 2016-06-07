package java8.chainofresponsability.payment;

public class PaymentProcessorB extends PaymentProcessor{

	@Override
	protected void handle(PaymentObj p) {
		System.out.println("PaymentProcessoB amount: " + p.getAmount());
	}
	
}
