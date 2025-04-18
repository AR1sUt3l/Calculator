package calculator;
import java.util.Vector;
import java.util.Arrays;

public class BigInt
{
	Vector<Integer> number = new Vector<>();
	
	public BigInt(int[] newNumber)
	{
		for (int integer : newNumber)
		{
			number.add(integer);
		}
	}
	
	public Vector<Integer> getNumber()
	{
		return number;
	}
	
	public void setNumber(int[] newNumber)
	{
		for (int integer : newNumber)
		{
			number.add(integer);
		}
	}
	
	public void setNumber(Vector<Integer> newNumber)
	{
		number = newNumber;
	}

}
