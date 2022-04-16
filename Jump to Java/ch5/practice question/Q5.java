import java.util.ArrayList;
import java.util.Arrays;

public class Q5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> b = a;
		a.add(4);
		System.out.println(b.size());

		b = new ArrayList<>(a);
		a.add(5);
		System.out.println(b.size());
	}
}
