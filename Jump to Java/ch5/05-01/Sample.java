class Calculator
{
	int result = 0;

	int add(int num)
	{
		result += num;
		return (result);
	}
}

public class Sample
{
	public static void main(String[] args)
	{
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();

		System.out.println(c1.add(3));
		System.out.println(c2.add(10));
		System.out.println(c1.add(100));
	}
}
