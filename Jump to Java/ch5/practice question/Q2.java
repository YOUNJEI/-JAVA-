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
}

class MaxLimitCalculator extends Calculator
{
	void add(int val)
	{
		if (this.value + val >= 100)
			this.value = 100;
		else
			this.value += val;
	}
}

public class Q2
{
	public static void main(String[] args)
	{
		MaxLimitCalculator cal = new MaxLimitCalculator();
		cal.add(50);
		System.out.println(cal.getValue());
		cal.add(60);
		System.out.println(cal.getValue());
	}
}
