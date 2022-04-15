public class Q2
{
	public static void main(String[] args)
	{
		if (is_even(13))
			System.out.println("13 is even number!");
		else
			System.out.println("13 is odd number!");
	}
	public static boolean is_even(int n)
	{
		if (n % 2 == 0)
			return (true);
		return (false);
	}
}
