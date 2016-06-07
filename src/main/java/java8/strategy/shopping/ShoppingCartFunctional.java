package java8.strategy.shopping;

import java.util.function.Consumer;

public class ShoppingCartFunctional {
	
	private int amount;
	
	public ShoppingCartFunctional(int amount) {
		super();
		this.amount = amount;
	}

	public void pay(Consumer<Integer> method){
		method.accept(amount);
	}

}
