public class Q4
{
	public static void main(String[] args)
	{
		String pin = "881120-1068234";
		String pin2 = "9512112174466";

		print_sex(pin);
		print_sex(pin2);
	}
	public static void print_sex(String s)
	{
		int length = s.length();

		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '-' || i == length - 8)
			{
				System.out.println(s.charAt(i + 1));
				break;
			}
		}
	}
}
