package java8.decorator.item;

//Implementing Decorator Design pattern
public class GiftPacking extends ItemExtras{
	
	public GiftPacking(Item item) {
		super(item);
	}

	@Override
	public int getPrice() {
		return 15 + super.getPrice();	
	}

}
