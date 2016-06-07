package java8.chainofresponsability.payment;

public class PaymentProcessorA extends PaymentProcessor{

	@Override
	protected void handle(PaymentObj p) {
		System.out.println("PaymentProcessorA amount: " + p.getAmount());
	}
	
}
