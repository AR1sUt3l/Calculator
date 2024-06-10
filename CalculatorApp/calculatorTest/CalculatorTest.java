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
		assertEquals(3, calculator.addition(1, 2));
	}

}
