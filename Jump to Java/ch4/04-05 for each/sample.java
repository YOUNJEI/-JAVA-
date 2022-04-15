import java.util.ArrayList;
import java.util.Arrays;

public class sample
{
	public static void main(String[] args)
	{
		String[] numbers = {"one", "two", "three"};
		/*
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
			*/
		for (String number : numbers)
			System.out.println(number);

		ArrayList<String> nums = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String num : nums)
			System.out.println(num);
	}
}
