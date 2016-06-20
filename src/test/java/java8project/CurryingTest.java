package java8project;

import java.util.function.DoubleUnaryOperator;

import org.junit.Test;

import java8.currying.payment.Currying;
import junit.framework.Assert;

public class CurryingTest {

	@Test
	public void testCurrying(){
		DoubleUnaryOperator convertCtoF = Currying.curriedConverter(9.0/5, 32);
		
		Assert.assertEquals(95.0, convertCtoF.applyAsDouble(35));
		
		DoubleUnaryOperator convertCKmToMi = Currying.curriedConverter(0.6214, 0);
		Assert.assertEquals(500.0231808, convertCKmToMi.applyAsDouble(804.672));
		
		DoubleUnaryOperator convertBLRtoUSD = Currying.curriedConverter(0.27, 0);
		double usd = convertBLRtoUSD.applyAsDouble(100);
		Assert.assertEquals(27.0, usd);
		
		DoubleUnaryOperator convertUSDtoEUR = Currying.curriedConverter(0.89, 0);
		Assert.assertEquals(24.03, convertUSDtoEUR.applyAsDouble(usd));
		
		double eur = convertBLRtoUSD.andThen(convertUSDtoEUR).applyAsDouble(100);
		Assert.assertEquals(24.03, eur);
	}
}
