package java8.decorator.item;

import java.util.function.Function;
import java.util.stream.Stream;

public class ItemFunctional implements Item {
	private int price;
	
	private Function<Integer, Integer>[] itemExtras = new Function[]{};
	
	public ItemFunctional(int price) {
		this.price = price;
	}
	
	public ItemFunctional(int price, Function<Integer, Integer>... itemExtras) {
		this.price = price;
		this.setItemExtras(itemExtras);
	}
	
	@Override
	public int getPrice() {
		Function<Integer, Integer> extras = Stream.of(itemExtras)
			.reduce(Function.identity(), Function::andThen);
		return extras.apply(price);
//		int priceWithExtras = price;
//		for (Function<Integer, Integer> function : itemExtras) {
//			priceWithExtras = function.apply(priceWithExtras);
//		}
//		return priceWithExtras;
	}

	public void setItemExtras(Function<Integer, Integer>... itemExtras) {
		this.itemExtras = itemExtras;
	}
}
