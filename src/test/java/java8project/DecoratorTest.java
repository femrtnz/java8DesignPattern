package java8project;

import java.util.function.Function;

import org.junit.Test;

import java8.decorator.functions.Packing;
import java8.decorator.functions.Taxes;
import java8.decorator.item.Book;
import java8.decorator.item.GiftPacking;
import java8.decorator.item.InternationalDeilvery;
import java8.decorator.item.Item;
import java8.decorator.item.ItemFunctional;
import junit.framework.Assert;

public class DecoratorTest {
	//Implementing Decorator Design pattern
	
	@Test
	public void testDecoratorItens(){
		Item book = new Book(10);
		Assert.assertEquals(10, book.getPrice());
		
		InternationalDeilvery internationalDeilvery = new InternationalDeilvery(book);
		Assert.assertEquals(15, internationalDeilvery.getPrice());
		
		InternationalDeilvery internationalDeilvery2 = new InternationalDeilvery(new GiftPacking(book));
		Assert.assertEquals(30, internationalDeilvery2.getPrice());
		
		GiftPacking giftPacking = new GiftPacking(new InternationalDeilvery(book));
		Assert.assertEquals(30, giftPacking.getPrice());
	}
	
	@Test
	public void testDecoratorFunctionalItens(){
		Item book = new Book(10);
		Assert.assertEquals(10, book.getPrice());
		
		Function<Integer, Integer> giftPacking = value -> {
			System.out.println("Applying giftPacking");
			return 15 + value;
		};
		Assert.assertEquals(new Integer(25), giftPacking.apply(book.getPrice()));
		
		Function<Integer, Integer> internationalDeilvery = value -> {
			System.out.println("Applying internationalDeilvery");
			return 5 + value;
		};
		Assert.assertEquals(new Integer(15), internationalDeilvery.apply(book.getPrice()));
		
		Assert.assertEquals(new Integer(30), giftPacking.andThen(internationalDeilvery).apply(book.getPrice()));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testDecoratorFunctionalItens2(){
		ItemFunctional book = new ItemFunctional(10);
		Assert.assertEquals(10, book.getPrice());
		
		Function<Integer, Integer> giftPacking = value -> {
			System.out.println("Applying giftPacking");
			return 15 + value;
		};
		
		Function<Integer, Integer> internationalDeilvery = value -> {
			System.out.println("Applying internationalDeilvery");
			return 5 + value;
		};
		
		book.setItemExtras(giftPacking, internationalDeilvery);
		Assert.assertEquals(30, book.getPrice());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testDecoratorFunctionalItensMethodReferences(){
		ItemFunctional book = new ItemFunctional(10,
								Packing::giftPacking,
								Taxes::international);
		
		Assert.assertEquals(75, book.getPrice());
	}
}
