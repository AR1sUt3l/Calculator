package calculator;

public class SimpleOperations
{
	public double add(double firstNumber, double secondNumber)
	{
		return firstNumber + secondNumber;
	}
	
	public double subtract(double firstNumber, double secondNumber)
	{
		return firstNumber - secondNumber;
	}
	
	public double multiply(double firstNumber, double secondNumber)
	{
		return firstNumber * secondNumber;
	}
	
	public double divide(double firstNumber, double secondNumber)
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
	
	public static void main(String[] args)
	{
		
	}
}
