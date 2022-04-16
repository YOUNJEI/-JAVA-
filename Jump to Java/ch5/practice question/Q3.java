class Calculator
{
	int value;

	Calculator()
	{
		this.value = 0;
	}
	void add(int val)
	{
		this.value += val;
	}
	int getValue()
	{
		return (this.value);
	}
	boolean isOdd(int n)
	{
		if (n % 2 == 1)
			return (true);
		else
			return (false);
	}
}

public class Q3
{
	public static void main(String[] args)
	{
	}
}
