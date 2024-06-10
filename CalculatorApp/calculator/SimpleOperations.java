package calculator;

public class SimpleOperations
{
	public double addition(double firstNumber, double secondNumber)
	{
		return firstNumber + secondNumber;
	}
	
	public double subtraction(double firstNumber, double secondNumber)
	{
		return firstNumber - secondNumber;
	}
	
	public double multiplication(double firstNumber, double secondNumber)
	{
		return firstNumber * secondNumber;
	}
	
	public double division(double firstNumber, double secondNumber)
	{
		double quotient;
		try
		{
			quotient = firstNumber / secondNumber;
			return quotient;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error: Cannot Divide by Zero");
			return 0;
		}
	}
}
