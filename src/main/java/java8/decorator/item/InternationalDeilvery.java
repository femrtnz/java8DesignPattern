package java8.decorator.item;

//Implementing Decorator Design pattern
public class InternationalDeilvery extends ItemExtras{
	
	public InternationalDeilvery(Item item) {
		super(item);
	}

	@Override
	public int getPrice() {
		return 5 + super.getPrice();	
	}

}
