package calculatorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.SimpleOperations;

class CalculatorTest
{

	@Test
	void testSimpleOperations()
	{
		SimpleOperations calculator = new SimpleOperations();
		assertEquals(3, calculator.add(1, 2));
		assertEquals(0.1, calculator.subtract(10, 9.9));
		assertEquals(0, calculator.multiply(0, 999));
		assertEquals(100000000, calculator.multiply(10000000, 10));
		assertNotEquals(0, calculator.divide(1, 999999999));
	}

}
