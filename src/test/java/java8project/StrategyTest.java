package java8project;

import org.junit.Test;

import java8.strategy.payment.CreditCard;
import java8.strategy.payment.Money;
import java8.strategy.payment.PaymentTypes;
import java8.strategy.shopping.ShoppingCartFunctional;
import java8.strategy.shopping.ShoppingCartStrategy;

public class StrategyTest {
//Strategy Design Pattern
	@Test
	public void testPaymentStrategy	(){
		ShoppingCartStrategy shoppingCartStrategy = new ShoppingCartStrategy(10);
		shoppingCartStrategy.pay(new CreditCard());
		shoppingCartStrategy.pay(new Money());
	}
	
	@Test
	public void testPaymentFunctionalConsumer(){
		//
		ShoppingCartFunctional shoppingCartFunctional  = new ShoppingCartFunctional(10);
		shoppingCartFunctional.pay(a -> System.out.println("Credit " + a));
		shoppingCartFunctional.pay(a -> System.out.println("Money " + a));
	}
	
	@Test
	public void testPaymentFunctionalConsumerMethodReferences(){
		//
		ShoppingCartFunctional shoppingCartFunctional  = new ShoppingCartFunctional(10);
		shoppingCartFunctional.pay(PaymentTypes::money);
		shoppingCartFunctional.pay(PaymentTypes::credit);
	}
}
