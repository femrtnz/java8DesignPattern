package java8.currying.payment;

import java.util.function.DoubleUnaryOperator;

public class Currying {
//reduce parameters from a big function
// g(y) = f(2,y) = 2/y 
	
	public static DoubleUnaryOperator curriedConverter(double f, double b){
		return x -> x * f + b;
	}
}
