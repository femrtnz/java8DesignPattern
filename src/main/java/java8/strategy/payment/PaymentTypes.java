package java8.strategy.payment;

public class PaymentTypes {
	//Functional Class
	public static void money(int amount ){
		System.out.println("Money payment : " + amount);
	} 

	public static void credit(int amount ){
		System.out.println("Credit payment : " + amount);
	}
	
	public static void debit(int amount ){
		System.out.println("Debit payment : " + amount);
	}
}
