import java.text.DecimalFormat;

public class Converter
{
	public static void main (String args[])
	{
		DecimalFormat rounder = new DecimalFormat(".###");
		System.out.println("Miles          Kilometers");
		for(int x = 1; x <= 10; x++)
		{
			double kilometers = x * 1.609;
			System.out.println(x + "              " + rounder.format(kilometers));
			






		}
	}
}