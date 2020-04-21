
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestCalculator {
	
	Calculator calculator = new Calculator();
	
	@Test
	public void testAddition() {
		Assertions.assertEquals(10, calculator.addition(5, 5));
	}
	
	@Test
	public void testSubstraction() {
		Assertions.assertEquals(2, calculator.substraction(5, 3));
	}
	
	@Test
	public void testMultiplication() {
		Assertions.assertEquals(15, calculator.multiplication(5, 3));
	}

}
