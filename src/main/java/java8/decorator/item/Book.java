package java8.decorator.item;

public class Book implements Item {
	private int price;
	
	public Book(int price) {
		this.price = price;
	}
	@Override
	public int getPrice() {
		return price;
	}
	
}
