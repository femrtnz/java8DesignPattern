package java8.strategy.shopping;

import java8.strategy.payment.PaymentMethod;

public class ShoppingCart {
	
	public void pay(PaymentMethod method){
		if(method == PaymentMethod.CREDIT){
			System.out.println();
		}else if (method == PaymentMethod.MONEY){
			System.out.println();
		}
	}

}
