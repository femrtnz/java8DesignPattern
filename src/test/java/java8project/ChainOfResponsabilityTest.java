package java8project;

import java.util.function.Function;

import org.junit.Test;

import java8.chainofresponsability.payment.PaymentObj;
import java8.chainofresponsability.payment.PaymentProcessorA;
import java8.chainofresponsability.payment.PaymentProcessorB;

public class ChainOfResponsabilityTest {
//ChainOfResponsabilityTest Design Pattern
	@Test
	public void testPaymentProcessor(){
		
		PaymentProcessorA paymentProcessorA = new PaymentProcessorA();
		paymentProcessorA.setNext(new PaymentProcessorB());
		
		paymentProcessorA.process(new PaymentObj(10));
	}
	
	@Test
	public void testPaymentProcessorFunctional(){
		Function<PaymentObj, PaymentObj> processorA = p -> {
			System.out.println("Processor A" + p.getAmount());
			return p;
		}; 
		
		Function<PaymentObj, PaymentObj> processorB = p -> {
			System.out.println("Processor B" + p.getAmount());
			return p;
		}; 
		
		Function<PaymentObj, PaymentObj> chain = processorA.andThen(processorB);
		
		chain.apply(new PaymentObj(10));
	}
	
}
