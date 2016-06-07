package java8.decorator.item;

//Implementing Decorator Design pattern
public abstract class ItemExtras implements Item{
	
	private Item item;
	
	public ItemExtras(Item item) {
		this.item = item;
	}

	@Override
	public int getPrice() {
		return item.getPrice();
	}

}
